// Generated from /home/users/100/tndao/Documents/M0/Q2/Compilers/Projet/1718_INFOB314_COMPILATEUR_GROUPE12/src/main/antlr4/be/unamur/info/b314/compiler/B314.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class B314Parser extends Parser {
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
	public static final int
		RULE_root = 0, RULE_programme = 1, RULE_clauseDefault = 2, RULE_varDecl = 3, 
		RULE_fctDecl = 4, RULE_type = 5, RULE_scalar = 6, RULE_array = 7, RULE_instruction = 8, 
		RULE_exprD = 9, RULE_exprBool = 10, RULE_exprEnt = 11, RULE_exprCase = 12, 
		RULE_exprG = 13, RULE_action = 14, RULE_impDecl = 15, RULE_clauseWhen = 16;
	public static final String[] ruleNames = {
		"root", "programme", "clauseDefault", "varDecl", "fctDecl", "type", "scalar", 
		"array", "instruction", "exprD", "exprBool", "exprEnt", "exprCase", "exprG", 
		"action", "impDecl", "clauseWhen"
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

	@Override
	public String getGrammarFileName() { return "B314.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public B314Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class RootContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(B314Parser.ID, 0); }
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitRoot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitRoot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
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

	public static class ProgrammeContext extends ParserRuleContext {
		public TerminalNode DECLARE() { return getToken(B314Parser.DECLARE, 0); }
		public TerminalNode AND() { return getToken(B314Parser.AND, 0); }
		public TerminalNode RETAIN() { return getToken(B314Parser.RETAIN, 0); }
		public ClauseDefaultContext clauseDefault() {
			return getRuleContext(ClauseDefaultContext.class,0);
		}
		public TerminalNode WHEN() { return getToken(B314Parser.WHEN, 0); }
		public TerminalNode YOUR() { return getToken(B314Parser.YOUR, 0); }
		public TerminalNode TURN() { return getToken(B314Parser.TURN, 0); }
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(B314Parser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(B314Parser.SEMICOLON, i);
		}
		public List<FctDeclContext> fctDecl() {
			return getRuleContexts(FctDeclContext.class);
		}
		public FctDeclContext fctDecl(int i) {
			return getRuleContext(FctDeclContext.class,i);
		}
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public List<ImpDeclContext> impDecl() {
			return getRuleContexts(ImpDeclContext.class);
		}
		public ImpDeclContext impDecl(int i) {
			return getRuleContext(ImpDeclContext.class,i);
		}
		public List<ClauseWhenContext> clauseWhen() {
			return getRuleContexts(ClauseWhenContext.class);
		}
		public ClauseWhenContext clauseWhen(int i) {
			return getRuleContext(ClauseWhenContext.class,i);
		}
		public ProgrammeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programme; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterProgramme(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitProgramme(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitProgramme(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgrammeContext programme() throws RecognitionException {
		ProgrammeContext _localctx = new ProgrammeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_programme);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(DECLARE);
			setState(37);
			match(AND);
			setState(38);
			match(RETAIN);
			setState(73);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				{
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					setState(43);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(39);
						varDecl();
						setState(40);
						match(SEMICOLON);
						}
						break;
					case 2:
						{
						setState(42);
						fctDecl();
						}
						break;
					}
					}
					setState(47);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & ((1L << (IF - 25)) | (1L << (WHILE - 25)) | (1L << (SET - 25)) | (1L << (COMPUTE - 25)) | (1L << (NEXT - 25)) | (1L << (SKIPINS - 25)))) != 0)) {
					{
					{
					setState(48);
					instruction();
					}
					}
					setState(53);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case 2:
				{
				{
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IMPORT || _la==ID) {
					{
					setState(59);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						setState(54);
						varDecl();
						setState(55);
						match(SEMICOLON);
						}
						break;
					case 2:
						{
						setState(57);
						fctDecl();
						}
						break;
					case 3:
						{
						setState(58);
						impDecl();
						}
						break;
					}
					}
					setState(63);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(64);
				match(WHEN);
				setState(65);
				match(YOUR);
				setState(66);
				match(TURN);
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHEN) {
					{
					{
					setState(67);
					clauseWhen();
					}
					}
					setState(72);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			}
			setState(75);
			clauseDefault();
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

	public static class ClauseDefaultContext extends ParserRuleContext {
		public TerminalNode BY() { return getToken(B314Parser.BY, 0); }
		public TerminalNode DEFAULT() { return getToken(B314Parser.DEFAULT, 0); }
		public TerminalNode DO() { return getToken(B314Parser.DO, 0); }
		public TerminalNode DONE() { return getToken(B314Parser.DONE, 0); }
		public TerminalNode DECLARE() { return getToken(B314Parser.DECLARE, 0); }
		public TerminalNode LOCAL() { return getToken(B314Parser.LOCAL, 0); }
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(B314Parser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(B314Parser.SEMICOLON, i);
		}
		public ClauseDefaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clauseDefault; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterClauseDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitClauseDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitClauseDefault(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClauseDefaultContext clauseDefault() throws RecognitionException {
		ClauseDefaultContext _localctx = new ClauseDefaultContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_clauseDefault);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(BY);
			setState(78);
			match(DEFAULT);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DECLARE) {
				{
				setState(79);
				match(DECLARE);
				setState(80);
				match(LOCAL);
				setState(84); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(81);
					varDecl();
					setState(82);
					match(SEMICOLON);
					}
					}
					setState(86); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				}
			}

			setState(90);
			match(DO);
			setState(92); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(91);
				instruction();
				}
				}
				setState(94); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & ((1L << (IF - 25)) | (1L << (WHILE - 25)) | (1L << (SET - 25)) | (1L << (COMPUTE - 25)) | (1L << (NEXT - 25)) | (1L << (SKIPINS - 25)))) != 0) );
			setState(96);
			match(DONE);
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

	public static class VarDeclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(B314Parser.ID, 0); }
		public TerminalNode AS() { return getToken(B314Parser.AS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitVarDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(ID);
			setState(99);
			match(AS);
			setState(100);
			type();
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

	public static class FctDeclContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(B314Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(B314Parser.ID, i);
		}
		public TerminalNode AS() { return getToken(B314Parser.AS, 0); }
		public TerminalNode FUNCTION() { return getToken(B314Parser.FUNCTION, 0); }
		public TerminalNode LPAR() { return getToken(B314Parser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(B314Parser.RPAR, 0); }
		public TerminalNode COLON() { return getToken(B314Parser.COLON, 0); }
		public TerminalNode DO() { return getToken(B314Parser.DO, 0); }
		public TerminalNode RETURN() { return getToken(B314Parser.RETURN, 0); }
		public TerminalNode DONE() { return getToken(B314Parser.DONE, 0); }
		public ScalarContext scalar() {
			return getRuleContext(ScalarContext.class,0);
		}
		public TerminalNode VOID() { return getToken(B314Parser.VOID, 0); }
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public TerminalNode DECLARE() { return getToken(B314Parser.DECLARE, 0); }
		public TerminalNode LOCAL() { return getToken(B314Parser.LOCAL, 0); }
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(B314Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(B314Parser.COMMA, i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(B314Parser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(B314Parser.SEMICOLON, i);
		}
		public FctDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fctDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterFctDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitFctDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitFctDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FctDeclContext fctDecl() throws RecognitionException {
		FctDeclContext _localctx = new FctDeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_fctDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(ID);
			setState(103);
			match(AS);
			setState(104);
			match(FUNCTION);
			setState(105);
			match(LPAR);
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(106);
				varDecl();
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(107);
					match(COMMA);
					setState(108);
					varDecl();
					}
					}
					setState(113);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(116);
			match(RPAR);
			setState(117);
			match(COLON);
			setState(120);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SQUARE:
			case BOOLEAN:
			case INTEGER:
				{
				setState(118);
				scalar();
				}
				break;
			case VOID:
				{
				setState(119);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DECLARE) {
				{
				setState(122);
				match(DECLARE);
				setState(123);
				match(LOCAL);
				setState(127); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(124);
					varDecl();
					setState(125);
					match(SEMICOLON);
					}
					}
					setState(129); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				}
			}

			setState(133);
			match(DO);
			setState(135); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(134);
				instruction();
				}
				}
				setState(137); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & ((1L << (IF - 25)) | (1L << (WHILE - 25)) | (1L << (SET - 25)) | (1L << (COMPUTE - 25)) | (1L << (NEXT - 25)) | (1L << (SKIPINS - 25)))) != 0) );
			setState(139);
			match(RETURN);
			setState(140);
			match(ID);
			setState(141);
			match(DONE);
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
		public ScalarContext scalar() {
			return getRuleContext(ScalarContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_type);
		try {
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				scalar();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				array();
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

	public static class ScalarContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(B314Parser.BOOLEAN, 0); }
		public TerminalNode INTEGER() { return getToken(B314Parser.INTEGER, 0); }
		public TerminalNode SQUARE() { return getToken(B314Parser.SQUARE, 0); }
		public ScalarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scalar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterScalar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitScalar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitScalar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScalarContext scalar() throws RecognitionException {
		ScalarContext _localctx = new ScalarContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_scalar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			_la = _input.LA(1);
			if ( !(((((_la - 34)) & ~0x3f) == 0 && ((1L << (_la - 34)) & ((1L << (SQUARE - 34)) | (1L << (BOOLEAN - 34)) | (1L << (INTEGER - 34)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class ArrayContext extends ParserRuleContext {
		public ScalarContext scalar() {
			return getRuleContext(ScalarContext.class,0);
		}
		public TerminalNode LBRA() { return getToken(B314Parser.LBRA, 0); }
		public List<TerminalNode> INT() { return getTokens(B314Parser.INT); }
		public TerminalNode INT(int i) {
			return getToken(B314Parser.INT, i);
		}
		public TerminalNode RBRA() { return getToken(B314Parser.RBRA, 0); }
		public TerminalNode COMMA() { return getToken(B314Parser.COMMA, 0); }
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			scalar();
			setState(150);
			match(LBRA);
			setState(151);
			match(INT);
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(152);
				match(COMMA);
				setState(153);
				match(INT);
				}
			}

			setState(156);
			match(RBRA);
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

	public static class InstructionContext extends ParserRuleContext {
		public TerminalNode SKIPINS() { return getToken(B314Parser.SKIPINS, 0); }
		public TerminalNode IF() { return getToken(B314Parser.IF, 0); }
		public ExprDContext exprD() {
			return getRuleContext(ExprDContext.class,0);
		}
		public TerminalNode THEN() { return getToken(B314Parser.THEN, 0); }
		public TerminalNode DONE() { return getToken(B314Parser.DONE, 0); }
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(B314Parser.ELSE, 0); }
		public TerminalNode WHILE() { return getToken(B314Parser.WHILE, 0); }
		public TerminalNode DO() { return getToken(B314Parser.DO, 0); }
		public TerminalNode SET() { return getToken(B314Parser.SET, 0); }
		public ExprGContext exprG() {
			return getRuleContext(ExprGContext.class,0);
		}
		public TerminalNode TO() { return getToken(B314Parser.TO, 0); }
		public TerminalNode COMPUTE() { return getToken(B314Parser.COMPUTE, 0); }
		public TerminalNode NEXT() { return getToken(B314Parser.NEXT, 0); }
		public ActionContext action() {
			return getRuleContext(ActionContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitInstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_instruction);
		int _la;
		try {
			setState(204);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				match(SKIPINS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				match(IF);
				setState(160);
				exprD();
				setState(161);
				match(THEN);
				setState(163); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(162);
					instruction();
					}
					}
					setState(165); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & ((1L << (IF - 25)) | (1L << (WHILE - 25)) | (1L << (SET - 25)) | (1L << (COMPUTE - 25)) | (1L << (NEXT - 25)) | (1L << (SKIPINS - 25)))) != 0) );
				setState(167);
				match(DONE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(169);
				match(IF);
				setState(170);
				exprD();
				setState(171);
				match(THEN);
				setState(173); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(172);
					instruction();
					}
					}
					setState(175); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & ((1L << (IF - 25)) | (1L << (WHILE - 25)) | (1L << (SET - 25)) | (1L << (COMPUTE - 25)) | (1L << (NEXT - 25)) | (1L << (SKIPINS - 25)))) != 0) );
				setState(177);
				match(ELSE);
				setState(179); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(178);
					instruction();
					}
					}
					setState(181); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & ((1L << (IF - 25)) | (1L << (WHILE - 25)) | (1L << (SET - 25)) | (1L << (COMPUTE - 25)) | (1L << (NEXT - 25)) | (1L << (SKIPINS - 25)))) != 0) );
				setState(183);
				match(DONE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(185);
				match(WHILE);
				setState(186);
				exprD();
				setState(187);
				match(DO);
				setState(189); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(188);
					instruction();
					}
					}
					setState(191); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & ((1L << (IF - 25)) | (1L << (WHILE - 25)) | (1L << (SET - 25)) | (1L << (COMPUTE - 25)) | (1L << (NEXT - 25)) | (1L << (SKIPINS - 25)))) != 0) );
				setState(193);
				match(DONE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(195);
				match(SET);
				setState(196);
				exprG();
				setState(197);
				match(TO);
				setState(198);
				exprD();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(200);
				match(COMPUTE);
				setState(201);
				exprD();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(202);
				match(NEXT);
				setState(203);
				action();
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

	public static class ExprDContext extends ParserRuleContext {
		public ExprBoolContext exprBool() {
			return getRuleContext(ExprBoolContext.class,0);
		}
		public ExprCaseContext exprCase() {
			return getRuleContext(ExprCaseContext.class,0);
		}
		public ExprGContext exprG() {
			return getRuleContext(ExprGContext.class,0);
		}
		public TerminalNode ID() { return getToken(B314Parser.ID, 0); }
		public TerminalNode LPAR() { return getToken(B314Parser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(B314Parser.RPAR, 0); }
		public List<ExprDContext> exprD() {
			return getRuleContexts(ExprDContext.class);
		}
		public ExprDContext exprD(int i) {
			return getRuleContext(ExprDContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(B314Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(B314Parser.COMMA, i);
		}
		public ExprEntContext exprEnt() {
			return getRuleContext(ExprEntContext.class,0);
		}
		public ExprDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprD; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterExprD(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitExprD(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitExprD(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprDContext exprD() throws RecognitionException {
		ExprDContext _localctx = new ExprDContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_exprD);
		int _la;
		try {
			setState(227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				exprBool(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
				exprCase();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(208);
				exprG();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(209);
				match(ID);
				setState(210);
				match(LPAR);
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << NOT) | (1L << ENNEMI) | (1L << GRAAL) | (1L << NEARBY) | (1L << DIRT) | (1L << ROCK) | (1L << VINES) | (1L << ZOMBIE) | (1L << PLAYER) | (1L << AMMO) | (1L << MAP) | (1L << RADIO) | (1L << FRUITS) | (1L << SODA) | (1L << LIFE) | (1L << LATITUDE) | (1L << LONGITUDE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (GRID - 64)) | (1L << (INT - 64)) | (1L << (TRUE - 64)) | (1L << (FALSE - 64)) | (1L << (ID - 64)))) != 0)) {
					{
					setState(211);
					exprD();
					setState(216);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(212);
						match(COMMA);
						setState(213);
						exprD();
						}
						}
						setState(218);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(221);
				match(RPAR);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(222);
				match(LPAR);
				setState(223);
				exprD();
				setState(224);
				match(RPAR);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(226);
				exprEnt(0);
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

	public static class ExprBoolContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(B314Parser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(B314Parser.FALSE, 0); }
		public TerminalNode IS() { return getToken(B314Parser.IS, 0); }
		public TerminalNode ENNEMI() { return getToken(B314Parser.ENNEMI, 0); }
		public TerminalNode GRAAL() { return getToken(B314Parser.GRAAL, 0); }
		public TerminalNode NORTH() { return getToken(B314Parser.NORTH, 0); }
		public TerminalNode SOUTH() { return getToken(B314Parser.SOUTH, 0); }
		public TerminalNode EAST() { return getToken(B314Parser.EAST, 0); }
		public TerminalNode WEST() { return getToken(B314Parser.WEST, 0); }
		public TerminalNode NOT() { return getToken(B314Parser.NOT, 0); }
		public List<ExprBoolContext> exprBool() {
			return getRuleContexts(ExprBoolContext.class);
		}
		public ExprBoolContext exprBool(int i) {
			return getRuleContext(ExprBoolContext.class,i);
		}
		public List<ExprEntContext> exprEnt() {
			return getRuleContexts(ExprEntContext.class);
		}
		public ExprEntContext exprEnt(int i) {
			return getRuleContext(ExprEntContext.class,i);
		}
		public TerminalNode SMALLER() { return getToken(B314Parser.SMALLER, 0); }
		public TerminalNode BIGGER() { return getToken(B314Parser.BIGGER, 0); }
		public TerminalNode EQUAL() { return getToken(B314Parser.EQUAL, 0); }
		public List<ExprCaseContext> exprCase() {
			return getRuleContexts(ExprCaseContext.class);
		}
		public ExprCaseContext exprCase(int i) {
			return getRuleContext(ExprCaseContext.class,i);
		}
		public TerminalNode AND() { return getToken(B314Parser.AND, 0); }
		public TerminalNode OR() { return getToken(B314Parser.OR, 0); }
		public ExprBoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprBool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterExprBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitExprBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitExprBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprBoolContext exprBool() throws RecognitionException {
		return exprBool(0);
	}

	private ExprBoolContext exprBool(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprBoolContext _localctx = new ExprBoolContext(_ctx, _parentState);
		ExprBoolContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_exprBool, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(230);
				match(TRUE);
				}
				break;
			case 2:
				{
				setState(231);
				match(FALSE);
				}
				break;
			case 3:
				{
				setState(232);
				_la = _input.LA(1);
				if ( !(_la==ENNEMI || _la==GRAAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(233);
				match(IS);
				setState(234);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NORTH) | (1L << SOUTH) | (1L << EAST) | (1L << WEST))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 4:
				{
				setState(235);
				match(NOT);
				setState(236);
				exprBool(3);
				}
				break;
			case 5:
				{
				setState(237);
				exprEnt(0);
				setState(238);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << SMALLER) | (1L << BIGGER))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(239);
				exprEnt(0);
				}
				break;
			case 6:
				{
				setState(241);
				exprCase();
				setState(242);
				match(EQUAL);
				setState(243);
				exprCase();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(252);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprBoolContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exprBool);
					setState(247);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(248);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << AND) | (1L << OR))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(249);
					exprBool(5);
					}
					} 
				}
				setState(254);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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

	public static class ExprEntContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(B314Parser.INT, 0); }
		public TerminalNode LATITUDE() { return getToken(B314Parser.LATITUDE, 0); }
		public TerminalNode LONGITUDE() { return getToken(B314Parser.LONGITUDE, 0); }
		public TerminalNode GRID() { return getToken(B314Parser.GRID, 0); }
		public TerminalNode SIZE() { return getToken(B314Parser.SIZE, 0); }
		public TerminalNode COUNT() { return getToken(B314Parser.COUNT, 0); }
		public TerminalNode MAP() { return getToken(B314Parser.MAP, 0); }
		public TerminalNode RADIO() { return getToken(B314Parser.RADIO, 0); }
		public TerminalNode AMMO() { return getToken(B314Parser.AMMO, 0); }
		public TerminalNode FRUITS() { return getToken(B314Parser.FRUITS, 0); }
		public TerminalNode SODA() { return getToken(B314Parser.SODA, 0); }
		public TerminalNode LIFE() { return getToken(B314Parser.LIFE, 0); }
		public List<ExprEntContext> exprEnt() {
			return getRuleContexts(ExprEntContext.class);
		}
		public ExprEntContext exprEnt(int i) {
			return getRuleContext(ExprEntContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(B314Parser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(B314Parser.MINUS, 0); }
		public TerminalNode MULT() { return getToken(B314Parser.MULT, 0); }
		public TerminalNode DIV() { return getToken(B314Parser.DIV, 0); }
		public TerminalNode MODULO() { return getToken(B314Parser.MODULO, 0); }
		public ExprEntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprEnt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterExprEnt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitExprEnt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitExprEnt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprEntContext exprEnt() throws RecognitionException {
		return exprEnt(0);
	}

	private ExprEntContext exprEnt(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprEntContext _localctx = new ExprEntContext(_ctx, _parentState);
		ExprEntContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_exprEnt, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(256);
				match(INT);
				}
				break;
			case LATITUDE:
				{
				setState(257);
				match(LATITUDE);
				}
				break;
			case LONGITUDE:
				{
				setState(258);
				match(LONGITUDE);
				}
				break;
			case GRID:
				{
				setState(259);
				match(GRID);
				setState(260);
				match(SIZE);
				}
				break;
			case AMMO:
			case MAP:
			case RADIO:
			case FRUITS:
			case SODA:
				{
				setState(261);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AMMO) | (1L << MAP) | (1L << RADIO) | (1L << FRUITS) | (1L << SODA))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(262);
				match(COUNT);
				}
				break;
			case LIFE:
				{
				setState(263);
				match(LIFE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(271);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprEntContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exprEnt);
					setState(266);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(267);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MULT) | (1L << DIV) | (1L << MODULO))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(268);
					exprEnt(2);
					}
					} 
				}
				setState(273);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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

	public static class ExprCaseContext extends ParserRuleContext {
		public TerminalNode DIRT() { return getToken(B314Parser.DIRT, 0); }
		public TerminalNode ROCK() { return getToken(B314Parser.ROCK, 0); }
		public TerminalNode VINES() { return getToken(B314Parser.VINES, 0); }
		public TerminalNode ZOMBIE() { return getToken(B314Parser.ZOMBIE, 0); }
		public TerminalNode PLAYER() { return getToken(B314Parser.PLAYER, 0); }
		public TerminalNode ENNEMI() { return getToken(B314Parser.ENNEMI, 0); }
		public TerminalNode MAP() { return getToken(B314Parser.MAP, 0); }
		public TerminalNode RADIO() { return getToken(B314Parser.RADIO, 0); }
		public TerminalNode AMMO() { return getToken(B314Parser.AMMO, 0); }
		public TerminalNode FRUITS() { return getToken(B314Parser.FRUITS, 0); }
		public TerminalNode SODA() { return getToken(B314Parser.SODA, 0); }
		public TerminalNode GRAAL() { return getToken(B314Parser.GRAAL, 0); }
		public TerminalNode NEARBY() { return getToken(B314Parser.NEARBY, 0); }
		public TerminalNode LBRA() { return getToken(B314Parser.LBRA, 0); }
		public List<ExprDContext> exprD() {
			return getRuleContexts(ExprDContext.class);
		}
		public ExprDContext exprD(int i) {
			return getRuleContext(ExprDContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(B314Parser.COMMA, 0); }
		public TerminalNode RBRA() { return getToken(B314Parser.RBRA, 0); }
		public ExprCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterExprCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitExprCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitExprCase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprCaseContext exprCase() throws RecognitionException {
		ExprCaseContext _localctx = new ExprCaseContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_exprCase);
		try {
			setState(293);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIRT:
				enterOuterAlt(_localctx, 1);
				{
				setState(274);
				match(DIRT);
				}
				break;
			case ROCK:
				enterOuterAlt(_localctx, 2);
				{
				setState(275);
				match(ROCK);
				}
				break;
			case VINES:
				enterOuterAlt(_localctx, 3);
				{
				setState(276);
				match(VINES);
				}
				break;
			case ZOMBIE:
				enterOuterAlt(_localctx, 4);
				{
				setState(277);
				match(ZOMBIE);
				}
				break;
			case PLAYER:
				enterOuterAlt(_localctx, 5);
				{
				setState(278);
				match(PLAYER);
				}
				break;
			case ENNEMI:
				enterOuterAlt(_localctx, 6);
				{
				setState(279);
				match(ENNEMI);
				}
				break;
			case MAP:
				enterOuterAlt(_localctx, 7);
				{
				setState(280);
				match(MAP);
				}
				break;
			case RADIO:
				enterOuterAlt(_localctx, 8);
				{
				setState(281);
				match(RADIO);
				}
				break;
			case AMMO:
				enterOuterAlt(_localctx, 9);
				{
				setState(282);
				match(AMMO);
				}
				break;
			case FRUITS:
				enterOuterAlt(_localctx, 10);
				{
				setState(283);
				match(FRUITS);
				}
				break;
			case SODA:
				enterOuterAlt(_localctx, 11);
				{
				setState(284);
				match(SODA);
				}
				break;
			case GRAAL:
				enterOuterAlt(_localctx, 12);
				{
				setState(285);
				match(GRAAL);
				}
				break;
			case NEARBY:
				enterOuterAlt(_localctx, 13);
				{
				setState(286);
				match(NEARBY);
				setState(287);
				match(LBRA);
				setState(288);
				exprD();
				setState(289);
				match(COMMA);
				setState(290);
				exprD();
				setState(291);
				match(RBRA);
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

	public static class ExprGContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(B314Parser.ID, 0); }
		public TerminalNode LBRA() { return getToken(B314Parser.LBRA, 0); }
		public List<ExprDContext> exprD() {
			return getRuleContexts(ExprDContext.class);
		}
		public ExprDContext exprD(int i) {
			return getRuleContext(ExprDContext.class,i);
		}
		public TerminalNode RBRA() { return getToken(B314Parser.RBRA, 0); }
		public TerminalNode COMMA() { return getToken(B314Parser.COMMA, 0); }
		public ExprGContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprG; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterExprG(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitExprG(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitExprG(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprGContext exprG() throws RecognitionException {
		ExprGContext _localctx = new ExprGContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_exprG);
		int _la;
		try {
			setState(305);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(295);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(296);
				match(ID);
				setState(297);
				match(LBRA);
				setState(298);
				exprD();
				setState(301);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(299);
					match(COMMA);
					setState(300);
					exprD();
					}
				}

				setState(303);
				match(RBRA);
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

	public static class ActionContext extends ParserRuleContext {
		public TerminalNode MOVE() { return getToken(B314Parser.MOVE, 0); }
		public TerminalNode NORTH() { return getToken(B314Parser.NORTH, 0); }
		public TerminalNode SOUTH() { return getToken(B314Parser.SOUTH, 0); }
		public TerminalNode EAST() { return getToken(B314Parser.EAST, 0); }
		public TerminalNode WEST() { return getToken(B314Parser.WEST, 0); }
		public TerminalNode SHOOT() { return getToken(B314Parser.SHOOT, 0); }
		public TerminalNode USE() { return getToken(B314Parser.USE, 0); }
		public TerminalNode MAP() { return getToken(B314Parser.MAP, 0); }
		public TerminalNode RADIO() { return getToken(B314Parser.RADIO, 0); }
		public TerminalNode FRUITS() { return getToken(B314Parser.FRUITS, 0); }
		public TerminalNode SODA() { return getToken(B314Parser.SODA, 0); }
		public TerminalNode DO() { return getToken(B314Parser.DO, 0); }
		public TerminalNode NOTHING() { return getToken(B314Parser.NOTHING, 0); }
		public ActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_action);
		int _la;
		try {
			setState(315);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MOVE:
				enterOuterAlt(_localctx, 1);
				{
				setState(307);
				match(MOVE);
				setState(308);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NORTH) | (1L << SOUTH) | (1L << EAST) | (1L << WEST))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case SHOOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(309);
				match(SHOOT);
				setState(310);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NORTH) | (1L << SOUTH) | (1L << EAST) | (1L << WEST))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case USE:
				enterOuterAlt(_localctx, 3);
				{
				setState(311);
				match(USE);
				setState(312);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAP) | (1L << RADIO) | (1L << FRUITS) | (1L << SODA))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 4);
				{
				setState(313);
				match(DO);
				setState(314);
				match(NOTHING);
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

	public static class ImpDeclContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(B314Parser.IMPORT, 0); }
		public TerminalNode FILEDECL() { return getToken(B314Parser.FILEDECL, 0); }
		public ImpDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_impDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterImpDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitImpDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitImpDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImpDeclContext impDecl() throws RecognitionException {
		ImpDeclContext _localctx = new ImpDeclContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_impDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(IMPORT);
			setState(318);
			match(FILEDECL);
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

	public static class ClauseWhenContext extends ParserRuleContext {
		public TerminalNode WHEN() { return getToken(B314Parser.WHEN, 0); }
		public ExprDContext exprD() {
			return getRuleContext(ExprDContext.class,0);
		}
		public TerminalNode DO() { return getToken(B314Parser.DO, 0); }
		public TerminalNode DONE() { return getToken(B314Parser.DONE, 0); }
		public TerminalNode DECLARE() { return getToken(B314Parser.DECLARE, 0); }
		public TerminalNode LOCAL() { return getToken(B314Parser.LOCAL, 0); }
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(B314Parser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(B314Parser.SEMICOLON, i);
		}
		public ClauseWhenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clauseWhen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterClauseWhen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitClauseWhen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitClauseWhen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClauseWhenContext clauseWhen() throws RecognitionException {
		ClauseWhenContext _localctx = new ClauseWhenContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_clauseWhen);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			match(WHEN);
			setState(321);
			exprD();
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DECLARE) {
				{
				setState(322);
				match(DECLARE);
				setState(323);
				match(LOCAL);
				setState(327); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(324);
					varDecl();
					setState(325);
					match(SEMICOLON);
					}
					}
					setState(329); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				}
			}

			setState(333);
			match(DO);
			setState(335); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(334);
				instruction();
				}
				}
				setState(337); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & ((1L << (IF - 25)) | (1L << (WHILE - 25)) | (1L << (SET - 25)) | (1L << (COMPUTE - 25)) | (1L << (NEXT - 25)) | (1L << (SKIPINS - 25)))) != 0) );
			setState(339);
			match(DONE);
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
		case 10:
			return exprBool_sempred((ExprBoolContext)_localctx, predIndex);
		case 11:
			return exprEnt_sempred((ExprEntContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exprBool_sempred(ExprBoolContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean exprEnt_sempred(ExprEntContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3S\u0158\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3.\n\3\f\3\16\3\61\13\3\3\3\7\3"+
		"\64\n\3\f\3\16\3\67\13\3\3\3\3\3\3\3\3\3\3\3\7\3>\n\3\f\3\16\3A\13\3\3"+
		"\3\3\3\3\3\3\3\7\3G\n\3\f\3\16\3J\13\3\5\3L\n\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\6\4W\n\4\r\4\16\4X\5\4[\n\4\3\4\3\4\6\4_\n\4\r\4\16\4`"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6p\n\6\f\6\16\6"+
		"s\13\6\5\6u\n\6\3\6\3\6\3\6\3\6\5\6{\n\6\3\6\3\6\3\6\3\6\3\6\6\6\u0082"+
		"\n\6\r\6\16\6\u0083\5\6\u0086\n\6\3\6\3\6\6\6\u008a\n\6\r\6\16\6\u008b"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\5\7\u0094\n\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\5\t"+
		"\u009d\n\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\6\n\u00a6\n\n\r\n\16\n\u00a7\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\6\n\u00b0\n\n\r\n\16\n\u00b1\3\n\3\n\6\n\u00b6"+
		"\n\n\r\n\16\n\u00b7\3\n\3\n\3\n\3\n\3\n\3\n\6\n\u00c0\n\n\r\n\16\n\u00c1"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00cf\n\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\7\13\u00d9\n\13\f\13\16\13\u00dc\13\13\5"+
		"\13\u00de\n\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00e6\n\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00f8\n\f\3"+
		"\f\3\f\3\f\7\f\u00fd\n\f\f\f\16\f\u0100\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\5\r\u010b\n\r\3\r\3\r\3\r\7\r\u0110\n\r\f\r\16\r\u0113\13\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\5\16\u0128\n\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\5\17\u0130\n\17\3\17\3\17\5\17\u0134\n\17\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\5\20\u013e\n\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\6\22\u014a\n\22\r\22\16\22\u014b\5\22\u014e\n\22\3\22\3\22"+
		"\6\22\u0152\n\22\r\22\16\22\u0153\3\22\3\22\3\22\2\4\26\30\23\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"\2\n\4\2$$IJ\4\2((**\3\2+.\3\2\17\21"+
		"\4\2\17\17\22\23\3\2\659\3\2\6\n\3\2\669\2\u018a\2$\3\2\2\2\4&\3\2\2\2"+
		"\6O\3\2\2\2\bd\3\2\2\2\nh\3\2\2\2\f\u0093\3\2\2\2\16\u0095\3\2\2\2\20"+
		"\u0097\3\2\2\2\22\u00ce\3\2\2\2\24\u00e5\3\2\2\2\26\u00f7\3\2\2\2\30\u010a"+
		"\3\2\2\2\32\u0127\3\2\2\2\34\u0133\3\2\2\2\36\u013d\3\2\2\2 \u013f\3\2"+
		"\2\2\"\u0142\3\2\2\2$%\7S\2\2%\3\3\2\2\2&\'\7\24\2\2\'(\7\22\2\2(K\7\25"+
		"\2\2)*\5\b\5\2*+\7\13\2\2+.\3\2\2\2,.\5\n\6\2-)\3\2\2\2-,\3\2\2\2.\61"+
		"\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\65\3\2\2\2\61/\3\2\2\2\62\64\5\22\n"+
		"\2\63\62\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66L\3\2\2\2"+
		"\67\65\3\2\2\289\5\b\5\29:\7\13\2\2:>\3\2\2\2;>\5\n\6\2<>\5 \21\2=8\3"+
		"\2\2\2=;\3\2\2\2=<\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@B\3\2\2\2A?\3"+
		"\2\2\2BC\7D\2\2CD\7E\2\2DH\7F\2\2EG\5\"\22\2FE\3\2\2\2GJ\3\2\2\2HF\3\2"+
		"\2\2HI\3\2\2\2IL\3\2\2\2JH\3\2\2\2K/\3\2\2\2K?\3\2\2\2LM\3\2\2\2MN\5\6"+
		"\4\2N\5\3\2\2\2OP\7\26\2\2PZ\7\27\2\2QR\7\24\2\2RV\7\30\2\2ST\5\b\5\2"+
		"TU\7\13\2\2UW\3\2\2\2VS\3\2\2\2WX\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y[\3\2\2"+
		"\2ZQ\3\2\2\2Z[\3\2\2\2[\\\3\2\2\2\\^\7\31\2\2]_\5\22\n\2^]\3\2\2\2_`\3"+
		"\2\2\2`^\3\2\2\2`a\3\2\2\2ab\3\2\2\2bc\7\32\2\2c\7\3\2\2\2de\7S\2\2ef"+
		"\7!\2\2fg\5\f\7\2g\t\3\2\2\2hi\7S\2\2ij\7!\2\2jk\7%\2\2kt\7\3\2\2lq\5"+
		"\b\5\2mn\7\5\2\2np\5\b\5\2om\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2ru\3"+
		"\2\2\2sq\3\2\2\2tl\3\2\2\2tu\3\2\2\2uv\3\2\2\2vw\7\4\2\2wz\7\f\2\2x{\5"+
		"\16\b\2y{\7N\2\2zx\3\2\2\2zy\3\2\2\2{\u0085\3\2\2\2|}\7\24\2\2}\u0081"+
		"\7\30\2\2~\177\5\b\5\2\177\u0080\7\13\2\2\u0080\u0082\3\2\2\2\u0081~\3"+
		"\2\2\2\u0082\u0083\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084"+
		"\u0086\3\2\2\2\u0085|\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\3\2\2\2"+
		"\u0087\u0089\7\31\2\2\u0088\u008a\5\22\n\2\u0089\u0088\3\2\2\2\u008a\u008b"+
		"\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\3\2\2\2\u008d"+
		"\u008e\7&\2\2\u008e\u008f\7S\2\2\u008f\u0090\7\32\2\2\u0090\13\3\2\2\2"+
		"\u0091\u0094\5\16\b\2\u0092\u0094\5\20\t\2\u0093\u0091\3\2\2\2\u0093\u0092"+
		"\3\2\2\2\u0094\r\3\2\2\2\u0095\u0096\t\2\2\2\u0096\17\3\2\2\2\u0097\u0098"+
		"\5\16\b\2\u0098\u0099\7\r\2\2\u0099\u009c\7K\2\2\u009a\u009b\7\5\2\2\u009b"+
		"\u009d\7K\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\3\2"+
		"\2\2\u009e\u009f\7\16\2\2\u009f\21\3\2\2\2\u00a0\u00cf\7H\2\2\u00a1\u00a2"+
		"\7\33\2\2\u00a2\u00a3\5\24\13\2\u00a3\u00a5\7\34\2\2\u00a4\u00a6\5\22"+
		"\n\2\u00a5\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7"+
		"\u00a8\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\7\32\2\2\u00aa\u00cf\3"+
		"\2\2\2\u00ab\u00ac\7\33\2\2\u00ac\u00ad\5\24\13\2\u00ad\u00af\7\34\2\2"+
		"\u00ae\u00b0\5\22\n\2\u00af\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00af"+
		"\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b5\7\35\2\2"+
		"\u00b4\u00b6\5\22\n\2\u00b5\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b5"+
		"\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\7\32\2\2"+
		"\u00ba\u00cf\3\2\2\2\u00bb\u00bc\7\36\2\2\u00bc\u00bd\5\24\13\2\u00bd"+
		"\u00bf\7\31\2\2\u00be\u00c0\5\22\n\2\u00bf\u00be\3\2\2\2\u00c0\u00c1\3"+
		"\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3"+
		"\u00c4\7\32\2\2\u00c4\u00cf\3\2\2\2\u00c5\u00c6\7\37\2\2\u00c6\u00c7\5"+
		"\34\17\2\u00c7\u00c8\7 \2\2\u00c8\u00c9\5\24\13\2\u00c9\u00cf\3\2\2\2"+
		"\u00ca\u00cb\7\"\2\2\u00cb\u00cf\5\24\13\2\u00cc\u00cd\7#\2\2\u00cd\u00cf"+
		"\5\36\20\2\u00ce\u00a0\3\2\2\2\u00ce\u00a1\3\2\2\2\u00ce\u00ab\3\2\2\2"+
		"\u00ce\u00bb\3\2\2\2\u00ce\u00c5\3\2\2\2\u00ce\u00ca\3\2\2\2\u00ce\u00cc"+
		"\3\2\2\2\u00cf\23\3\2\2\2\u00d0\u00e6\5\26\f\2\u00d1\u00e6\5\32\16\2\u00d2"+
		"\u00e6\5\34\17\2\u00d3\u00d4\7S\2\2\u00d4\u00dd\7\3\2\2\u00d5\u00da\5"+
		"\24\13\2\u00d6\u00d7\7\5\2\2\u00d7\u00d9\5\24\13\2\u00d8\u00d6\3\2\2\2"+
		"\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00de"+
		"\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00d5\3\2\2\2\u00dd\u00de\3\2\2\2\u00de"+
		"\u00df\3\2\2\2\u00df\u00e6\7\4\2\2\u00e0\u00e1\7\3\2\2\u00e1\u00e2\5\24"+
		"\13\2\u00e2\u00e3\7\4\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e6\5\30\r\2\u00e5"+
		"\u00d0\3\2\2\2\u00e5\u00d1\3\2\2\2\u00e5\u00d2\3\2\2\2\u00e5\u00d3\3\2"+
		"\2\2\u00e5\u00e0\3\2\2\2\u00e5\u00e4\3\2\2\2\u00e6\25\3\2\2\2\u00e7\u00e8"+
		"\b\f\1\2\u00e8\u00f8\7L\2\2\u00e9\u00f8\7M\2\2\u00ea\u00eb\t\3\2\2\u00eb"+
		"\u00ec\7)\2\2\u00ec\u00f8\t\4\2\2\u00ed\u00ee\7\'\2\2\u00ee\u00f8\5\26"+
		"\f\5\u00ef\u00f0\5\30\r\2\u00f0\u00f1\t\5\2\2\u00f1\u00f2\5\30\r\2\u00f2"+
		"\u00f8\3\2\2\2\u00f3\u00f4\5\32\16\2\u00f4\u00f5\7\17\2\2\u00f5\u00f6"+
		"\5\32\16\2\u00f6\u00f8\3\2\2\2\u00f7\u00e7\3\2\2\2\u00f7\u00e9\3\2\2\2"+
		"\u00f7\u00ea\3\2\2\2\u00f7\u00ed\3\2\2\2\u00f7\u00ef\3\2\2\2\u00f7\u00f3"+
		"\3\2\2\2\u00f8\u00fe\3\2\2\2\u00f9\u00fa\f\6\2\2\u00fa\u00fb\t\6\2\2\u00fb"+
		"\u00fd\5\26\f\7\u00fc\u00f9\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc\3"+
		"\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\27\3\2\2\2\u0100\u00fe\3\2\2\2\u0101"+
		"\u0102\b\r\1\2\u0102\u010b\7K\2\2\u0103\u010b\7@\2\2\u0104\u010b\7A\2"+
		"\2\u0105\u0106\7B\2\2\u0106\u010b\7C\2\2\u0107\u0108\t\7\2\2\u0108\u010b"+
		"\7>\2\2\u0109\u010b\7?\2\2\u010a\u0101\3\2\2\2\u010a\u0103\3\2\2\2\u010a"+
		"\u0104\3\2\2\2\u010a\u0105\3\2\2\2\u010a\u0107\3\2\2\2\u010a\u0109\3\2"+
		"\2\2\u010b\u0111\3\2\2\2\u010c\u010d\f\3\2\2\u010d\u010e\t\b\2\2\u010e"+
		"\u0110\5\30\r\4\u010f\u010c\3\2\2\2\u0110\u0113\3\2\2\2\u0111\u010f\3"+
		"\2\2\2\u0111\u0112\3\2\2\2\u0112\31\3\2\2\2\u0113\u0111\3\2\2\2\u0114"+
		"\u0128\7\60\2\2\u0115\u0128\7\61\2\2\u0116\u0128\7\62\2\2\u0117\u0128"+
		"\7\63\2\2\u0118\u0128\7\64\2\2\u0119\u0128\7(\2\2\u011a\u0128\7\66\2\2"+
		"\u011b\u0128\7\67\2\2\u011c\u0128\7\65\2\2\u011d\u0128\78\2\2\u011e\u0128"+
		"\79\2\2\u011f\u0128\7*\2\2\u0120\u0121\7/\2\2\u0121\u0122\7\r\2\2\u0122"+
		"\u0123\5\24\13\2\u0123\u0124\7\5\2\2\u0124\u0125\5\24\13\2\u0125\u0126"+
		"\7\16\2\2\u0126\u0128\3\2\2\2\u0127\u0114\3\2\2\2\u0127\u0115\3\2\2\2"+
		"\u0127\u0116\3\2\2\2\u0127\u0117\3\2\2\2\u0127\u0118\3\2\2\2\u0127\u0119"+
		"\3\2\2\2\u0127\u011a\3\2\2\2\u0127\u011b\3\2\2\2\u0127\u011c\3\2\2\2\u0127"+
		"\u011d\3\2\2\2\u0127\u011e\3\2\2\2\u0127\u011f\3\2\2\2\u0127\u0120\3\2"+
		"\2\2\u0128\33\3\2\2\2\u0129\u0134\7S\2\2\u012a\u012b\7S\2\2\u012b\u012c"+
		"\7\r\2\2\u012c\u012f\5\24\13\2\u012d\u012e\7\5\2\2\u012e\u0130\5\24\13"+
		"\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0132"+
		"\7\16\2\2\u0132\u0134\3\2\2\2\u0133\u0129\3\2\2\2\u0133\u012a\3\2\2\2"+
		"\u0134\35\3\2\2\2\u0135\u0136\7:\2\2\u0136\u013e\t\4\2\2\u0137\u0138\7"+
		";\2\2\u0138\u013e\t\4\2\2\u0139\u013a\7<\2\2\u013a\u013e\t\t\2\2\u013b"+
		"\u013c\7\31\2\2\u013c\u013e\7=\2\2\u013d\u0135\3\2\2\2\u013d\u0137\3\2"+
		"\2\2\u013d\u0139\3\2\2\2\u013d\u013b\3\2\2\2\u013e\37\3\2\2\2\u013f\u0140"+
		"\7G\2\2\u0140\u0141\7R\2\2\u0141!\3\2\2\2\u0142\u0143\7D\2\2\u0143\u014d"+
		"\5\24\13\2\u0144\u0145\7\24\2\2\u0145\u0149\7\30\2\2\u0146\u0147\5\b\5"+
		"\2\u0147\u0148\7\13\2\2\u0148\u014a\3\2\2\2\u0149\u0146\3\2\2\2\u014a"+
		"\u014b\3\2\2\2\u014b\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014e\3\2"+
		"\2\2\u014d\u0144\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u014f\3\2\2\2\u014f"+
		"\u0151\7\31\2\2\u0150\u0152\5\22\n\2\u0151\u0150\3\2\2\2\u0152\u0153\3"+
		"\2\2\2\u0153\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0155\3\2\2\2\u0155"+
		"\u0156\7\32\2\2\u0156#\3\2\2\2\'-/\65=?HKXZ`qtz\u0083\u0085\u008b\u0093"+
		"\u009c\u00a7\u00b1\u00b7\u00c1\u00ce\u00da\u00dd\u00e5\u00f7\u00fe\u010a"+
		"\u0111\u0127\u012f\u0133\u013d\u014b\u014d\u0153";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}