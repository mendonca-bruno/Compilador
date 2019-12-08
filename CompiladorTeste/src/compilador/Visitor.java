/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilador;
import gram.CompiladorBaseVisitor;
import gram.CompiladorParser;
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
        Token firstToken = ctx.start;
        Tipo verificaTipo = (Tipo) visit(ctx.expr());        
        if(verificaTipo.getTipo().equals("Double")){
            System.out.println("Erro na linha: " +firstToken.getLine() + " Coluna: " +firstToken.getCharPositionInLine() + " - Tipo Incompativel!");
            return false;
        }
        return true;
    }
    
    @Override
    public Object visitSumExpr(CompiladorParser.SumExprContext ctx){
        
        return new Util().somar((Tipo)visit(ctx.expr()), (Tipo)visit(ctx.term()));
    }
    
}
