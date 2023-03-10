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
		DIGIT=10, WS=11;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "INT", "OPERATOR", "ID", 
			"DIGIT", "WS", "LETTER", "DIGIT_RULE", "Types"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\r^\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\7\n\67"+
		"\n\n\f\n\16\n:\13\n\3\13\3\13\3\f\6\f?\n\f\r\f\16\f@\3\f\3\f\3\r\3\r\3"+
		"\16\3\16\3\16\7\16J\n\16\f\16\16\16M\13\16\5\16O\n\16\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17]\n\17\2\2\20\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\2\33\2\35\2\3\2\5\5\2,"+
		"-//\61\61\5\2\13\f\17\17\"\"\3\2C|\2a\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\3\37\3\2\2\2\5!\3\2\2\2\7\'\3\2"+
		"\2\2\t)\3\2\2\2\13+\3\2\2\2\r-\3\2\2\2\17/\3\2\2\2\21\61\3\2\2\2\23\63"+
		"\3\2\2\2\25;\3\2\2\2\27>\3\2\2\2\31D\3\2\2\2\33N\3\2\2\2\35\\\3\2\2\2"+
		"\37 \7=\2\2 \4\3\2\2\2!\"\7y\2\2\"#\7j\2\2#$\7k\2\2$%\7n\2\2%&\7g\2\2"+
		"&\6\3\2\2\2\'(\7*\2\2(\b\3\2\2\2)*\7+\2\2*\n\3\2\2\2+,\7}\2\2,\f\3\2\2"+
		"\2-.\7\177\2\2.\16\3\2\2\2/\60\5\25\13\2\60\20\3\2\2\2\61\62\t\2\2\2\62"+
		"\22\3\2\2\2\638\5\31\r\2\64\67\5\31\r\2\65\67\5\25\13\2\66\64\3\2\2\2"+
		"\66\65\3\2\2\2\67:\3\2\2\28\66\3\2\2\289\3\2\2\29\24\3\2\2\2:8\3\2\2\2"+
		";<\5\33\16\2<\26\3\2\2\2=?\t\3\2\2>=\3\2\2\2?@\3\2\2\2@>\3\2\2\2@A\3\2"+
		"\2\2AB\3\2\2\2BC\b\f\2\2C\30\3\2\2\2DE\t\4\2\2E\32\3\2\2\2FO\7\62\2\2"+
		"GK\4\63;\2HJ\4\62;\2IH\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2LO\3\2\2\2"+
		"MK\3\2\2\2NF\3\2\2\2NG\3\2\2\2O\34\3\2\2\2PQ\7e\2\2QR\7j\2\2RS\7c\2\2"+
		"S]\7t\2\2TU\7k\2\2UV\7p\2\2V]\7v\2\2WX\7h\2\2XY\7n\2\2YZ\7q\2\2Z[\7c\2"+
		"\2[]\7v\2\2\\P\3\2\2\2\\T\3\2\2\2\\W\3\2\2\2]\36\3\2\2\2\t\2\668@KN\\"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}