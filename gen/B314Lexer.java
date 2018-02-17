// Generated from C:/Users/thibaut/IdeaProjects/b314-compiler/src/main/antlr4/be/unamur/info/b314/compiler\B314.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class B314Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LPAR=1, RPAR=2, COMMA=3, PLUS=4, MINUS=5, MULT=6, DIV=7, MODULO=8, SEMICOLON=9, 
		COLON=10, LBRA=11, RBRA=12, EQUAL=13, SMALLER=14, BIGGER=15, AND=16, OR=17, 
		SCALAR=18, ARRAY=19, DECLARE=20, RETAIN=21, BY=22, DEFAULT=23, LOCAL=24, 
		DO=25, DONE=26, IF=27, THEN=28, ELSE=29, WHILE=30, SET=31, TO=32, AS=33, 
		COMPUTE=34, NEXT=35, SQUARE=36, FUNCTION=37, RETURN=38, NOT=39, ENNEMI=40, 
		IS=41, GRAAL=42, NORTH=43, SOUTH=44, EAST=45, WEST=46, NEARBY=47, DIRT=48, 
		ROCK=49, VINES=50, ZOMBIE=51, PLAYER=52, AMMO=53, MAP=54, RADIO=55, FRUITS=56, 
		SODA=57, MOVE=58, SHOOT=59, USE=60, NOTHING=61, COUNT=62, LIFE=63, LATITUDE=64, 
		LONGITUDE=65, GRID=66, SIZE=67, BOOLEAN=68, INTEGER=69, INT=70, TRUE=71, 
		FALSE=72, VOID=73, COMMENT=74, NEWLINE=75, WS=76, ID=77, NUMBER=78;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"LPAR", "RPAR", "COMMA", "PLUS", "MINUS", "MULT", "DIV", "MODULO", "SEMICOLON", 
		"COLON", "LBRA", "RBRA", "EQUAL", "SMALLER", "BIGGER", "AND", "OR", "SCALAR", 
		"ARRAY", "DECLARE", "RETAIN", "BY", "DEFAULT", "LOCAL", "DO", "DONE", 
		"IF", "THEN", "ELSE", "WHILE", "SET", "TO", "AS", "COMPUTE", "NEXT", "SQUARE", 
		"FUNCTION", "RETURN", "NOT", "ENNEMI", "IS", "GRAAL", "NORTH", "SOUTH", 
		"EAST", "WEST", "NEARBY", "DIRT", "ROCK", "VINES", "ZOMBIE", "PLAYER", 
		"AMMO", "MAP", "RADIO", "FRUITS", "SODA", "MOVE", "SHOOT", "USE", "NOTHING", 
		"COUNT", "LIFE", "LATITUDE", "LONGITUDE", "GRID", "SIZE", "BOOLEAN", "INTEGER", 
		"INT", "TRUE", "FALSE", "VOID", "COMMENT", "NEWLINE", "WS", "ID", "NUMBER", 
		"LETTER", "DIGIT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "','", "'+'", "'-'", "'*'", "'/'", "'%'", "';'", "':'", 
		"'['", "']'", "'='", "'<'", "'>'", "'and'", "'or'", null, null, "'declare'", 
		"'retain'", "'by'", "'default'", "'local'", "'do'", "'done'", "'if'", 
		"'then'", "'else'", "'while'", "'set'", "'to'", "'as'", "'compute'", "'next'", 
		"'square'", "'function'", "'return'", "'not'", "'ennemi'", "'is'", "'graal'", 
		"'north'", "'south'", "'east'", "'west'", "'nearby'", "'dirt'", "'rock'", 
		"'vines'", "'zombie'", "'player'", "'ammo'", "'map'", "'radio'", "'fruits'", 
		"'soda'", "'move'", "'shoot'", "'use'", "'nothing'", "'count'", "'life'", 
		"'latitude'", "'longitude'", "'grid'", "'size'", "'boolean'", "'integer'", 
		null, "'true'", "'false'", "'void'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "LPAR", "RPAR", "COMMA", "PLUS", "MINUS", "MULT", "DIV", "MODULO", 
		"SEMICOLON", "COLON", "LBRA", "RBRA", "EQUAL", "SMALLER", "BIGGER", "AND", 
		"OR", "SCALAR", "ARRAY", "DECLARE", "RETAIN", "BY", "DEFAULT", "LOCAL", 
		"DO", "DONE", "IF", "THEN", "ELSE", "WHILE", "SET", "TO", "AS", "COMPUTE", 
		"NEXT", "SQUARE", "FUNCTION", "RETURN", "NOT", "ENNEMI", "IS", "GRAAL", 
		"NORTH", "SOUTH", "EAST", "WEST", "NEARBY", "DIRT", "ROCK", "VINES", "ZOMBIE", 
		"PLAYER", "AMMO", "MAP", "RADIO", "FRUITS", "SODA", "MOVE", "SHOOT", "USE", 
		"NOTHING", "COUNT", "LIFE", "LATITUDE", "LONGITUDE", "GRID", "SIZE", "BOOLEAN", 
		"INTEGER", "INT", "TRUE", "FALSE", "VOID", "COMMENT", "NEWLINE", "WS", 
		"ID", "NUMBER"
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


	public B314Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "B314.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2P\u023f\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\3\2\3\2\3\3\3\3\3"+
		"\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3"+
		"\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\5\23\u00cc\n\23\3\24\3\24\3\24\6\24\u00d1\n\24\r"+
		"\24\16\24\u00d2\3\24\3\24\6\24\u00d7\n\24\r\24\16\24\u00d8\5\24\u00db"+
		"\n\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#"+
		"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&"+
		"\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3)\3)\3)\3)\3)\3"+
		")\3)\3*\3*\3*\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3"+
		".\3.\3.\3.\3.\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3"+
		"\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3"+
		"\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3"+
		"\65\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\38\38\38\38\38\38\39"+
		"\39\39\39\39\39\39\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3="+
		"\3=\3=\3=\3>\3>\3>\3>\3>\3>\3>\3>\3?\3?\3?\3?\3?\3?\3@\3@\3@\3@\3@\3A"+
		"\3A\3A\3A\3A\3A\3A\3A\3A\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3C\3C\3C\3C\3C"+
		"\3D\3D\3D\3D\3D\3E\3E\3E\3E\3E\3E\3E\3E\3F\3F\3F\3F\3F\3F\3F\3F\3G\3G"+
		"\3H\3H\3H\3H\3H\3I\3I\3I\3I\3I\3I\3J\3J\3J\3J\3J\3K\3K\3K\3K\7K\u0217"+
		"\nK\fK\16K\u021a\13K\3K\3K\3K\3K\3K\3L\5L\u0222\nL\3L\3L\3L\3L\3M\6M\u0229"+
		"\nM\rM\16M\u022a\3M\3M\3N\3N\3N\7N\u0232\nN\fN\16N\u0235\13N\3O\6O\u0238"+
		"\nO\rO\16O\u0239\3P\3P\3Q\3Q\3\u0218\2R\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
		"-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W"+
		"-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083"+
		"C\u0085D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091J\u0093K\u0095L\u0097"+
		"M\u0099N\u009bO\u009dP\u009f\2\u00a1\2\3\2\4\4\2\13\13\"\"\4\2C\\c|\2"+
		"\u0247\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2"+
		"G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3"+
		"\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2"+
		"\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2"+
		"m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3"+
		"\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2"+
		"\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2"+
		"\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095"+
		"\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2"+
		"\2\3\u00a3\3\2\2\2\5\u00a5\3\2\2\2\7\u00a7\3\2\2\2\t\u00a9\3\2\2\2\13"+
		"\u00ab\3\2\2\2\r\u00ad\3\2\2\2\17\u00af\3\2\2\2\21\u00b1\3\2\2\2\23\u00b3"+
		"\3\2\2\2\25\u00b5\3\2\2\2\27\u00b7\3\2\2\2\31\u00b9\3\2\2\2\33\u00bb\3"+
		"\2\2\2\35\u00bd\3\2\2\2\37\u00bf\3\2\2\2!\u00c1\3\2\2\2#\u00c5\3\2\2\2"+
		"%\u00cb\3\2\2\2\'\u00cd\3\2\2\2)\u00de\3\2\2\2+\u00e6\3\2\2\2-\u00ed\3"+
		"\2\2\2/\u00f0\3\2\2\2\61\u00f8\3\2\2\2\63\u00fe\3\2\2\2\65\u0101\3\2\2"+
		"\2\67\u0106\3\2\2\29\u0109\3\2\2\2;\u010e\3\2\2\2=\u0113\3\2\2\2?\u0119"+
		"\3\2\2\2A\u011d\3\2\2\2C\u0120\3\2\2\2E\u0123\3\2\2\2G\u012b\3\2\2\2I"+
		"\u0130\3\2\2\2K\u0137\3\2\2\2M\u0140\3\2\2\2O\u0147\3\2\2\2Q\u014b\3\2"+
		"\2\2S\u0152\3\2\2\2U\u0155\3\2\2\2W\u015b\3\2\2\2Y\u0161\3\2\2\2[\u0167"+
		"\3\2\2\2]\u016c\3\2\2\2_\u0171\3\2\2\2a\u0178\3\2\2\2c\u017d\3\2\2\2e"+
		"\u0182\3\2\2\2g\u0188\3\2\2\2i\u018f\3\2\2\2k\u0196\3\2\2\2m\u019b\3\2"+
		"\2\2o\u019f\3\2\2\2q\u01a5\3\2\2\2s\u01ac\3\2\2\2u\u01b1\3\2\2\2w\u01b6"+
		"\3\2\2\2y\u01bc\3\2\2\2{\u01c0\3\2\2\2}\u01c8\3\2\2\2\177\u01ce\3\2\2"+
		"\2\u0081\u01d3\3\2\2\2\u0083\u01dc\3\2\2\2\u0085\u01e6\3\2\2\2\u0087\u01eb"+
		"\3\2\2\2\u0089\u01f0\3\2\2\2\u008b\u01f8\3\2\2\2\u008d\u0200\3\2\2\2\u008f"+
		"\u0202\3\2\2\2\u0091\u0207\3\2\2\2\u0093\u020d\3\2\2\2\u0095\u0212\3\2"+
		"\2\2\u0097\u0221\3\2\2\2\u0099\u0228\3\2\2\2\u009b\u022e\3\2\2\2\u009d"+
		"\u0237\3\2\2\2\u009f\u023b\3\2\2\2\u00a1\u023d\3\2\2\2\u00a3\u00a4\7*"+
		"\2\2\u00a4\4\3\2\2\2\u00a5\u00a6\7+\2\2\u00a6\6\3\2\2\2\u00a7\u00a8\7"+
		".\2\2\u00a8\b\3\2\2\2\u00a9\u00aa\7-\2\2\u00aa\n\3\2\2\2\u00ab\u00ac\7"+
		"/\2\2\u00ac\f\3\2\2\2\u00ad\u00ae\7,\2\2\u00ae\16\3\2\2\2\u00af\u00b0"+
		"\7\61\2\2\u00b0\20\3\2\2\2\u00b1\u00b2\7\'\2\2\u00b2\22\3\2\2\2\u00b3"+
		"\u00b4\7=\2\2\u00b4\24\3\2\2\2\u00b5\u00b6\7<\2\2\u00b6\26\3\2\2\2\u00b7"+
		"\u00b8\7]\2\2\u00b8\30\3\2\2\2\u00b9\u00ba\7_\2\2\u00ba\32\3\2\2\2\u00bb"+
		"\u00bc\7?\2\2\u00bc\34\3\2\2\2\u00bd\u00be\7>\2\2\u00be\36\3\2\2\2\u00bf"+
		"\u00c0\7@\2\2\u00c0 \3\2\2\2\u00c1\u00c2\7c\2\2\u00c2\u00c3\7p\2\2\u00c3"+
		"\u00c4\7f\2\2\u00c4\"\3\2\2\2\u00c5\u00c6\7q\2\2\u00c6\u00c7\7t\2\2\u00c7"+
		"$\3\2\2\2\u00c8\u00cc\5\u0089E\2\u00c9\u00cc\5\u008bF\2\u00ca\u00cc\5"+
		"I%\2\u00cb\u00c8\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00ca\3\2\2\2\u00cc"+
		"&\3\2\2\2\u00cd\u00ce\5%\23\2\u00ce\u00d0\5\27\f\2\u00cf\u00d1\5\u00a1"+
		"Q\2\u00d0\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2"+
		"\u00d3\3\2\2\2\u00d3\u00da\3\2\2\2\u00d4\u00d6\5\7\4\2\u00d5\u00d7\5\u00a1"+
		"Q\2\u00d6\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8"+
		"\u00d9\3\2\2\2\u00d9\u00db\3\2\2\2\u00da\u00d4\3\2\2\2\u00da\u00db\3\2"+
		"\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\5\31\r\2\u00dd(\3\2\2\2\u00de\u00df"+
		"\7f\2\2\u00df\u00e0\7g\2\2\u00e0\u00e1\7e\2\2\u00e1\u00e2\7n\2\2\u00e2"+
		"\u00e3\7c\2\2\u00e3\u00e4\7t\2\2\u00e4\u00e5\7g\2\2\u00e5*\3\2\2\2\u00e6"+
		"\u00e7\7t\2\2\u00e7\u00e8\7g\2\2\u00e8\u00e9\7v\2\2\u00e9\u00ea\7c\2\2"+
		"\u00ea\u00eb\7k\2\2\u00eb\u00ec\7p\2\2\u00ec,\3\2\2\2\u00ed\u00ee\7d\2"+
		"\2\u00ee\u00ef\7{\2\2\u00ef.\3\2\2\2\u00f0\u00f1\7f\2\2\u00f1\u00f2\7"+
		"g\2\2\u00f2\u00f3\7h\2\2\u00f3\u00f4\7c\2\2\u00f4\u00f5\7w\2\2\u00f5\u00f6"+
		"\7n\2\2\u00f6\u00f7\7v\2\2\u00f7\60\3\2\2\2\u00f8\u00f9\7n\2\2\u00f9\u00fa"+
		"\7q\2\2\u00fa\u00fb\7e\2\2\u00fb\u00fc\7c\2\2\u00fc\u00fd\7n\2\2\u00fd"+
		"\62\3\2\2\2\u00fe\u00ff\7f\2\2\u00ff\u0100\7q\2\2\u0100\64\3\2\2\2\u0101"+
		"\u0102\7f\2\2\u0102\u0103\7q\2\2\u0103\u0104\7p\2\2\u0104\u0105\7g\2\2"+
		"\u0105\66\3\2\2\2\u0106\u0107\7k\2\2\u0107\u0108\7h\2\2\u01088\3\2\2\2"+
		"\u0109\u010a\7v\2\2\u010a\u010b\7j\2\2\u010b\u010c\7g\2\2\u010c\u010d"+
		"\7p\2\2\u010d:\3\2\2\2\u010e\u010f\7g\2\2\u010f\u0110\7n\2\2\u0110\u0111"+
		"\7u\2\2\u0111\u0112\7g\2\2\u0112<\3\2\2\2\u0113\u0114\7y\2\2\u0114\u0115"+
		"\7j\2\2\u0115\u0116\7k\2\2\u0116\u0117\7n\2\2\u0117\u0118\7g\2\2\u0118"+
		">\3\2\2\2\u0119\u011a\7u\2\2\u011a\u011b\7g\2\2\u011b\u011c\7v\2\2\u011c"+
		"@\3\2\2\2\u011d\u011e\7v\2\2\u011e\u011f\7q\2\2\u011fB\3\2\2\2\u0120\u0121"+
		"\7c\2\2\u0121\u0122\7u\2\2\u0122D\3\2\2\2\u0123\u0124\7e\2\2\u0124\u0125"+
		"\7q\2\2\u0125\u0126\7o\2\2\u0126\u0127\7r\2\2\u0127\u0128\7w\2\2\u0128"+
		"\u0129\7v\2\2\u0129\u012a\7g\2\2\u012aF\3\2\2\2\u012b\u012c\7p\2\2\u012c"+
		"\u012d\7g\2\2\u012d\u012e\7z\2\2\u012e\u012f\7v\2\2\u012fH\3\2\2\2\u0130"+
		"\u0131\7u\2\2\u0131\u0132\7s\2\2\u0132\u0133\7w\2\2\u0133\u0134\7c\2\2"+
		"\u0134\u0135\7t\2\2\u0135\u0136\7g\2\2\u0136J\3\2\2\2\u0137\u0138\7h\2"+
		"\2\u0138\u0139\7w\2\2\u0139\u013a\7p\2\2\u013a\u013b\7e\2\2\u013b\u013c"+
		"\7v\2\2\u013c\u013d\7k\2\2\u013d\u013e\7q\2\2\u013e\u013f\7p\2\2\u013f"+
		"L\3\2\2\2\u0140\u0141\7t\2\2\u0141\u0142\7g\2\2\u0142\u0143\7v\2\2\u0143"+
		"\u0144\7w\2\2\u0144\u0145\7t\2\2\u0145\u0146\7p\2\2\u0146N\3\2\2\2\u0147"+
		"\u0148\7p\2\2\u0148\u0149\7q\2\2\u0149\u014a\7v\2\2\u014aP\3\2\2\2\u014b"+
		"\u014c\7g\2\2\u014c\u014d\7p\2\2\u014d\u014e\7p\2\2\u014e\u014f\7g\2\2"+
		"\u014f\u0150\7o\2\2\u0150\u0151\7k\2\2\u0151R\3\2\2\2\u0152\u0153\7k\2"+
		"\2\u0153\u0154\7u\2\2\u0154T\3\2\2\2\u0155\u0156\7i\2\2\u0156\u0157\7"+
		"t\2\2\u0157\u0158\7c\2\2\u0158\u0159\7c\2\2\u0159\u015a\7n\2\2\u015aV"+
		"\3\2\2\2\u015b\u015c\7p\2\2\u015c\u015d\7q\2\2\u015d\u015e\7t\2\2\u015e"+
		"\u015f\7v\2\2\u015f\u0160\7j\2\2\u0160X\3\2\2\2\u0161\u0162\7u\2\2\u0162"+
		"\u0163\7q\2\2\u0163\u0164\7w\2\2\u0164\u0165\7v\2\2\u0165\u0166\7j\2\2"+
		"\u0166Z\3\2\2\2\u0167\u0168\7g\2\2\u0168\u0169\7c\2\2\u0169\u016a\7u\2"+
		"\2\u016a\u016b\7v\2\2\u016b\\\3\2\2\2\u016c\u016d\7y\2\2\u016d\u016e\7"+
		"g\2\2\u016e\u016f\7u\2\2\u016f\u0170\7v\2\2\u0170^\3\2\2\2\u0171\u0172"+
		"\7p\2\2\u0172\u0173\7g\2\2\u0173\u0174\7c\2\2\u0174\u0175\7t\2\2\u0175"+
		"\u0176\7d\2\2\u0176\u0177\7{\2\2\u0177`\3\2\2\2\u0178\u0179\7f\2\2\u0179"+
		"\u017a\7k\2\2\u017a\u017b\7t\2\2\u017b\u017c\7v\2\2\u017cb\3\2\2\2\u017d"+
		"\u017e\7t\2\2\u017e\u017f\7q\2\2\u017f\u0180\7e\2\2\u0180\u0181\7m\2\2"+
		"\u0181d\3\2\2\2\u0182\u0183\7x\2\2\u0183\u0184\7k\2\2\u0184\u0185\7p\2"+
		"\2\u0185\u0186\7g\2\2\u0186\u0187\7u\2\2\u0187f\3\2\2\2\u0188\u0189\7"+
		"|\2\2\u0189\u018a\7q\2\2\u018a\u018b\7o\2\2\u018b\u018c\7d\2\2\u018c\u018d"+
		"\7k\2\2\u018d\u018e\7g\2\2\u018eh\3\2\2\2\u018f\u0190\7r\2\2\u0190\u0191"+
		"\7n\2\2\u0191\u0192\7c\2\2\u0192\u0193\7{\2\2\u0193\u0194\7g\2\2\u0194"+
		"\u0195\7t\2\2\u0195j\3\2\2\2\u0196\u0197\7c\2\2\u0197\u0198\7o\2\2\u0198"+
		"\u0199\7o\2\2\u0199\u019a\7q\2\2\u019al\3\2\2\2\u019b\u019c\7o\2\2\u019c"+
		"\u019d\7c\2\2\u019d\u019e\7r\2\2\u019en\3\2\2\2\u019f\u01a0\7t\2\2\u01a0"+
		"\u01a1\7c\2\2\u01a1\u01a2\7f\2\2\u01a2\u01a3\7k\2\2\u01a3\u01a4\7q\2\2"+
		"\u01a4p\3\2\2\2\u01a5\u01a6\7h\2\2\u01a6\u01a7\7t\2\2\u01a7\u01a8\7w\2"+
		"\2\u01a8\u01a9\7k\2\2\u01a9\u01aa\7v\2\2\u01aa\u01ab\7u\2\2\u01abr\3\2"+
		"\2\2\u01ac\u01ad\7u\2\2\u01ad\u01ae\7q\2\2\u01ae\u01af\7f\2\2\u01af\u01b0"+
		"\7c\2\2\u01b0t\3\2\2\2\u01b1\u01b2\7o\2\2\u01b2\u01b3\7q\2\2\u01b3\u01b4"+
		"\7x\2\2\u01b4\u01b5\7g\2\2\u01b5v\3\2\2\2\u01b6\u01b7\7u\2\2\u01b7\u01b8"+
		"\7j\2\2\u01b8\u01b9\7q\2\2\u01b9\u01ba\7q\2\2\u01ba\u01bb\7v\2\2\u01bb"+
		"x\3\2\2\2\u01bc\u01bd\7w\2\2\u01bd\u01be\7u\2\2\u01be\u01bf\7g\2\2\u01bf"+
		"z\3\2\2\2\u01c0\u01c1\7p\2\2\u01c1\u01c2\7q\2\2\u01c2\u01c3\7v\2\2\u01c3"+
		"\u01c4\7j\2\2\u01c4\u01c5\7k\2\2\u01c5\u01c6\7p\2\2\u01c6\u01c7\7i\2\2"+
		"\u01c7|\3\2\2\2\u01c8\u01c9\7e\2\2\u01c9\u01ca\7q\2\2\u01ca\u01cb\7w\2"+
		"\2\u01cb\u01cc\7p\2\2\u01cc\u01cd\7v\2\2\u01cd~\3\2\2\2\u01ce\u01cf\7"+
		"n\2\2\u01cf\u01d0\7k\2\2\u01d0\u01d1\7h\2\2\u01d1\u01d2\7g\2\2\u01d2\u0080"+
		"\3\2\2\2\u01d3\u01d4\7n\2\2\u01d4\u01d5\7c\2\2\u01d5\u01d6\7v\2\2\u01d6"+
		"\u01d7\7k\2\2\u01d7\u01d8\7v\2\2\u01d8\u01d9\7w\2\2\u01d9\u01da\7f\2\2"+
		"\u01da\u01db\7g\2\2\u01db\u0082\3\2\2\2\u01dc\u01dd\7n\2\2\u01dd\u01de"+
		"\7q\2\2\u01de\u01df\7p\2\2\u01df\u01e0\7i\2\2\u01e0\u01e1\7k\2\2\u01e1"+
		"\u01e2\7v\2\2\u01e2\u01e3\7w\2\2\u01e3\u01e4\7f\2\2\u01e4\u01e5\7g\2\2"+
		"\u01e5\u0084\3\2\2\2\u01e6\u01e7\7i\2\2\u01e7\u01e8\7t\2\2\u01e8\u01e9"+
		"\7k\2\2\u01e9\u01ea\7f\2\2\u01ea\u0086\3\2\2\2\u01eb\u01ec\7u\2\2\u01ec"+
		"\u01ed\7k\2\2\u01ed\u01ee\7|\2\2\u01ee\u01ef\7g\2\2\u01ef\u0088\3\2\2"+
		"\2\u01f0\u01f1\7d\2\2\u01f1\u01f2\7q\2\2\u01f2\u01f3\7q\2\2\u01f3\u01f4"+
		"\7n\2\2\u01f4\u01f5\7g\2\2\u01f5\u01f6\7c\2\2\u01f6\u01f7\7p\2\2\u01f7"+
		"\u008a\3\2\2\2\u01f8\u01f9\7k\2\2\u01f9\u01fa\7p\2\2\u01fa\u01fb\7v\2"+
		"\2\u01fb\u01fc\7g\2\2\u01fc\u01fd\7i\2\2\u01fd\u01fe\7g\2\2\u01fe\u01ff"+
		"\7t\2\2\u01ff\u008c\3\2\2\2\u0200\u0201\5\u009dO\2\u0201\u008e\3\2\2\2"+
		"\u0202\u0203\7v\2\2\u0203\u0204\7t\2\2\u0204\u0205\7w\2\2\u0205\u0206"+
		"\7g\2\2\u0206\u0090\3\2\2\2\u0207\u0208\7h\2\2\u0208\u0209\7c\2\2\u0209"+
		"\u020a\7n\2\2\u020a\u020b\7u\2\2\u020b\u020c\7g\2\2\u020c\u0092\3\2\2"+
		"\2\u020d\u020e\7x\2\2\u020e\u020f\7q\2\2\u020f\u0210\7k\2\2\u0210\u0211"+
		"\7f\2\2\u0211\u0094\3\2\2\2\u0212\u0213\7\61\2\2\u0213\u0214\7,\2\2\u0214"+
		"\u0218\3\2\2\2\u0215\u0217\13\2\2\2\u0216\u0215\3\2\2\2\u0217\u021a\3"+
		"\2\2\2\u0218\u0219\3\2\2\2\u0218\u0216\3\2\2\2\u0219\u021b\3\2\2\2\u021a"+
		"\u0218\3\2\2\2\u021b\u021c\7,\2\2\u021c\u021d\7\61\2\2\u021d\u021e\3\2"+
		"\2\2\u021e\u021f\bK\2\2\u021f\u0096\3\2\2\2\u0220\u0222\7\17\2\2\u0221"+
		"\u0220\3\2\2\2\u0221\u0222\3\2\2\2\u0222\u0223\3\2\2\2\u0223\u0224\7\f"+
		"\2\2\u0224\u0225\3\2\2\2\u0225\u0226\bL\2\2\u0226\u0098\3\2\2\2\u0227"+
		"\u0229\t\2\2\2\u0228\u0227\3\2\2\2\u0229\u022a\3\2\2\2\u022a\u0228\3\2"+
		"\2\2\u022a\u022b\3\2\2\2\u022b\u022c\3\2\2\2\u022c\u022d\bM\2\2\u022d"+
		"\u009a\3\2\2\2\u022e\u0233\5\u009fP\2\u022f\u0232\5\u009fP\2\u0230\u0232"+
		"\5\u00a1Q\2\u0231\u022f\3\2\2\2\u0231\u0230\3\2\2\2\u0232\u0235\3\2\2"+
		"\2\u0233\u0231\3\2\2\2\u0233\u0234\3\2\2\2\u0234\u009c\3\2\2\2\u0235\u0233"+
		"\3\2\2\2\u0236\u0238\5\u00a1Q\2\u0237\u0236\3\2\2\2\u0238\u0239\3\2\2"+
		"\2\u0239\u0237\3\2\2\2\u0239\u023a\3\2\2\2\u023a\u009e\3\2\2\2\u023b\u023c"+
		"\t\3\2\2\u023c\u00a0\3\2\2\2\u023d\u023e\4\62;\2\u023e\u00a2\3\2\2\2\r"+
		"\2\u00cb\u00d2\u00d8\u00da\u0218\u0221\u022a\u0231\u0233\u0239\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}