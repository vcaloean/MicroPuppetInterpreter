// Generated from PuppetGrammar.g4 by ANTLR 4.5
package ANTLR;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PuppetGrammarParser}.
 */
public interface PuppetGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PuppetGrammarParser#puppetAssignment}.
	 * @param ctx the parse tree
	 */
	void enterPuppetAssignment(PuppetGrammarParser.PuppetAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PuppetGrammarParser#puppetAssignment}.
	 * @param ctx the parse tree
	 */
	void exitPuppetAssignment(PuppetGrammarParser.PuppetAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PuppetGrammarParser#puppetAttributeBody}.
	 * @param ctx the parse tree
	 */
	void enterPuppetAttributeBody(PuppetGrammarParser.PuppetAttributeBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PuppetGrammarParser#puppetAttributeBody}.
	 * @param ctx the parse tree
	 */
	void exitPuppetAttributeBody(PuppetGrammarParser.PuppetAttributeBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PuppetGrammarParser#puppetAttributeValue}.
	 * @param ctx the parse tree
	 */
	void enterPuppetAttributeValue(PuppetGrammarParser.PuppetAttributeValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PuppetGrammarParser#puppetAttributeValue}.
	 * @param ctx the parse tree
	 */
	void exitPuppetAttributeValue(PuppetGrammarParser.PuppetAttributeValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PuppetGrammarParser#puppetCase}.
	 * @param ctx the parse tree
	 */
	void enterPuppetCase(PuppetGrammarParser.PuppetCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PuppetGrammarParser#puppetCase}.
	 * @param ctx the parse tree
	 */
	void exitPuppetCase(PuppetGrammarParser.PuppetCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PuppetGrammarParser#puppetCaseBody}.
	 * @param ctx the parse tree
	 */
	void enterPuppetCaseBody(PuppetGrammarParser.PuppetCaseBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PuppetGrammarParser#puppetCaseBody}.
	 * @param ctx the parse tree
	 */
	void exitPuppetCaseBody(PuppetGrammarParser.PuppetCaseBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PuppetGrammarParser#puppetCaseElement}.
	 * @param ctx the parse tree
	 */
	void enterPuppetCaseElement(PuppetGrammarParser.PuppetCaseElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PuppetGrammarParser#puppetCaseElement}.
	 * @param ctx the parse tree
	 */
	void exitPuppetCaseElement(PuppetGrammarParser.PuppetCaseElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PuppetGrammarParser#puppetClass}.
	 * @param ctx the parse tree
	 */
	void enterPuppetClass(PuppetGrammarParser.PuppetClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link PuppetGrammarParser#puppetClass}.
	 * @param ctx the parse tree
	 */
	void exitPuppetClass(PuppetGrammarParser.PuppetClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link PuppetGrammarParser#puppetClassDecl}.
	 * @param ctx the parse tree
	 */
	void enterPuppetClassDecl(PuppetGrammarParser.PuppetClassDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link PuppetGrammarParser#puppetClassDecl}.
	 * @param ctx the parse tree
	 */
	void exitPuppetClassDecl(PuppetGrammarParser.PuppetClassDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link PuppetGrammarParser#puppetClassInherits}.
	 * @param ctx the parse tree
	 */
	void enterPuppetClassInherits(PuppetGrammarParser.PuppetClassInheritsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PuppetGrammarParser#puppetClassInherits}.
	 * @param ctx the parse tree
	 */
	void exitPuppetClassInherits(PuppetGrammarParser.PuppetClassInheritsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code puppetClassNameScoped}
	 * labeled alternative in {@link PuppetGrammarParser#puppetClassName}.
	 * @param ctx the parse tree
	 */
	void enterPuppetClassNameScoped(PuppetGrammarParser.PuppetClassNameScopedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code puppetClassNameScoped}
	 * labeled alternative in {@link PuppetGrammarParser#puppetClassName}.
	 * @param ctx the parse tree
	 */
	void exitPuppetClassNameScoped(PuppetGrammarParser.PuppetClassNameScopedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code puppetClassNameEnd}
	 * labeled alternative in {@link PuppetGrammarParser#puppetClassName}.
	 * @param ctx the parse tree
	 */
	void enterPuppetClassNameEnd(PuppetGrammarParser.PuppetClassNameEndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code puppetClassNameEnd}
	 * labeled alternative in {@link PuppetGrammarParser#puppetClassName}.
	 * @param ctx the parse tree
	 */
	void exitPuppetClassNameEnd(PuppetGrammarParser.PuppetClassNameEndContext ctx);
	/**
	 * Enter a parse tree produced by {@link PuppetGrammarParser#puppetCustomSkip}.
	 * @param ctx the parse tree
	 */
	void enterPuppetCustomSkip(PuppetGrammarParser.PuppetCustomSkipContext ctx);
	/**
	 * Exit a parse tree produced by {@link PuppetGrammarParser#puppetCustomSkip}.
	 * @param ctx the parse tree
	 */
	void exitPuppetCustomSkip(PuppetGrammarParser.PuppetCustomSkipContext ctx);
	/**
	 * Enter a parse tree produced by {@link PuppetGrammarParser#puppetCustomScope}.
	 * @param ctx the parse tree
	 */
	void enterPuppetCustomScope(PuppetGrammarParser.PuppetCustomScopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PuppetGrammarParser#puppetCustomScope}.
	 * @param ctx the parse tree
	 */
	void exitPuppetCustomScope(PuppetGrammarParser.PuppetCustomScopeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code puppetCustomScopeDef}
	 * labeled alternative in {@link PuppetGrammarParser#puppetCustomScopeSpec}.
	 * @param ctx the parse tree
	 */
	void enterPuppetCustomScopeDef(PuppetGrammarParser.PuppetCustomScopeDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code puppetCustomScopeDef}
	 * labeled alternative in {@link PuppetGrammarParser#puppetCustomScopeSpec}.
	 * @param ctx the parse tree
	 */
	void exitPuppetCustomScopeDef(PuppetGrammarParser.PuppetCustomScopeDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code puppetCustomScopeRest}
	 * labeled alternative in {@link PuppetGrammarParser#puppetCustomScopeSpec}.
	 * @param ctx the parse tree
	 */
	void enterPuppetCustomScopeRest(PuppetGrammarParser.PuppetCustomScopeRestContext ctx);
	/**
	 * Exit a parse tree produced by the {@code puppetCustomScopeRest}
	 * labeled alternative in {@link PuppetGrammarParser#puppetCustomScopeSpec}.
	 * @param ctx the parse tree
	 */
	void exitPuppetCustomScopeRest(PuppetGrammarParser.PuppetCustomScopeRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link PuppetGrammarParser#puppetDefinedResDecl}.
	 * @param ctx the parse tree
	 */
	void enterPuppetDefinedResDecl(PuppetGrammarParser.PuppetDefinedResDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link PuppetGrammarParser#puppetDefinedResDecl}.
	 * @param ctx the parse tree
	 */
	void exitPuppetDefinedResDecl(PuppetGrammarParser.PuppetDefinedResDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link PuppetGrammarParser#puppetDefinedResType}.
	 * @param ctx the parse tree
	 */
	void enterPuppetDefinedResType(PuppetGrammarParser.PuppetDefinedResTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PuppetGrammarParser#puppetDefinedResType}.
	 * @param ctx the parse tree
	 */
	void exitPuppetDefinedResType(PuppetGrammarParser.PuppetDefinedResTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PuppetGrammarParser#puppetIf}.
	 * @param ctx the parse tree
	 */
	void enterPuppetIf(PuppetGrammarParser.PuppetIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link PuppetGrammarParser#puppetIf}.
	 * @param ctx the parse tree
	 */
	void exitPuppetIf(PuppetGrammarParser.PuppetIfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code puppetIfElse}
	 * labeled alternative in {@link PuppetGrammarParser#puppetIfContinuation}.
	 * @param ctx the parse tree
	 */
	void enterPuppetIfElse(PuppetGrammarParser.PuppetIfElseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code puppetIfElse}
	 * labeled alternative in {@link PuppetGrammarParser#puppetIfContinuation}.
	 * @param ctx the parse tree
	 */
	void exitPuppetIfElse(PuppetGrammarParser.PuppetIfElseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code puppetElse}
	 * labeled alternative in {@link PuppetGrammarParser#puppetIfContinuation}.
	 * @param ctx the parse tree
	 */
	void enterPuppetElse(PuppetGrammarParser.PuppetElseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code puppetElse}
	 * labeled alternative in {@link PuppetGrammarParser#puppetIfContinuation}.
	 * @param ctx the parse tree
	 */
	void exitPuppetElse(PuppetGrammarParser.PuppetElseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code puppetIfEnd}
	 * labeled alternative in {@link PuppetGrammarParser#puppetIfContinuation}.
	 * @param ctx the parse tree
	 */
	void enterPuppetIfEnd(PuppetGrammarParser.PuppetIfEndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code puppetIfEnd}
	 * labeled alternative in {@link PuppetGrammarParser#puppetIfContinuation}.
	 * @param ctx the parse tree
	 */
	void exitPuppetIfEnd(PuppetGrammarParser.PuppetIfEndContext ctx);
	/**
	 * Enter a parse tree produced by {@link PuppetGrammarParser#puppetInclude}.
	 * @param ctx the parse tree
	 */
	void enterPuppetInclude(PuppetGrammarParser.PuppetIncludeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PuppetGrammarParser#puppetInclude}.
	 * @param ctx the parse tree
	 */
	void exitPuppetInclude(PuppetGrammarParser.PuppetIncludeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PuppetGrammarParser#puppetLocalVariable}.
	 * @param ctx the parse tree
	 */
	void enterPuppetLocalVariable(PuppetGrammarParser.PuppetLocalVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PuppetGrammarParser#puppetLocalVariable}.
	 * @param ctx the parse tree
	 */
	void exitPuppetLocalVariable(PuppetGrammarParser.PuppetLocalVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PuppetGrammarParser#puppetNode}.
	 * @param ctx the parse tree
	 */
	void enterPuppetNode(PuppetGrammarParser.PuppetNodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PuppetGrammarParser#puppetNode}.
	 * @param ctx the parse tree
	 */
	void exitPuppetNode(PuppetGrammarParser.PuppetNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code puppetNameNotDefault}
	 * labeled alternative in {@link PuppetGrammarParser#puppetNodeSpecs}.
	 * @param ctx the parse tree
	 */
	void enterPuppetNameNotDefault(PuppetGrammarParser.PuppetNameNotDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code puppetNameNotDefault}
	 * labeled alternative in {@link PuppetGrammarParser#puppetNodeSpecs}.
	 * @param ctx the parse tree
	 */
	void exitPuppetNameNotDefault(PuppetGrammarParser.PuppetNameNotDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code puppetNameDefault}
	 * labeled alternative in {@link PuppetGrammarParser#puppetNodeSpecs}.
	 * @param ctx the parse tree
	 */
	void enterPuppetNameDefault(PuppetGrammarParser.PuppetNameDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code puppetNameDefault}
	 * labeled alternative in {@link PuppetGrammarParser#puppetNodeSpecs}.
	 * @param ctx the parse tree
	 */
	void exitPuppetNameDefault(PuppetGrammarParser.PuppetNameDefaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link PuppetGrammarParser#puppetParameter}.
	 * @param ctx the parse tree
	 */
	void enterPuppetParameter(PuppetGrammarParser.PuppetParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link PuppetGrammarParser#puppetParameter}.
	 * @param ctx the parse tree
	 */
	void exitPuppetParameter(PuppetGrammarParser.PuppetParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link PuppetGrammarParser#puppetParaSeq}.
	 * @param ctx the parse tree
	 */
	void enterPuppetParaSeq(PuppetGrammarParser.PuppetParaSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link PuppetGrammarParser#puppetParaSeq}.
	 * @param ctx the parse tree
	 */
	void exitPuppetParaSeq(PuppetGrammarParser.PuppetParaSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link PuppetGrammarParser#puppetProgram}.
	 * @param ctx the parse tree
	 */
	void enterPuppetProgram(PuppetGrammarParser.PuppetProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PuppetGrammarParser#puppetProgram}.
	 * @param ctx the parse tree
	 */
	void exitPuppetProgram(PuppetGrammarParser.PuppetProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PuppetGrammarParser#puppetProgramElement}.
	 * @param ctx the parse tree
	 */
	void enterPuppetProgramElement(PuppetGrammarParser.PuppetProgramElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PuppetGrammarParser#puppetProgramElement}.
	 * @param ctx the parse tree
	 */
	void exitPuppetProgramElement(PuppetGrammarParser.PuppetProgramElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PuppetGrammarParser#puppetQualifiedVariable}.
	 * @param ctx the parse tree
	 */
	void enterPuppetQualifiedVariable(PuppetGrammarParser.PuppetQualifiedVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PuppetGrammarParser#puppetQualifiedVariable}.
	 * @param ctx the parse tree
	 */
	void exitPuppetQualifiedVariable(PuppetGrammarParser.PuppetQualifiedVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PuppetGrammarParser#puppetResource}.
	 * @param ctx the parse tree
	 */
	void enterPuppetResource(PuppetGrammarParser.PuppetResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PuppetGrammarParser#puppetResource}.
	 * @param ctx the parse tree
	 */
	void exitPuppetResource(PuppetGrammarParser.PuppetResourceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code puppetScopeFull}
	 * labeled alternative in {@link PuppetGrammarParser#puppetScope}.
	 * @param ctx the parse tree
	 */
	void enterPuppetScopeFull(PuppetGrammarParser.PuppetScopeFullContext ctx);
	/**
	 * Exit a parse tree produced by the {@code puppetScopeFull}
	 * labeled alternative in {@link PuppetGrammarParser#puppetScope}.
	 * @param ctx the parse tree
	 */
	void exitPuppetScopeFull(PuppetGrammarParser.PuppetScopeFullContext ctx);
	/**
	 * Enter a parse tree produced by the {@code puppetScopeEmpty}
	 * labeled alternative in {@link PuppetGrammarParser#puppetScope}.
	 * @param ctx the parse tree
	 */
	void enterPuppetScopeEmpty(PuppetGrammarParser.PuppetScopeEmptyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code puppetScopeEmpty}
	 * labeled alternative in {@link PuppetGrammarParser#puppetScope}.
	 * @param ctx the parse tree
	 */
	void exitPuppetScopeEmpty(PuppetGrammarParser.PuppetScopeEmptyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PuppetGrammarParser#puppetSelectorBody}.
	 * @param ctx the parse tree
	 */
	void enterPuppetSelectorBody(PuppetGrammarParser.PuppetSelectorBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PuppetGrammarParser#puppetSelectorBody}.
	 * @param ctx the parse tree
	 */
	void exitPuppetSelectorBody(PuppetGrammarParser.PuppetSelectorBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code puppetSelectorNotDefault}
	 * labeled alternative in {@link PuppetGrammarParser#puppetSelectorElement}.
	 * @param ctx the parse tree
	 */
	void enterPuppetSelectorNotDefault(PuppetGrammarParser.PuppetSelectorNotDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code puppetSelectorNotDefault}
	 * labeled alternative in {@link PuppetGrammarParser#puppetSelectorElement}.
	 * @param ctx the parse tree
	 */
	void exitPuppetSelectorNotDefault(PuppetGrammarParser.PuppetSelectorNotDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code puppetSelectorDefault}
	 * labeled alternative in {@link PuppetGrammarParser#puppetSelectorElement}.
	 * @param ctx the parse tree
	 */
	void enterPuppetSelectorDefault(PuppetGrammarParser.PuppetSelectorDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code puppetSelectorDefault}
	 * labeled alternative in {@link PuppetGrammarParser#puppetSelectorElement}.
	 * @param ctx the parse tree
	 */
	void exitPuppetSelectorDefault(PuppetGrammarParser.PuppetSelectorDefaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link PuppetGrammarParser#puppetStatements}.
	 * @param ctx the parse tree
	 */
	void enterPuppetStatements(PuppetGrammarParser.PuppetStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PuppetGrammarParser#puppetStatements}.
	 * @param ctx the parse tree
	 */
	void exitPuppetStatements(PuppetGrammarParser.PuppetStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PuppetGrammarParser#puppetStatementElement}.
	 * @param ctx the parse tree
	 */
	void enterPuppetStatementElement(PuppetGrammarParser.PuppetStatementElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PuppetGrammarParser#puppetStatementElement}.
	 * @param ctx the parse tree
	 */
	void exitPuppetStatementElement(PuppetGrammarParser.PuppetStatementElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PuppetGrammarParser#puppetUnless}.
	 * @param ctx the parse tree
	 */
	void enterPuppetUnless(PuppetGrammarParser.PuppetUnlessContext ctx);
	/**
	 * Exit a parse tree produced by {@link PuppetGrammarParser#puppetUnless}.
	 * @param ctx the parse tree
	 */
	void exitPuppetUnless(PuppetGrammarParser.PuppetUnlessContext ctx);
	/**
	 * Enter a parse tree produced by {@link PuppetGrammarParser#puppetValue}.
	 * @param ctx the parse tree
	 */
	void enterPuppetValue(PuppetGrammarParser.PuppetValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PuppetGrammarParser#puppetValue}.
	 * @param ctx the parse tree
	 */
	void exitPuppetValue(PuppetGrammarParser.PuppetValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code puppetCompExpr}
	 * labeled alternative in {@link PuppetGrammarParser#puppetValueExp}.
	 * @param ctx the parse tree
	 */
	void enterPuppetCompExpr(PuppetGrammarParser.PuppetCompExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code puppetCompExpr}
	 * labeled alternative in {@link PuppetGrammarParser#puppetValueExp}.
	 * @param ctx the parse tree
	 */
	void exitPuppetCompExpr(PuppetGrammarParser.PuppetCompExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code puppetEqExpr}
	 * labeled alternative in {@link PuppetGrammarParser#puppetValueExp}.
	 * @param ctx the parse tree
	 */
	void enterPuppetEqExpr(PuppetGrammarParser.PuppetEqExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code puppetEqExpr}
	 * labeled alternative in {@link PuppetGrammarParser#puppetValueExp}.
	 * @param ctx the parse tree
	 */
	void exitPuppetEqExpr(PuppetGrammarParser.PuppetEqExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code puppetParaExpr}
	 * labeled alternative in {@link PuppetGrammarParser#puppetValueExp}.
	 * @param ctx the parse tree
	 */
	void enterPuppetParaExpr(PuppetGrammarParser.PuppetParaExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code puppetParaExpr}
	 * labeled alternative in {@link PuppetGrammarParser#puppetValueExp}.
	 * @param ctx the parse tree
	 */
	void exitPuppetParaExpr(PuppetGrammarParser.PuppetParaExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code puppetExprToVariable}
	 * labeled alternative in {@link PuppetGrammarParser#puppetValueExp}.
	 * @param ctx the parse tree
	 */
	void enterPuppetExprToVariable(PuppetGrammarParser.PuppetExprToVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code puppetExprToVariable}
	 * labeled alternative in {@link PuppetGrammarParser#puppetValueExp}.
	 * @param ctx the parse tree
	 */
	void exitPuppetExprToVariable(PuppetGrammarParser.PuppetExprToVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code puppetShiftExpr}
	 * labeled alternative in {@link PuppetGrammarParser#puppetValueExp}.
	 * @param ctx the parse tree
	 */
	void enterPuppetShiftExpr(PuppetGrammarParser.PuppetShiftExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code puppetShiftExpr}
	 * labeled alternative in {@link PuppetGrammarParser#puppetValueExp}.
	 * @param ctx the parse tree
	 */
	void exitPuppetShiftExpr(PuppetGrammarParser.PuppetShiftExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code puppetExprToValue}
	 * labeled alternative in {@link PuppetGrammarParser#puppetValueExp}.
	 * @param ctx the parse tree
	 */
	void enterPuppetExprToValue(PuppetGrammarParser.PuppetExprToValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code puppetExprToValue}
	 * labeled alternative in {@link PuppetGrammarParser#puppetValueExp}.
	 * @param ctx the parse tree
	 */
	void exitPuppetExprToValue(PuppetGrammarParser.PuppetExprToValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code puppetInExpr}
	 * labeled alternative in {@link PuppetGrammarParser#puppetValueExp}.
	 * @param ctx the parse tree
	 */
	void enterPuppetInExpr(PuppetGrammarParser.PuppetInExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code puppetInExpr}
	 * labeled alternative in {@link PuppetGrammarParser#puppetValueExp}.
	 * @param ctx the parse tree
	 */
	void exitPuppetInExpr(PuppetGrammarParser.PuppetInExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code puppetRegExpr}
	 * labeled alternative in {@link PuppetGrammarParser#puppetValueExp}.
	 * @param ctx the parse tree
	 */
	void enterPuppetRegExpr(PuppetGrammarParser.PuppetRegExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code puppetRegExpr}
	 * labeled alternative in {@link PuppetGrammarParser#puppetValueExp}.
	 * @param ctx the parse tree
	 */
	void exitPuppetRegExpr(PuppetGrammarParser.PuppetRegExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code puppetAddExpr}
	 * labeled alternative in {@link PuppetGrammarParser#puppetValueExp}.
	 * @param ctx the parse tree
	 */
	void enterPuppetAddExpr(PuppetGrammarParser.PuppetAddExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code puppetAddExpr}
	 * labeled alternative in {@link PuppetGrammarParser#puppetValueExp}.
	 * @param ctx the parse tree
	 */
	void exitPuppetAddExpr(PuppetGrammarParser.PuppetAddExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code puppetMultExpr}
	 * labeled alternative in {@link PuppetGrammarParser#puppetValueExp}.
	 * @param ctx the parse tree
	 */
	void enterPuppetMultExpr(PuppetGrammarParser.PuppetMultExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code puppetMultExpr}
	 * labeled alternative in {@link PuppetGrammarParser#puppetValueExp}.
	 * @param ctx the parse tree
	 */
	void exitPuppetMultExpr(PuppetGrammarParser.PuppetMultExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code puppetNotExpr}
	 * labeled alternative in {@link PuppetGrammarParser#puppetValueExp}.
	 * @param ctx the parse tree
	 */
	void enterPuppetNotExpr(PuppetGrammarParser.PuppetNotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code puppetNotExpr}
	 * labeled alternative in {@link PuppetGrammarParser#puppetValueExp}.
	 * @param ctx the parse tree
	 */
	void exitPuppetNotExpr(PuppetGrammarParser.PuppetNotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code puppetOrExpr}
	 * labeled alternative in {@link PuppetGrammarParser#puppetValueExp}.
	 * @param ctx the parse tree
	 */
	void enterPuppetOrExpr(PuppetGrammarParser.PuppetOrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code puppetOrExpr}
	 * labeled alternative in {@link PuppetGrammarParser#puppetValueExp}.
	 * @param ctx the parse tree
	 */
	void exitPuppetOrExpr(PuppetGrammarParser.PuppetOrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code puppetSelector}
	 * labeled alternative in {@link PuppetGrammarParser#puppetValueExp}.
	 * @param ctx the parse tree
	 */
	void enterPuppetSelector(PuppetGrammarParser.PuppetSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code puppetSelector}
	 * labeled alternative in {@link PuppetGrammarParser#puppetValueExp}.
	 * @param ctx the parse tree
	 */
	void exitPuppetSelector(PuppetGrammarParser.PuppetSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code puppetAndExpr}
	 * labeled alternative in {@link PuppetGrammarParser#puppetValueExp}.
	 * @param ctx the parse tree
	 */
	void enterPuppetAndExpr(PuppetGrammarParser.PuppetAndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code puppetAndExpr}
	 * labeled alternative in {@link PuppetGrammarParser#puppetValueExp}.
	 * @param ctx the parse tree
	 */
	void exitPuppetAndExpr(PuppetGrammarParser.PuppetAndExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PuppetGrammarParser#puppetVariable}.
	 * @param ctx the parse tree
	 */
	void enterPuppetVariable(PuppetGrammarParser.PuppetVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PuppetGrammarParser#puppetVariable}.
	 * @param ctx the parse tree
	 */
	void exitPuppetVariable(PuppetGrammarParser.PuppetVariableContext ctx);
}