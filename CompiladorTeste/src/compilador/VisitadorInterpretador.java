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
import java.util.ArrayList;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 *
 * @author kags_
 */
public class VisitadorInterpretador extends CompiladorBaseVisitor{
    CompiladorParser parser;
    public VisitadorInterpretador(CompiladorParser parser){
        this.parser = parser;
    }
    
    
    TabelaSimbolos tabela = TabelaSimbolos.getInstace();
    
    
    @Override
    public Object visitLineFuncProg(CompiladorParser.LineFuncProgContext ctx){
        for(CompiladorParser.LineContext lc : ctx.line()){
            visit(lc);
        }
        return null;
    }
    
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
        CompiladorParser.VoidFuncContext ctxVoidFunc = null;
        c = ctx.getParent();
        aux = "";
        while(aux!="func"){
            aux = RuleNames.get(c.getRuleIndex());
            if(RuleNames.get(c.getRuleIndex()).equals("func")) break;
            c = c.getParent();
        }
        ctxVoidFunc = (CompiladorParser.VoidFuncContext) c;
        ControleContexto cc = ControleContexto.checaContexto(false, true, ctxVoidFunc.VAR(0).getText());
        ConteudoContexto conteudo = (ConteudoContexto)tabela.achaValor(cc, id);
        if(conteudo == null) System.out.println("Variavel \"" +id + "\" não inicializada");
        Tipo verificaTipo = new Tipo(conteudo.tipo, conteudo.valor);
            
        
        
        return verificaTipo; //falta retornar o valor deste id.
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
        //System.out.println("Nome funcao: " +ctx.VAR(0));;
        for(CmdContext c : ctx.cmd()){
            visit(c);
        }
       
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
    public Object visitCallFuncLine(CompiladorParser.CallFuncLineContext ctx){
        return visit(ctx.callfunc());
    }
    
    @Override
    public Object visitParamCallFunc(CompiladorParser.ParamCallFuncContext ctx){
        FunctionControl fc = FunctionTable.getInstace().getFunc(ctx.VAR(0).getText());
        if(fc == null) {
            System.out.println("Funcao "+ ctx.getText()+" nao declarada!");
        }
        ControleContexto cc = ControleContexto.checaContexto(false, true, ctx.VAR(0).getText());
        ArrayList<ConteudoContexto> conteudoFuncao = tabela.pegaConteudo(cc);
        if(fc.getValorRetorno()==null){
            ParserRuleContext c = ctx.getParent();
            String aux = ""; 
        
            while((aux != "cmd") || (aux != "line")){
                aux = RuleNames.get(c.getRuleIndex());
                if(aux =="cmd" || aux=="line") break;
                c = c.getParent();
            }

            if(aux.equals("line")){
                
                //Atualizo valores das variaveis na funcao
                ControleContexto conteudoGlobal = ControleContexto.checaContexto(true, false, "");
                for(ConteudoContexto conteudo : conteudoFuncao){
                    ConteudoContexto auxiliar = (ConteudoContexto)tabela.achaValor(conteudoGlobal, conteudo.id);                    
                    conteudo.valor = auxiliar.valor;
                }
                ConteudoContexto t = (ConteudoContexto)tabela.achaValor(cc, "x");
                //System.out.println("Valor  x "+t.valor+" global");
                return visit(FunctionTable.getInstace().getFunc(ctx.VAR(0).getText()).getVoidContexto()); //chamar contexto func
            }
        
    }
        return fc.getValorRetorno();
}    
    @Override
    public Object visitAtrLine(CompiladorParser.AtrLineContext ctx){
        //CompiladorParser.ProgContext progctx = (CompiladorParser.ProgContext)ctx.getParent();
  
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
    public Object visitAtrCmd(CompiladorParser.AtrCmdContext ctx){
        ParserRuleContext c = ctx.getParent();
        String aux = "";
        while(aux!="func"){
            aux = RuleNames.get(c.getRuleIndex());
            if(RuleNames.get(c.getRuleIndex()).equals("func")) break;
            c = c.getParent();
        }
        CompiladorParser.VoidFuncContext ctxVoidFunc = null;
        ctxVoidFunc = (CompiladorParser.VoidFuncContext) c;
        AuxiliaTabela auxilia = (AuxiliaTabela)visit(ctx.atr());
        if(auxilia.isRetorno()){
            ControleContexto cc = ControleContexto.checaContexto(false, true, ctxVoidFunc.VAR(0).getText());
            ConteudoContexto conteudo = new ConteudoContexto(auxilia.tipo.tipo, auxilia.ID, auxilia.tipo.valor);
            tabela.adicionaTabela(cc,conteudo);
            return true;
        }
        return false;
    }
    
    @Override
    public Object visitPrintCmd(CompiladorParser.PrintCmdContext ctx){
        String id = (String)visit(ctx.print());
        ParserRuleContext c = ctx.getParent();
        String aux = "";
        while(aux!="func"){
            aux = RuleNames.get(c.getRuleIndex());
            if(RuleNames.get(c.getRuleIndex()).equals("func")) break;
            c = c.getParent();
        }
        CompiladorParser.VoidFuncContext ctxVoidFunc = null;
        ctxVoidFunc = (CompiladorParser.VoidFuncContext) c; 
        //System.out.println(id);
        ControleContexto cc = ControleContexto.checaContexto(false, true, ctxVoidFunc.VAR(0).getText());
        ArrayList<ConteudoContexto> contextos = tabela.pegaConteudo(cc);
        /*for(ConteudoContexto cxs : contextos){
            System.out.println(cxs.id + "=" +cxs.valor);
        }*/
        ConteudoContexto conteudo = (ConteudoContexto)tabela.retornaContexto(cc, id);
        if(conteudo == null) System.out.println("asdsadusha");;
        System.out.println(conteudo.valor);
        return id;
    }
    
    @Override
    public Object visitPrintLine(CompiladorParser.PrintLineContext ctx ){
        
        String id = (String)visit(ctx.print());
        ControleContexto cc = ControleContexto.checaContexto(true, false, "");
        ConteudoContexto conteudo = (ConteudoContexto)tabela.achaValor(cc, id);
        System.out.println(conteudo.valor);
        return conteudo;
    }
    
    @Override
    public Object visitVarPrint(CompiladorParser.VarPrintContext ctx){
        String id = ctx.VAR().getText();
        return id;
    }
}
