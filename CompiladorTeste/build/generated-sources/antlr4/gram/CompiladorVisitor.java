// Generated from R:\Users\Bruno\Documents\NetBeansProjects\CompiladorTeste\grammar\gram\Compilador.g4 by ANTLR 4.6

    package gram;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CompiladorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CompiladorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CompiladorParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(CompiladorParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompiladorParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(CompiladorParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompiladorParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(CompiladorParser.FuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtrCmd}
	 * labeled alternative in {@link CompiladorParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtrCmd(CompiladorParser.AtrCmdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InitCmd}
	 * labeled alternative in {@link CompiladorParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitCmd(CompiladorParser.InitCmdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrintCmd}
	 * labeled alternative in {@link CompiladorParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintCmd(CompiladorParser.PrintCmdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReadCmd}
	 * labeled alternative in {@link CompiladorParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadCmd(CompiladorParser.ReadCmdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfCmd}
	 * labeled alternative in {@link CompiladorParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfCmd(CompiladorParser.IfCmdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileCmd}
	 * labeled alternative in {@link CompiladorParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileCmd(CompiladorParser.WhileCmdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForCmd}
	 * labeled alternative in {@link CompiladorParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForCmd(CompiladorParser.ForCmdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FuncCmd}
	 * labeled alternative in {@link CompiladorParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCmd(CompiladorParser.FuncCmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompiladorParser#callfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallfunc(CompiladorParser.CallfuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompiladorParser#while_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_(CompiladorParser.While_Context ctx);
	/**
	 * Visit a parse tree produced by {@link CompiladorParser#for_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_(CompiladorParser.For_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code NormalIfStmt}
	 * labeled alternative in {@link CompiladorParser#ifstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalIfStmt(CompiladorParser.NormalIfStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NegIfStmt}
	 * labeled alternative in {@link CompiladorParser#ifstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegIfStmt(CompiladorParser.NegIfStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfElseIfStmt}
	 * labeled alternative in {@link CompiladorParser#ifstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElseIfStmt(CompiladorParser.IfElseIfStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OrCond}
	 * labeled alternative in {@link CompiladorParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrCond(CompiladorParser.OrCondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CdandCond}
	 * labeled alternative in {@link CompiladorParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCdandCond(CompiladorParser.CdandCondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AndCdand}
	 * labeled alternative in {@link CompiladorParser#cdand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndCdand(CompiladorParser.AndCdandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CndtsCdand}
	 * labeled alternative in {@link CompiladorParser#cdand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCndtsCdand(CompiladorParser.CndtsCdandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RelopCndts}
	 * labeled alternative in {@link CompiladorParser#cndts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelopCndts(CompiladorParser.RelopCndtsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CondCndts}
	 * labeled alternative in {@link CompiladorParser#cndts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondCndts(CompiladorParser.CondCndtsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompiladorParser#relop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelop(CompiladorParser.RelopContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompiladorParser#read}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead(CompiladorParser.ReadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConcatPrint}
	 * labeled alternative in {@link CompiladorParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcatPrint(CompiladorParser.ConcatPrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarPrint}
	 * labeled alternative in {@link CompiladorParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarPrint(CompiladorParser.VarPrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompiladorParser#init_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit_(CompiladorParser.Init_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code VarRetr}
	 * labeled alternative in {@link CompiladorParser#retr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarRetr(CompiladorParser.VarRetrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprRetr}
	 * labeled alternative in {@link CompiladorParser#retr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprRetr(CompiladorParser.ExprRetrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntAtr}
	 * labeled alternative in {@link CompiladorParser#atr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntAtr(CompiladorParser.IntAtrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DoubleAtr}
	 * labeled alternative in {@link CompiladorParser#atr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleAtr(CompiladorParser.DoubleAtrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FloatAtr}
	 * labeled alternative in {@link CompiladorParser#atr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatAtr(CompiladorParser.FloatAtrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringAtr}
	 * labeled alternative in {@link CompiladorParser#atr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringAtr(CompiladorParser.StringAtrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolAtr}
	 * labeled alternative in {@link CompiladorParser#atr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolAtr(CompiladorParser.BoolAtrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarExprFuncAtr}
	 * labeled alternative in {@link CompiladorParser#atr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarExprFuncAtr(CompiladorParser.VarExprFuncAtrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarStrAtr}
	 * labeled alternative in {@link CompiladorParser#atr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarStrAtr(CompiladorParser.VarStrAtrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarBoolAtr}
	 * labeled alternative in {@link CompiladorParser#atr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarBoolAtr(CompiladorParser.VarBoolAtrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TermExpr}
	 * labeled alternative in {@link CompiladorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermExpr(CompiladorParser.TermExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SumExpr}
	 * labeled alternative in {@link CompiladorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumExpr(CompiladorParser.SumExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MinusExpr}
	 * labeled alternative in {@link CompiladorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinusExpr(CompiladorParser.MinusExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FactTerm}
	 * labeled alternative in {@link CompiladorParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactTerm(CompiladorParser.FactTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultTerm}
	 * labeled alternative in {@link CompiladorParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultTerm(CompiladorParser.MultTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DivTerm}
	 * labeled alternative in {@link CompiladorParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivTerm(CompiladorParser.DivTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RestTerm}
	 * labeled alternative in {@link CompiladorParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRestTerm(CompiladorParser.RestTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varFact}
	 * labeled alternative in {@link CompiladorParser#fact}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarFact(CompiladorParser.VarFactContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumDoubleFact}
	 * labeled alternative in {@link CompiladorParser#fact}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumDoubleFact(CompiladorParser.NumDoubleFactContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumIntFact}
	 * labeled alternative in {@link CompiladorParser#fact}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumIntFact(CompiladorParser.NumIntFactContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprFact}
	 * labeled alternative in {@link CompiladorParser#fact}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprFact(CompiladorParser.ExprFactContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intType}
	 * labeled alternative in {@link CompiladorParser#type_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntType(CompiladorParser.IntTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code doubleType}
	 * labeled alternative in {@link CompiladorParser#type_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleType(CompiladorParser.DoubleTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code floatType}
	 * labeled alternative in {@link CompiladorParser#type_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatType(CompiladorParser.FloatTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringType}
	 * labeled alternative in {@link CompiladorParser#type_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringType(CompiladorParser.StringTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolType}
	 * labeled alternative in {@link CompiladorParser#type_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolType(CompiladorParser.BoolTypeContext ctx);
}