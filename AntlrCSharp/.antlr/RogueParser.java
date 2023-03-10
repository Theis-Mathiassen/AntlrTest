// Generated from /home/kali/Documents/AntlrProject/Test/AntlrTest/AntlrCSharp/Rogue.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RogueParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, INT=7, OPERATOR=8, ID=9, 
		DIGIT=10, WS=11, Types=12;
	public static final int
		RULE_calc = 0, RULE_statements = 1, RULE_statement = 2, RULE_stat = 3, 
		RULE_block = 4, RULE_identifierDecleration = 5, RULE_expression = 6, RULE_auxillary = 7, 
		RULE_type = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"calc", "statements", "statement", "stat", "block", "identifierDecleration", 
			"expression", "auxillary", "type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'while'", "'('", "')'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "INT", "OPERATOR", "ID", "DIGIT", 
			"WS", "Types"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "Rogue.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RogueParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CalcContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(RogueParser.EOF, 0); }
		public CalcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calc; }
	}

	public final CalcContext calc() throws RecognitionException {
		CalcContext _localctx = new CalcContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_calc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			statements();
			setState(19);
			match(EOF);
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

	public static class StatementsContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statements);
		try {
			setState(25);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(21);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(22);
				statement();
				setState(23);
				statements();
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

	public static class StatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			expression();
			setState(28);
			match(T__0);
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

	public static class StatContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_stat);
		try {
			setState(37);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				match(T__1);
				setState(31);
				match(T__2);
				setState(32);
				expression();
				setState(33);
				match(T__3);
				setState(34);
				stat();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				block();
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

	public static class BlockContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(T__4);
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1 || _la==T__4) {
				{
				{
				setState(40);
				stat();
				}
				}
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(46);
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

	public static class IdentifierDeclerationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(RogueParser.ID, 0); }
		public IdentifierDeclerationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierDecleration; }
	}

	public final IdentifierDeclerationContext identifierDecleration() throws RecognitionException {
		IdentifierDeclerationContext _localctx = new IdentifierDeclerationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_identifierDecleration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			type();
			setState(49);
			match(ID);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NormalExpressionContext extends ExpressionContext {
		public TerminalNode INT() { return getToken(RogueParser.INT, 0); }
		public TerminalNode OPERATOR() { return getToken(RogueParser.OPERATOR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NormalExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class IntExpressionContext extends ExpressionContext {
		public TerminalNode INT() { return getToken(RogueParser.INT, 0); }
		public IntExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expression);
		try {
			setState(55);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new NormalExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				match(INT);
				setState(52);
				match(OPERATOR);
				setState(53);
				expression();
				}
				break;
			case 2:
				_localctx = new IntExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				match(INT);
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

	public static class AuxillaryContext extends ParserRuleContext {
		public AuxillaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_auxillary; }
	 
		public AuxillaryContext() { }
		public void copyFrom(AuxillaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IntAuxContext extends AuxillaryContext {
		public TerminalNode INT() { return getToken(RogueParser.INT, 0); }
		public IntAuxContext(AuxillaryContext ctx) { copyFrom(ctx); }
	}
	public static class ExprAuxContext extends AuxillaryContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExprAuxContext(AuxillaryContext ctx) { copyFrom(ctx); }
	}

	public final AuxillaryContext auxillary() throws RecognitionException {
		AuxillaryContext _localctx = new AuxillaryContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_auxillary);
		try {
			setState(59);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new IntAuxContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				match(INT);
				}
				break;
			case 2:
				_localctx = new ExprAuxContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				expression();
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode Types() { return getToken(RogueParser.Types, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(Types);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\16B\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\5\3\34\n\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5"+
		"\5(\n\5\3\6\3\6\7\6,\n\6\f\6\16\6/\13\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\5\b:\n\b\3\t\3\t\5\t>\n\t\3\n\3\n\3\n\2\2\13\2\4\6\b\n\f\16\20"+
		"\22\2\2\2=\2\24\3\2\2\2\4\33\3\2\2\2\6\35\3\2\2\2\b\'\3\2\2\2\n)\3\2\2"+
		"\2\f\62\3\2\2\2\169\3\2\2\2\20=\3\2\2\2\22?\3\2\2\2\24\25\5\4\3\2\25\26"+
		"\7\2\2\3\26\3\3\2\2\2\27\34\5\6\4\2\30\31\5\6\4\2\31\32\5\4\3\2\32\34"+
		"\3\2\2\2\33\27\3\2\2\2\33\30\3\2\2\2\34\5\3\2\2\2\35\36\5\16\b\2\36\37"+
		"\7\3\2\2\37\7\3\2\2\2 !\7\4\2\2!\"\7\5\2\2\"#\5\16\b\2#$\7\6\2\2$%\5\b"+
		"\5\2%(\3\2\2\2&(\5\n\6\2\' \3\2\2\2\'&\3\2\2\2(\t\3\2\2\2)-\7\7\2\2*,"+
		"\5\b\5\2+*\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\60\3\2\2\2/-\3\2\2\2"+
		"\60\61\7\b\2\2\61\13\3\2\2\2\62\63\5\22\n\2\63\64\7\13\2\2\64\r\3\2\2"+
		"\2\65\66\7\t\2\2\66\67\7\n\2\2\67:\5\16\b\28:\7\t\2\29\65\3\2\2\298\3"+
		"\2\2\2:\17\3\2\2\2;>\7\t\2\2<>\5\16\b\2=;\3\2\2\2=<\3\2\2\2>\21\3\2\2"+
		"\2?@\7\16\2\2@\23\3\2\2\2\7\33\'-9=";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}