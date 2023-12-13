// Generated from C:/Users/shapo/IdeaProjects/Compilers/src/main/java/antlr/lang.g4 by ANTLR 4.13.1
package antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class langLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, ID=16, NUM=17, 
		WS=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "ID", "NUM", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'begin'", "'end'", "'let'", "'be'", "'add'", "'to'", "'sub'", 
			"'from'", "'div'", "'by'", "'compare'", "'with'", "'save_in'", "'mod'", 
			"'print'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "ID", "NUM", "WS"
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


	public langLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "lang.g4"; }

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
		"\u0004\u0000\u0012}\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t"+
		"\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0004\u000fn\b\u000f\u000b\u000f"+
		"\f\u000fo\u0001\u0010\u0004\u0010s\b\u0010\u000b\u0010\f\u0010t\u0001"+
		"\u0011\u0004\u0011x\b\u0011\u000b\u0011\f\u0011y\u0001\u0011\u0001\u0011"+
		"\u0000\u0000\u0012\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019"+
		"\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012\u0001\u0000\u0003"+
		"\u0001\u0000az\u0001\u000009\u0003\u0000\t\n\r\r  \u007f\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000"+
		"\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000"+
		"\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000"+
		"\u0000#\u0001\u0000\u0000\u0000\u0001%\u0001\u0000\u0000\u0000\u0003+"+
		"\u0001\u0000\u0000\u0000\u0005/\u0001\u0000\u0000\u0000\u00073\u0001\u0000"+
		"\u0000\u0000\t6\u0001\u0000\u0000\u0000\u000b:\u0001\u0000\u0000\u0000"+
		"\r=\u0001\u0000\u0000\u0000\u000fA\u0001\u0000\u0000\u0000\u0011F\u0001"+
		"\u0000\u0000\u0000\u0013J\u0001\u0000\u0000\u0000\u0015M\u0001\u0000\u0000"+
		"\u0000\u0017U\u0001\u0000\u0000\u0000\u0019Z\u0001\u0000\u0000\u0000\u001b"+
		"b\u0001\u0000\u0000\u0000\u001df\u0001\u0000\u0000\u0000\u001fm\u0001"+
		"\u0000\u0000\u0000!r\u0001\u0000\u0000\u0000#w\u0001\u0000\u0000\u0000"+
		"%&\u0005b\u0000\u0000&\'\u0005e\u0000\u0000\'(\u0005g\u0000\u0000()\u0005"+
		"i\u0000\u0000)*\u0005n\u0000\u0000*\u0002\u0001\u0000\u0000\u0000+,\u0005"+
		"e\u0000\u0000,-\u0005n\u0000\u0000-.\u0005d\u0000\u0000.\u0004\u0001\u0000"+
		"\u0000\u0000/0\u0005l\u0000\u000001\u0005e\u0000\u000012\u0005t\u0000"+
		"\u00002\u0006\u0001\u0000\u0000\u000034\u0005b\u0000\u000045\u0005e\u0000"+
		"\u00005\b\u0001\u0000\u0000\u000067\u0005a\u0000\u000078\u0005d\u0000"+
		"\u000089\u0005d\u0000\u00009\n\u0001\u0000\u0000\u0000:;\u0005t\u0000"+
		"\u0000;<\u0005o\u0000\u0000<\f\u0001\u0000\u0000\u0000=>\u0005s\u0000"+
		"\u0000>?\u0005u\u0000\u0000?@\u0005b\u0000\u0000@\u000e\u0001\u0000\u0000"+
		"\u0000AB\u0005f\u0000\u0000BC\u0005r\u0000\u0000CD\u0005o\u0000\u0000"+
		"DE\u0005m\u0000\u0000E\u0010\u0001\u0000\u0000\u0000FG\u0005d\u0000\u0000"+
		"GH\u0005i\u0000\u0000HI\u0005v\u0000\u0000I\u0012\u0001\u0000\u0000\u0000"+
		"JK\u0005b\u0000\u0000KL\u0005y\u0000\u0000L\u0014\u0001\u0000\u0000\u0000"+
		"MN\u0005c\u0000\u0000NO\u0005o\u0000\u0000OP\u0005m\u0000\u0000PQ\u0005"+
		"p\u0000\u0000QR\u0005a\u0000\u0000RS\u0005r\u0000\u0000ST\u0005e\u0000"+
		"\u0000T\u0016\u0001\u0000\u0000\u0000UV\u0005w\u0000\u0000VW\u0005i\u0000"+
		"\u0000WX\u0005t\u0000\u0000XY\u0005h\u0000\u0000Y\u0018\u0001\u0000\u0000"+
		"\u0000Z[\u0005s\u0000\u0000[\\\u0005a\u0000\u0000\\]\u0005v\u0000\u0000"+
		"]^\u0005e\u0000\u0000^_\u0005_\u0000\u0000_`\u0005i\u0000\u0000`a\u0005"+
		"n\u0000\u0000a\u001a\u0001\u0000\u0000\u0000bc\u0005m\u0000\u0000cd\u0005"+
		"o\u0000\u0000de\u0005d\u0000\u0000e\u001c\u0001\u0000\u0000\u0000fg\u0005"+
		"p\u0000\u0000gh\u0005r\u0000\u0000hi\u0005i\u0000\u0000ij\u0005n\u0000"+
		"\u0000jk\u0005t\u0000\u0000k\u001e\u0001\u0000\u0000\u0000ln\u0007\u0000"+
		"\u0000\u0000ml\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000om\u0001"+
		"\u0000\u0000\u0000op\u0001\u0000\u0000\u0000p \u0001\u0000\u0000\u0000"+
		"qs\u0007\u0001\u0000\u0000rq\u0001\u0000\u0000\u0000st\u0001\u0000\u0000"+
		"\u0000tr\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000u\"\u0001\u0000"+
		"\u0000\u0000vx\u0007\u0002\u0000\u0000wv\u0001\u0000\u0000\u0000xy\u0001"+
		"\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000"+
		"z{\u0001\u0000\u0000\u0000{|\u0006\u0011\u0000\u0000|$\u0001\u0000\u0000"+
		"\u0000\u0004\u0000oty\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}