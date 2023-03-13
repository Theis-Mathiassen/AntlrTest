// Generated from /home/kali/Documents/AntlrProject/Test/AntlrTest/AntlrCSharp/Rogue.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RogueLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, INT=8, OPERATOR=9, 
		CompareOperator=10, LogicalUnaryOperator=11, LogicalBinaryOperator=12, 
		ID=13, DIGIT=14, Types=15, WS=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "INT", "OPERATOR", 
			"CompareOperator", "LogicalUnaryOperator", "LogicalBinaryOperator", "ID", 
			"DIGIT", "Types", "WS", "LETTER", "DIGIT_RULE", "Types_Rule"
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


	public RogueLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Rogue.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\22{\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\5\13D\n\13\3"+
		"\f\3\f\3\r\3\r\3\r\3\r\3\r\5\rM\n\r\3\16\3\16\3\16\7\16R\n\16\f\16\16"+
		"\16U\13\16\3\17\3\17\3\20\3\20\3\21\6\21\\\n\21\r\21\16\21]\3\21\3\21"+
		"\3\22\3\22\3\23\3\23\3\23\7\23g\n\23\f\23\16\23j\13\23\5\23l\n\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24z\n\24\2\2"+
		"\25\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\2%\2\'\2\3\2\6\5\2,-//\61\61\4\2>>@@\5\2\13\f\17\17\"\""+
		"\3\2C|\2\u0081\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\3)\3\2\2\2\5+\3\2\2\2\7\61\3\2\2\2\t\63\3\2\2\2\13\65\3\2\2\2\r"+
		"8\3\2\2\2\17:\3\2\2\2\21<\3\2\2\2\23>\3\2\2\2\25C\3\2\2\2\27E\3\2\2\2"+
		"\31L\3\2\2\2\33N\3\2\2\2\35V\3\2\2\2\37X\3\2\2\2![\3\2\2\2#a\3\2\2\2%"+
		"k\3\2\2\2\'y\3\2\2\2)*\7=\2\2*\4\3\2\2\2+,\7y\2\2,-\7j\2\2-.\7k\2\2./"+
		"\7n\2\2/\60\7g\2\2\60\6\3\2\2\2\61\62\7*\2\2\62\b\3\2\2\2\63\64\7+\2\2"+
		"\64\n\3\2\2\2\65\66\7k\2\2\66\67\7h\2\2\67\f\3\2\2\289\7}\2\29\16\3\2"+
		"\2\2:;\7\177\2\2;\20\3\2\2\2<=\5\35\17\2=\22\3\2\2\2>?\t\2\2\2?\24\3\2"+
		"\2\2@D\t\3\2\2AB\7?\2\2BD\7?\2\2C@\3\2\2\2CA\3\2\2\2D\26\3\2\2\2EF\7#"+
		"\2\2F\30\3\2\2\2GH\7(\2\2HM\7(\2\2IJ\7~\2\2JM\7~\2\2KM\7`\2\2LG\3\2\2"+
		"\2LI\3\2\2\2LK\3\2\2\2M\32\3\2\2\2NS\5#\22\2OR\5#\22\2PR\5\35\17\2QO\3"+
		"\2\2\2QP\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2T\34\3\2\2\2US\3\2\2\2V"+
		"W\5%\23\2W\36\3\2\2\2XY\5\'\24\2Y \3\2\2\2Z\\\t\4\2\2[Z\3\2\2\2\\]\3\2"+
		"\2\2][\3\2\2\2]^\3\2\2\2^_\3\2\2\2_`\b\21\2\2`\"\3\2\2\2ab\t\5\2\2b$\3"+
		"\2\2\2cl\7\62\2\2dh\4\63;\2eg\4\62;\2fe\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi"+
		"\3\2\2\2il\3\2\2\2jh\3\2\2\2kc\3\2\2\2kd\3\2\2\2l&\3\2\2\2mn\7e\2\2no"+
		"\7j\2\2op\7c\2\2pz\7t\2\2qr\7k\2\2rs\7p\2\2sz\7v\2\2tu\7h\2\2uv\7n\2\2"+
		"vw\7q\2\2wx\7c\2\2xz\7v\2\2ym\3\2\2\2yq\3\2\2\2yt\3\2\2\2z(\3\2\2\2\13"+
		"\2CLQS]hky\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}