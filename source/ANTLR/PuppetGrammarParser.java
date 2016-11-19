// Generated from PuppetGrammar.g4 by ANTLR 4.5
package ANTLR;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PuppetGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		NOT=25, AND=26, OR=27, EQ=28, NEQ=29, LT=30, GT=31, LE=32, GE=33, REGMATCH=34, 
		REGNONMATCH=35, IN=36, PLUS=37, SUB=38, DIV=39, MULT=40, MOD=41, LEFTSHIFT=42, 
		RIGHTSHIFT=43, INT=44, FLOAT=45, BOOLEAN=46, RESOURCE_TYPE=47, IDENTIFIER=48, 
		STRING_LITERAL=49, COMMENT=50, WS=51;
	public static final int
		RULE_puppetAssignment = 0, RULE_puppetAttributeBody = 1, RULE_puppetAttributeValue = 2, 
		RULE_puppetCase = 3, RULE_puppetCaseBody = 4, RULE_puppetCaseElement = 5, 
		RULE_puppetClass = 6, RULE_puppetClassDecl = 7, RULE_puppetClassInherits = 8, 
		RULE_puppetClassName = 9, RULE_puppetCustomSkip = 10, RULE_puppetCustomScope = 11, 
		RULE_puppetCustomScopeSpec = 12, RULE_puppetDefinedResDecl = 13, RULE_puppetDefinedResType = 14, 
		RULE_puppetIf = 15, RULE_puppetIfContinuation = 16, RULE_puppetInclude = 17, 
		RULE_puppetLocalVariable = 18, RULE_puppetNode = 19, RULE_puppetNodeSpecs = 20, 
		RULE_puppetParameter = 21, RULE_puppetParaSeq = 22, RULE_puppetProgram = 23, 
		RULE_puppetProgramElement = 24, RULE_puppetQualifiedVariable = 25, RULE_puppetResource = 26, 
		RULE_puppetScope = 27, RULE_puppetSelectorBody = 28, RULE_puppetSelectorElement = 29, 
		RULE_puppetStatements = 30, RULE_puppetStatementElement = 31, RULE_puppetUnless = 32, 
		RULE_puppetValue = 33, RULE_puppetValueExp = 34, RULE_puppetVariable = 35;
	public static final String[] ruleNames = {
		"puppetAssignment", "puppetAttributeBody", "puppetAttributeValue", "puppetCase", 
		"puppetCaseBody", "puppetCaseElement", "puppetClass", "puppetClassDecl", 
		"puppetClassInherits", "puppetClassName", "puppetCustomSkip", "puppetCustomScope", 
		"puppetCustomScopeSpec", "puppetDefinedResDecl", "puppetDefinedResType", 
		"puppetIf", "puppetIfContinuation", "puppetInclude", "puppetLocalVariable", 
		"puppetNode", "puppetNodeSpecs", "puppetParameter", "puppetParaSeq", "puppetProgram", 
		"puppetProgramElement", "puppetQualifiedVariable", "puppetResource", "puppetScope", 
		"puppetSelectorBody", "puppetSelectorElement", "puppetStatements", "puppetStatementElement", 
		"puppetUnless", "puppetValue", "puppetValueExp", "puppetVariable"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "','", "'=>'", "'case'", "'{'", "'}'", "':'", "'class'", 
		"'inherits'", "'::'", "'skip'", "'scope'", "'('", "')'", "'define'", "'if'", 
		"'elsif'", "'else'", "'include'", "'$'", "'node'", "'default'", "'unless'", 
		"'?'", "'!'", "'and'", "'or'", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", 
		"'=~'", "'!~'", "'in'", "'+'", "'-'", "'/'", "'*'", "'%'", "'<<'", "'>>'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "NOT", "AND", "OR", "EQ", "NEQ", "LT", "GT", "LE", "GE", "REGMATCH", 
		"REGNONMATCH", "IN", "PLUS", "SUB", "DIV", "MULT", "MOD", "LEFTSHIFT", 
		"RIGHTSHIFT", "INT", "FLOAT", "BOOLEAN", "RESOURCE_TYPE", "IDENTIFIER", 
		"STRING_LITERAL", "COMMENT", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "PuppetGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PuppetGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class PuppetAssignmentContext extends ParserRuleContext {
		public PuppetLocalVariableContext puppetLocalVariable() {
			return getRuleContext(PuppetLocalVariableContext.class,0);
		}
		public PuppetValueExpContext puppetValueExp() {
			return getRuleContext(PuppetValueExpContext.class,0);
		}
		public PuppetAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_puppetAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).enterPuppetAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).exitPuppetAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PuppetGrammarVisitor ) return ((PuppetGrammarVisitor<? extends T>)visitor).visitPuppetAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PuppetAssignmentContext puppetAssignment() throws RecognitionException {
		PuppetAssignmentContext _localctx = new PuppetAssignmentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_puppetAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			puppetLocalVariable();
			setState(73);
			match(T__0);
			setState(74);
			puppetValueExp(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PuppetAttributeBodyContext extends ParserRuleContext {
		public List<PuppetAttributeValueContext> puppetAttributeValue() {
			return getRuleContexts(PuppetAttributeValueContext.class);
		}
		public PuppetAttributeValueContext puppetAttributeValue(int i) {
			return getRuleContext(PuppetAttributeValueContext.class,i);
		}
		public PuppetAttributeBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_puppetAttributeBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).enterPuppetAttributeBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).exitPuppetAttributeBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PuppetGrammarVisitor ) return ((PuppetGrammarVisitor<? extends T>)visitor).visitPuppetAttributeBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PuppetAttributeBodyContext puppetAttributeBody() throws RecognitionException {
		PuppetAttributeBodyContext _localctx = new PuppetAttributeBodyContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_puppetAttributeBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			puppetAttributeValue();
			setState(81);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(77);
					match(T__1);
					setState(78);
					puppetAttributeValue();
					}
					} 
				}
				setState(83);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(85);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(84);
				match(T__1);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PuppetAttributeValueContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(PuppetGrammarParser.IDENTIFIER, 0); }
		public PuppetValueExpContext puppetValueExp() {
			return getRuleContext(PuppetValueExpContext.class,0);
		}
		public PuppetAttributeValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_puppetAttributeValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).enterPuppetAttributeValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).exitPuppetAttributeValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PuppetGrammarVisitor ) return ((PuppetGrammarVisitor<? extends T>)visitor).visitPuppetAttributeValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PuppetAttributeValueContext puppetAttributeValue() throws RecognitionException {
		PuppetAttributeValueContext _localctx = new PuppetAttributeValueContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_puppetAttributeValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(IDENTIFIER);
			setState(88);
			match(T__2);
			setState(89);
			puppetValueExp(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PuppetCaseContext extends ParserRuleContext {
		public PuppetValueExpContext puppetValueExp() {
			return getRuleContext(PuppetValueExpContext.class,0);
		}
		public PuppetCaseBodyContext puppetCaseBody() {
			return getRuleContext(PuppetCaseBodyContext.class,0);
		}
		public PuppetCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_puppetCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).enterPuppetCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).exitPuppetCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PuppetGrammarVisitor ) return ((PuppetGrammarVisitor<? extends T>)visitor).visitPuppetCase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PuppetCaseContext puppetCase() throws RecognitionException {
		PuppetCaseContext _localctx = new PuppetCaseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_puppetCase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(T__3);
			setState(92);
			puppetValueExp(0);
			setState(93);
			match(T__4);
			setState(94);
			puppetCaseBody();
			setState(95);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PuppetCaseBodyContext extends ParserRuleContext {
		public List<PuppetCaseElementContext> puppetCaseElement() {
			return getRuleContexts(PuppetCaseElementContext.class);
		}
		public PuppetCaseElementContext puppetCaseElement(int i) {
			return getRuleContext(PuppetCaseElementContext.class,i);
		}
		public PuppetCaseBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_puppetCaseBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).enterPuppetCaseBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).exitPuppetCaseBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PuppetGrammarVisitor ) return ((PuppetGrammarVisitor<? extends T>)visitor).visitPuppetCaseBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PuppetCaseBodyContext puppetCaseBody() throws RecognitionException {
		PuppetCaseBodyContext _localctx = new PuppetCaseBodyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_puppetCaseBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(97);
				puppetCaseElement();
				}
				}
				setState(100); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOLEAN) | (1L << STRING_LITERAL))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PuppetCaseElementContext extends ParserRuleContext {
		public PuppetValueContext puppetValue() {
			return getRuleContext(PuppetValueContext.class,0);
		}
		public PuppetStatementsContext puppetStatements() {
			return getRuleContext(PuppetStatementsContext.class,0);
		}
		public PuppetCaseElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_puppetCaseElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).enterPuppetCaseElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).exitPuppetCaseElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PuppetGrammarVisitor ) return ((PuppetGrammarVisitor<? extends T>)visitor).visitPuppetCaseElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PuppetCaseElementContext puppetCaseElement() throws RecognitionException {
		PuppetCaseElementContext _localctx = new PuppetCaseElementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_puppetCaseElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			puppetValue();
			setState(103);
			match(T__6);
			setState(104);
			match(T__4);
			setState(107);
			switch (_input.LA(1)) {
			case T__3:
			case T__7:
			case T__10:
			case T__11:
			case T__12:
			case T__15:
			case T__18:
			case T__19:
			case T__22:
			case NOT:
			case INT:
			case FLOAT:
			case BOOLEAN:
			case RESOURCE_TYPE:
			case IDENTIFIER:
			case STRING_LITERAL:
				{
				setState(105);
				puppetStatements();
				}
				break;
			case T__5:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(109);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PuppetClassContext extends ParserRuleContext {
		public PuppetClassNameContext puppetClassName() {
			return getRuleContext(PuppetClassNameContext.class,0);
		}
		public PuppetStatementsContext puppetStatements() {
			return getRuleContext(PuppetStatementsContext.class,0);
		}
		public PuppetParaSeqContext puppetParaSeq() {
			return getRuleContext(PuppetParaSeqContext.class,0);
		}
		public PuppetClassInheritsContext puppetClassInherits() {
			return getRuleContext(PuppetClassInheritsContext.class,0);
		}
		public PuppetClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_puppetClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).enterPuppetClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).exitPuppetClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PuppetGrammarVisitor ) return ((PuppetGrammarVisitor<? extends T>)visitor).visitPuppetClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PuppetClassContext puppetClass() throws RecognitionException {
		PuppetClassContext _localctx = new PuppetClassContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_puppetClass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(T__7);
			setState(112);
			puppetClassName();
			setState(114);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(113);
				puppetParaSeq();
				}
			}

			setState(117);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(116);
				puppetClassInherits();
				}
			}

			setState(119);
			match(T__4);
			setState(122);
			switch (_input.LA(1)) {
			case T__3:
			case T__7:
			case T__10:
			case T__11:
			case T__12:
			case T__15:
			case T__18:
			case T__19:
			case T__22:
			case NOT:
			case INT:
			case FLOAT:
			case BOOLEAN:
			case RESOURCE_TYPE:
			case IDENTIFIER:
			case STRING_LITERAL:
				{
				setState(120);
				puppetStatements();
				}
				break;
			case T__5:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(124);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PuppetClassDeclContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(PuppetGrammarParser.STRING_LITERAL, 0); }
		public PuppetAttributeBodyContext puppetAttributeBody() {
			return getRuleContext(PuppetAttributeBodyContext.class,0);
		}
		public PuppetClassDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_puppetClassDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).enterPuppetClassDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).exitPuppetClassDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PuppetGrammarVisitor ) return ((PuppetGrammarVisitor<? extends T>)visitor).visitPuppetClassDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PuppetClassDeclContext puppetClassDecl() throws RecognitionException {
		PuppetClassDeclContext _localctx = new PuppetClassDeclContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_puppetClassDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(T__7);
			setState(127);
			match(T__4);
			setState(128);
			match(STRING_LITERAL);
			setState(129);
			match(T__6);
			setState(130);
			puppetAttributeBody();
			setState(131);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PuppetClassInheritsContext extends ParserRuleContext {
		public PuppetClassNameContext puppetClassName() {
			return getRuleContext(PuppetClassNameContext.class,0);
		}
		public PuppetClassInheritsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_puppetClassInherits; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).enterPuppetClassInherits(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).exitPuppetClassInherits(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PuppetGrammarVisitor ) return ((PuppetGrammarVisitor<? extends T>)visitor).visitPuppetClassInherits(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PuppetClassInheritsContext puppetClassInherits() throws RecognitionException {
		PuppetClassInheritsContext _localctx = new PuppetClassInheritsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_puppetClassInherits);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(T__8);
			setState(134);
			puppetClassName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PuppetClassNameContext extends ParserRuleContext {
		public PuppetClassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_puppetClassName; }
	 
		public PuppetClassNameContext() { }
		public void copyFrom(PuppetClassNameContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PuppetClassNameScopedContext extends PuppetClassNameContext {
		public TerminalNode IDENTIFIER() { return getToken(PuppetGrammarParser.IDENTIFIER, 0); }
		public PuppetClassNameContext puppetClassName() {
			return getRuleContext(PuppetClassNameContext.class,0);
		}
		public PuppetClassNameScopedContext(PuppetClassNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).enterPuppetClassNameScoped(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).exitPuppetClassNameScoped(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PuppetGrammarVisitor ) return ((PuppetGrammarVisitor<? extends T>)visitor).visitPuppetClassNameScoped(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PuppetClassNameEndContext extends PuppetClassNameContext {
		public TerminalNode IDENTIFIER() { return getToken(PuppetGrammarParser.IDENTIFIER, 0); }
		public PuppetClassNameEndContext(PuppetClassNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).enterPuppetClassNameEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).exitPuppetClassNameEnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PuppetGrammarVisitor ) return ((PuppetGrammarVisitor<? extends T>)visitor).visitPuppetClassNameEnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PuppetClassNameContext puppetClassName() throws RecognitionException {
		PuppetClassNameContext _localctx = new PuppetClassNameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_puppetClassName);
		try {
			setState(140);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new PuppetClassNameScopedContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				match(IDENTIFIER);
				setState(137);
				match(T__9);
				setState(138);
				puppetClassName();
				}
				break;
			case 2:
				_localctx = new PuppetClassNameEndContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				match(IDENTIFIER);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PuppetCustomSkipContext extends ParserRuleContext {
		public PuppetCustomSkipContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_puppetCustomSkip; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).enterPuppetCustomSkip(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).exitPuppetCustomSkip(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PuppetGrammarVisitor ) return ((PuppetGrammarVisitor<? extends T>)visitor).visitPuppetCustomSkip(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PuppetCustomSkipContext puppetCustomSkip() throws RecognitionException {
		PuppetCustomSkipContext _localctx = new PuppetCustomSkipContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_puppetCustomSkip);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PuppetCustomScopeContext extends ParserRuleContext {
		public PuppetCustomScopeSpecContext puppetCustomScopeSpec() {
			return getRuleContext(PuppetCustomScopeSpecContext.class,0);
		}
		public PuppetStatementsContext puppetStatements() {
			return getRuleContext(PuppetStatementsContext.class,0);
		}
		public PuppetCustomScopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_puppetCustomScope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).enterPuppetCustomScope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).exitPuppetCustomScope(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PuppetGrammarVisitor ) return ((PuppetGrammarVisitor<? extends T>)visitor).visitPuppetCustomScope(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PuppetCustomScopeContext puppetCustomScope() throws RecognitionException {
		PuppetCustomScopeContext _localctx = new PuppetCustomScopeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_puppetCustomScope);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(T__11);
			setState(145);
			puppetCustomScopeSpec();
			setState(146);
			match(T__4);
			setState(149);
			switch (_input.LA(1)) {
			case T__3:
			case T__7:
			case T__10:
			case T__11:
			case T__12:
			case T__15:
			case T__18:
			case T__19:
			case T__22:
			case NOT:
			case INT:
			case FLOAT:
			case BOOLEAN:
			case RESOURCE_TYPE:
			case IDENTIFIER:
			case STRING_LITERAL:
				{
				setState(147);
				puppetStatements();
				}
				break;
			case T__5:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(151);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PuppetCustomScopeSpecContext extends ParserRuleContext {
		public PuppetCustomScopeSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_puppetCustomScopeSpec; }
	 
		public PuppetCustomScopeSpecContext() { }
		public void copyFrom(PuppetCustomScopeSpecContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PuppetCustomScopeDefContext extends PuppetCustomScopeSpecContext {
		public PuppetCustomScopeSpecContext puppetCustomScopeSpec() {
			return getRuleContext(PuppetCustomScopeSpecContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(PuppetGrammarParser.IDENTIFIER, 0); }
		public PuppetCustomScopeDefContext(PuppetCustomScopeSpecContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).enterPuppetCustomScopeDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).exitPuppetCustomScopeDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PuppetGrammarVisitor ) return ((PuppetGrammarVisitor<? extends T>)visitor).visitPuppetCustomScopeDef(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PuppetCustomScopeRestContext extends PuppetCustomScopeSpecContext {
		public PuppetClassNameContext puppetClassName() {
			return getRuleContext(PuppetClassNameContext.class,0);
		}
		public PuppetNodeSpecsContext puppetNodeSpecs() {
			return getRuleContext(PuppetNodeSpecsContext.class,0);
		}
		public PuppetCustomScopeRestContext(PuppetCustomScopeSpecContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).enterPuppetCustomScopeRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).exitPuppetCustomScopeRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PuppetGrammarVisitor ) return ((PuppetGrammarVisitor<? extends T>)visitor).visitPuppetCustomScopeRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PuppetCustomScopeSpecContext puppetCustomScopeSpec() throws RecognitionException {
		PuppetCustomScopeSpecContext _localctx = new PuppetCustomScopeSpecContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_puppetCustomScopeSpec);
		try {
			setState(165);
			switch (_input.LA(1)) {
			case T__12:
				_localctx = new PuppetCustomScopeDefContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				match(T__12);
				setState(154);
				puppetCustomScopeSpec();
				setState(155);
				match(IDENTIFIER);
				setState(156);
				match(T__13);
				}
				break;
			case T__9:
				_localctx = new PuppetCustomScopeRestContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(158);
					match(T__9);
					}
					break;
				case 2:
					{
					setState(159);
					match(T__9);
					setState(160);
					puppetClassName();
					}
					break;
				case 3:
					{
					setState(161);
					match(T__9);
					setState(162);
					puppetNodeSpecs();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PuppetDefinedResDeclContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(PuppetGrammarParser.IDENTIFIER, 0); }
		public PuppetValueExpContext puppetValueExp() {
			return getRuleContext(PuppetValueExpContext.class,0);
		}
		public PuppetAttributeBodyContext puppetAttributeBody() {
			return getRuleContext(PuppetAttributeBodyContext.class,0);
		}
		public PuppetDefinedResDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_puppetDefinedResDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).enterPuppetDefinedResDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).exitPuppetDefinedResDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PuppetGrammarVisitor ) return ((PuppetGrammarVisitor<? extends T>)visitor).visitPuppetDefinedResDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PuppetDefinedResDeclContext puppetDefinedResDecl() throws RecognitionException {
		PuppetDefinedResDeclContext _localctx = new PuppetDefinedResDeclContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_puppetDefinedResDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(IDENTIFIER);
			setState(168);
			match(T__4);
			setState(169);
			puppetValueExp(0);
			setState(170);
			match(T__6);
			setState(171);
			puppetAttributeBody();
			setState(172);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PuppetDefinedResTypeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(PuppetGrammarParser.IDENTIFIER, 0); }
		public PuppetParaSeqContext puppetParaSeq() {
			return getRuleContext(PuppetParaSeqContext.class,0);
		}
		public PuppetStatementsContext puppetStatements() {
			return getRuleContext(PuppetStatementsContext.class,0);
		}
		public PuppetDefinedResTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_puppetDefinedResType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).enterPuppetDefinedResType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).exitPuppetDefinedResType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PuppetGrammarVisitor ) return ((PuppetGrammarVisitor<? extends T>)visitor).visitPuppetDefinedResType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PuppetDefinedResTypeContext puppetDefinedResType() throws RecognitionException {
		PuppetDefinedResTypeContext _localctx = new PuppetDefinedResTypeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_puppetDefinedResType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(T__14);
			setState(175);
			match(IDENTIFIER);
			setState(176);
			puppetParaSeq();
			setState(177);
			match(T__4);
			setState(180);
			switch (_input.LA(1)) {
			case T__3:
			case T__7:
			case T__10:
			case T__11:
			case T__12:
			case T__15:
			case T__18:
			case T__19:
			case T__22:
			case NOT:
			case INT:
			case FLOAT:
			case BOOLEAN:
			case RESOURCE_TYPE:
			case IDENTIFIER:
			case STRING_LITERAL:
				{
				setState(178);
				puppetStatements();
				}
				break;
			case T__5:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(182);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PuppetIfContext extends ParserRuleContext {
		public PuppetValueExpContext puppetValueExp() {
			return getRuleContext(PuppetValueExpContext.class,0);
		}
		public PuppetIfContinuationContext puppetIfContinuation() {
			return getRuleContext(PuppetIfContinuationContext.class,0);
		}
		public PuppetStatementsContext puppetStatements() {
			return getRuleContext(PuppetStatementsContext.class,0);
		}
		public PuppetIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_puppetIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).enterPuppetIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).exitPuppetIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PuppetGrammarVisitor ) return ((PuppetGrammarVisitor<? extends T>)visitor).visitPuppetIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PuppetIfContext puppetIf() throws RecognitionException {
		PuppetIfContext _localctx = new PuppetIfContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_puppetIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(T__15);
			setState(185);
			puppetValueExp(0);
			setState(186);
			match(T__4);
			setState(189);
			switch (_input.LA(1)) {
			case T__3:
			case T__7:
			case T__10:
			case T__11:
			case T__12:
			case T__15:
			case T__18:
			case T__19:
			case T__22:
			case NOT:
			case INT:
			case FLOAT:
			case BOOLEAN:
			case RESOURCE_TYPE:
			case IDENTIFIER:
			case STRING_LITERAL:
				{
				setState(187);
				puppetStatements();
				}
				break;
			case T__5:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(191);
			match(T__5);
			setState(192);
			puppetIfContinuation();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PuppetIfContinuationContext extends ParserRuleContext {
		public PuppetIfContinuationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_puppetIfContinuation; }
	 
		public PuppetIfContinuationContext() { }
		public void copyFrom(PuppetIfContinuationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PuppetIfElseContext extends PuppetIfContinuationContext {
		public PuppetValueExpContext puppetValueExp() {
			return getRuleContext(PuppetValueExpContext.class,0);
		}
		public PuppetIfContinuationContext puppetIfContinuation() {
			return getRuleContext(PuppetIfContinuationContext.class,0);
		}
		public PuppetStatementsContext puppetStatements() {
			return getRuleContext(PuppetStatementsContext.class,0);
		}
		public PuppetIfElseContext(PuppetIfContinuationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).enterPuppetIfElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).exitPuppetIfElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PuppetGrammarVisitor ) return ((PuppetGrammarVisitor<? extends T>)visitor).visitPuppetIfElse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PuppetIfEndContext extends PuppetIfContinuationContext {
		public PuppetIfEndContext(PuppetIfContinuationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).enterPuppetIfEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).exitPuppetIfEnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PuppetGrammarVisitor ) return ((PuppetGrammarVisitor<? extends T>)visitor).visitPuppetIfEnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PuppetElseContext extends PuppetIfContinuationContext {
		public PuppetStatementsContext puppetStatements() {
			return getRuleContext(PuppetStatementsContext.class,0);
		}
		public PuppetElseContext(PuppetIfContinuationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).enterPuppetElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).exitPuppetElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PuppetGrammarVisitor ) return ((PuppetGrammarVisitor<? extends T>)visitor).visitPuppetElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PuppetIfContinuationContext puppetIfContinuation() throws RecognitionException {
		PuppetIfContinuationContext _localctx = new PuppetIfContinuationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_puppetIfContinuation);
		try {
			setState(212);
			switch (_input.LA(1)) {
			case T__16:
				_localctx = new PuppetIfElseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				match(T__16);
				setState(195);
				puppetValueExp(0);
				setState(196);
				match(T__4);
				setState(199);
				switch (_input.LA(1)) {
				case T__3:
				case T__7:
				case T__10:
				case T__11:
				case T__12:
				case T__15:
				case T__18:
				case T__19:
				case T__22:
				case NOT:
				case INT:
				case FLOAT:
				case BOOLEAN:
				case RESOURCE_TYPE:
				case IDENTIFIER:
				case STRING_LITERAL:
					{
					setState(197);
					puppetStatements();
					}
					break;
				case T__5:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(201);
				match(T__5);
				setState(202);
				puppetIfContinuation();
				}
				break;
			case T__17:
				_localctx = new PuppetElseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				match(T__17);
				setState(205);
				match(T__4);
				setState(208);
				switch (_input.LA(1)) {
				case T__3:
				case T__7:
				case T__10:
				case T__11:
				case T__12:
				case T__15:
				case T__18:
				case T__19:
				case T__22:
				case NOT:
				case INT:
				case FLOAT:
				case BOOLEAN:
				case RESOURCE_TYPE:
				case IDENTIFIER:
				case STRING_LITERAL:
					{
					setState(206);
					puppetStatements();
					}
					break;
				case T__5:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(210);
				match(T__5);
				}
				break;
			case EOF:
			case T__1:
			case T__3:
			case T__5:
			case T__7:
			case T__10:
			case T__11:
			case T__12:
			case T__14:
			case T__15:
			case T__18:
			case T__19:
			case T__20:
			case T__22:
			case NOT:
			case INT:
			case FLOAT:
			case BOOLEAN:
			case RESOURCE_TYPE:
			case IDENTIFIER:
			case STRING_LITERAL:
				_localctx = new PuppetIfEndContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PuppetIncludeContext extends ParserRuleContext {
		public PuppetClassNameContext puppetClassName() {
			return getRuleContext(PuppetClassNameContext.class,0);
		}
		public PuppetIncludeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_puppetInclude; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).enterPuppetInclude(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).exitPuppetInclude(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PuppetGrammarVisitor ) return ((PuppetGrammarVisitor<? extends T>)visitor).visitPuppetInclude(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PuppetIncludeContext puppetInclude() throws RecognitionException {
		PuppetIncludeContext _localctx = new PuppetIncludeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_puppetInclude);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(T__18);
			setState(215);
			puppetClassName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PuppetLocalVariableContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(PuppetGrammarParser.IDENTIFIER, 0); }
		public PuppetLocalVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_puppetLocalVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).enterPuppetLocalVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).exitPuppetLocalVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PuppetGrammarVisitor ) return ((PuppetGrammarVisitor<? extends T>)visitor).visitPuppetLocalVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PuppetLocalVariableContext puppetLocalVariable() throws RecognitionException {
		PuppetLocalVariableContext _localctx = new PuppetLocalVariableContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_puppetLocalVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(T__19);
			setState(218);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PuppetNodeContext extends ParserRuleContext {
		public PuppetNodeSpecsContext puppetNodeSpecs() {
			return getRuleContext(PuppetNodeSpecsContext.class,0);
		}
		public PuppetStatementsContext puppetStatements() {
			return getRuleContext(PuppetStatementsContext.class,0);
		}
		public PuppetNodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_puppetNode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).enterPuppetNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).exitPuppetNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PuppetGrammarVisitor ) return ((PuppetGrammarVisitor<? extends T>)visitor).visitPuppetNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PuppetNodeContext puppetNode() throws RecognitionException {
		PuppetNodeContext _localctx = new PuppetNodeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_puppetNode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(T__20);
			setState(221);
			puppetNodeSpecs();
			setState(222);
			match(T__4);
			setState(225);
			switch (_input.LA(1)) {
			case T__3:
			case T__7:
			case T__10:
			case T__11:
			case T__12:
			case T__15:
			case T__18:
			case T__19:
			case T__22:
			case NOT:
			case INT:
			case FLOAT:
			case BOOLEAN:
			case RESOURCE_TYPE:
			case IDENTIFIER:
			case STRING_LITERAL:
				{
				setState(223);
				puppetStatements();
				}
				break;
			case T__5:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(227);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PuppetNodeSpecsContext extends ParserRuleContext {
		public PuppetNodeSpecsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_puppetNodeSpecs; }
	 
		public PuppetNodeSpecsContext() { }
		public void copyFrom(PuppetNodeSpecsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PuppetNameDefaultContext extends PuppetNodeSpecsContext {
		public PuppetNameDefaultContext(PuppetNodeSpecsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).enterPuppetNameDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).exitPuppetNameDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PuppetGrammarVisitor ) return ((PuppetGrammarVisitor<? extends T>)visitor).visitPuppetNameDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PuppetNameNotDefaultContext extends PuppetNodeSpecsContext {
		public List<TerminalNode> STRING_LITERAL() { return getTokens(PuppetGrammarParser.STRING_LITERAL); }
		public TerminalNode STRING_LITERAL(int i) {
			return getToken(PuppetGrammarParser.STRING_LITERAL, i);
		}
		public PuppetNameNotDefaultContext(PuppetNodeSpecsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).enterPuppetNameNotDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).exitPuppetNameNotDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PuppetGrammarVisitor ) return ((PuppetGrammarVisitor<? extends T>)visitor).visitPuppetNameNotDefault(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PuppetNodeSpecsContext puppetNodeSpecs() throws RecognitionException {
		PuppetNodeSpecsContext _localctx = new PuppetNodeSpecsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_puppetNodeSpecs);
		int _la;
		try {
			setState(238);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
				_localctx = new PuppetNameNotDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				match(STRING_LITERAL);
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(230);
					match(T__1);
					setState(231);
					match(STRING_LITERAL);
					}
					}
					setState(236);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__21:
				_localctx = new PuppetNameDefaultContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
				match(T__21);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PuppetParameterContext extends ParserRuleContext {
		public PuppetVariableContext puppetVariable() {
			return getRuleContext(PuppetVariableContext.class,0);
		}
		public PuppetValueExpContext puppetValueExp() {
			return getRuleContext(PuppetValueExpContext.class,0);
		}
		public PuppetParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_puppetParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).enterPuppetParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).exitPuppetParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PuppetGrammarVisitor ) return ((PuppetGrammarVisitor<? extends T>)visitor).visitPuppetParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PuppetParameterContext puppetParameter() throws RecognitionException {
		PuppetParameterContext _localctx = new PuppetParameterContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_puppetParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			puppetVariable();
			setState(243);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(241);
				match(T__0);
				setState(242);
				puppetValueExp(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PuppetParaSeqContext extends ParserRuleContext {
		public List<PuppetParameterContext> puppetParameter() {
			return getRuleContexts(PuppetParameterContext.class);
		}
		public PuppetParameterContext puppetParameter(int i) {
			return getRuleContext(PuppetParameterContext.class,i);
		}
		public PuppetParaSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_puppetParaSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).enterPuppetParaSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).exitPuppetParaSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PuppetGrammarVisitor ) return ((PuppetGrammarVisitor<? extends T>)visitor).visitPuppetParaSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PuppetParaSeqContext puppetParaSeq() throws RecognitionException {
		PuppetParaSeqContext _localctx = new PuppetParaSeqContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_puppetParaSeq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(T__12);
			setState(246);
			puppetParameter();
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(247);
				match(T__1);
				setState(248);
				puppetParameter();
				}
				}
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(254);
			match(T__13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PuppetProgramContext extends ParserRuleContext {
		public List<PuppetProgramElementContext> puppetProgramElement() {
			return getRuleContexts(PuppetProgramElementContext.class);
		}
		public PuppetProgramElementContext puppetProgramElement(int i) {
			return getRuleContext(PuppetProgramElementContext.class,i);
		}
		public PuppetProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_puppetProgram; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).enterPuppetProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).exitPuppetProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PuppetGrammarVisitor ) return ((PuppetGrammarVisitor<? extends T>)visitor).visitPuppetProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PuppetProgramContext puppetProgram() throws RecognitionException {
		PuppetProgramContext _localctx = new PuppetProgramContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_puppetProgram);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(256);
				puppetProgramElement();
				}
				}
				setState(259); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__7) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__22) | (1L << NOT) | (1L << INT) | (1L << FLOAT) | (1L << BOOLEAN) | (1L << RESOURCE_TYPE) | (1L << IDENTIFIER) | (1L << STRING_LITERAL))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PuppetProgramElementContext extends ParserRuleContext {
		public PuppetClassContext puppetClass() {
			return getRuleContext(PuppetClassContext.class,0);
		}
		public PuppetNodeContext puppetNode() {
			return getRuleContext(PuppetNodeContext.class,0);
		}
		public PuppetDefinedResTypeContext puppetDefinedResType() {
			return getRuleContext(PuppetDefinedResTypeContext.class,0);
		}
		public PuppetStatementsContext puppetStatements() {
			return getRuleContext(PuppetStatementsContext.class,0);
		}
		public PuppetProgramElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_puppetProgramElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).enterPuppetProgramElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).exitPuppetProgramElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PuppetGrammarVisitor ) return ((PuppetGrammarVisitor<? extends T>)visitor).visitPuppetProgramElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PuppetProgramElementContext puppetProgramElement() throws RecognitionException {
		PuppetProgramElementContext _localctx = new PuppetProgramElementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_puppetProgramElement);
		try {
			setState(265);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(261);
				puppetClass();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(262);
				puppetNode();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(263);
				puppetDefinedResType();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(264);
				puppetStatements();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PuppetQualifiedVariableContext extends ParserRuleContext {
		public PuppetScopeContext puppetScope() {
			return getRuleContext(PuppetScopeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(PuppetGrammarParser.IDENTIFIER, 0); }
		public PuppetQualifiedVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_puppetQualifiedVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).enterPuppetQualifiedVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).exitPuppetQualifiedVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PuppetGrammarVisitor ) return ((PuppetGrammarVisitor<? extends T>)visitor).visitPuppetQualifiedVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PuppetQualifiedVariableContext puppetQualifiedVariable() throws RecognitionException {
		PuppetQualifiedVariableContext _localctx = new PuppetQualifiedVariableContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_puppetQualifiedVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(T__19);
			setState(268);
			puppetScope();
			setState(269);
			match(T__9);
			setState(270);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PuppetResourceContext extends ParserRuleContext {
		public TerminalNode RESOURCE_TYPE() { return getToken(PuppetGrammarParser.RESOURCE_TYPE, 0); }
		public PuppetValueExpContext puppetValueExp() {
			return getRuleContext(PuppetValueExpContext.class,0);
		}
		public PuppetAttributeBodyContext puppetAttributeBody() {
			return getRuleContext(PuppetAttributeBodyContext.class,0);
		}
		public PuppetResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_puppetResource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).enterPuppetResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).exitPuppetResource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PuppetGrammarVisitor ) return ((PuppetGrammarVisitor<? extends T>)visitor).visitPuppetResource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PuppetResourceContext puppetResource() throws RecognitionException {
		PuppetResourceContext _localctx = new PuppetResourceContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_puppetResource);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(RESOURCE_TYPE);
			setState(273);
			match(T__4);
			setState(274);
			puppetValueExp(0);
			setState(275);
			match(T__6);
			setState(276);
			puppetAttributeBody();
			setState(277);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PuppetScopeContext extends ParserRuleContext {
		public PuppetScopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_puppetScope; }
	 
		public PuppetScopeContext() { }
		public void copyFrom(PuppetScopeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PuppetScopeEmptyContext extends PuppetScopeContext {
		public PuppetScopeEmptyContext(PuppetScopeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).enterPuppetScopeEmpty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).exitPuppetScopeEmpty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PuppetGrammarVisitor ) return ((PuppetGrammarVisitor<? extends T>)visitor).visitPuppetScopeEmpty(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PuppetScopeFullContext extends PuppetScopeContext {
		public PuppetClassNameContext puppetClassName() {
			return getRuleContext(PuppetClassNameContext.class,0);
		}
		public PuppetScopeFullContext(PuppetScopeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).enterPuppetScopeFull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).exitPuppetScopeFull(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PuppetGrammarVisitor ) return ((PuppetGrammarVisitor<? extends T>)visitor).visitPuppetScopeFull(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PuppetScopeContext puppetScope() throws RecognitionException {
		PuppetScopeContext _localctx = new PuppetScopeContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_puppetScope);
		try {
			setState(282);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				_localctx = new PuppetScopeFullContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(279);
				match(T__9);
				setState(280);
				puppetClassName();
				}
				break;
			case 2:
				_localctx = new PuppetScopeEmptyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PuppetSelectorBodyContext extends ParserRuleContext {
		public List<PuppetSelectorElementContext> puppetSelectorElement() {
			return getRuleContexts(PuppetSelectorElementContext.class);
		}
		public PuppetSelectorElementContext puppetSelectorElement(int i) {
			return getRuleContext(PuppetSelectorElementContext.class,i);
		}
		public PuppetSelectorBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_puppetSelectorBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).enterPuppetSelectorBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).exitPuppetSelectorBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PuppetGrammarVisitor ) return ((PuppetGrammarVisitor<? extends T>)visitor).visitPuppetSelectorBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PuppetSelectorBodyContext puppetSelectorBody() throws RecognitionException {
		PuppetSelectorBodyContext _localctx = new PuppetSelectorBodyContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_puppetSelectorBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			puppetSelectorElement();
			setState(289);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(285);
					match(T__1);
					setState(286);
					puppetSelectorElement();
					}
					} 
				}
				setState(291);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			setState(293);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(292);
				match(T__1);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PuppetSelectorElementContext extends ParserRuleContext {
		public PuppetSelectorElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_puppetSelectorElement; }
	 
		public PuppetSelectorElementContext() { }
		public void copyFrom(PuppetSelectorElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PuppetSelectorNotDefaultContext extends PuppetSelectorElementContext {
		public List<PuppetValueExpContext> puppetValueExp() {
			return getRuleContexts(PuppetValueExpContext.class);
		}
		public PuppetValueExpContext puppetValueExp(int i) {
			return getRuleContext(PuppetValueExpContext.class,i);
		}
		public PuppetSelectorNotDefaultContext(PuppetSelectorElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).enterPuppetSelectorNotDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).exitPuppetSelectorNotDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PuppetGrammarVisitor ) return ((PuppetGrammarVisitor<? extends T>)visitor).visitPuppetSelectorNotDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PuppetSelectorDefaultContext extends PuppetSelectorElementContext {
		public PuppetValueExpContext puppetValueExp() {
			return getRuleContext(PuppetValueExpContext.class,0);
		}
		public PuppetSelectorDefaultContext(PuppetSelectorElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).enterPuppetSelectorDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).exitPuppetSelectorDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PuppetGrammarVisitor ) return ((PuppetGrammarVisitor<? extends T>)visitor).visitPuppetSelectorDefault(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PuppetSelectorElementContext puppetSelectorElement() throws RecognitionException {
		PuppetSelectorElementContext _localctx = new PuppetSelectorElementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_puppetSelectorElement);
		try {
			setState(302);
			switch (_input.LA(1)) {
			case T__12:
			case T__19:
			case NOT:
			case INT:
			case FLOAT:
			case BOOLEAN:
			case STRING_LITERAL:
				_localctx = new PuppetSelectorNotDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(295);
				puppetValueExp(0);
				setState(296);
				match(T__2);
				setState(297);
				puppetValueExp(0);
				}
				break;
			case T__21:
				_localctx = new PuppetSelectorDefaultContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(299);
				match(T__21);
				setState(300);
				match(T__2);
				setState(301);
				puppetValueExp(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PuppetStatementsContext extends ParserRuleContext {
		public List<PuppetStatementElementContext> puppetStatementElement() {
			return getRuleContexts(PuppetStatementElementContext.class);
		}
		public PuppetStatementElementContext puppetStatementElement(int i) {
			return getRuleContext(PuppetStatementElementContext.class,i);
		}
		public PuppetStatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_puppetStatements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).enterPuppetStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).exitPuppetStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PuppetGrammarVisitor ) return ((PuppetGrammarVisitor<? extends T>)visitor).visitPuppetStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PuppetStatementsContext puppetStatements() throws RecognitionException {
		PuppetStatementsContext _localctx = new PuppetStatementsContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_puppetStatements);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			puppetStatementElement();
			setState(311);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(306);
					_la = _input.LA(1);
					if (_la==T__1) {
						{
						setState(305);
						match(T__1);
						}
					}

					setState(308);
					puppetStatementElement();
					}
					} 
				}
				setState(313);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PuppetStatementElementContext extends ParserRuleContext {
		public PuppetValueExpContext puppetValueExp() {
			return getRuleContext(PuppetValueExpContext.class,0);
		}
		public PuppetDefinedResDeclContext puppetDefinedResDecl() {
			return getRuleContext(PuppetDefinedResDeclContext.class,0);
		}
		public PuppetResourceContext puppetResource() {
			return getRuleContext(PuppetResourceContext.class,0);
		}
		public PuppetAssignmentContext puppetAssignment() {
			return getRuleContext(PuppetAssignmentContext.class,0);
		}
		public PuppetIncludeContext puppetInclude() {
			return getRuleContext(PuppetIncludeContext.class,0);
		}
		public PuppetClassDeclContext puppetClassDecl() {
			return getRuleContext(PuppetClassDeclContext.class,0);
		}
		public PuppetCustomSkipContext puppetCustomSkip() {
			return getRuleContext(PuppetCustomSkipContext.class,0);
		}
		public PuppetCustomScopeContext puppetCustomScope() {
			return getRuleContext(PuppetCustomScopeContext.class,0);
		}
		public PuppetIfContext puppetIf() {
			return getRuleContext(PuppetIfContext.class,0);
		}
		public PuppetUnlessContext puppetUnless() {
			return getRuleContext(PuppetUnlessContext.class,0);
		}
		public PuppetCaseContext puppetCase() {
			return getRuleContext(PuppetCaseContext.class,0);
		}
		public PuppetStatementElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_puppetStatementElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).enterPuppetStatementElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).exitPuppetStatementElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PuppetGrammarVisitor ) return ((PuppetGrammarVisitor<? extends T>)visitor).visitPuppetStatementElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PuppetStatementElementContext puppetStatementElement() throws RecognitionException {
		PuppetStatementElementContext _localctx = new PuppetStatementElementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_puppetStatementElement);
		try {
			setState(325);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(314);
				puppetValueExp(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(315);
				puppetDefinedResDecl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(316);
				puppetResource();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(317);
				puppetAssignment();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(318);
				puppetInclude();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(319);
				puppetClassDecl();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(320);
				puppetCustomSkip();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(321);
				puppetCustomScope();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(322);
				puppetIf();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(323);
				puppetUnless();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(324);
				puppetCase();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PuppetUnlessContext extends ParserRuleContext {
		public PuppetValueExpContext puppetValueExp() {
			return getRuleContext(PuppetValueExpContext.class,0);
		}
		public PuppetStatementsContext puppetStatements() {
			return getRuleContext(PuppetStatementsContext.class,0);
		}
		public PuppetUnlessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_puppetUnless; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).enterPuppetUnless(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).exitPuppetUnless(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PuppetGrammarVisitor ) return ((PuppetGrammarVisitor<? extends T>)visitor).visitPuppetUnless(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PuppetUnlessContext puppetUnless() throws RecognitionException {
		PuppetUnlessContext _localctx = new PuppetUnlessContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_puppetUnless);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(T__22);
			setState(328);
			puppetValueExp(0);
			setState(329);
			match(T__4);
			setState(332);
			switch (_input.LA(1)) {
			case T__3:
			case T__7:
			case T__10:
			case T__11:
			case T__12:
			case T__15:
			case T__18:
			case T__19:
			case T__22:
			case NOT:
			case INT:
			case FLOAT:
			case BOOLEAN:
			case RESOURCE_TYPE:
			case IDENTIFIER:
			case STRING_LITERAL:
				{
				setState(330);
				puppetStatements();
				}
				break;
			case T__5:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(334);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PuppetValueContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(PuppetGrammarParser.INT, 0); }
		public TerminalNode BOOLEAN() { return getToken(PuppetGrammarParser.BOOLEAN, 0); }
		public TerminalNode FLOAT() { return getToken(PuppetGrammarParser.FLOAT, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(PuppetGrammarParser.STRING_LITERAL, 0); }
		public PuppetValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_puppetValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).enterPuppetValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).exitPuppetValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PuppetGrammarVisitor ) return ((PuppetGrammarVisitor<? extends T>)visitor).visitPuppetValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PuppetValueContext puppetValue() throws RecognitionException {
		PuppetValueContext _localctx = new PuppetValueContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_puppetValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOLEAN) | (1L << STRING_LITERAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PuppetValueExpContext extends ParserRuleContext {
		public PuppetValueExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_puppetValueExp; }
	 
		public PuppetValueExpContext() { }
		public void copyFrom(PuppetValueExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PuppetCompExprContext extends PuppetValueExpContext {
		public List<PuppetValueExpContext> puppetValueExp() {
			return getRuleContexts(PuppetValueExpContext.class);
		}
		public PuppetValueExpContext puppetValueExp(int i) {
			return getRuleContext(PuppetValueExpContext.class,i);
		}
		public TerminalNode LT() { return getToken(PuppetGrammarParser.LT, 0); }
		public TerminalNode GT() { return getToken(PuppetGrammarParser.GT, 0); }
		public TerminalNode LE() { return getToken(PuppetGrammarParser.LE, 0); }
		public TerminalNode GE() { return getToken(PuppetGrammarParser.GE, 0); }
		public PuppetCompExprContext(PuppetValueExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).enterPuppetCompExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).exitPuppetCompExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PuppetGrammarVisitor ) return ((PuppetGrammarVisitor<? extends T>)visitor).visitPuppetCompExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PuppetEqExprContext extends PuppetValueExpContext {
		public List<PuppetValueExpContext> puppetValueExp() {
			return getRuleContexts(PuppetValueExpContext.class);
		}
		public PuppetValueExpContext puppetValueExp(int i) {
			return getRuleContext(PuppetValueExpContext.class,i);
		}
		public TerminalNode EQ() { return getToken(PuppetGrammarParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(PuppetGrammarParser.NEQ, 0); }
		public PuppetEqExprContext(PuppetValueExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).enterPuppetEqExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).exitPuppetEqExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PuppetGrammarVisitor ) return ((PuppetGrammarVisitor<? extends T>)visitor).visitPuppetEqExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PuppetParaExprContext extends PuppetValueExpContext {
		public PuppetValueExpContext puppetValueExp() {
			return getRuleContext(PuppetValueExpContext.class,0);
		}
		public PuppetParaExprContext(PuppetValueExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).enterPuppetParaExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).exitPuppetParaExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PuppetGrammarVisitor ) return ((PuppetGrammarVisitor<? extends T>)visitor).visitPuppetParaExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PuppetExprToVariableContext extends PuppetValueExpContext {
		public PuppetVariableContext puppetVariable() {
			return getRuleContext(PuppetVariableContext.class,0);
		}
		public PuppetExprToVariableContext(PuppetValueExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).enterPuppetExprToVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).exitPuppetExprToVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PuppetGrammarVisitor ) return ((PuppetGrammarVisitor<? extends T>)visitor).visitPuppetExprToVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PuppetShiftExprContext extends PuppetValueExpContext {
		public List<PuppetValueExpContext> puppetValueExp() {
			return getRuleContexts(PuppetValueExpContext.class);
		}
		public PuppetValueExpContext puppetValueExp(int i) {
			return getRuleContext(PuppetValueExpContext.class,i);
		}
		public TerminalNode LEFTSHIFT() { return getToken(PuppetGrammarParser.LEFTSHIFT, 0); }
		public TerminalNode RIGHTSHIFT() { return getToken(PuppetGrammarParser.RIGHTSHIFT, 0); }
		public PuppetShiftExprContext(PuppetValueExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).enterPuppetShiftExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).exitPuppetShiftExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PuppetGrammarVisitor ) return ((PuppetGrammarVisitor<? extends T>)visitor).visitPuppetShiftExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PuppetExprToValueContext extends PuppetValueExpContext {
		public PuppetValueContext puppetValue() {
			return getRuleContext(PuppetValueContext.class,0);
		}
		public PuppetExprToValueContext(PuppetValueExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).enterPuppetExprToValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).exitPuppetExprToValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PuppetGrammarVisitor ) return ((PuppetGrammarVisitor<? extends T>)visitor).visitPuppetExprToValue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PuppetInExprContext extends PuppetValueExpContext {
		public List<PuppetValueExpContext> puppetValueExp() {
			return getRuleContexts(PuppetValueExpContext.class);
		}
		public PuppetValueExpContext puppetValueExp(int i) {
			return getRuleContext(PuppetValueExpContext.class,i);
		}
		public TerminalNode IN() { return getToken(PuppetGrammarParser.IN, 0); }
		public PuppetInExprContext(PuppetValueExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).enterPuppetInExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).exitPuppetInExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PuppetGrammarVisitor ) return ((PuppetGrammarVisitor<? extends T>)visitor).visitPuppetInExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PuppetRegExprContext extends PuppetValueExpContext {
		public List<PuppetValueExpContext> puppetValueExp() {
			return getRuleContexts(PuppetValueExpContext.class);
		}
		public PuppetValueExpContext puppetValueExp(int i) {
			return getRuleContext(PuppetValueExpContext.class,i);
		}
		public TerminalNode REGMATCH() { return getToken(PuppetGrammarParser.REGMATCH, 0); }
		public TerminalNode REGNONMATCH() { return getToken(PuppetGrammarParser.REGNONMATCH, 0); }
		public PuppetRegExprContext(PuppetValueExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).enterPuppetRegExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).exitPuppetRegExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PuppetGrammarVisitor ) return ((PuppetGrammarVisitor<? extends T>)visitor).visitPuppetRegExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PuppetAddExprContext extends PuppetValueExpContext {
		public List<PuppetValueExpContext> puppetValueExp() {
			return getRuleContexts(PuppetValueExpContext.class);
		}
		public PuppetValueExpContext puppetValueExp(int i) {
			return getRuleContext(PuppetValueExpContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(PuppetGrammarParser.PLUS, 0); }
		public TerminalNode SUB() { return getToken(PuppetGrammarParser.SUB, 0); }
		public PuppetAddExprContext(PuppetValueExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).enterPuppetAddExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).exitPuppetAddExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PuppetGrammarVisitor ) return ((PuppetGrammarVisitor<? extends T>)visitor).visitPuppetAddExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PuppetMultExprContext extends PuppetValueExpContext {
		public List<PuppetValueExpContext> puppetValueExp() {
			return getRuleContexts(PuppetValueExpContext.class);
		}
		public PuppetValueExpContext puppetValueExp(int i) {
			return getRuleContext(PuppetValueExpContext.class,i);
		}
		public TerminalNode MULT() { return getToken(PuppetGrammarParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(PuppetGrammarParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(PuppetGrammarParser.MOD, 0); }
		public PuppetMultExprContext(PuppetValueExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).enterPuppetMultExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).exitPuppetMultExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PuppetGrammarVisitor ) return ((PuppetGrammarVisitor<? extends T>)visitor).visitPuppetMultExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PuppetNotExprContext extends PuppetValueExpContext {
		public TerminalNode NOT() { return getToken(PuppetGrammarParser.NOT, 0); }
		public PuppetValueExpContext puppetValueExp() {
			return getRuleContext(PuppetValueExpContext.class,0);
		}
		public PuppetNotExprContext(PuppetValueExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).enterPuppetNotExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).exitPuppetNotExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PuppetGrammarVisitor ) return ((PuppetGrammarVisitor<? extends T>)visitor).visitPuppetNotExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PuppetOrExprContext extends PuppetValueExpContext {
		public List<PuppetValueExpContext> puppetValueExp() {
			return getRuleContexts(PuppetValueExpContext.class);
		}
		public PuppetValueExpContext puppetValueExp(int i) {
			return getRuleContext(PuppetValueExpContext.class,i);
		}
		public TerminalNode OR() { return getToken(PuppetGrammarParser.OR, 0); }
		public PuppetOrExprContext(PuppetValueExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).enterPuppetOrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).exitPuppetOrExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PuppetGrammarVisitor ) return ((PuppetGrammarVisitor<? extends T>)visitor).visitPuppetOrExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PuppetSelectorContext extends PuppetValueExpContext {
		public PuppetValueExpContext puppetValueExp() {
			return getRuleContext(PuppetValueExpContext.class,0);
		}
		public PuppetSelectorBodyContext puppetSelectorBody() {
			return getRuleContext(PuppetSelectorBodyContext.class,0);
		}
		public PuppetSelectorContext(PuppetValueExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).enterPuppetSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).exitPuppetSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PuppetGrammarVisitor ) return ((PuppetGrammarVisitor<? extends T>)visitor).visitPuppetSelector(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PuppetAndExprContext extends PuppetValueExpContext {
		public List<PuppetValueExpContext> puppetValueExp() {
			return getRuleContexts(PuppetValueExpContext.class);
		}
		public PuppetValueExpContext puppetValueExp(int i) {
			return getRuleContext(PuppetValueExpContext.class,i);
		}
		public TerminalNode AND() { return getToken(PuppetGrammarParser.AND, 0); }
		public PuppetAndExprContext(PuppetValueExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).enterPuppetAndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).exitPuppetAndExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PuppetGrammarVisitor ) return ((PuppetGrammarVisitor<? extends T>)visitor).visitPuppetAndExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PuppetValueExpContext puppetValueExp() throws RecognitionException {
		return puppetValueExp(0);
	}

	private PuppetValueExpContext puppetValueExp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PuppetValueExpContext _localctx = new PuppetValueExpContext(_ctx, _parentState);
		PuppetValueExpContext _prevctx = _localctx;
		int _startState = 68;
		enterRecursionRule(_localctx, 68, RULE_puppetValueExp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			switch (_input.LA(1)) {
			case NOT:
				{
				_localctx = new PuppetNotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(339);
				match(NOT);
				setState(340);
				puppetValueExp(11);
				}
				break;
			case INT:
			case FLOAT:
			case BOOLEAN:
			case STRING_LITERAL:
				{
				_localctx = new PuppetExprToValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(341);
				puppetValue();
				}
				break;
			case T__19:
				{
				_localctx = new PuppetExprToVariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(342);
				puppetVariable();
				}
				break;
			case T__12:
				{
				_localctx = new PuppetParaExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(343);
				match(T__12);
				setState(344);
				puppetValueExp(0);
				setState(345);
				match(T__13);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(384);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(382);
					switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
					case 1:
						{
						_localctx = new PuppetInExprContext(new PuppetValueExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_puppetValueExp);
						setState(349);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(350);
						match(IN);
						setState(351);
						puppetValueExp(10);
						}
						break;
					case 2:
						{
						_localctx = new PuppetRegExprContext(new PuppetValueExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_puppetValueExp);
						setState(352);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(353);
						_la = _input.LA(1);
						if ( !(_la==REGMATCH || _la==REGNONMATCH) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(354);
						puppetValueExp(9);
						}
						break;
					case 3:
						{
						_localctx = new PuppetMultExprContext(new PuppetValueExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_puppetValueExp);
						setState(355);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(356);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIV) | (1L << MULT) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(357);
						puppetValueExp(8);
						}
						break;
					case 4:
						{
						_localctx = new PuppetAddExprContext(new PuppetValueExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_puppetValueExp);
						setState(358);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(359);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==SUB) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(360);
						puppetValueExp(7);
						}
						break;
					case 5:
						{
						_localctx = new PuppetShiftExprContext(new PuppetValueExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_puppetValueExp);
						setState(361);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(362);
						_la = _input.LA(1);
						if ( !(_la==LEFTSHIFT || _la==RIGHTSHIFT) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(363);
						puppetValueExp(6);
						}
						break;
					case 6:
						{
						_localctx = new PuppetEqExprContext(new PuppetValueExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_puppetValueExp);
						setState(364);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(365);
						_la = _input.LA(1);
						if ( !(_la==EQ || _la==NEQ) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(366);
						puppetValueExp(5);
						}
						break;
					case 7:
						{
						_localctx = new PuppetCompExprContext(new PuppetValueExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_puppetValueExp);
						setState(367);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(368);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << GT) | (1L << LE) | (1L << GE))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(369);
						puppetValueExp(4);
						}
						break;
					case 8:
						{
						_localctx = new PuppetAndExprContext(new PuppetValueExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_puppetValueExp);
						setState(370);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(371);
						match(AND);
						setState(372);
						puppetValueExp(3);
						}
						break;
					case 9:
						{
						_localctx = new PuppetOrExprContext(new PuppetValueExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_puppetValueExp);
						setState(373);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(374);
						match(OR);
						setState(375);
						puppetValueExp(2);
						}
						break;
					case 10:
						{
						_localctx = new PuppetSelectorContext(new PuppetValueExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_puppetValueExp);
						setState(376);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(377);
						match(T__23);
						setState(378);
						match(T__4);
						setState(379);
						puppetSelectorBody();
						setState(380);
						match(T__5);
						}
						break;
					}
					} 
				}
				setState(386);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PuppetVariableContext extends ParserRuleContext {
		public PuppetLocalVariableContext puppetLocalVariable() {
			return getRuleContext(PuppetLocalVariableContext.class,0);
		}
		public PuppetQualifiedVariableContext puppetQualifiedVariable() {
			return getRuleContext(PuppetQualifiedVariableContext.class,0);
		}
		public PuppetVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_puppetVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).enterPuppetVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PuppetGrammarListener ) ((PuppetGrammarListener)listener).exitPuppetVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PuppetGrammarVisitor ) return ((PuppetGrammarVisitor<? extends T>)visitor).visitPuppetVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PuppetVariableContext puppetVariable() throws RecognitionException {
		PuppetVariableContext _localctx = new PuppetVariableContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_puppetVariable);
		try {
			setState(389);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(387);
				puppetLocalVariable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(388);
				puppetQualifiedVariable();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 34:
			return puppetValueExp_sempred((PuppetValueExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean puppetValueExp_sempred(PuppetValueExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 3);
		case 7:
			return precpred(_ctx, 2);
		case 8:
			return precpred(_ctx, 1);
		case 9:
			return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\65\u018a\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\2\3\2\3\3\3\3\3\3\7\3R\n\3\f\3"+
		"\16\3U\13\3\3\3\5\3X\n\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\6"+
		"\6e\n\6\r\6\16\6f\3\7\3\7\3\7\3\7\3\7\5\7n\n\7\3\7\3\7\3\b\3\b\3\b\5\b"+
		"u\n\b\3\b\5\bx\n\b\3\b\3\b\3\b\5\b}\n\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\5\13\u008f\n\13\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\3\r\5\r\u0098\n\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\5\16\u00a6\n\16\5\16\u00a8\n\16\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00b7\n\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\21\5\21\u00c0\n\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\5\22\u00ca\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00d3"+
		"\n\22\3\22\3\22\5\22\u00d7\n\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\3\25\5\25\u00e4\n\25\3\25\3\25\3\26\3\26\3\26\7\26\u00eb\n"+
		"\26\f\26\16\26\u00ee\13\26\3\26\5\26\u00f1\n\26\3\27\3\27\3\27\5\27\u00f6"+
		"\n\27\3\30\3\30\3\30\3\30\7\30\u00fc\n\30\f\30\16\30\u00ff\13\30\3\30"+
		"\3\30\3\31\6\31\u0104\n\31\r\31\16\31\u0105\3\32\3\32\3\32\3\32\5\32\u010c"+
		"\n\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35"+
		"\3\35\3\35\5\35\u011d\n\35\3\36\3\36\3\36\7\36\u0122\n\36\f\36\16\36\u0125"+
		"\13\36\3\36\5\36\u0128\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u0131"+
		"\n\37\3 \3 \5 \u0135\n \3 \7 \u0138\n \f \16 \u013b\13 \3!\3!\3!\3!\3"+
		"!\3!\3!\3!\3!\3!\3!\5!\u0148\n!\3\"\3\"\3\"\3\"\3\"\5\"\u014f\n\"\3\""+
		"\3\"\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u015e\n$\3$\3$\3$\3$\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3"+
		"$\3$\3$\3$\7$\u0181\n$\f$\16$\u0184\13$\3%\3%\5%\u0188\n%\3%\2\3F&\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH\2\t"+
		"\4\2.\60\63\63\3\2$%\3\2)+\3\2\'(\3\2,-\3\2\36\37\3\2 #\u019f\2J\3\2\2"+
		"\2\4N\3\2\2\2\6Y\3\2\2\2\b]\3\2\2\2\nd\3\2\2\2\fh\3\2\2\2\16q\3\2\2\2"+
		"\20\u0080\3\2\2\2\22\u0087\3\2\2\2\24\u008e\3\2\2\2\26\u0090\3\2\2\2\30"+
		"\u0092\3\2\2\2\32\u00a7\3\2\2\2\34\u00a9\3\2\2\2\36\u00b0\3\2\2\2 \u00ba"+
		"\3\2\2\2\"\u00d6\3\2\2\2$\u00d8\3\2\2\2&\u00db\3\2\2\2(\u00de\3\2\2\2"+
		"*\u00f0\3\2\2\2,\u00f2\3\2\2\2.\u00f7\3\2\2\2\60\u0103\3\2\2\2\62\u010b"+
		"\3\2\2\2\64\u010d\3\2\2\2\66\u0112\3\2\2\28\u011c\3\2\2\2:\u011e\3\2\2"+
		"\2<\u0130\3\2\2\2>\u0132\3\2\2\2@\u0147\3\2\2\2B\u0149\3\2\2\2D\u0152"+
		"\3\2\2\2F\u015d\3\2\2\2H\u0187\3\2\2\2JK\5&\24\2KL\7\3\2\2LM\5F$\2M\3"+
		"\3\2\2\2NS\5\6\4\2OP\7\4\2\2PR\5\6\4\2QO\3\2\2\2RU\3\2\2\2SQ\3\2\2\2S"+
		"T\3\2\2\2TW\3\2\2\2US\3\2\2\2VX\7\4\2\2WV\3\2\2\2WX\3\2\2\2X\5\3\2\2\2"+
		"YZ\7\62\2\2Z[\7\5\2\2[\\\5F$\2\\\7\3\2\2\2]^\7\6\2\2^_\5F$\2_`\7\7\2\2"+
		"`a\5\n\6\2ab\7\b\2\2b\t\3\2\2\2ce\5\f\7\2dc\3\2\2\2ef\3\2\2\2fd\3\2\2"+
		"\2fg\3\2\2\2g\13\3\2\2\2hi\5D#\2ij\7\t\2\2jm\7\7\2\2kn\5> \2ln\3\2\2\2"+
		"mk\3\2\2\2ml\3\2\2\2no\3\2\2\2op\7\b\2\2p\r\3\2\2\2qr\7\n\2\2rt\5\24\13"+
		"\2su\5.\30\2ts\3\2\2\2tu\3\2\2\2uw\3\2\2\2vx\5\22\n\2wv\3\2\2\2wx\3\2"+
		"\2\2xy\3\2\2\2y|\7\7\2\2z}\5> \2{}\3\2\2\2|z\3\2\2\2|{\3\2\2\2}~\3\2\2"+
		"\2~\177\7\b\2\2\177\17\3\2\2\2\u0080\u0081\7\n\2\2\u0081\u0082\7\7\2\2"+
		"\u0082\u0083\7\63\2\2\u0083\u0084\7\t\2\2\u0084\u0085\5\4\3\2\u0085\u0086"+
		"\7\b\2\2\u0086\21\3\2\2\2\u0087\u0088\7\13\2\2\u0088\u0089\5\24\13\2\u0089"+
		"\23\3\2\2\2\u008a\u008b\7\62\2\2\u008b\u008c\7\f\2\2\u008c\u008f\5\24"+
		"\13\2\u008d\u008f\7\62\2\2\u008e\u008a\3\2\2\2\u008e\u008d\3\2\2\2\u008f"+
		"\25\3\2\2\2\u0090\u0091\7\r\2\2\u0091\27\3\2\2\2\u0092\u0093\7\16\2\2"+
		"\u0093\u0094\5\32\16\2\u0094\u0097\7\7\2\2\u0095\u0098\5> \2\u0096\u0098"+
		"\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099"+
		"\u009a\7\b\2\2\u009a\31\3\2\2\2\u009b\u009c\7\17\2\2\u009c\u009d\5\32"+
		"\16\2\u009d\u009e\7\62\2\2\u009e\u009f\7\20\2\2\u009f\u00a8\3\2\2\2\u00a0"+
		"\u00a6\7\f\2\2\u00a1\u00a2\7\f\2\2\u00a2\u00a6\5\24\13\2\u00a3\u00a4\7"+
		"\f\2\2\u00a4\u00a6\5*\26\2\u00a5\u00a0\3\2\2\2\u00a5\u00a1\3\2\2\2\u00a5"+
		"\u00a3\3\2\2\2\u00a6\u00a8\3\2\2\2\u00a7\u009b\3\2\2\2\u00a7\u00a5\3\2"+
		"\2\2\u00a8\33\3\2\2\2\u00a9\u00aa\7\62\2\2\u00aa\u00ab\7\7\2\2\u00ab\u00ac"+
		"\5F$\2\u00ac\u00ad\7\t\2\2\u00ad\u00ae\5\4\3\2\u00ae\u00af\7\b\2\2\u00af"+
		"\35\3\2\2\2\u00b0\u00b1\7\21\2\2\u00b1\u00b2\7\62\2\2\u00b2\u00b3\5.\30"+
		"\2\u00b3\u00b6\7\7\2\2\u00b4\u00b7\5> \2\u00b5\u00b7\3\2\2\2\u00b6\u00b4"+
		"\3\2\2\2\u00b6\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\7\b\2\2\u00b9"+
		"\37\3\2\2\2\u00ba\u00bb\7\22\2\2\u00bb\u00bc\5F$\2\u00bc\u00bf\7\7\2\2"+
		"\u00bd\u00c0\5> \2\u00be\u00c0\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00be"+
		"\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\7\b\2\2\u00c2\u00c3\5\"\22\2"+
		"\u00c3!\3\2\2\2\u00c4\u00c5\7\23\2\2\u00c5\u00c6\5F$\2\u00c6\u00c9\7\7"+
		"\2\2\u00c7\u00ca\5> \2\u00c8\u00ca\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00c8"+
		"\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\7\b\2\2\u00cc\u00cd\5\"\22\2"+
		"\u00cd\u00d7\3\2\2\2\u00ce\u00cf\7\24\2\2\u00cf\u00d2\7\7\2\2\u00d0\u00d3"+
		"\5> \2\u00d1\u00d3\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d1\3\2\2\2\u00d3"+
		"\u00d4\3\2\2\2\u00d4\u00d7\7\b\2\2\u00d5\u00d7\3\2\2\2\u00d6\u00c4\3\2"+
		"\2\2\u00d6\u00ce\3\2\2\2\u00d6\u00d5\3\2\2\2\u00d7#\3\2\2\2\u00d8\u00d9"+
		"\7\25\2\2\u00d9\u00da\5\24\13\2\u00da%\3\2\2\2\u00db\u00dc\7\26\2\2\u00dc"+
		"\u00dd\7\62\2\2\u00dd\'\3\2\2\2\u00de\u00df\7\27\2\2\u00df\u00e0\5*\26"+
		"\2\u00e0\u00e3\7\7\2\2\u00e1\u00e4\5> \2\u00e2\u00e4\3\2\2\2\u00e3\u00e1"+
		"\3\2\2\2\u00e3\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\7\b\2\2\u00e6"+
		")\3\2\2\2\u00e7\u00ec\7\63\2\2\u00e8\u00e9\7\4\2\2\u00e9\u00eb\7\63\2"+
		"\2\u00ea\u00e8\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed"+
		"\3\2\2\2\u00ed\u00f1\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f1\7\30\2\2"+
		"\u00f0\u00e7\3\2\2\2\u00f0\u00ef\3\2\2\2\u00f1+\3\2\2\2\u00f2\u00f5\5"+
		"H%\2\u00f3\u00f4\7\3\2\2\u00f4\u00f6\5F$\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6"+
		"\3\2\2\2\u00f6-\3\2\2\2\u00f7\u00f8\7\17\2\2\u00f8\u00fd\5,\27\2\u00f9"+
		"\u00fa\7\4\2\2\u00fa\u00fc\5,\27\2\u00fb\u00f9\3\2\2\2\u00fc\u00ff\3\2"+
		"\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0100\3\2\2\2\u00ff"+
		"\u00fd\3\2\2\2\u0100\u0101\7\20\2\2\u0101/\3\2\2\2\u0102\u0104\5\62\32"+
		"\2\u0103\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106"+
		"\3\2\2\2\u0106\61\3\2\2\2\u0107\u010c\5\16\b\2\u0108\u010c\5(\25\2\u0109"+
		"\u010c\5\36\20\2\u010a\u010c\5> \2\u010b\u0107\3\2\2\2\u010b\u0108\3\2"+
		"\2\2\u010b\u0109\3\2\2\2\u010b\u010a\3\2\2\2\u010c\63\3\2\2\2\u010d\u010e"+
		"\7\26\2\2\u010e\u010f\58\35\2\u010f\u0110\7\f\2\2\u0110\u0111\7\62\2\2"+
		"\u0111\65\3\2\2\2\u0112\u0113\7\61\2\2\u0113\u0114\7\7\2\2\u0114\u0115"+
		"\5F$\2\u0115\u0116\7\t\2\2\u0116\u0117\5\4\3\2\u0117\u0118\7\b\2\2\u0118"+
		"\67\3\2\2\2\u0119\u011a\7\f\2\2\u011a\u011d\5\24\13\2\u011b\u011d\3\2"+
		"\2\2\u011c\u0119\3\2\2\2\u011c\u011b\3\2\2\2\u011d9\3\2\2\2\u011e\u0123"+
		"\5<\37\2\u011f\u0120\7\4\2\2\u0120\u0122\5<\37\2\u0121\u011f\3\2\2\2\u0122"+
		"\u0125\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0127\3\2"+
		"\2\2\u0125\u0123\3\2\2\2\u0126\u0128\7\4\2\2\u0127\u0126\3\2\2\2\u0127"+
		"\u0128\3\2\2\2\u0128;\3\2\2\2\u0129\u012a\5F$\2\u012a\u012b\7\5\2\2\u012b"+
		"\u012c\5F$\2\u012c\u0131\3\2\2\2\u012d\u012e\7\30\2\2\u012e\u012f\7\5"+
		"\2\2\u012f\u0131\5F$\2\u0130\u0129\3\2\2\2\u0130\u012d\3\2\2\2\u0131="+
		"\3\2\2\2\u0132\u0139\5@!\2\u0133\u0135\7\4\2\2\u0134\u0133\3\2\2\2\u0134"+
		"\u0135\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0138\5@!\2\u0137\u0134\3\2\2"+
		"\2\u0138\u013b\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a?"+
		"\3\2\2\2\u013b\u0139\3\2\2\2\u013c\u0148\5F$\2\u013d\u0148\5\34\17\2\u013e"+
		"\u0148\5\66\34\2\u013f\u0148\5\2\2\2\u0140\u0148\5$\23\2\u0141\u0148\5"+
		"\20\t\2\u0142\u0148\5\26\f\2\u0143\u0148\5\30\r\2\u0144\u0148\5 \21\2"+
		"\u0145\u0148\5B\"\2\u0146\u0148\5\b\5\2\u0147\u013c\3\2\2\2\u0147\u013d"+
		"\3\2\2\2\u0147\u013e\3\2\2\2\u0147\u013f\3\2\2\2\u0147\u0140\3\2\2\2\u0147"+
		"\u0141\3\2\2\2\u0147\u0142\3\2\2\2\u0147\u0143\3\2\2\2\u0147\u0144\3\2"+
		"\2\2\u0147\u0145\3\2\2\2\u0147\u0146\3\2\2\2\u0148A\3\2\2\2\u0149\u014a"+
		"\7\31\2\2\u014a\u014b\5F$\2\u014b\u014e\7\7\2\2\u014c\u014f\5> \2\u014d"+
		"\u014f\3\2\2\2\u014e\u014c\3\2\2\2\u014e\u014d\3\2\2\2\u014f\u0150\3\2"+
		"\2\2\u0150\u0151\7\b\2\2\u0151C\3\2\2\2\u0152\u0153\t\2\2\2\u0153E\3\2"+
		"\2\2\u0154\u0155\b$\1\2\u0155\u0156\7\33\2\2\u0156\u015e\5F$\r\u0157\u015e"+
		"\5D#\2\u0158\u015e\5H%\2\u0159\u015a\7\17\2\2\u015a\u015b\5F$\2\u015b"+
		"\u015c\7\20\2\2\u015c\u015e\3\2\2\2\u015d\u0154\3\2\2\2\u015d\u0157\3"+
		"\2\2\2\u015d\u0158\3\2\2\2\u015d\u0159\3\2\2\2\u015e\u0182\3\2\2\2\u015f"+
		"\u0160\f\13\2\2\u0160\u0161\7&\2\2\u0161\u0181\5F$\f\u0162\u0163\f\n\2"+
		"\2\u0163\u0164\t\3\2\2\u0164\u0181\5F$\13\u0165\u0166\f\t\2\2\u0166\u0167"+
		"\t\4\2\2\u0167\u0181\5F$\n\u0168\u0169\f\b\2\2\u0169\u016a\t\5\2\2\u016a"+
		"\u0181\5F$\t\u016b\u016c\f\7\2\2\u016c\u016d\t\6\2\2\u016d\u0181\5F$\b"+
		"\u016e\u016f\f\6\2\2\u016f\u0170\t\7\2\2\u0170\u0181\5F$\7\u0171\u0172"+
		"\f\5\2\2\u0172\u0173\t\b\2\2\u0173\u0181\5F$\6\u0174\u0175\f\4\2\2\u0175"+
		"\u0176\7\34\2\2\u0176\u0181\5F$\5\u0177\u0178\f\3\2\2\u0178\u0179\7\35"+
		"\2\2\u0179\u0181\5F$\4\u017a\u017b\f\f\2\2\u017b\u017c\7\32\2\2\u017c"+
		"\u017d\7\7\2\2\u017d\u017e\5:\36\2\u017e\u017f\7\b\2\2\u017f\u0181\3\2"+
		"\2\2\u0180\u015f\3\2\2\2\u0180\u0162\3\2\2\2\u0180\u0165\3\2\2\2\u0180"+
		"\u0168\3\2\2\2\u0180\u016b\3\2\2\2\u0180\u016e\3\2\2\2\u0180\u0171\3\2"+
		"\2\2\u0180\u0174\3\2\2\2\u0180\u0177\3\2\2\2\u0180\u017a\3\2\2\2\u0181"+
		"\u0184\3\2\2\2\u0182\u0180\3\2\2\2\u0182\u0183\3\2\2\2\u0183G\3\2\2\2"+
		"\u0184\u0182\3\2\2\2\u0185\u0188\5&\24\2\u0186\u0188\5\64\33\2\u0187\u0185"+
		"\3\2\2\2\u0187\u0186\3\2\2\2\u0188I\3\2\2\2%SWfmtw|\u008e\u0097\u00a5"+
		"\u00a7\u00b6\u00bf\u00c9\u00d2\u00d6\u00e3\u00ec\u00f0\u00f5\u00fd\u0105"+
		"\u010b\u011c\u0123\u0127\u0130\u0134\u0139\u0147\u014e\u015d\u0180\u0182"+
		"\u0187";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}