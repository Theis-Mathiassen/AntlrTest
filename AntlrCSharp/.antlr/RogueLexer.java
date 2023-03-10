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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, INT=7, OPERATOR=8, ID=9, 
		DIGIT=10, Types=11, WS=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "INT", "OPERATOR", "ID", 
			"DIGIT", "Types", "WS", "LETTER", "DIGIT_RULE", "Types_Rule"
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
			"Types", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\16b\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3"+
		"\n\7\n9\n\n\f\n\16\n<\13\n\3\13\3\13\3\f\3\f\3\r\6\rC\n\r\r\r\16\rD\3"+
		"\r\3\r\3\16\3\16\3\17\3\17\3\17\7\17N\n\17\f\17\16\17Q\13\17\5\17S\n\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20a\n\20"+
		"\2\2\21\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\2"+
		"\35\2\37\2\3\2\5\5\2,-//\61\61\5\2\13\f\17\17\"\"\3\2C|\2e\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\3!\3\2\2\2\5#\3\2\2\2\7)\3\2\2\2\t+\3\2\2\2\13-\3\2\2\2\r/\3\2\2\2\17"+
		"\61\3\2\2\2\21\63\3\2\2\2\23\65\3\2\2\2\25=\3\2\2\2\27?\3\2\2\2\31B\3"+
		"\2\2\2\33H\3\2\2\2\35R\3\2\2\2\37`\3\2\2\2!\"\7=\2\2\"\4\3\2\2\2#$\7y"+
		"\2\2$%\7j\2\2%&\7k\2\2&\'\7n\2\2\'(\7g\2\2(\6\3\2\2\2)*\7*\2\2*\b\3\2"+
		"\2\2+,\7+\2\2,\n\3\2\2\2-.\7}\2\2.\f\3\2\2\2/\60\7\177\2\2\60\16\3\2\2"+
		"\2\61\62\5\25\13\2\62\20\3\2\2\2\63\64\t\2\2\2\64\22\3\2\2\2\65:\5\33"+
		"\16\2\669\5\33\16\2\679\5\25\13\28\66\3\2\2\28\67\3\2\2\29<\3\2\2\2:8"+
		"\3\2\2\2:;\3\2\2\2;\24\3\2\2\2<:\3\2\2\2=>\5\35\17\2>\26\3\2\2\2?@\5\37"+
		"\20\2@\30\3\2\2\2AC\t\3\2\2BA\3\2\2\2CD\3\2\2\2DB\3\2\2\2DE\3\2\2\2EF"+
		"\3\2\2\2FG\b\r\2\2G\32\3\2\2\2HI\t\4\2\2I\34\3\2\2\2JS\7\62\2\2KO\4\63"+
		";\2LN\4\62;\2ML\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2PS\3\2\2\2QO\3\2"+
		"\2\2RJ\3\2\2\2RK\3\2\2\2S\36\3\2\2\2TU\7e\2\2UV\7j\2\2VW\7c\2\2Wa\7t\2"+
		"\2XY\7k\2\2YZ\7p\2\2Za\7v\2\2[\\\7h\2\2\\]\7n\2\2]^\7q\2\2^_\7c\2\2_a"+
		"\7v\2\2`T\3\2\2\2`X\3\2\2\2`[\3\2\2\2a \3\2\2\2\t\28:DOR`\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}