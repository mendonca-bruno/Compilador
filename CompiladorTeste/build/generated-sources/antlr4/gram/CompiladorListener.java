// Generated from R:\Users\Bruno\Documents\CompiladorProjeto\Definitivo\CompiladorTeste\grammar\gram\Compilador.g4 by ANTLR 4.6

    package gram;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CompiladorParser}.
 */
public interface CompiladorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CompiladorParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(CompiladorParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompiladorParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(CompiladorParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtrLine}
	 * labeled alternative in {@link CompiladorParser#line}.
	 * @param ctx the parse tree
	 */
	void enterAtrLine(CompiladorParser.AtrLineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtrLine}
	 * labeled alternative in {@link CompiladorParser#line}.
	 * @param ctx the parse tree
	 */
	void exitAtrLine(CompiladorParser.AtrLineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InitLine}
	 * labeled alternative in {@link CompiladorParser#line}.
	 * @param ctx the parse tree
	 */
	void enterInitLine(CompiladorParser.InitLineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InitLine}
	 * labeled alternative in {@link CompiladorParser#line}.
	 * @param ctx the parse tree
	 */
	void exitInitLine(CompiladorParser.InitLineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CallFuncLine}
	 * labeled alternative in {@link CompiladorParser#line}.
	 * @param ctx the parse tree
	 */
	void enterCallFuncLine(CompiladorParser.CallFuncLineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CallFuncLine}
	 * labeled alternative in {@link CompiladorParser#line}.
	 * @param ctx the parse tree
	 */
	void exitCallFuncLine(CompiladorParser.CallFuncLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompiladorParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(CompiladorParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompiladorParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(CompiladorParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtrCmd}
	 * labeled alternative in {@link CompiladorParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterAtrCmd(CompiladorParser.AtrCmdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtrCmd}
	 * labeled alternative in {@link CompiladorParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitAtrCmd(CompiladorParser.AtrCmdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InitCmd}
	 * labeled alternative in {@link CompiladorParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterInitCmd(CompiladorParser.InitCmdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InitCmd}
	 * labeled alternative in {@link CompiladorParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitInitCmd(CompiladorParser.InitCmdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrintCmd}
	 * labeled alternative in {@link CompiladorParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterPrintCmd(CompiladorParser.PrintCmdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrintCmd}
	 * labeled alternative in {@link CompiladorParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitPrintCmd(CompiladorParser.PrintCmdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReadCmd}
	 * labeled alternative in {@link CompiladorParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterReadCmd(CompiladorParser.ReadCmdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReadCmd}
	 * labeled alternative in {@link CompiladorParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitReadCmd(CompiladorParser.ReadCmdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfCmd}
	 * labeled alternative in {@link CompiladorParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterIfCmd(CompiladorParser.IfCmdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfCmd}
	 * labeled alternative in {@link CompiladorParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitIfCmd(CompiladorParser.IfCmdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileCmd}
	 * labeled alternative in {@link CompiladorParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterWhileCmd(CompiladorParser.WhileCmdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileCmd}
	 * labeled alternative in {@link CompiladorParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitWhileCmd(CompiladorParser.WhileCmdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForCmd}
	 * labeled alternative in {@link CompiladorParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterForCmd(CompiladorParser.ForCmdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForCmd}
	 * labeled alternative in {@link CompiladorParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitForCmd(CompiladorParser.ForCmdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FuncCmd}
	 * labeled alternative in {@link CompiladorParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterFuncCmd(CompiladorParser.FuncCmdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FuncCmd}
	 * labeled alternative in {@link CompiladorParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitFuncCmd(CompiladorParser.FuncCmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompiladorParser#callfunc}.
	 * @param ctx the parse tree
	 */
	void enterCallfunc(CompiladorParser.CallfuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompiladorParser#callfunc}.
	 * @param ctx the parse tree
	 */
	void exitCallfunc(CompiladorParser.CallfuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompiladorParser#while_}.
	 * @param ctx the parse tree
	 */
	void enterWhile_(CompiladorParser.While_Context ctx);
	/**
	 * Exit a parse tree produced by {@link CompiladorParser#while_}.
	 * @param ctx the parse tree
	 */
	void exitWhile_(CompiladorParser.While_Context ctx);
	/**
	 * Enter a parse tree produced by {@link CompiladorParser#for_}.
	 * @param ctx the parse tree
	 */
	void enterFor_(CompiladorParser.For_Context ctx);
	/**
	 * Exit a parse tree produced by {@link CompiladorParser#for_}.
	 * @param ctx the parse tree
	 */
	void exitFor_(CompiladorParser.For_Context ctx);
	/**
	 * Enter a parse tree produced by the {@code NormalIfStmt}
	 * labeled alternative in {@link CompiladorParser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void enterNormalIfStmt(CompiladorParser.NormalIfStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NormalIfStmt}
	 * labeled alternative in {@link CompiladorParser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void exitNormalIfStmt(CompiladorParser.NormalIfStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NegIfStmt}
	 * labeled alternative in {@link CompiladorParser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void enterNegIfStmt(CompiladorParser.NegIfStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NegIfStmt}
	 * labeled alternative in {@link CompiladorParser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void exitNegIfStmt(CompiladorParser.NegIfStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfElseIfStmt}
	 * labeled alternative in {@link CompiladorParser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void enterIfElseIfStmt(CompiladorParser.IfElseIfStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfElseIfStmt}
	 * labeled alternative in {@link CompiladorParser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void exitIfElseIfStmt(CompiladorParser.IfElseIfStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OrCond}
	 * labeled alternative in {@link CompiladorParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterOrCond(CompiladorParser.OrCondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OrCond}
	 * labeled alternative in {@link CompiladorParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitOrCond(CompiladorParser.OrCondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CdandCond}
	 * labeled alternative in {@link CompiladorParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCdandCond(CompiladorParser.CdandCondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CdandCond}
	 * labeled alternative in {@link CompiladorParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCdandCond(CompiladorParser.CdandCondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AndCdand}
	 * labeled alternative in {@link CompiladorParser#cdand}.
	 * @param ctx the parse tree
	 */
	void enterAndCdand(CompiladorParser.AndCdandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndCdand}
	 * labeled alternative in {@link CompiladorParser#cdand}.
	 * @param ctx the parse tree
	 */
	void exitAndCdand(CompiladorParser.AndCdandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CndtsCdand}
	 * labeled alternative in {@link CompiladorParser#cdand}.
	 * @param ctx the parse tree
	 */
	void enterCndtsCdand(CompiladorParser.CndtsCdandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CndtsCdand}
	 * labeled alternative in {@link CompiladorParser#cdand}.
	 * @param ctx the parse tree
	 */
	void exitCndtsCdand(CompiladorParser.CndtsCdandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RelopCndts}
	 * labeled alternative in {@link CompiladorParser#cndts}.
	 * @param ctx the parse tree
	 */
	void enterRelopCndts(CompiladorParser.RelopCndtsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RelopCndts}
	 * labeled alternative in {@link CompiladorParser#cndts}.
	 * @param ctx the parse tree
	 */
	void exitRelopCndts(CompiladorParser.RelopCndtsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CondCndts}
	 * labeled alternative in {@link CompiladorParser#cndts}.
	 * @param ctx the parse tree
	 */
	void enterCondCndts(CompiladorParser.CondCndtsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CondCndts}
	 * labeled alternative in {@link CompiladorParser#cndts}.
	 * @param ctx the parse tree
	 */
	void exitCondCndts(CompiladorParser.CondCndtsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompiladorParser#relop}.
	 * @param ctx the parse tree
	 */
	void enterRelop(CompiladorParser.RelopContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompiladorParser#relop}.
	 * @param ctx the parse tree
	 */
	void exitRelop(CompiladorParser.RelopContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompiladorParser#read}.
	 * @param ctx the parse tree
	 */
	void enterRead(CompiladorParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompiladorParser#read}.
	 * @param ctx the parse tree
	 */
	void exitRead(CompiladorParser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConcatPrint}
	 * labeled alternative in {@link CompiladorParser#print}.
	 * @param ctx the parse tree
	 */
	void enterConcatPrint(CompiladorParser.ConcatPrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConcatPrint}
	 * labeled alternative in {@link CompiladorParser#print}.
	 * @param ctx the parse tree
	 */
	void exitConcatPrint(CompiladorParser.ConcatPrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarPrint}
	 * labeled alternative in {@link CompiladorParser#print}.
	 * @param ctx the parse tree
	 */
	void enterVarPrint(CompiladorParser.VarPrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarPrint}
	 * labeled alternative in {@link CompiladorParser#print}.
	 * @param ctx the parse tree
	 */
	void exitVarPrint(CompiladorParser.VarPrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompiladorParser#init_}.
	 * @param ctx the parse tree
	 */
	void enterInit_(CompiladorParser.Init_Context ctx);
	/**
	 * Exit a parse tree produced by {@link CompiladorParser#init_}.
	 * @param ctx the parse tree
	 */
	void exitInit_(CompiladorParser.Init_Context ctx);
	/**
	 * Enter a parse tree produced by the {@code VarRetr}
	 * labeled alternative in {@link CompiladorParser#retr}.
	 * @param ctx the parse tree
	 */
	void enterVarRetr(CompiladorParser.VarRetrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarRetr}
	 * labeled alternative in {@link CompiladorParser#retr}.
	 * @param ctx the parse tree
	 */
	void exitVarRetr(CompiladorParser.VarRetrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprRetr}
	 * labeled alternative in {@link CompiladorParser#retr}.
	 * @param ctx the parse tree
	 */
	void enterExprRetr(CompiladorParser.ExprRetrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprRetr}
	 * labeled alternative in {@link CompiladorParser#retr}.
	 * @param ctx the parse tree
	 */
	void exitExprRetr(CompiladorParser.ExprRetrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntAtr}
	 * labeled alternative in {@link CompiladorParser#atr}.
	 * @param ctx the parse tree
	 */
	void enterIntAtr(CompiladorParser.IntAtrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntAtr}
	 * labeled alternative in {@link CompiladorParser#atr}.
	 * @param ctx the parse tree
	 */
	void exitIntAtr(CompiladorParser.IntAtrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DoubleAtr}
	 * labeled alternative in {@link CompiladorParser#atr}.
	 * @param ctx the parse tree
	 */
	void enterDoubleAtr(CompiladorParser.DoubleAtrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoubleAtr}
	 * labeled alternative in {@link CompiladorParser#atr}.
	 * @param ctx the parse tree
	 */
	void exitDoubleAtr(CompiladorParser.DoubleAtrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FloatAtr}
	 * labeled alternative in {@link CompiladorParser#atr}.
	 * @param ctx the parse tree
	 */
	void enterFloatAtr(CompiladorParser.FloatAtrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FloatAtr}
	 * labeled alternative in {@link CompiladorParser#atr}.
	 * @param ctx the parse tree
	 */
	void exitFloatAtr(CompiladorParser.FloatAtrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringAtr}
	 * labeled alternative in {@link CompiladorParser#atr}.
	 * @param ctx the parse tree
	 */
	void enterStringAtr(CompiladorParser.StringAtrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringAtr}
	 * labeled alternative in {@link CompiladorParser#atr}.
	 * @param ctx the parse tree
	 */
	void exitStringAtr(CompiladorParser.StringAtrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolAtr}
	 * labeled alternative in {@link CompiladorParser#atr}.
	 * @param ctx the parse tree
	 */
	void enterBoolAtr(CompiladorParser.BoolAtrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolAtr}
	 * labeled alternative in {@link CompiladorParser#atr}.
	 * @param ctx the parse tree
	 */
	void exitBoolAtr(CompiladorParser.BoolAtrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarExprFuncAtr}
	 * labeled alternative in {@link CompiladorParser#atr}.
	 * @param ctx the parse tree
	 */
	void enterVarExprFuncAtr(CompiladorParser.VarExprFuncAtrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarExprFuncAtr}
	 * labeled alternative in {@link CompiladorParser#atr}.
	 * @param ctx the parse tree
	 */
	void exitVarExprFuncAtr(CompiladorParser.VarExprFuncAtrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarStrAtr}
	 * labeled alternative in {@link CompiladorParser#atr}.
	 * @param ctx the parse tree
	 */
	void enterVarStrAtr(CompiladorParser.VarStrAtrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarStrAtr}
	 * labeled alternative in {@link CompiladorParser#atr}.
	 * @param ctx the parse tree
	 */
	void exitVarStrAtr(CompiladorParser.VarStrAtrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarBoolAtr}
	 * labeled alternative in {@link CompiladorParser#atr}.
	 * @param ctx the parse tree
	 */
	void enterVarBoolAtr(CompiladorParser.VarBoolAtrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarBoolAtr}
	 * labeled alternative in {@link CompiladorParser#atr}.
	 * @param ctx the parse tree
	 */
	void exitVarBoolAtr(CompiladorParser.VarBoolAtrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TermExpr}
	 * labeled alternative in {@link CompiladorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterTermExpr(CompiladorParser.TermExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TermExpr}
	 * labeled alternative in {@link CompiladorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitTermExpr(CompiladorParser.TermExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SumExpr}
	 * labeled alternative in {@link CompiladorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSumExpr(CompiladorParser.SumExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SumExpr}
	 * labeled alternative in {@link CompiladorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSumExpr(CompiladorParser.SumExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MinusExpr}
	 * labeled alternative in {@link CompiladorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMinusExpr(CompiladorParser.MinusExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MinusExpr}
	 * labeled alternative in {@link CompiladorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMinusExpr(CompiladorParser.MinusExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FactTerm}
	 * labeled alternative in {@link CompiladorParser#term}.
	 * @param ctx the parse tree
	 */
	void enterFactTerm(CompiladorParser.FactTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FactTerm}
	 * labeled alternative in {@link CompiladorParser#term}.
	 * @param ctx the parse tree
	 */
	void exitFactTerm(CompiladorParser.FactTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultTerm}
	 * labeled alternative in {@link CompiladorParser#term}.
	 * @param ctx the parse tree
	 */
	void enterMultTerm(CompiladorParser.MultTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultTerm}
	 * labeled alternative in {@link CompiladorParser#term}.
	 * @param ctx the parse tree
	 */
	void exitMultTerm(CompiladorParser.MultTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DivTerm}
	 * labeled alternative in {@link CompiladorParser#term}.
	 * @param ctx the parse tree
	 */
	void enterDivTerm(CompiladorParser.DivTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DivTerm}
	 * labeled alternative in {@link CompiladorParser#term}.
	 * @param ctx the parse tree
	 */
	void exitDivTerm(CompiladorParser.DivTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RestTerm}
	 * labeled alternative in {@link CompiladorParser#term}.
	 * @param ctx the parse tree
	 */
	void enterRestTerm(CompiladorParser.RestTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RestTerm}
	 * labeled alternative in {@link CompiladorParser#term}.
	 * @param ctx the parse tree
	 */
	void exitRestTerm(CompiladorParser.RestTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varFact}
	 * labeled alternative in {@link CompiladorParser#fact}.
	 * @param ctx the parse tree
	 */
	void enterVarFact(CompiladorParser.VarFactContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varFact}
	 * labeled alternative in {@link CompiladorParser#fact}.
	 * @param ctx the parse tree
	 */
	void exitVarFact(CompiladorParser.VarFactContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumDoubleFact}
	 * labeled alternative in {@link CompiladorParser#fact}.
	 * @param ctx the parse tree
	 */
	void enterNumDoubleFact(CompiladorParser.NumDoubleFactContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumDoubleFact}
	 * labeled alternative in {@link CompiladorParser#fact}.
	 * @param ctx the parse tree
	 */
	void exitNumDoubleFact(CompiladorParser.NumDoubleFactContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumIntFact}
	 * labeled alternative in {@link CompiladorParser#fact}.
	 * @param ctx the parse tree
	 */
	void enterNumIntFact(CompiladorParser.NumIntFactContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumIntFact}
	 * labeled alternative in {@link CompiladorParser#fact}.
	 * @param ctx the parse tree
	 */
	void exitNumIntFact(CompiladorParser.NumIntFactContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprFact}
	 * labeled alternative in {@link CompiladorParser#fact}.
	 * @param ctx the parse tree
	 */
	void enterExprFact(CompiladorParser.ExprFactContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprFact}
	 * labeled alternative in {@link CompiladorParser#fact}.
	 * @param ctx the parse tree
	 */
	void exitExprFact(CompiladorParser.ExprFactContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intType}
	 * labeled alternative in {@link CompiladorParser#type_}.
	 * @param ctx the parse tree
	 */
	void enterIntType(CompiladorParser.IntTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intType}
	 * labeled alternative in {@link CompiladorParser#type_}.
	 * @param ctx the parse tree
	 */
	void exitIntType(CompiladorParser.IntTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code doubleType}
	 * labeled alternative in {@link CompiladorParser#type_}.
	 * @param ctx the parse tree
	 */
	void enterDoubleType(CompiladorParser.DoubleTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doubleType}
	 * labeled alternative in {@link CompiladorParser#type_}.
	 * @param ctx the parse tree
	 */
	void exitDoubleType(CompiladorParser.DoubleTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code floatType}
	 * labeled alternative in {@link CompiladorParser#type_}.
	 * @param ctx the parse tree
	 */
	void enterFloatType(CompiladorParser.FloatTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code floatType}
	 * labeled alternative in {@link CompiladorParser#type_}.
	 * @param ctx the parse tree
	 */
	void exitFloatType(CompiladorParser.FloatTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringType}
	 * labeled alternative in {@link CompiladorParser#type_}.
	 * @param ctx the parse tree
	 */
	void enterStringType(CompiladorParser.StringTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringType}
	 * labeled alternative in {@link CompiladorParser#type_}.
	 * @param ctx the parse tree
	 */
	void exitStringType(CompiladorParser.StringTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolType}
	 * labeled alternative in {@link CompiladorParser#type_}.
	 * @param ctx the parse tree
	 */
	void enterBoolType(CompiladorParser.BoolTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolType}
	 * labeled alternative in {@link CompiladorParser#type_}.
	 * @param ctx the parse tree
	 */
	void exitBoolType(CompiladorParser.BoolTypeContext ctx);
}