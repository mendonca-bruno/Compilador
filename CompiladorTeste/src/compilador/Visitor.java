/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilador;
import static compilador.Run.RuleNames;
import gram.CompiladorBaseVisitor;
import gram.CompiladorParser;
import gram.CompiladorParser.CmdContext;
import gram.CompiladorParser.Type_Context;
import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;
/**
 *
 * @author Bruno
 */
public class Visitor extends CompiladorBaseVisitor{
    CompiladorParser parser;
    public Visitor(CompiladorParser parser){
        this.parser = parser;
    }
    
    
    TabelaSimbolos tabela = TabelaSimbolos.getInstace();
    
    
    @Override
    public Object visitNumDoubleFact(CompiladorParser.NumDoubleFactContext ctx){
        String id = ctx.getText();
        Double valor = Double.parseDouble(id);
        return new Tipo("Double", valor);
    }
    
    @Override
    public Object visitNumIntFact(CompiladorParser.NumIntFactContext ctx){
        String id = ctx.getText();
        Integer valor = Integer.parseInt(id);
        return new Tipo("Integer",valor);
        
    }
    
    @Override
    public Object visitVarFact(CompiladorParser.VarFactContext ctx){
        String id = ctx.getText();
        ParserRuleContext c = ctx.getParent();
        String aux = "";       
        
        while((aux != "cmd") || (aux != "line")){
            aux = RuleNames.get(c.getRuleIndex());
            if(aux =="cmd" || aux=="line") break;
            //System.out.println(aux);
            c = c.getParent();
        }
        
        if(aux.equals("line")){ //contexto global
            ControleContexto cc = ControleContexto.checaContexto(true, false, "");
            ConteudoContexto conteudo = (ConteudoContexto)tabela.achaValor(cc, id);
            if(conteudo == null) System.out.println("Variavel \"" +id + "\" não inicializada");
            Tipo verificaTipo = new Tipo(conteudo.tipo, conteudo.valor);
            return verificaTipo;
        }
        
        
        return id; //falta retornar o valor deste id.
    }
    
    @Override
    public Object visitIntAtr(CompiladorParser.IntAtrContext ctx){
        AuxiliaTabela aux = null;
        Token firstToken = ctx.start;
        Tipo verificaTipo = (Tipo) visit(ctx.expr());
        //System.out.println(RuleNames.get(ctx.getParent().getRuleIndex()));
        if(verificaTipo.getTipo().equals("Double")){
            System.out.println("Erro na linha: " +firstToken.getLine() + " Coluna: " +firstToken.getCharPositionInLine() + " - Tipo Incompativel!");
            aux = new AuxiliaTabela(verificaTipo, false, (String)ctx.VAR().getText());
            return aux;
        }
        aux = new AuxiliaTabela(verificaTipo, true, (String)ctx.VAR().getText());
        return aux;

    }
    
    
    @Override
    public Object visitVoidFunc(CompiladorParser.VoidFuncContext ctx){
        ControleContexto cc = ControleContexto.checaContexto(false, true, ctx.VAR(0).getText());
        //System.out.println(cc.getNomeFuncao());
        int j = 0;
        for(int i = 1; i<ctx.VAR().size(); i++){
            ConteudoContexto c = new ConteudoContexto(ctx.type_(j).getText(), ctx.VAR(i).getText(), null);
            tabela.adicionaTabela(cc, c);
            j++;
        }

        ArrayList<String> variaveis = new ArrayList<>();
        for(TerminalNode node : ctx.VAR()){
            variaveis.add(node.getText());
        }
        ArrayList<String> parametros = new ArrayList<>();
        for(int i=1; i<ctx.VAR().size(); i++){
            parametros.add(ctx.VAR(i).getText());
        }

        FunctionControl tc = new FunctionControl(ctx.VAR(0).getText(), variaveis, parametros, ctx);
        FunctionTable.getInstace().adicionaTabelaFuncoes(ctx.VAR(0).getText(), tc);
        return null;
    } 
    
    
    @Override
    public Object visitIntType(CompiladorParser.IntTypeContext ctx){
        return ctx.INT().getText();
    }
    
    @Override
    public Object visitDoubleAtr(CompiladorParser.DoubleAtrContext ctx){
        AuxiliaTabela aux;
        Token firstToken = ctx.start;
        Tipo verificaTipo = (Tipo) visit(ctx.expr());        
        if(verificaTipo.getTipo().equals("Integer")){
            System.out.println("Erro na linha: " +firstToken.getLine() + " Coluna: " +firstToken.getCharPositionInLine() + " - Tipo Incompativel!");
            aux = new AuxiliaTabela(verificaTipo, false, (String)ctx.VAR().getText());
            return aux;
        }
        aux = new AuxiliaTabela(verificaTipo, true, (String)ctx.VAR().getText());
        return aux;
    }
    
    @Override
    public Object visitSumExpr(CompiladorParser.SumExprContext ctx){
        //System.out.println("Rule Index: " + RuleNames.get(ctx.getParent().getParent().getRuleIndex()));
        return new Util().somar((Tipo)visit(ctx.expr()), (Tipo)visit(ctx.term())); //retorna Tipo
    }

    
    @Override
    public Object visitAtrLine(CompiladorParser.AtrLineContext ctx){
        AuxiliaTabela auxilia = (AuxiliaTabela)visit(ctx.atr());
        if(auxilia.isRetorno()){
            ControleContexto cc = ControleContexto.checaContexto(true, false, "");
            ConteudoContexto conteudo = new ConteudoContexto(auxilia.tipo.tipo, auxilia.ID, auxilia.tipo.valor);
            tabela.adicionaTabela(cc,conteudo);
            //System.out.println(tabela.tamanhoTabela());
            //tabela.mostraTabela(cc);
            return true;
        }
        return false;
    }
    
    @Override
    public Object visitPrintLine(CompiladorParser.PrintLineContext ctx ){
        String id = (String)visit(ctx.print());
        ControleContexto cc = ControleContexto.checaContexto(true, false, "");
        ConteudoContexto conteudo = (ConteudoContexto)tabela.achaValor(cc, id);
        //System.out.println(conteudo.valor);
        return conteudo;
    }
    
    @Override
    public Object visitVarPrint(CompiladorParser.VarPrintContext ctx){
        String id = ctx.VAR().getText();
        return id;
    }
    
}
