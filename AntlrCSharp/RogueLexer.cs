//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     ANTLR Version: 4.9.2
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

// Generated from c:\tmp\Antlr\New3\AntlrCSharp\Rogue.g4 by ANTLR 4.9.2

// Unreachable code detected
#pragma warning disable 0162
// The variable '...' is assigned but its value is never used
#pragma warning disable 0219
// Missing XML comment for publicly visible type or member '...'
#pragma warning disable 1591
// Ambiguous reference in cref attribute
#pragma warning disable 419

using System;
using System.IO;
using System.Text;
using Antlr4.Runtime;
using Antlr4.Runtime.Atn;
using Antlr4.Runtime.Misc;
using DFA = Antlr4.Runtime.Dfa.DFA;

[System.CodeDom.Compiler.GeneratedCode("ANTLR", "4.9.2")]
[System.CLSCompliant(false)]
public partial class RogueLexer : Lexer {
	protected static DFA[] decisionToDFA;
	protected static PredictionContextCache sharedContextCache = new PredictionContextCache();
	public const int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, INT=7, OPERATOR=8, ID=9, 
		DIGIT=10, WS=11;
	public static string[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static string[] modeNames = {
		"DEFAULT_MODE"
	};

	public static readonly string[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "INT", "OPERATOR", "ID", 
		"DIGIT", "WS", "LETTER", "DIGIT_RULE", "Types"
	};


	public RogueLexer(ICharStream input)
	: this(input, Console.Out, Console.Error) { }

	public RogueLexer(ICharStream input, TextWriter output, TextWriter errorOutput)
	: base(input, output, errorOutput)
	{
		Interpreter = new LexerATNSimulator(this, _ATN, decisionToDFA, sharedContextCache);
	}

	private static readonly string[] _LiteralNames = {
		null, "';'", "'while'", "'('", "')'", "'{'", "'}'"
	};
	private static readonly string[] _SymbolicNames = {
		null, null, null, null, null, null, null, "INT", "OPERATOR", "ID", "DIGIT", 
		"WS"
	};
	public static readonly IVocabulary DefaultVocabulary = new Vocabulary(_LiteralNames, _SymbolicNames);

	[NotNull]
	public override IVocabulary Vocabulary
	{
		get
		{
			return DefaultVocabulary;
		}
	}

	public override string GrammarFileName { get { return "Rogue.g4"; } }

	public override string[] RuleNames { get { return ruleNames; } }

	public override string[] ChannelNames { get { return channelNames; } }

	public override string[] ModeNames { get { return modeNames; } }

	public override string SerializedAtn { get { return new string(_serializedATN); } }

	static RogueLexer() {
		decisionToDFA = new DFA[_ATN.NumberOfDecisions];
		for (int i = 0; i < _ATN.NumberOfDecisions; i++) {
			decisionToDFA[i] = new DFA(_ATN.GetDecisionState(i), i);
		}
	}
	private static char[] _serializedATN = {
		'\x3', '\x608B', '\xA72A', '\x8133', '\xB9ED', '\x417C', '\x3BE7', '\x7786', 
		'\x5964', '\x2', '\r', '^', '\b', '\x1', '\x4', '\x2', '\t', '\x2', '\x4', 
		'\x3', '\t', '\x3', '\x4', '\x4', '\t', '\x4', '\x4', '\x5', '\t', '\x5', 
		'\x4', '\x6', '\t', '\x6', '\x4', '\a', '\t', '\a', '\x4', '\b', '\t', 
		'\b', '\x4', '\t', '\t', '\t', '\x4', '\n', '\t', '\n', '\x4', '\v', '\t', 
		'\v', '\x4', '\f', '\t', '\f', '\x4', '\r', '\t', '\r', '\x4', '\xE', 
		'\t', '\xE', '\x4', '\xF', '\t', '\xF', '\x3', '\x2', '\x3', '\x2', '\x3', 
		'\x3', '\x3', '\x3', '\x3', '\x3', '\x3', '\x3', '\x3', '\x3', '\x3', 
		'\x3', '\x3', '\x4', '\x3', '\x4', '\x3', '\x5', '\x3', '\x5', '\x3', 
		'\x6', '\x3', '\x6', '\x3', '\a', '\x3', '\a', '\x3', '\b', '\x3', '\b', 
		'\x3', '\t', '\x3', '\t', '\x3', '\n', '\x3', '\n', '\x3', '\n', '\a', 
		'\n', '\x37', '\n', '\n', '\f', '\n', '\xE', '\n', ':', '\v', '\n', '\x3', 
		'\v', '\x3', '\v', '\x3', '\f', '\x6', '\f', '?', '\n', '\f', '\r', '\f', 
		'\xE', '\f', '@', '\x3', '\f', '\x3', '\f', '\x3', '\r', '\x3', '\r', 
		'\x3', '\xE', '\x3', '\xE', '\x3', '\xE', '\a', '\xE', 'J', '\n', '\xE', 
		'\f', '\xE', '\xE', '\xE', 'M', '\v', '\xE', '\x5', '\xE', 'O', '\n', 
		'\xE', '\x3', '\xF', '\x3', '\xF', '\x3', '\xF', '\x3', '\xF', '\x3', 
		'\xF', '\x3', '\xF', '\x3', '\xF', '\x3', '\xF', '\x3', '\xF', '\x3', 
		'\xF', '\x3', '\xF', '\x3', '\xF', '\x5', '\xF', ']', '\n', '\xF', '\x2', 
		'\x2', '\x10', '\x3', '\x3', '\x5', '\x4', '\a', '\x5', '\t', '\x6', '\v', 
		'\a', '\r', '\b', '\xF', '\t', '\x11', '\n', '\x13', '\v', '\x15', '\f', 
		'\x17', '\r', '\x19', '\x2', '\x1B', '\x2', '\x1D', '\x2', '\x3', '\x2', 
		'\x5', '\x5', '\x2', ',', '-', '/', '/', '\x31', '\x31', '\x5', '\x2', 
		'\v', '\f', '\xF', '\xF', '\"', '\"', '\x3', '\x2', '\x43', '|', '\x2', 
		'\x61', '\x2', '\x3', '\x3', '\x2', '\x2', '\x2', '\x2', '\x5', '\x3', 
		'\x2', '\x2', '\x2', '\x2', '\a', '\x3', '\x2', '\x2', '\x2', '\x2', '\t', 
		'\x3', '\x2', '\x2', '\x2', '\x2', '\v', '\x3', '\x2', '\x2', '\x2', '\x2', 
		'\r', '\x3', '\x2', '\x2', '\x2', '\x2', '\xF', '\x3', '\x2', '\x2', '\x2', 
		'\x2', '\x11', '\x3', '\x2', '\x2', '\x2', '\x2', '\x13', '\x3', '\x2', 
		'\x2', '\x2', '\x2', '\x15', '\x3', '\x2', '\x2', '\x2', '\x2', '\x17', 
		'\x3', '\x2', '\x2', '\x2', '\x3', '\x1F', '\x3', '\x2', '\x2', '\x2', 
		'\x5', '!', '\x3', '\x2', '\x2', '\x2', '\a', '\'', '\x3', '\x2', '\x2', 
		'\x2', '\t', ')', '\x3', '\x2', '\x2', '\x2', '\v', '+', '\x3', '\x2', 
		'\x2', '\x2', '\r', '-', '\x3', '\x2', '\x2', '\x2', '\xF', '/', '\x3', 
		'\x2', '\x2', '\x2', '\x11', '\x31', '\x3', '\x2', '\x2', '\x2', '\x13', 
		'\x33', '\x3', '\x2', '\x2', '\x2', '\x15', ';', '\x3', '\x2', '\x2', 
		'\x2', '\x17', '>', '\x3', '\x2', '\x2', '\x2', '\x19', '\x44', '\x3', 
		'\x2', '\x2', '\x2', '\x1B', 'N', '\x3', '\x2', '\x2', '\x2', '\x1D', 
		'\\', '\x3', '\x2', '\x2', '\x2', '\x1F', ' ', '\a', '=', '\x2', '\x2', 
		' ', '\x4', '\x3', '\x2', '\x2', '\x2', '!', '\"', '\a', 'y', '\x2', '\x2', 
		'\"', '#', '\a', 'j', '\x2', '\x2', '#', '$', '\a', 'k', '\x2', '\x2', 
		'$', '%', '\a', 'n', '\x2', '\x2', '%', '&', '\a', 'g', '\x2', '\x2', 
		'&', '\x6', '\x3', '\x2', '\x2', '\x2', '\'', '(', '\a', '*', '\x2', '\x2', 
		'(', '\b', '\x3', '\x2', '\x2', '\x2', ')', '*', '\a', '+', '\x2', '\x2', 
		'*', '\n', '\x3', '\x2', '\x2', '\x2', '+', ',', '\a', '}', '\x2', '\x2', 
		',', '\f', '\x3', '\x2', '\x2', '\x2', '-', '.', '\a', '\x7F', '\x2', 
		'\x2', '.', '\xE', '\x3', '\x2', '\x2', '\x2', '/', '\x30', '\x5', '\x15', 
		'\v', '\x2', '\x30', '\x10', '\x3', '\x2', '\x2', '\x2', '\x31', '\x32', 
		'\t', '\x2', '\x2', '\x2', '\x32', '\x12', '\x3', '\x2', '\x2', '\x2', 
		'\x33', '\x38', '\x5', '\x19', '\r', '\x2', '\x34', '\x37', '\x5', '\x19', 
		'\r', '\x2', '\x35', '\x37', '\x5', '\x15', '\v', '\x2', '\x36', '\x34', 
		'\x3', '\x2', '\x2', '\x2', '\x36', '\x35', '\x3', '\x2', '\x2', '\x2', 
		'\x37', ':', '\x3', '\x2', '\x2', '\x2', '\x38', '\x36', '\x3', '\x2', 
		'\x2', '\x2', '\x38', '\x39', '\x3', '\x2', '\x2', '\x2', '\x39', '\x14', 
		'\x3', '\x2', '\x2', '\x2', ':', '\x38', '\x3', '\x2', '\x2', '\x2', ';', 
		'<', '\x5', '\x1B', '\xE', '\x2', '<', '\x16', '\x3', '\x2', '\x2', '\x2', 
		'=', '?', '\t', '\x3', '\x2', '\x2', '>', '=', '\x3', '\x2', '\x2', '\x2', 
		'?', '@', '\x3', '\x2', '\x2', '\x2', '@', '>', '\x3', '\x2', '\x2', '\x2', 
		'@', '\x41', '\x3', '\x2', '\x2', '\x2', '\x41', '\x42', '\x3', '\x2', 
		'\x2', '\x2', '\x42', '\x43', '\b', '\f', '\x2', '\x2', '\x43', '\x18', 
		'\x3', '\x2', '\x2', '\x2', '\x44', '\x45', '\t', '\x4', '\x2', '\x2', 
		'\x45', '\x1A', '\x3', '\x2', '\x2', '\x2', '\x46', 'O', '\a', '\x32', 
		'\x2', '\x2', 'G', 'K', '\x4', '\x33', ';', '\x2', 'H', 'J', '\x4', '\x32', 
		';', '\x2', 'I', 'H', '\x3', '\x2', '\x2', '\x2', 'J', 'M', '\x3', '\x2', 
		'\x2', '\x2', 'K', 'I', '\x3', '\x2', '\x2', '\x2', 'K', 'L', '\x3', '\x2', 
		'\x2', '\x2', 'L', 'O', '\x3', '\x2', '\x2', '\x2', 'M', 'K', '\x3', '\x2', 
		'\x2', '\x2', 'N', '\x46', '\x3', '\x2', '\x2', '\x2', 'N', 'G', '\x3', 
		'\x2', '\x2', '\x2', 'O', '\x1C', '\x3', '\x2', '\x2', '\x2', 'P', 'Q', 
		'\a', '\x65', '\x2', '\x2', 'Q', 'R', '\a', 'j', '\x2', '\x2', 'R', 'S', 
		'\a', '\x63', '\x2', '\x2', 'S', ']', '\a', 't', '\x2', '\x2', 'T', 'U', 
		'\a', 'k', '\x2', '\x2', 'U', 'V', '\a', 'p', '\x2', '\x2', 'V', ']', 
		'\a', 'v', '\x2', '\x2', 'W', 'X', '\a', 'h', '\x2', '\x2', 'X', 'Y', 
		'\a', 'n', '\x2', '\x2', 'Y', 'Z', '\a', 'q', '\x2', '\x2', 'Z', '[', 
		'\a', '\x63', '\x2', '\x2', '[', ']', '\a', 'v', '\x2', '\x2', '\\', 'P', 
		'\x3', '\x2', '\x2', '\x2', '\\', 'T', '\x3', '\x2', '\x2', '\x2', '\\', 
		'W', '\x3', '\x2', '\x2', '\x2', ']', '\x1E', '\x3', '\x2', '\x2', '\x2', 
		'\t', '\x2', '\x36', '\x38', '@', 'K', 'N', '\\', '\x3', '\b', '\x2', 
		'\x2',
	};

	public static readonly ATN _ATN =
		new ATNDeserializer().Deserialize(_serializedATN);


}