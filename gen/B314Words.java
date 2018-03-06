// Generated from /home/users/100/tndao/Documents/M0/Q2/Compilers/Projet/1718_INFOB314_COMPILATEUR_GROUPE12/src/main/antlr4/imports/B314Words.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class B314Words extends Lexer {
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
		LONGITUDE=65, GRID=66, SIZE=67, WHEN=68, YOUR=69, TURN=70, IMPORT=71, 
		SKIPINS=72, BOOLEAN=73, INTEGER=74, INT=75, TRUE=76, FALSE=77, VOID=78, 
		COMMENT=79, NEWLINE=80, WS=81, FILEDECL=82, ID=83, NUMBER=84;
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
		"COUNT", "LIFE", "LATITUDE", "LONGITUDE", "GRID", "SIZE", "WHEN", "YOUR", 
		"TURN", "IMPORT", "SKIPINS", "BOOLEAN", "INTEGER", "INT", "TRUE", "FALSE", 
		"VOID", "COMMENT", "NEWLINE", "WS", "FILEDECL", "ID", "NUMBER", "LETTER", 
		"DIGIT"
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
		"'latitude'", "'longitude'", "'grid'", "'size'", "'when'", "'your'", "'turn'", 
		"'import'", "'skip'", "'boolean'", "'integer'", null, "'true'", "'false'", 
		"'void'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "LPAR", "RPAR", "COMMA", "PLUS", "MINUS", "MULT", "DIV", "MODULO", 
		"SEMICOLON", "COLON", "LBRA", "RBRA", "EQUAL", "SMALLER", "BIGGER", "AND", 
		"OR", "SCALAR", "ARRAY", "DECLARE", "RETAIN", "BY", "DEFAULT", "LOCAL", 
		"DO", "DONE", "IF", "THEN", "ELSE", "WHILE", "SET", "TO", "AS", "COMPUTE", 
		"NEXT", "SQUARE", "FUNCTION", "RETURN", "NOT", "ENNEMI", "IS", "GRAAL", 
		"NORTH", "SOUTH", "EAST", "WEST", "NEARBY", "DIRT", "ROCK", "VINES", "ZOMBIE", 
		"PLAYER", "AMMO", "MAP", "RADIO", "FRUITS", "SODA", "MOVE", "SHOOT", "USE", 
		"NOTHING", "COUNT", "LIFE", "LATITUDE", "LONGITUDE", "GRID", "SIZE", "WHEN", 
		"YOUR", "TURN", "IMPORT", "SKIPINS", "BOOLEAN", "INTEGER", "INT", "TRUE", 
		"FALSE", "VOID", "COMMENT", "NEWLINE", "WS", "FILEDECL", "ID", "NUMBER"
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


	public B314Words(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "B314Words.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2V\u026c\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b"+
		"\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\5\23\u00d8\n\23"+
		"\3\24\3\24\3\24\6\24\u00dd\n\24\r\24\16\24\u00de\3\24\3\24\6\24\u00e3"+
		"\n\24\r\24\16\24\u00e4\5\24\u00e7\n\24\3\24\3\24\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3"+
		"\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 "+
		"\3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%"+
		"\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3+\3+\3+\3+\3+\3+\3,\3"+
		",\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62"+
		"\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\67\3\67"+
		"\3\67\3\67\38\38\38\38\38\38\39\39\39\39\39\39\39\3:\3:\3:\3:\3:\3;\3"+
		";\3;\3;\3;\3<\3<\3<\3<\3<\3<\3=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3>\3>\3?\3"+
		"?\3?\3?\3?\3?\3@\3@\3@\3@\3@\3A\3A\3A\3A\3A\3A\3A\3A\3A\3B\3B\3B\3B\3"+
		"B\3B\3B\3B\3B\3B\3C\3C\3C\3C\3C\3D\3D\3D\3D\3D\3E\3E\3E\3E\3E\3F\3F\3"+
		"F\3F\3F\3G\3G\3G\3G\3G\3H\3H\3H\3H\3H\3H\3H\3I\3I\3I\3I\3I\3J\3J\3J\3"+
		"J\3J\3J\3J\3J\3K\3K\3K\3K\3K\3K\3K\3K\3L\3L\3M\3M\3M\3M\3M\3N\3N\3N\3"+
		"N\3N\3N\3O\3O\3O\3O\3O\3P\3P\3P\3P\7P\u023e\nP\fP\16P\u0241\13P\3P\3P"+
		"\3P\3P\3P\3Q\5Q\u0249\nQ\3Q\3Q\3Q\3Q\3R\6R\u0250\nR\rR\16R\u0251\3R\3"+
		"R\3S\3S\3S\3S\3S\3S\3T\3T\3T\7T\u025f\nT\fT\16T\u0262\13T\3U\6U\u0265"+
		"\nU\rU\16U\u0266\3V\3V\3W\3W\3\u023f\2X\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
		"-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W"+
		"-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083"+
		"C\u0085D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091J\u0093K\u0095L\u0097"+
		"M\u0099N\u009bO\u009dP\u009fQ\u00a1R\u00a3S\u00a5T\u00a7U\u00a9V\u00ab"+
		"\2\u00ad\2\3\2\4\4\2\13\13\"\"\4\2C\\c|\2\u0274\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2"+
		"Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3"+
		"\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2"+
		"\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2"+
		"\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3"+
		"\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2"+
		"\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099"+
		"\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2"+
		"\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\3\u00af"+
		"\3\2\2\2\5\u00b1\3\2\2\2\7\u00b3\3\2\2\2\t\u00b5\3\2\2\2\13\u00b7\3\2"+
		"\2\2\r\u00b9\3\2\2\2\17\u00bb\3\2\2\2\21\u00bd\3\2\2\2\23\u00bf\3\2\2"+
		"\2\25\u00c1\3\2\2\2\27\u00c3\3\2\2\2\31\u00c5\3\2\2\2\33\u00c7\3\2\2\2"+
		"\35\u00c9\3\2\2\2\37\u00cb\3\2\2\2!\u00cd\3\2\2\2#\u00d1\3\2\2\2%\u00d7"+
		"\3\2\2\2\'\u00d9\3\2\2\2)\u00ea\3\2\2\2+\u00f2\3\2\2\2-\u00f9\3\2\2\2"+
		"/\u00fc\3\2\2\2\61\u0104\3\2\2\2\63\u010a\3\2\2\2\65\u010d\3\2\2\2\67"+
		"\u0112\3\2\2\29\u0115\3\2\2\2;\u011a\3\2\2\2=\u011f\3\2\2\2?\u0125\3\2"+
		"\2\2A\u0129\3\2\2\2C\u012c\3\2\2\2E\u012f\3\2\2\2G\u0137\3\2\2\2I\u013c"+
		"\3\2\2\2K\u0143\3\2\2\2M\u014c\3\2\2\2O\u0153\3\2\2\2Q\u0157\3\2\2\2S"+
		"\u015e\3\2\2\2U\u0161\3\2\2\2W\u0167\3\2\2\2Y\u016d\3\2\2\2[\u0173\3\2"+
		"\2\2]\u0178\3\2\2\2_\u017d\3\2\2\2a\u0184\3\2\2\2c\u0189\3\2\2\2e\u018e"+
		"\3\2\2\2g\u0194\3\2\2\2i\u019b\3\2\2\2k\u01a2\3\2\2\2m\u01a7\3\2\2\2o"+
		"\u01ab\3\2\2\2q\u01b1\3\2\2\2s\u01b8\3\2\2\2u\u01bd\3\2\2\2w\u01c2\3\2"+
		"\2\2y\u01c8\3\2\2\2{\u01cc\3\2\2\2}\u01d4\3\2\2\2\177\u01da\3\2\2\2\u0081"+
		"\u01df\3\2\2\2\u0083\u01e8\3\2\2\2\u0085\u01f2\3\2\2\2\u0087\u01f7\3\2"+
		"\2\2\u0089\u01fc\3\2\2\2\u008b\u0201\3\2\2\2\u008d\u0206\3\2\2\2\u008f"+
		"\u020b\3\2\2\2\u0091\u0212\3\2\2\2\u0093\u0217\3\2\2\2\u0095\u021f\3\2"+
		"\2\2\u0097\u0227\3\2\2\2\u0099\u0229\3\2\2\2\u009b\u022e\3\2\2\2\u009d"+
		"\u0234\3\2\2\2\u009f\u0239\3\2\2\2\u00a1\u0248\3\2\2\2\u00a3\u024f\3\2"+
		"\2\2\u00a5\u0255\3\2\2\2\u00a7\u025b\3\2\2\2\u00a9\u0264\3\2\2\2\u00ab"+
		"\u0268\3\2\2\2\u00ad\u026a\3\2\2\2\u00af\u00b0\7*\2\2\u00b0\4\3\2\2\2"+
		"\u00b1\u00b2\7+\2\2\u00b2\6\3\2\2\2\u00b3\u00b4\7.\2\2\u00b4\b\3\2\2\2"+
		"\u00b5\u00b6\7-\2\2\u00b6\n\3\2\2\2\u00b7\u00b8\7/\2\2\u00b8\f\3\2\2\2"+
		"\u00b9\u00ba\7,\2\2\u00ba\16\3\2\2\2\u00bb\u00bc\7\61\2\2\u00bc\20\3\2"+
		"\2\2\u00bd\u00be\7\'\2\2\u00be\22\3\2\2\2\u00bf\u00c0\7=\2\2\u00c0\24"+
		"\3\2\2\2\u00c1\u00c2\7<\2\2\u00c2\26\3\2\2\2\u00c3\u00c4\7]\2\2\u00c4"+
		"\30\3\2\2\2\u00c5\u00c6\7_\2\2\u00c6\32\3\2\2\2\u00c7\u00c8\7?\2\2\u00c8"+
		"\34\3\2\2\2\u00c9\u00ca\7>\2\2\u00ca\36\3\2\2\2\u00cb\u00cc\7@\2\2\u00cc"+
		" \3\2\2\2\u00cd\u00ce\7c\2\2\u00ce\u00cf\7p\2\2\u00cf\u00d0\7f\2\2\u00d0"+
		"\"\3\2\2\2\u00d1\u00d2\7q\2\2\u00d2\u00d3\7t\2\2\u00d3$\3\2\2\2\u00d4"+
		"\u00d8\5\u0093J\2\u00d5\u00d8\5\u0095K\2\u00d6\u00d8\5I%\2\u00d7\u00d4"+
		"\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d6\3\2\2\2\u00d8&\3\2\2\2\u00d9"+
		"\u00da\5%\23\2\u00da\u00dc\5\27\f\2\u00db\u00dd\5\u00adW\2\u00dc\u00db"+
		"\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df"+
		"\u00e6\3\2\2\2\u00e0\u00e2\5\7\4\2\u00e1\u00e3\5\u00adW\2\u00e2\u00e1"+
		"\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5"+
		"\u00e7\3\2\2\2\u00e6\u00e0\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8\3\2"+
		"\2\2\u00e8\u00e9\5\31\r\2\u00e9(\3\2\2\2\u00ea\u00eb\7f\2\2\u00eb\u00ec"+
		"\7g\2\2\u00ec\u00ed\7e\2\2\u00ed\u00ee\7n\2\2\u00ee\u00ef\7c\2\2\u00ef"+
		"\u00f0\7t\2\2\u00f0\u00f1\7g\2\2\u00f1*\3\2\2\2\u00f2\u00f3\7t\2\2\u00f3"+
		"\u00f4\7g\2\2\u00f4\u00f5\7v\2\2\u00f5\u00f6\7c\2\2\u00f6\u00f7\7k\2\2"+
		"\u00f7\u00f8\7p\2\2\u00f8,\3\2\2\2\u00f9\u00fa\7d\2\2\u00fa\u00fb\7{\2"+
		"\2\u00fb.\3\2\2\2\u00fc\u00fd\7f\2\2\u00fd\u00fe\7g\2\2\u00fe\u00ff\7"+
		"h\2\2\u00ff\u0100\7c\2\2\u0100\u0101\7w\2\2\u0101\u0102\7n\2\2\u0102\u0103"+
		"\7v\2\2\u0103\60\3\2\2\2\u0104\u0105\7n\2\2\u0105\u0106\7q\2\2\u0106\u0107"+
		"\7e\2\2\u0107\u0108\7c\2\2\u0108\u0109\7n\2\2\u0109\62\3\2\2\2\u010a\u010b"+
		"\7f\2\2\u010b\u010c\7q\2\2\u010c\64\3\2\2\2\u010d\u010e\7f\2\2\u010e\u010f"+
		"\7q\2\2\u010f\u0110\7p\2\2\u0110\u0111\7g\2\2\u0111\66\3\2\2\2\u0112\u0113"+
		"\7k\2\2\u0113\u0114\7h\2\2\u01148\3\2\2\2\u0115\u0116\7v\2\2\u0116\u0117"+
		"\7j\2\2\u0117\u0118\7g\2\2\u0118\u0119\7p\2\2\u0119:\3\2\2\2\u011a\u011b"+
		"\7g\2\2\u011b\u011c\7n\2\2\u011c\u011d\7u\2\2\u011d\u011e\7g\2\2\u011e"+
		"<\3\2\2\2\u011f\u0120\7y\2\2\u0120\u0121\7j\2\2\u0121\u0122\7k\2\2\u0122"+
		"\u0123\7n\2\2\u0123\u0124\7g\2\2\u0124>\3\2\2\2\u0125\u0126\7u\2\2\u0126"+
		"\u0127\7g\2\2\u0127\u0128\7v\2\2\u0128@\3\2\2\2\u0129\u012a\7v\2\2\u012a"+
		"\u012b\7q\2\2\u012bB\3\2\2\2\u012c\u012d\7c\2\2\u012d\u012e\7u\2\2\u012e"+
		"D\3\2\2\2\u012f\u0130\7e\2\2\u0130\u0131\7q\2\2\u0131\u0132\7o\2\2\u0132"+
		"\u0133\7r\2\2\u0133\u0134\7w\2\2\u0134\u0135\7v\2\2\u0135\u0136\7g\2\2"+
		"\u0136F\3\2\2\2\u0137\u0138\7p\2\2\u0138\u0139\7g\2\2\u0139\u013a\7z\2"+
		"\2\u013a\u013b\7v\2\2\u013bH\3\2\2\2\u013c\u013d\7u\2\2\u013d\u013e\7"+
		"s\2\2\u013e\u013f\7w\2\2\u013f\u0140\7c\2\2\u0140\u0141\7t\2\2\u0141\u0142"+
		"\7g\2\2\u0142J\3\2\2\2\u0143\u0144\7h\2\2\u0144\u0145\7w\2\2\u0145\u0146"+
		"\7p\2\2\u0146\u0147\7e\2\2\u0147\u0148\7v\2\2\u0148\u0149\7k\2\2\u0149"+
		"\u014a\7q\2\2\u014a\u014b\7p\2\2\u014bL\3\2\2\2\u014c\u014d\7t\2\2\u014d"+
		"\u014e\7g\2\2\u014e\u014f\7v\2\2\u014f\u0150\7w\2\2\u0150\u0151\7t\2\2"+
		"\u0151\u0152\7p\2\2\u0152N\3\2\2\2\u0153\u0154\7p\2\2\u0154\u0155\7q\2"+
		"\2\u0155\u0156\7v\2\2\u0156P\3\2\2\2\u0157\u0158\7g\2\2\u0158\u0159\7"+
		"p\2\2\u0159\u015a\7p\2\2\u015a\u015b\7g\2\2\u015b\u015c\7o\2\2\u015c\u015d"+
		"\7k\2\2\u015dR\3\2\2\2\u015e\u015f\7k\2\2\u015f\u0160\7u\2\2\u0160T\3"+
		"\2\2\2\u0161\u0162\7i\2\2\u0162\u0163\7t\2\2\u0163\u0164\7c\2\2\u0164"+
		"\u0165\7c\2\2\u0165\u0166\7n\2\2\u0166V\3\2\2\2\u0167\u0168\7p\2\2\u0168"+
		"\u0169\7q\2\2\u0169\u016a\7t\2\2\u016a\u016b\7v\2\2\u016b\u016c\7j\2\2"+
		"\u016cX\3\2\2\2\u016d\u016e\7u\2\2\u016e\u016f\7q\2\2\u016f\u0170\7w\2"+
		"\2\u0170\u0171\7v\2\2\u0171\u0172\7j\2\2\u0172Z\3\2\2\2\u0173\u0174\7"+
		"g\2\2\u0174\u0175\7c\2\2\u0175\u0176\7u\2\2\u0176\u0177\7v\2\2\u0177\\"+
		"\3\2\2\2\u0178\u0179\7y\2\2\u0179\u017a\7g\2\2\u017a\u017b\7u\2\2\u017b"+
		"\u017c\7v\2\2\u017c^\3\2\2\2\u017d\u017e\7p\2\2\u017e\u017f\7g\2\2\u017f"+
		"\u0180\7c\2\2\u0180\u0181\7t\2\2\u0181\u0182\7d\2\2\u0182\u0183\7{\2\2"+
		"\u0183`\3\2\2\2\u0184\u0185\7f\2\2\u0185\u0186\7k\2\2\u0186\u0187\7t\2"+
		"\2\u0187\u0188\7v\2\2\u0188b\3\2\2\2\u0189\u018a\7t\2\2\u018a\u018b\7"+
		"q\2\2\u018b\u018c\7e\2\2\u018c\u018d\7m\2\2\u018dd\3\2\2\2\u018e\u018f"+
		"\7x\2\2\u018f\u0190\7k\2\2\u0190\u0191\7p\2\2\u0191\u0192\7g\2\2\u0192"+
		"\u0193\7u\2\2\u0193f\3\2\2\2\u0194\u0195\7|\2\2\u0195\u0196\7q\2\2\u0196"+
		"\u0197\7o\2\2\u0197\u0198\7d\2\2\u0198\u0199\7k\2\2\u0199\u019a\7g\2\2"+
		"\u019ah\3\2\2\2\u019b\u019c\7r\2\2\u019c\u019d\7n\2\2\u019d\u019e\7c\2"+
		"\2\u019e\u019f\7{\2\2\u019f\u01a0\7g\2\2\u01a0\u01a1\7t\2\2\u01a1j\3\2"+
		"\2\2\u01a2\u01a3\7c\2\2\u01a3\u01a4\7o\2\2\u01a4\u01a5\7o\2\2\u01a5\u01a6"+
		"\7q\2\2\u01a6l\3\2\2\2\u01a7\u01a8\7o\2\2\u01a8\u01a9\7c\2\2\u01a9\u01aa"+
		"\7r\2\2\u01aan\3\2\2\2\u01ab\u01ac\7t\2\2\u01ac\u01ad\7c\2\2\u01ad\u01ae"+
		"\7f\2\2\u01ae\u01af\7k\2\2\u01af\u01b0\7q\2\2\u01b0p\3\2\2\2\u01b1\u01b2"+
		"\7h\2\2\u01b2\u01b3\7t\2\2\u01b3\u01b4\7w\2\2\u01b4\u01b5\7k\2\2\u01b5"+
		"\u01b6\7v\2\2\u01b6\u01b7\7u\2\2\u01b7r\3\2\2\2\u01b8\u01b9\7u\2\2\u01b9"+
		"\u01ba\7q\2\2\u01ba\u01bb\7f\2\2\u01bb\u01bc\7c\2\2\u01bct\3\2\2\2\u01bd"+
		"\u01be\7o\2\2\u01be\u01bf\7q\2\2\u01bf\u01c0\7x\2\2\u01c0\u01c1\7g\2\2"+
		"\u01c1v\3\2\2\2\u01c2\u01c3\7u\2\2\u01c3\u01c4\7j\2\2\u01c4\u01c5\7q\2"+
		"\2\u01c5\u01c6\7q\2\2\u01c6\u01c7\7v\2\2\u01c7x\3\2\2\2\u01c8\u01c9\7"+
		"w\2\2\u01c9\u01ca\7u\2\2\u01ca\u01cb\7g\2\2\u01cbz\3\2\2\2\u01cc\u01cd"+
		"\7p\2\2\u01cd\u01ce\7q\2\2\u01ce\u01cf\7v\2\2\u01cf\u01d0\7j\2\2\u01d0"+
		"\u01d1\7k\2\2\u01d1\u01d2\7p\2\2\u01d2\u01d3\7i\2\2\u01d3|\3\2\2\2\u01d4"+
		"\u01d5\7e\2\2\u01d5\u01d6\7q\2\2\u01d6\u01d7\7w\2\2\u01d7\u01d8\7p\2\2"+
		"\u01d8\u01d9\7v\2\2\u01d9~\3\2\2\2\u01da\u01db\7n\2\2\u01db\u01dc\7k\2"+
		"\2\u01dc\u01dd\7h\2\2\u01dd\u01de\7g\2\2\u01de\u0080\3\2\2\2\u01df\u01e0"+
		"\7n\2\2\u01e0\u01e1\7c\2\2\u01e1\u01e2\7v\2\2\u01e2\u01e3\7k\2\2\u01e3"+
		"\u01e4\7v\2\2\u01e4\u01e5\7w\2\2\u01e5\u01e6\7f\2\2\u01e6\u01e7\7g\2\2"+
		"\u01e7\u0082\3\2\2\2\u01e8\u01e9\7n\2\2\u01e9\u01ea\7q\2\2\u01ea\u01eb"+
		"\7p\2\2\u01eb\u01ec\7i\2\2\u01ec\u01ed\7k\2\2\u01ed\u01ee\7v\2\2\u01ee"+
		"\u01ef\7w\2\2\u01ef\u01f0\7f\2\2\u01f0\u01f1\7g\2\2\u01f1\u0084\3\2\2"+
		"\2\u01f2\u01f3\7i\2\2\u01f3\u01f4\7t\2\2\u01f4\u01f5\7k\2\2\u01f5\u01f6"+
		"\7f\2\2\u01f6\u0086\3\2\2\2\u01f7\u01f8\7u\2\2\u01f8\u01f9\7k\2\2\u01f9"+
		"\u01fa\7|\2\2\u01fa\u01fb\7g\2\2\u01fb\u0088\3\2\2\2\u01fc\u01fd\7y\2"+
		"\2\u01fd\u01fe\7j\2\2\u01fe\u01ff\7g\2\2\u01ff\u0200\7p\2\2\u0200\u008a"+
		"\3\2\2\2\u0201\u0202\7{\2\2\u0202\u0203\7q\2\2\u0203\u0204\7w\2\2\u0204"+
		"\u0205\7t\2\2\u0205\u008c\3\2\2\2\u0206\u0207\7v\2\2\u0207\u0208\7w\2"+
		"\2\u0208\u0209\7t\2\2\u0209\u020a\7p\2\2\u020a\u008e\3\2\2\2\u020b\u020c"+
		"\7k\2\2\u020c\u020d\7o\2\2\u020d\u020e\7r\2\2\u020e\u020f\7q\2\2\u020f"+
		"\u0210\7t\2\2\u0210\u0211\7v\2\2\u0211\u0090\3\2\2\2\u0212\u0213\7u\2"+
		"\2\u0213\u0214\7m\2\2\u0214\u0215\7k\2\2\u0215\u0216\7r\2\2\u0216\u0092"+
		"\3\2\2\2\u0217\u0218\7d\2\2\u0218\u0219\7q\2\2\u0219\u021a\7q\2\2\u021a"+
		"\u021b\7n\2\2\u021b\u021c\7g\2\2\u021c\u021d\7c\2\2\u021d\u021e\7p\2\2"+
		"\u021e\u0094\3\2\2\2\u021f\u0220\7k\2\2\u0220\u0221\7p\2\2\u0221\u0222"+
		"\7v\2\2\u0222\u0223\7g\2\2\u0223\u0224\7i\2\2\u0224\u0225\7g\2\2\u0225"+
		"\u0226\7t\2\2\u0226\u0096\3\2\2\2\u0227\u0228\5\u00a9U\2\u0228\u0098\3"+
		"\2\2\2\u0229\u022a\7v\2\2\u022a\u022b\7t\2\2\u022b\u022c\7w\2\2\u022c"+
		"\u022d\7g\2\2\u022d\u009a\3\2\2\2\u022e\u022f\7h\2\2\u022f\u0230\7c\2"+
		"\2\u0230\u0231\7n\2\2\u0231\u0232\7u\2\2\u0232\u0233\7g\2\2\u0233\u009c"+
		"\3\2\2\2\u0234\u0235\7x\2\2\u0235\u0236\7q\2\2\u0236\u0237\7k\2\2\u0237"+
		"\u0238\7f\2\2\u0238\u009e\3\2\2\2\u0239\u023a\7\61\2\2\u023a\u023b\7,"+
		"\2\2\u023b\u023f\3\2\2\2\u023c\u023e\13\2\2\2\u023d\u023c\3\2\2\2\u023e"+
		"\u0241\3\2\2\2\u023f\u0240\3\2\2\2\u023f\u023d\3\2\2\2\u0240\u0242\3\2"+
		"\2\2\u0241\u023f\3\2\2\2\u0242\u0243\7,\2\2\u0243\u0244\7\61\2\2\u0244"+
		"\u0245\3\2\2\2\u0245\u0246\bP\2\2\u0246\u00a0\3\2\2\2\u0247\u0249\7\17"+
		"\2\2\u0248\u0247\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u024a\3\2\2\2\u024a"+
		"\u024b\7\f\2\2\u024b\u024c\3\2\2\2\u024c\u024d\bQ\2\2\u024d\u00a2\3\2"+
		"\2\2\u024e\u0250\t\2\2\2\u024f\u024e\3\2\2\2\u0250\u0251\3\2\2\2\u0251"+
		"\u024f\3\2\2\2\u0251\u0252\3\2\2\2\u0252\u0253\3\2\2\2\u0253\u0254\bR"+
		"\2\2\u0254\u00a4\3\2\2\2\u0255\u0256\5\u00a7T\2\u0256\u0257\7\60\2\2\u0257"+
		"\u0258\7y\2\2\u0258\u0259\7n\2\2\u0259\u025a\7f\2\2\u025a\u00a6\3\2\2"+
		"\2\u025b\u0260\5\u00abV\2\u025c\u025f\5\u00abV\2\u025d\u025f\5\u00adW"+
		"\2\u025e\u025c\3\2\2\2\u025e\u025d\3\2\2\2\u025f\u0262\3\2\2\2\u0260\u025e"+
		"\3\2\2\2\u0260\u0261\3\2\2\2\u0261\u00a8\3\2\2\2\u0262\u0260\3\2\2\2\u0263"+
		"\u0265\5\u00adW\2\u0264\u0263\3\2\2\2\u0265\u0266\3\2\2\2\u0266\u0264"+
		"\3\2\2\2\u0266\u0267\3\2\2\2\u0267\u00aa\3\2\2\2\u0268\u0269\t\3\2\2\u0269"+
		"\u00ac\3\2\2\2\u026a\u026b\4\62;\2\u026b\u00ae\3\2\2\2\r\2\u00d7\u00de"+
		"\u00e4\u00e6\u023f\u0248\u0251\u025e\u0260\u0266\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}