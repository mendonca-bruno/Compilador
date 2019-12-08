/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilador;
import gram.CompiladorBaseVisitor;
import gram.CompiladorParser;
import java.util.ArrayList;
import org.antlr.v4.runtime.CommonTokenStream;
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
    TabelaSimbolos tabela = new TabelaSimbolos();
    
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
    public Object visitIntAtr(CompiladorParser.IntAtrContext ctx){
        AuxiliaTabela aux;
        Token firstToken = ctx.start;
        Tipo verificaTipo = (Tipo) visit(ctx.expr());        
        if(verificaTipo.getTipo().equals("Double")){
            System.out.println("Erro na linha: " +firstToken.getLine() + " Coluna: " +firstToken.getCharPositionInLine() + " - Tipo Incompativel!");
            aux = new AuxiliaTabela(verificaTipo, false, (String)ctx.VAR().getText());
            return aux;
        }
        aux = new AuxiliaTabela(verificaTipo, true, (String)ctx.VAR().getText());
        return aux;
    }
    
    @Override
    public Object visitSumExpr(CompiladorParser.SumExprContext ctx){
        
        return new Util().somar((Tipo)visit(ctx.expr()), (Tipo)visit(ctx.term())); //retorna Tipo
    }
    
    
    @Override
    public Object visitAtrLine(CompiladorParser.AtrLineContext ctx){
        AuxiliaTabela auxilia = (AuxiliaTabela)visit(ctx.atr());
        if(auxilia.isRetorno()){
            ControleContexto cc = ControleContexto.getInstance(true, false, "");
            ConteudoContexto conteudo = new ConteudoContexto(auxilia.tipo.tipo, auxilia.ID, auxilia.tipo.valor);
            tabela.adicionaTabela(cc,conteudo);
            System.out.println(tabela.tamanhoTabela());
            return true;
        }
        return false;
    }
}
