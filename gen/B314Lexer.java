// Generated from /home/users/100/tndao/Documents/M0/Q2/Compilers/Projet/1718_INFOB314_COMPILATEUR_GROUPE12/src/main/antlr4/be/unamur/info/b314/compiler/B314.g4 by ANTLR 4.7
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
		DECLARE=18, RETAIN=19, BY=20, DEFAULT=21, LOCAL=22, DO=23, DONE=24, IF=25, 
		THEN=26, ELSE=27, WHILE=28, SET=29, TO=30, AS=31, COMPUTE=32, NEXT=33, 
		SQUARE=34, FUNCTION=35, RETURN=36, NOT=37, ENNEMI=38, IS=39, GRAAL=40, 
		NORTH=41, SOUTH=42, EAST=43, WEST=44, NEARBY=45, DIRT=46, ROCK=47, VINES=48, 
		ZOMBIE=49, PLAYER=50, AMMO=51, MAP=52, RADIO=53, FRUITS=54, SODA=55, MOVE=56, 
		SHOOT=57, USE=58, NOTHING=59, COUNT=60, LIFE=61, LATITUDE=62, LONGITUDE=63, 
		GRID=64, SIZE=65, WHEN=66, YOUR=67, TURN=68, IMPORT=69, SKIPINS=70, BOOLEAN=71, 
		INTEGER=72, INT=73, TRUE=74, FALSE=75, VOID=76, COMMENT=77, NEWLINE=78, 
		WS=79, FILEDECL=80, ID=81;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"LPAR", "RPAR", "COMMA", "PLUS", "MINUS", "MULT", "DIV", "MODULO", "SEMICOLON", 
		"COLON", "LBRA", "RBRA", "EQUAL", "SMALLER", "BIGGER", "AND", "OR", "DECLARE", 
		"RETAIN", "BY", "DEFAULT", "LOCAL", "DO", "DONE", "IF", "THEN", "ELSE", 
		"WHILE", "SET", "TO", "AS", "COMPUTE", "NEXT", "SQUARE", "FUNCTION", "RETURN", 
		"NOT", "ENNEMI", "IS", "GRAAL", "NORTH", "SOUTH", "EAST", "WEST", "NEARBY", 
		"DIRT", "ROCK", "VINES", "ZOMBIE", "PLAYER", "AMMO", "MAP", "RADIO", "FRUITS", 
		"SODA", "MOVE", "SHOOT", "USE", "NOTHING", "COUNT", "LIFE", "LATITUDE", 
		"LONGITUDE", "GRID", "SIZE", "WHEN", "YOUR", "TURN", "IMPORT", "SKIPINS", 
		"BOOLEAN", "INTEGER", "INT", "TRUE", "FALSE", "VOID", "COMMENT", "NEWLINE", 
		"WS", "FILEDECL", "ID", "LETTER", "DIGIT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "','", "'+'", "'-'", "'*'", "'/'", "'%'", "';'", "':'", 
		"'['", "']'", "'='", "'<'", "'>'", "'and'", "'or'", "'declare'", "'retain'", 
		"'by'", "'default'", "'local'", "'do'", "'done'", "'if'", "'then'", "'else'", 
		"'while'", "'set'", "'to'", "'as'", "'compute'", "'next'", "'square'", 
		"'function'", "'return'", "'not'", "'ennemi'", "'is'", "'graal'", "'north'", 
		"'south'", "'east'", "'west'", "'nearby'", "'dirt'", "'rock'", "'vines'", 
		"'zombie'", "'player'", "'ammo'", "'map'", "'radio'", "'fruits'", "'soda'", 
		"'move'", "'shoot'", "'use'", "'nothing'", "'count'", "'life'", "'latitude'", 
		"'longitude'", "'grid'", "'size'", "'when'", "'your'", "'turn'", "'import'", 
		"'skip'", "'boolean'", "'integer'", null, "'true'", "'false'", "'void'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "LPAR", "RPAR", "COMMA", "PLUS", "MINUS", "MULT", "DIV", "MODULO", 
		"SEMICOLON", "COLON", "LBRA", "RBRA", "EQUAL", "SMALLER", "BIGGER", "AND", 
		"OR", "DECLARE", "RETAIN", "BY", "DEFAULT", "LOCAL", "DO", "DONE", "IF", 
		"THEN", "ELSE", "WHILE", "SET", "TO", "AS", "COMPUTE", "NEXT", "SQUARE", 
		"FUNCTION", "RETURN", "NOT", "ENNEMI", "IS", "GRAAL", "NORTH", "SOUTH", 
		"EAST", "WEST", "NEARBY", "DIRT", "ROCK", "VINES", "ZOMBIE", "PLAYER", 
		"AMMO", "MAP", "RADIO", "FRUITS", "SODA", "MOVE", "SHOOT", "USE", "NOTHING", 
		"COUNT", "LIFE", "LATITUDE", "LONGITUDE", "GRID", "SIZE", "WHEN", "YOUR", 
		"TURN", "IMPORT", "SKIPINS", "BOOLEAN", "INTEGER", "INT", "TRUE", "FALSE", 
		"VOID", "COMMENT", "NEWLINE", "WS", "FILEDECL", "ID"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2S\u0256\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3"+
		"\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3"+
		"\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3"+
		"\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3"+
		"\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3"+
		"\37\3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3"+
		"#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3"+
		"*\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3"+
		".\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\38\38\38\38\38\39\39\39\39\3"+
		"9\3:\3:\3:\3:\3:\3:\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3<\3=\3=\3=\3=\3"+
		"=\3=\3>\3>\3>\3>\3>\3?\3?\3?\3?\3?\3?\3?\3?\3?\3@\3@\3@\3@\3@\3@\3@\3"+
		"@\3@\3@\3A\3A\3A\3A\3A\3B\3B\3B\3B\3B\3C\3C\3C\3C\3C\3D\3D\3D\3D\3D\3"+
		"E\3E\3E\3E\3E\3F\3F\3F\3F\3F\3F\3F\3G\3G\3G\3G\3G\3H\3H\3H\3H\3H\3H\3"+
		"H\3H\3I\3I\3I\3I\3I\3I\3I\3I\3J\5J\u020d\nJ\3J\3J\7J\u0211\nJ\fJ\16J\u0214"+
		"\13J\3J\5J\u0217\nJ\3K\3K\3K\3K\3K\3L\3L\3L\3L\3L\3L\3M\3M\3M\3M\3M\3"+
		"N\3N\3N\3N\7N\u022d\nN\fN\16N\u0230\13N\3N\3N\3N\3N\3N\3O\5O\u0238\nO"+
		"\3O\3O\3O\3O\3P\6P\u023f\nP\rP\16P\u0240\3P\3P\3Q\3Q\3Q\3Q\3Q\3Q\3R\3"+
		"R\3R\7R\u024e\nR\fR\16R\u0251\13R\3S\3S\3T\3T\3\u022e\2U\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{"+
		"?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091"+
		"J\u0093K\u0095L\u0097M\u0099N\u009bO\u009dP\u009fQ\u00a1R\u00a3S\u00a5"+
		"\2\u00a7\2\3\2\5\3\2\63;\4\2\13\13\"\"\4\2C\\c|\2\u025b\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2"+
		"K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3"+
		"\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2"+
		"\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2"+
		"q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3"+
		"\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2"+
		"\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f"+
		"\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2"+
		"\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1"+
		"\3\2\2\2\2\u00a3\3\2\2\2\3\u00a9\3\2\2\2\5\u00ab\3\2\2\2\7\u00ad\3\2\2"+
		"\2\t\u00af\3\2\2\2\13\u00b1\3\2\2\2\r\u00b3\3\2\2\2\17\u00b5\3\2\2\2\21"+
		"\u00b7\3\2\2\2\23\u00b9\3\2\2\2\25\u00bb\3\2\2\2\27\u00bd\3\2\2\2\31\u00bf"+
		"\3\2\2\2\33\u00c1\3\2\2\2\35\u00c3\3\2\2\2\37\u00c5\3\2\2\2!\u00c7\3\2"+
		"\2\2#\u00cb\3\2\2\2%\u00ce\3\2\2\2\'\u00d6\3\2\2\2)\u00dd\3\2\2\2+\u00e0"+
		"\3\2\2\2-\u00e8\3\2\2\2/\u00ee\3\2\2\2\61\u00f1\3\2\2\2\63\u00f6\3\2\2"+
		"\2\65\u00f9\3\2\2\2\67\u00fe\3\2\2\29\u0103\3\2\2\2;\u0109\3\2\2\2=\u010d"+
		"\3\2\2\2?\u0110\3\2\2\2A\u0113\3\2\2\2C\u011b\3\2\2\2E\u0120\3\2\2\2G"+
		"\u0127\3\2\2\2I\u0130\3\2\2\2K\u0137\3\2\2\2M\u013b\3\2\2\2O\u0142\3\2"+
		"\2\2Q\u0145\3\2\2\2S\u014b\3\2\2\2U\u0151\3\2\2\2W\u0157\3\2\2\2Y\u015c"+
		"\3\2\2\2[\u0161\3\2\2\2]\u0168\3\2\2\2_\u016d\3\2\2\2a\u0172\3\2\2\2c"+
		"\u0178\3\2\2\2e\u017f\3\2\2\2g\u0186\3\2\2\2i\u018b\3\2\2\2k\u018f\3\2"+
		"\2\2m\u0195\3\2\2\2o\u019c\3\2\2\2q\u01a1\3\2\2\2s\u01a6\3\2\2\2u\u01ac"+
		"\3\2\2\2w\u01b0\3\2\2\2y\u01b8\3\2\2\2{\u01be\3\2\2\2}\u01c3\3\2\2\2\177"+
		"\u01cc\3\2\2\2\u0081\u01d6\3\2\2\2\u0083\u01db\3\2\2\2\u0085\u01e0\3\2"+
		"\2\2\u0087\u01e5\3\2\2\2\u0089\u01ea\3\2\2\2\u008b\u01ef\3\2\2\2\u008d"+
		"\u01f6\3\2\2\2\u008f\u01fb\3\2\2\2\u0091\u0203\3\2\2\2\u0093\u0216\3\2"+
		"\2\2\u0095\u0218\3\2\2\2\u0097\u021d\3\2\2\2\u0099\u0223\3\2\2\2\u009b"+
		"\u0228\3\2\2\2\u009d\u0237\3\2\2\2\u009f\u023e\3\2\2\2\u00a1\u0244\3\2"+
		"\2\2\u00a3\u024a\3\2\2\2\u00a5\u0252\3\2\2\2\u00a7\u0254\3\2\2\2\u00a9"+
		"\u00aa\7*\2\2\u00aa\4\3\2\2\2\u00ab\u00ac\7+\2\2\u00ac\6\3\2\2\2\u00ad"+
		"\u00ae\7.\2\2\u00ae\b\3\2\2\2\u00af\u00b0\7-\2\2\u00b0\n\3\2\2\2\u00b1"+
		"\u00b2\7/\2\2\u00b2\f\3\2\2\2\u00b3\u00b4\7,\2\2\u00b4\16\3\2\2\2\u00b5"+
		"\u00b6\7\61\2\2\u00b6\20\3\2\2\2\u00b7\u00b8\7\'\2\2\u00b8\22\3\2\2\2"+
		"\u00b9\u00ba\7=\2\2\u00ba\24\3\2\2\2\u00bb\u00bc\7<\2\2\u00bc\26\3\2\2"+
		"\2\u00bd\u00be\7]\2\2\u00be\30\3\2\2\2\u00bf\u00c0\7_\2\2\u00c0\32\3\2"+
		"\2\2\u00c1\u00c2\7?\2\2\u00c2\34\3\2\2\2\u00c3\u00c4\7>\2\2\u00c4\36\3"+
		"\2\2\2\u00c5\u00c6\7@\2\2\u00c6 \3\2\2\2\u00c7\u00c8\7c\2\2\u00c8\u00c9"+
		"\7p\2\2\u00c9\u00ca\7f\2\2\u00ca\"\3\2\2\2\u00cb\u00cc\7q\2\2\u00cc\u00cd"+
		"\7t\2\2\u00cd$\3\2\2\2\u00ce\u00cf\7f\2\2\u00cf\u00d0\7g\2\2\u00d0\u00d1"+
		"\7e\2\2\u00d1\u00d2\7n\2\2\u00d2\u00d3\7c\2\2\u00d3\u00d4\7t\2\2\u00d4"+
		"\u00d5\7g\2\2\u00d5&\3\2\2\2\u00d6\u00d7\7t\2\2\u00d7\u00d8\7g\2\2\u00d8"+
		"\u00d9\7v\2\2\u00d9\u00da\7c\2\2\u00da\u00db\7k\2\2\u00db\u00dc\7p\2\2"+
		"\u00dc(\3\2\2\2\u00dd\u00de\7d\2\2\u00de\u00df\7{\2\2\u00df*\3\2\2\2\u00e0"+
		"\u00e1\7f\2\2\u00e1\u00e2\7g\2\2\u00e2\u00e3\7h\2\2\u00e3\u00e4\7c\2\2"+
		"\u00e4\u00e5\7w\2\2\u00e5\u00e6\7n\2\2\u00e6\u00e7\7v\2\2\u00e7,\3\2\2"+
		"\2\u00e8\u00e9\7n\2\2\u00e9\u00ea\7q\2\2\u00ea\u00eb\7e\2\2\u00eb\u00ec"+
		"\7c\2\2\u00ec\u00ed\7n\2\2\u00ed.\3\2\2\2\u00ee\u00ef\7f\2\2\u00ef\u00f0"+
		"\7q\2\2\u00f0\60\3\2\2\2\u00f1\u00f2\7f\2\2\u00f2\u00f3\7q\2\2\u00f3\u00f4"+
		"\7p\2\2\u00f4\u00f5\7g\2\2\u00f5\62\3\2\2\2\u00f6\u00f7\7k\2\2\u00f7\u00f8"+
		"\7h\2\2\u00f8\64\3\2\2\2\u00f9\u00fa\7v\2\2\u00fa\u00fb\7j\2\2\u00fb\u00fc"+
		"\7g\2\2\u00fc\u00fd\7p\2\2\u00fd\66\3\2\2\2\u00fe\u00ff\7g\2\2\u00ff\u0100"+
		"\7n\2\2\u0100\u0101\7u\2\2\u0101\u0102\7g\2\2\u01028\3\2\2\2\u0103\u0104"+
		"\7y\2\2\u0104\u0105\7j\2\2\u0105\u0106\7k\2\2\u0106\u0107\7n\2\2\u0107"+
		"\u0108\7g\2\2\u0108:\3\2\2\2\u0109\u010a\7u\2\2\u010a\u010b\7g\2\2\u010b"+
		"\u010c\7v\2\2\u010c<\3\2\2\2\u010d\u010e\7v\2\2\u010e\u010f\7q\2\2\u010f"+
		">\3\2\2\2\u0110\u0111\7c\2\2\u0111\u0112\7u\2\2\u0112@\3\2\2\2\u0113\u0114"+
		"\7e\2\2\u0114\u0115\7q\2\2\u0115\u0116\7o\2\2\u0116\u0117\7r\2\2\u0117"+
		"\u0118\7w\2\2\u0118\u0119\7v\2\2\u0119\u011a\7g\2\2\u011aB\3\2\2\2\u011b"+
		"\u011c\7p\2\2\u011c\u011d\7g\2\2\u011d\u011e\7z\2\2\u011e\u011f\7v\2\2"+
		"\u011fD\3\2\2\2\u0120\u0121\7u\2\2\u0121\u0122\7s\2\2\u0122\u0123\7w\2"+
		"\2\u0123\u0124\7c\2\2\u0124\u0125\7t\2\2\u0125\u0126\7g\2\2\u0126F\3\2"+
		"\2\2\u0127\u0128\7h\2\2\u0128\u0129\7w\2\2\u0129\u012a\7p\2\2\u012a\u012b"+
		"\7e\2\2\u012b\u012c\7v\2\2\u012c\u012d\7k\2\2\u012d\u012e\7q\2\2\u012e"+
		"\u012f\7p\2\2\u012fH\3\2\2\2\u0130\u0131\7t\2\2\u0131\u0132\7g\2\2\u0132"+
		"\u0133\7v\2\2\u0133\u0134\7w\2\2\u0134\u0135\7t\2\2\u0135\u0136\7p\2\2"+
		"\u0136J\3\2\2\2\u0137\u0138\7p\2\2\u0138\u0139\7q\2\2\u0139\u013a\7v\2"+
		"\2\u013aL\3\2\2\2\u013b\u013c\7g\2\2\u013c\u013d\7p\2\2\u013d\u013e\7"+
		"p\2\2\u013e\u013f\7g\2\2\u013f\u0140\7o\2\2\u0140\u0141\7k\2\2\u0141N"+
		"\3\2\2\2\u0142\u0143\7k\2\2\u0143\u0144\7u\2\2\u0144P\3\2\2\2\u0145\u0146"+
		"\7i\2\2\u0146\u0147\7t\2\2\u0147\u0148\7c\2\2\u0148\u0149\7c\2\2\u0149"+
		"\u014a\7n\2\2\u014aR\3\2\2\2\u014b\u014c\7p\2\2\u014c\u014d\7q\2\2\u014d"+
		"\u014e\7t\2\2\u014e\u014f\7v\2\2\u014f\u0150\7j\2\2\u0150T\3\2\2\2\u0151"+
		"\u0152\7u\2\2\u0152\u0153\7q\2\2\u0153\u0154\7w\2\2\u0154\u0155\7v\2\2"+
		"\u0155\u0156\7j\2\2\u0156V\3\2\2\2\u0157\u0158\7g\2\2\u0158\u0159\7c\2"+
		"\2\u0159\u015a\7u\2\2\u015a\u015b\7v\2\2\u015bX\3\2\2\2\u015c\u015d\7"+
		"y\2\2\u015d\u015e\7g\2\2\u015e\u015f\7u\2\2\u015f\u0160\7v\2\2\u0160Z"+
		"\3\2\2\2\u0161\u0162\7p\2\2\u0162\u0163\7g\2\2\u0163\u0164\7c\2\2\u0164"+
		"\u0165\7t\2\2\u0165\u0166\7d\2\2\u0166\u0167\7{\2\2\u0167\\\3\2\2\2\u0168"+
		"\u0169\7f\2\2\u0169\u016a\7k\2\2\u016a\u016b\7t\2\2\u016b\u016c\7v\2\2"+
		"\u016c^\3\2\2\2\u016d\u016e\7t\2\2\u016e\u016f\7q\2\2\u016f\u0170\7e\2"+
		"\2\u0170\u0171\7m\2\2\u0171`\3\2\2\2\u0172\u0173\7x\2\2\u0173\u0174\7"+
		"k\2\2\u0174\u0175\7p\2\2\u0175\u0176\7g\2\2\u0176\u0177\7u\2\2\u0177b"+
		"\3\2\2\2\u0178\u0179\7|\2\2\u0179\u017a\7q\2\2\u017a\u017b\7o\2\2\u017b"+
		"\u017c\7d\2\2\u017c\u017d\7k\2\2\u017d\u017e\7g\2\2\u017ed\3\2\2\2\u017f"+
		"\u0180\7r\2\2\u0180\u0181\7n\2\2\u0181\u0182\7c\2\2\u0182\u0183\7{\2\2"+
		"\u0183\u0184\7g\2\2\u0184\u0185\7t\2\2\u0185f\3\2\2\2\u0186\u0187\7c\2"+
		"\2\u0187\u0188\7o\2\2\u0188\u0189\7o\2\2\u0189\u018a\7q\2\2\u018ah\3\2"+
		"\2\2\u018b\u018c\7o\2\2\u018c\u018d\7c\2\2\u018d\u018e\7r\2\2\u018ej\3"+
		"\2\2\2\u018f\u0190\7t\2\2\u0190\u0191\7c\2\2\u0191\u0192\7f\2\2\u0192"+
		"\u0193\7k\2\2\u0193\u0194\7q\2\2\u0194l\3\2\2\2\u0195\u0196\7h\2\2\u0196"+
		"\u0197\7t\2\2\u0197\u0198\7w\2\2\u0198\u0199\7k\2\2\u0199\u019a\7v\2\2"+
		"\u019a\u019b\7u\2\2\u019bn\3\2\2\2\u019c\u019d\7u\2\2\u019d\u019e\7q\2"+
		"\2\u019e\u019f\7f\2\2\u019f\u01a0\7c\2\2\u01a0p\3\2\2\2\u01a1\u01a2\7"+
		"o\2\2\u01a2\u01a3\7q\2\2\u01a3\u01a4\7x\2\2\u01a4\u01a5\7g\2\2\u01a5r"+
		"\3\2\2\2\u01a6\u01a7\7u\2\2\u01a7\u01a8\7j\2\2\u01a8\u01a9\7q\2\2\u01a9"+
		"\u01aa\7q\2\2\u01aa\u01ab\7v\2\2\u01abt\3\2\2\2\u01ac\u01ad\7w\2\2\u01ad"+
		"\u01ae\7u\2\2\u01ae\u01af\7g\2\2\u01afv\3\2\2\2\u01b0\u01b1\7p\2\2\u01b1"+
		"\u01b2\7q\2\2\u01b2\u01b3\7v\2\2\u01b3\u01b4\7j\2\2\u01b4\u01b5\7k\2\2"+
		"\u01b5\u01b6\7p\2\2\u01b6\u01b7\7i\2\2\u01b7x\3\2\2\2\u01b8\u01b9\7e\2"+
		"\2\u01b9\u01ba\7q\2\2\u01ba\u01bb\7w\2\2\u01bb\u01bc\7p\2\2\u01bc\u01bd"+
		"\7v\2\2\u01bdz\3\2\2\2\u01be\u01bf\7n\2\2\u01bf\u01c0\7k\2\2\u01c0\u01c1"+
		"\7h\2\2\u01c1\u01c2\7g\2\2\u01c2|\3\2\2\2\u01c3\u01c4\7n\2\2\u01c4\u01c5"+
		"\7c\2\2\u01c5\u01c6\7v\2\2\u01c6\u01c7\7k\2\2\u01c7\u01c8\7v\2\2\u01c8"+
		"\u01c9\7w\2\2\u01c9\u01ca\7f\2\2\u01ca\u01cb\7g\2\2\u01cb~\3\2\2\2\u01cc"+
		"\u01cd\7n\2\2\u01cd\u01ce\7q\2\2\u01ce\u01cf\7p\2\2\u01cf\u01d0\7i\2\2"+
		"\u01d0\u01d1\7k\2\2\u01d1\u01d2\7v\2\2\u01d2\u01d3\7w\2\2\u01d3\u01d4"+
		"\7f\2\2\u01d4\u01d5\7g\2\2\u01d5\u0080\3\2\2\2\u01d6\u01d7\7i\2\2\u01d7"+
		"\u01d8\7t\2\2\u01d8\u01d9\7k\2\2\u01d9\u01da\7f\2\2\u01da\u0082\3\2\2"+
		"\2\u01db\u01dc\7u\2\2\u01dc\u01dd\7k\2\2\u01dd\u01de\7|\2\2\u01de\u01df"+
		"\7g\2\2\u01df\u0084\3\2\2\2\u01e0\u01e1\7y\2\2\u01e1\u01e2\7j\2\2\u01e2"+
		"\u01e3\7g\2\2\u01e3\u01e4\7p\2\2\u01e4\u0086\3\2\2\2\u01e5\u01e6\7{\2"+
		"\2\u01e6\u01e7\7q\2\2\u01e7\u01e8\7w\2\2\u01e8\u01e9\7t\2\2\u01e9\u0088"+
		"\3\2\2\2\u01ea\u01eb\7v\2\2\u01eb\u01ec\7w\2\2\u01ec\u01ed\7t\2\2\u01ed"+
		"\u01ee\7p\2\2\u01ee\u008a\3\2\2\2\u01ef\u01f0\7k\2\2\u01f0\u01f1\7o\2"+
		"\2\u01f1\u01f2\7r\2\2\u01f2\u01f3\7q\2\2\u01f3\u01f4\7t\2\2\u01f4\u01f5"+
		"\7v\2\2\u01f5\u008c\3\2\2\2\u01f6\u01f7\7u\2\2\u01f7\u01f8\7m\2\2\u01f8"+
		"\u01f9\7k\2\2\u01f9\u01fa\7r\2\2\u01fa\u008e\3\2\2\2\u01fb\u01fc\7d\2"+
		"\2\u01fc\u01fd\7q\2\2\u01fd\u01fe\7q\2\2\u01fe\u01ff\7n\2\2\u01ff\u0200"+
		"\7g\2\2\u0200\u0201\7c\2\2\u0201\u0202\7p\2\2\u0202\u0090\3\2\2\2\u0203"+
		"\u0204\7k\2\2\u0204\u0205\7p\2\2\u0205\u0206\7v\2\2\u0206\u0207\7g\2\2"+
		"\u0207\u0208\7i\2\2\u0208\u0209\7g\2\2\u0209\u020a\7t\2\2\u020a\u0092"+
		"\3\2\2\2\u020b\u020d\5\13\6\2\u020c\u020b\3\2\2\2\u020c\u020d\3\2\2\2"+
		"\u020d\u020e\3\2\2\2\u020e\u0212\t\2\2\2\u020f\u0211\5\u00a7T\2\u0210"+
		"\u020f\3\2\2\2\u0211\u0214\3\2\2\2\u0212\u0210\3\2\2\2\u0212\u0213\3\2"+
		"\2\2\u0213\u0217\3\2\2\2\u0214\u0212\3\2\2\2\u0215\u0217\7\62\2\2\u0216"+
		"\u020c\3\2\2\2\u0216\u0215\3\2\2\2\u0217\u0094\3\2\2\2\u0218\u0219\7v"+
		"\2\2\u0219\u021a\7t\2\2\u021a\u021b\7w\2\2\u021b\u021c\7g\2\2\u021c\u0096"+
		"\3\2\2\2\u021d\u021e\7h\2\2\u021e\u021f\7c\2\2\u021f\u0220\7n\2\2\u0220"+
		"\u0221\7u\2\2\u0221\u0222\7g\2\2\u0222\u0098\3\2\2\2\u0223\u0224\7x\2"+
		"\2\u0224\u0225\7q\2\2\u0225\u0226\7k\2\2\u0226\u0227\7f\2\2\u0227\u009a"+
		"\3\2\2\2\u0228\u0229\7\61\2\2\u0229\u022a\7,\2\2\u022a\u022e\3\2\2\2\u022b"+
		"\u022d\13\2\2\2\u022c\u022b\3\2\2\2\u022d\u0230\3\2\2\2\u022e\u022f\3"+
		"\2\2\2\u022e\u022c\3\2\2\2\u022f\u0231\3\2\2\2\u0230\u022e\3\2\2\2\u0231"+
		"\u0232\7,\2\2\u0232\u0233\7\61\2\2\u0233\u0234\3\2\2\2\u0234\u0235\bN"+
		"\2\2\u0235\u009c\3\2\2\2\u0236\u0238\7\17\2\2\u0237\u0236\3\2\2\2\u0237"+
		"\u0238\3\2\2\2\u0238\u0239\3\2\2\2\u0239\u023a\7\f\2\2\u023a\u023b\3\2"+
		"\2\2\u023b\u023c\bO\2\2\u023c\u009e\3\2\2\2\u023d\u023f\t\3\2\2\u023e"+
		"\u023d\3\2\2\2\u023f\u0240\3\2\2\2\u0240\u023e\3\2\2\2\u0240\u0241\3\2"+
		"\2\2\u0241\u0242\3\2\2\2\u0242\u0243\bP\2\2\u0243\u00a0\3\2\2\2\u0244"+
		"\u0245\5\u00a3R\2\u0245\u0246\7\60\2\2\u0246\u0247\7y\2\2\u0247\u0248"+
		"\7n\2\2\u0248\u0249\7f\2\2\u0249\u00a2\3\2\2\2\u024a\u024f\5\u00a5S\2"+
		"\u024b\u024e\5\u00a5S\2\u024c\u024e\5\u00a7T\2\u024d\u024b\3\2\2\2\u024d"+
		"\u024c\3\2\2\2\u024e\u0251\3\2\2\2\u024f\u024d\3\2\2\2\u024f\u0250\3\2"+
		"\2\2\u0250\u00a4\3\2\2\2\u0251\u024f\3\2\2\2\u0252\u0253\t\4\2\2\u0253"+
		"\u00a6\3\2\2\2\u0254\u0255\4\62;\2\u0255\u00a8\3\2\2\2\13\2\u020c\u0212"+
		"\u0216\u022e\u0237\u0240\u024d\u024f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}