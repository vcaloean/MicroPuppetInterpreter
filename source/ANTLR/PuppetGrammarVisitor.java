// Generated from PuppetGrammar.g4 by ANTLR 4.5
package ANTLR;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PuppetGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PuppetGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PuppetGrammarParser#puppetAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPuppetAssignment(PuppetGrammarParser.PuppetAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PuppetGrammarParser#puppetAttributeBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPuppetAttributeBody(PuppetGrammarParser.PuppetAttributeBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PuppetGrammarParser#puppetAttributeValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPuppetAttributeValue(PuppetGrammarParser.PuppetAttributeValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PuppetGrammarParser#puppetCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPuppetCase(PuppetGrammarParser.PuppetCaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PuppetGrammarParser#puppetCaseBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPuppetCaseBody(PuppetGrammarParser.PuppetCaseBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PuppetGrammarParser#puppetCaseElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPuppetCaseElement(PuppetGrammarParser.PuppetCaseElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PuppetGrammarParser#puppetClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPuppetClass(PuppetGrammarParser.PuppetClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link PuppetGrammarParser#puppetClassDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPuppetClassDecl(PuppetGrammarParser.PuppetClassDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link PuppetGrammarParser#puppetClassInherits}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPuppetClassInherits(PuppetGrammarParser.PuppetClassInheritsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code puppetClassNameScoped}
	 * labeled alternative in {@link PuppetGrammarParser#puppetClassName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPuppetClassNameScoped(PuppetGrammarParser.PuppetClassNameScopedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code puppetClassNameEnd}
	 * labeled alternative in {@link PuppetGrammarParser#puppetClassName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPuppetClassNameEnd(PuppetGrammarParser.PuppetClassNameEndContext ctx);
	/**
	 * Visit a parse tree produced by {@link PuppetGrammarParser#puppetCustomSkip}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPuppetCustomSkip(PuppetGrammarParser.PuppetCustomSkipContext ctx);
	/**
	 * Visit a parse tree produced by {@link PuppetGrammarParser#puppetCustomScope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPuppetCustomScope(PuppetGrammarParser.PuppetCustomScopeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code puppetCustomScopeDef}
	 * labeled alternative in {@link PuppetGrammarParser#puppetCustomScopeSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPuppetCustomScopeDef(PuppetGrammarParser.PuppetCustomScopeDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code puppetCustomScopeRest}
	 * labeled alternative in {@link PuppetGrammarParser#puppetCustomScopeSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPuppetCustomScopeRest(PuppetGrammarParser.PuppetCustomScopeRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link PuppetGrammarParser#puppetDefinedResDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPuppetDefinedResDecl(PuppetGrammarParser.PuppetDefinedResDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link PuppetGrammarParser#puppetDefinedResType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPuppetDefinedResType(PuppetGrammarParser.PuppetDefinedResTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PuppetGrammarParser#puppetIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPuppetIf(PuppetGrammarParser.PuppetIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code puppetIfElse}
	 * labeled alternative in {@link PuppetGrammarParser#puppetIfContinuation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPuppetIfElse(PuppetGrammarParser.PuppetIfElseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code puppetElse}
	 * labeled alternative in {@link PuppetGrammarParser#puppetIfContinuation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPuppetElse(PuppetGrammarParser.PuppetElseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code puppetIfEnd}
	 * labeled alternative in {@link PuppetGrammarParser#puppetIfContinuation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPuppetIfEnd(PuppetGrammarParser.PuppetIfEndContext ctx);
	/**
	 * Visit a parse tree produced by {@link PuppetGrammarParser#puppetInclude}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPuppetInclude(PuppetGrammarParser.PuppetIncludeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PuppetGrammarParser#puppetLocalVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPuppetLocalVariable(PuppetGrammarParser.PuppetLocalVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PuppetGrammarParser#puppetNode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPuppetNode(PuppetGrammarParser.PuppetNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code puppetNameNotDefault}
	 * labeled alternative in {@link PuppetGrammarParser#puppetNodeSpecs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPuppetNameNotDefault(PuppetGrammarParser.PuppetNameNotDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code puppetNameDefault}
	 * labeled alternative in {@link PuppetGrammarParser#puppetNodeSpecs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPuppetNameDefault(PuppetGrammarParser.PuppetNameDefaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link PuppetGrammarParser#puppetParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPuppetParameter(PuppetGrammarParser.PuppetParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link PuppetGrammarParser#puppetParaSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPuppetParaSeq(PuppetGrammarParser.PuppetParaSeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link PuppetGrammarParser#puppetProgram}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPuppetProgram(PuppetGrammarParser.PuppetProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link PuppetGrammarParser#puppetProgramElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPuppetProgramElement(PuppetGrammarParser.PuppetProgramElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PuppetGrammarParser#puppetQualifiedVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPuppetQualifiedVariable(PuppetGrammarParser.PuppetQualifiedVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PuppetGrammarParser#puppetResource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPuppetResource(PuppetGrammarParser.PuppetResourceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code puppetScopeFull}
	 * labeled alternative in {@link PuppetGrammarParser#puppetScope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPuppetScopeFull(PuppetGrammarParser.PuppetScopeFullContext ctx);
	/**
	 * Visit a parse tree produced by the {@code puppetScopeEmpty}
	 * labeled alternative in {@link PuppetGrammarParser#puppetScope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPuppetScopeEmpty(PuppetGrammarParser.PuppetScopeEmptyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PuppetGrammarParser#puppetSelectorBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPuppetSelectorBody(PuppetGrammarParser.PuppetSelectorBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code puppetSelectorNotDefault}
	 * labeled alternative in {@link PuppetGrammarParser#puppetSelectorElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPuppetSelectorNotDefault(PuppetGrammarParser.PuppetSelectorNotDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code puppetSelectorDefault}
	 * labeled alternative in {@link PuppetGrammarParser#puppetSelectorElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPuppetSelectorDefault(PuppetGrammarParser.PuppetSelectorDefaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link PuppetGrammarParser#puppetStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPuppetStatements(PuppetGrammarParser.PuppetStatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PuppetGrammarParser#puppetStatementElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPuppetStatementElement(PuppetGrammarParser.PuppetStatementElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PuppetGrammarParser#puppetUnless}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPuppetUnless(PuppetGrammarParser.PuppetUnlessContext ctx);
	/**
	 * Visit a parse tree produced by {@link PuppetGrammarParser#puppetValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPuppetValue(PuppetGrammarParser.PuppetValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code puppetCompExpr}
	 * labeled alternative in {@link PuppetGrammarParser#puppetValueExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPuppetCompExpr(PuppetGrammarParser.PuppetCompExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code puppetEqExpr}
	 * labeled alternative in {@link PuppetGrammarParser#puppetValueExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPuppetEqExpr(PuppetGrammarParser.PuppetEqExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code puppetParaExpr}
	 * labeled alternative in {@link PuppetGrammarParser#puppetValueExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPuppetParaExpr(PuppetGrammarParser.PuppetParaExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code puppetExprToVariable}
	 * labeled alternative in {@link PuppetGrammarParser#puppetValueExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPuppetExprToVariable(PuppetGrammarParser.PuppetExprToVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code puppetShiftExpr}
	 * labeled alternative in {@link PuppetGrammarParser#puppetValueExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPuppetShiftExpr(PuppetGrammarParser.PuppetShiftExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code puppetExprToValue}
	 * labeled alternative in {@link PuppetGrammarParser#puppetValueExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPuppetExprToValue(PuppetGrammarParser.PuppetExprToValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code puppetInExpr}
	 * labeled alternative in {@link PuppetGrammarParser#puppetValueExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPuppetInExpr(PuppetGrammarParser.PuppetInExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code puppetRegExpr}
	 * labeled alternative in {@link PuppetGrammarParser#puppetValueExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPuppetRegExpr(PuppetGrammarParser.PuppetRegExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code puppetAddExpr}
	 * labeled alternative in {@link PuppetGrammarParser#puppetValueExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPuppetAddExpr(PuppetGrammarParser.PuppetAddExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code puppetMultExpr}
	 * labeled alternative in {@link PuppetGrammarParser#puppetValueExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPuppetMultExpr(PuppetGrammarParser.PuppetMultExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code puppetNotExpr}
	 * labeled alternative in {@link PuppetGrammarParser#puppetValueExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPuppetNotExpr(PuppetGrammarParser.PuppetNotExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code puppetOrExpr}
	 * labeled alternative in {@link PuppetGrammarParser#puppetValueExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPuppetOrExpr(PuppetGrammarParser.PuppetOrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code puppetSelector}
	 * labeled alternative in {@link PuppetGrammarParser#puppetValueExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPuppetSelector(PuppetGrammarParser.PuppetSelectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code puppetAndExpr}
	 * labeled alternative in {@link PuppetGrammarParser#puppetValueExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPuppetAndExpr(PuppetGrammarParser.PuppetAndExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PuppetGrammarParser#puppetVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPuppetVariable(PuppetGrammarParser.PuppetVariableContext ctx);
}