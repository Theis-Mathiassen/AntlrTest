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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, INT=8, OPERATOR=9, 
		CompareOperator=10, LogicalUnaryOperator=11, LogicalBinaryOperator=12, 
		ID=13, DIGIT=14, Types=15, WS=16;
	public static final int
		RULE_calc = 0, RULE_statements = 1, RULE_statement = 2, RULE_stat = 3, 
		RULE_block = 4, RULE_lexpr = 5, RULE_identifierDecleration = 6, RULE_expression = 7, 
		RULE_auxillary = 8, RULE_type = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"calc", "statements", "statement", "stat", "block", "lexpr", "identifierDecleration", 
			"expression", "auxillary", "type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'while'", "'('", "')'", "'if'", "'{'", "'}'", null, null, 
			null, "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "INT", "OPERATOR", "CompareOperator", 
			"LogicalUnaryOperator", "LogicalBinaryOperator", "ID", "DIGIT", "Types", 
			"WS"
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
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
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
			setState(20);
			statement();
			setState(21);
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
			setState(27);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(23);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(24);
				statement();
				setState(25);
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
			setState(29);
			expression();
			setState(30);
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
		public LexprContext lexpr() {
			return getRuleContext(LexprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
			setState(48);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				match(T__1);
				setState(33);
				match(T__2);
				setState(34);
				lexpr(0);
				setState(35);
				match(T__3);
				setState(36);
				block();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				match(T__4);
				setState(39);
				match(T__2);
				setState(40);
				lexpr(0);
				setState(41);
				match(T__3);
				setState(42);
				block();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(44);
				block();
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 4);
				{
				setState(45);
				expression();
				setState(46);
				match(T__0);
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
			setState(50);
			match(T__5);
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << INT))) != 0)) {
				{
				{
				setState(51);
				stat();
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(57);
			match(T__6);
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

	public static class LexprContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode CompareOperator() { return getToken(RogueParser.CompareOperator, 0); }
		public TerminalNode LogicalUnaryOperator() { return getToken(RogueParser.LogicalUnaryOperator, 0); }
		public List<LexprContext> lexpr() {
			return getRuleContexts(LexprContext.class);
		}
		public LexprContext lexpr(int i) {
			return getRuleContext(LexprContext.class,i);
		}
		public TerminalNode LogicalBinaryOperator() { return getToken(RogueParser.LogicalBinaryOperator, 0); }
		public LexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexpr; }
	}

	public final LexprContext lexpr() throws RecognitionException {
		return lexpr(0);
	}

	private LexprContext lexpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LexprContext _localctx = new LexprContext(_ctx, _parentState);
		LexprContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_lexpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(60);
				expression();
				setState(61);
				match(CompareOperator);
				setState(62);
				expression();
				}
				break;
			case LogicalUnaryOperator:
				{
				setState(64);
				match(LogicalUnaryOperator);
				setState(65);
				lexpr(2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(73);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LexprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_lexpr);
					setState(68);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(69);
					match(LogicalBinaryOperator);
					setState(70);
					lexpr(2);
					}
					} 
				}
				setState(75);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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
		enterRule(_localctx, 12, RULE_identifierDecleration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			type();
			setState(77);
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
		enterRule(_localctx, 14, RULE_expression);
		try {
			setState(83);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new NormalExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				match(INT);
				setState(80);
				match(OPERATOR);
				setState(81);
				expression();
				}
				break;
			case 2:
				_localctx = new IntExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
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
		enterRule(_localctx, 16, RULE_auxillary);
		try {
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new IntAuxContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				match(INT);
				}
				break;
			case 2:
				_localctx = new ExprAuxContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
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
		enterRule(_localctx, 18, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return lexpr_sempred((LexprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean lexpr_sempred(LexprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\22^\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3\36\n\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\63\n\5\3\6\3\6\7\6\67"+
		"\n\6\f\6\16\6:\13\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7E\n\7\3\7\3"+
		"\7\3\7\7\7J\n\7\f\7\16\7M\13\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\5\tV\n\t\3"+
		"\n\3\n\5\nZ\n\n\3\13\3\13\3\13\2\3\f\f\2\4\6\b\n\f\16\20\22\24\2\2\2\\"+
		"\2\26\3\2\2\2\4\35\3\2\2\2\6\37\3\2\2\2\b\62\3\2\2\2\n\64\3\2\2\2\fD\3"+
		"\2\2\2\16N\3\2\2\2\20U\3\2\2\2\22Y\3\2\2\2\24[\3\2\2\2\26\27\5\6\4\2\27"+
		"\30\7\2\2\3\30\3\3\2\2\2\31\36\5\6\4\2\32\33\5\6\4\2\33\34\5\4\3\2\34"+
		"\36\3\2\2\2\35\31\3\2\2\2\35\32\3\2\2\2\36\5\3\2\2\2\37 \5\20\t\2 !\7"+
		"\3\2\2!\7\3\2\2\2\"#\7\4\2\2#$\7\5\2\2$%\5\f\7\2%&\7\6\2\2&\'\5\n\6\2"+
		"\'\63\3\2\2\2()\7\7\2\2)*\7\5\2\2*+\5\f\7\2+,\7\6\2\2,-\5\n\6\2-\63\3"+
		"\2\2\2.\63\5\n\6\2/\60\5\20\t\2\60\61\7\3\2\2\61\63\3\2\2\2\62\"\3\2\2"+
		"\2\62(\3\2\2\2\62.\3\2\2\2\62/\3\2\2\2\63\t\3\2\2\2\648\7\b\2\2\65\67"+
		"\5\b\5\2\66\65\3\2\2\2\67:\3\2\2\28\66\3\2\2\289\3\2\2\29;\3\2\2\2:8\3"+
		"\2\2\2;<\7\t\2\2<\13\3\2\2\2=>\b\7\1\2>?\5\20\t\2?@\7\f\2\2@A\5\20\t\2"+
		"AE\3\2\2\2BC\7\r\2\2CE\5\f\7\4D=\3\2\2\2DB\3\2\2\2EK\3\2\2\2FG\f\3\2\2"+
		"GH\7\16\2\2HJ\5\f\7\4IF\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2L\r\3\2\2"+
		"\2MK\3\2\2\2NO\5\24\13\2OP\7\17\2\2P\17\3\2\2\2QR\7\n\2\2RS\7\13\2\2S"+
		"V\5\20\t\2TV\7\n\2\2UQ\3\2\2\2UT\3\2\2\2V\21\3\2\2\2WZ\7\n\2\2XZ\5\20"+
		"\t\2YW\3\2\2\2YX\3\2\2\2Z\23\3\2\2\2[\\\7\21\2\2\\\25\3\2\2\2\t\35\62"+
		"8DKUY";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}