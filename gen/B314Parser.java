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
		SCALAR=18, ARRAY=19, DECLARE=20, RETAIN=21, BY=22, DEFAULT=23, LOCAL=24, 
		DO=25, DONE=26, IF=27, THEN=28, ELSE=29, WHILE=30, SET=31, TO=32, AS=33, 
		COMPUTE=34, NEXT=35, SQUARE=36, FUNCTION=37, RETURN=38, NOT=39, ENNEMI=40, 
		IS=41, GRAAL=42, NORTH=43, SOUTH=44, EAST=45, WEST=46, NEARBY=47, DIRT=48, 
		ROCK=49, VINES=50, ZOMBIE=51, PLAYER=52, AMMO=53, MAP=54, RADIO=55, FRUITS=56, 
		SODA=57, MOVE=58, SHOOT=59, USE=60, NOTHING=61, COUNT=62, LIFE=63, LATITUDE=64, 
		LONGITUDE=65, GRID=66, SIZE=67, WHEN=68, YOUR=69, TURN=70, IMPORT=71, 
		SKIPINS=72, BOOLEAN=73, INTEGER=74, INT=75, TRUE=76, FALSE=77, VOID=78, 
		COMMENT=79, NEWLINE=80, WS=81, FILEDECL=82, ID=83, NUMBER=84;
	public static final int
		RULE_root = 0, RULE_programme = 1, RULE_clauseDefault = 2, RULE_varDecl = 3, 
		RULE_fctDecl = 4, RULE_type = 5, RULE_instruction = 6, RULE_exprD = 7, 
		RULE_exprCase = 8, RULE_exprG = 9, RULE_action = 10, RULE_impDecl = 11, 
		RULE_clauseWhen = 12;
	public static final String[] ruleNames = {
		"root", "programme", "clauseDefault", "varDecl", "fctDecl", "type", "instruction", 
		"exprD", "exprCase", "exprG", "action", "impDecl", "clauseWhen"
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
			setState(26);
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
			setState(28);
			match(DECLARE);
			setState(29);
			match(AND);
			setState(30);
			match(RETAIN);
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				{
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					setState(35);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(31);
						varDecl();
						setState(32);
						match(SEMICOLON);
						}
						break;
					case 2:
						{
						setState(34);
						fctDecl();
						}
						break;
					}
					}
					setState(39);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 27)) & ~0x3f) == 0 && ((1L << (_la - 27)) & ((1L << (IF - 27)) | (1L << (WHILE - 27)) | (1L << (SET - 27)) | (1L << (COMPUTE - 27)) | (1L << (NEXT - 27)) | (1L << (SKIPINS - 27)))) != 0)) {
					{
					{
					setState(40);
					instruction();
					}
					}
					setState(45);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case 2:
				{
				{
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IMPORT || _la==ID) {
					{
					setState(51);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						setState(46);
						varDecl();
						setState(47);
						match(SEMICOLON);
						}
						break;
					case 2:
						{
						setState(49);
						fctDecl();
						}
						break;
					case 3:
						{
						setState(50);
						impDecl();
						}
						break;
					}
					}
					setState(55);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(56);
				match(WHEN);
				setState(57);
				match(YOUR);
				setState(58);
				match(TURN);
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHEN) {
					{
					{
					setState(59);
					clauseWhen();
					}
					}
					setState(64);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			}
			setState(67);
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
			setState(69);
			match(BY);
			setState(70);
			match(DEFAULT);
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DECLARE) {
				{
				setState(71);
				match(DECLARE);
				setState(72);
				match(LOCAL);
				setState(76); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(73);
					varDecl();
					setState(74);
					match(SEMICOLON);
					}
					}
					setState(78); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				}
			}

			setState(82);
			match(DO);
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 27)) & ~0x3f) == 0 && ((1L << (_la - 27)) & ((1L << (IF - 27)) | (1L << (WHILE - 27)) | (1L << (SET - 27)) | (1L << (COMPUTE - 27)) | (1L << (NEXT - 27)) | (1L << (SKIPINS - 27)))) != 0)) {
				{
				{
				setState(83);
				instruction();
				}
				}
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(89);
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
			setState(91);
			match(ID);
			setState(92);
			match(AS);
			setState(93);
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
		public TerminalNode SCALAR() { return getToken(B314Parser.SCALAR, 0); }
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
			setState(95);
			match(ID);
			setState(96);
			match(AS);
			setState(97);
			match(FUNCTION);
			setState(98);
			match(LPAR);
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(99);
				varDecl();
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(100);
					match(COMMA);
					setState(101);
					varDecl();
					}
					}
					setState(106);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(109);
			match(RPAR);
			setState(110);
			match(COLON);
			setState(111);
			_la = _input.LA(1);
			if ( !(_la==SCALAR || _la==VOID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DECLARE) {
				{
				setState(112);
				match(DECLARE);
				setState(113);
				match(LOCAL);
				setState(117); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(114);
					varDecl();
					setState(115);
					match(SEMICOLON);
					}
					}
					setState(119); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				}
			}

			setState(123);
			match(DO);
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 27)) & ~0x3f) == 0 && ((1L << (_la - 27)) & ((1L << (IF - 27)) | (1L << (WHILE - 27)) | (1L << (SET - 27)) | (1L << (COMPUTE - 27)) | (1L << (NEXT - 27)) | (1L << (SKIPINS - 27)))) != 0)) {
				{
				{
				setState(124);
				instruction();
				}
				}
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(130);
			match(RETURN);
			setState(131);
			match(ID);
			setState(132);
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
		public TerminalNode SCALAR() { return getToken(B314Parser.SCALAR, 0); }
		public TerminalNode ARRAY() { return getToken(B314Parser.ARRAY, 0); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			_la = _input.LA(1);
			if ( !(_la==SCALAR || _la==ARRAY) ) {
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
		enterRule(_localctx, 12, RULE_instruction);
		int _la;
		try {
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				match(SKIPINS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				match(IF);
				setState(138);
				exprD(0);
				setState(139);
				match(THEN);
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 27)) & ~0x3f) == 0 && ((1L << (_la - 27)) & ((1L << (IF - 27)) | (1L << (WHILE - 27)) | (1L << (SET - 27)) | (1L << (COMPUTE - 27)) | (1L << (NEXT - 27)) | (1L << (SKIPINS - 27)))) != 0)) {
					{
					{
					setState(140);
					instruction();
					}
					}
					setState(145);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(146);
				match(DONE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(148);
				match(IF);
				setState(149);
				exprD(0);
				setState(150);
				match(THEN);
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 27)) & ~0x3f) == 0 && ((1L << (_la - 27)) & ((1L << (IF - 27)) | (1L << (WHILE - 27)) | (1L << (SET - 27)) | (1L << (COMPUTE - 27)) | (1L << (NEXT - 27)) | (1L << (SKIPINS - 27)))) != 0)) {
					{
					{
					setState(151);
					instruction();
					}
					}
					setState(156);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(157);
				match(ELSE);
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 27)) & ~0x3f) == 0 && ((1L << (_la - 27)) & ((1L << (IF - 27)) | (1L << (WHILE - 27)) | (1L << (SET - 27)) | (1L << (COMPUTE - 27)) | (1L << (NEXT - 27)) | (1L << (SKIPINS - 27)))) != 0)) {
					{
					{
					setState(158);
					instruction();
					}
					}
					setState(163);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(164);
				match(DONE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(166);
				match(WHILE);
				setState(167);
				exprD(0);
				setState(168);
				match(DO);
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 27)) & ~0x3f) == 0 && ((1L << (_la - 27)) & ((1L << (IF - 27)) | (1L << (WHILE - 27)) | (1L << (SET - 27)) | (1L << (COMPUTE - 27)) | (1L << (NEXT - 27)) | (1L << (SKIPINS - 27)))) != 0)) {
					{
					{
					setState(169);
					instruction();
					}
					}
					setState(174);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(175);
				match(DONE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(177);
				match(SET);
				setState(178);
				exprG();
				setState(179);
				match(TO);
				setState(180);
				exprD(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(182);
				match(COMPUTE);
				setState(183);
				exprD(0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(184);
				match(NEXT);
				setState(185);
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
		public TerminalNode AND() { return getToken(B314Parser.AND, 0); }
		public TerminalNode OR() { return getToken(B314Parser.OR, 0); }
		public TerminalNode SMALLER() { return getToken(B314Parser.SMALLER, 0); }
		public TerminalNode BIGGER() { return getToken(B314Parser.BIGGER, 0); }
		public TerminalNode EQUAL() { return getToken(B314Parser.EQUAL, 0); }
		public TerminalNode PLUS() { return getToken(B314Parser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(B314Parser.MINUS, 0); }
		public TerminalNode MULT() { return getToken(B314Parser.MULT, 0); }
		public TerminalNode DIV() { return getToken(B314Parser.DIV, 0); }
		public TerminalNode MODULO() { return getToken(B314Parser.MODULO, 0); }
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
		return exprD(0);
	}

	private ExprDContext exprD(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprDContext _localctx = new ExprDContext(_ctx, _parentState);
		ExprDContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_exprD, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(189);
				exprCase();
				}
				break;
			case 2:
				{
				setState(190);
				exprG();
				}
				break;
			case 3:
				{
				setState(191);
				match(ID);
				setState(192);
				match(LPAR);
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << NOT) | (1L << ENNEMI) | (1L << GRAAL) | (1L << NEARBY) | (1L << DIRT) | (1L << ROCK) | (1L << VINES) | (1L << ZOMBIE) | (1L << PLAYER) | (1L << AMMO) | (1L << MAP) | (1L << RADIO) | (1L << FRUITS) | (1L << SODA) | (1L << LIFE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LATITUDE - 64)) | (1L << (LONGITUDE - 64)) | (1L << (GRID - 64)) | (1L << (INT - 64)) | (1L << (TRUE - 64)) | (1L << (FALSE - 64)) | (1L << (ID - 64)))) != 0)) {
					{
					setState(193);
					exprD(0);
					setState(198);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(194);
						match(COMMA);
						setState(195);
						exprD(0);
						}
						}
						setState(200);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(203);
				match(RPAR);
				}
				break;
			case 4:
				{
				setState(204);
				match(LPAR);
				setState(205);
				exprD(0);
				setState(206);
				match(RPAR);
				}
				break;
			case 5:
				{
				setState(208);
				match(TRUE);
				}
				break;
			case 6:
				{
				setState(209);
				match(FALSE);
				}
				break;
			case 7:
				{
				setState(210);
				_la = _input.LA(1);
				if ( !(_la==ENNEMI || _la==GRAAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(211);
				match(IS);
				setState(212);
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
			case 8:
				{
				setState(213);
				match(NOT);
				setState(214);
				exprD(8);
				}
				break;
			case 9:
				{
				setState(215);
				match(INT);
				}
				break;
			case 10:
				{
				setState(216);
				match(LATITUDE);
				}
				break;
			case 11:
				{
				setState(217);
				match(LONGITUDE);
				}
				break;
			case 12:
				{
				setState(218);
				match(GRID);
				setState(219);
				match(SIZE);
				}
				break;
			case 13:
				{
				setState(220);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AMMO) | (1L << MAP) | (1L << RADIO) | (1L << FRUITS) | (1L << SODA))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(221);
				match(COUNT);
				}
				break;
			case 14:
				{
				setState(222);
				match(LIFE);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(233);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(231);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new ExprDContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprD);
						setState(225);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(226);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << SMALLER) | (1L << BIGGER) | (1L << AND) | (1L << OR))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(227);
						exprD(10);
						}
						break;
					case 2:
						{
						_localctx = new ExprDContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprD);
						setState(228);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(229);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MULT) | (1L << DIV) | (1L << MODULO))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(230);
						exprD(2);
						}
						break;
					}
					} 
				}
				setState(235);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
		enterRule(_localctx, 16, RULE_exprCase);
		try {
			setState(255);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIRT:
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				match(DIRT);
				}
				break;
			case ROCK:
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
				match(ROCK);
				}
				break;
			case VINES:
				enterOuterAlt(_localctx, 3);
				{
				setState(238);
				match(VINES);
				}
				break;
			case ZOMBIE:
				enterOuterAlt(_localctx, 4);
				{
				setState(239);
				match(ZOMBIE);
				}
				break;
			case PLAYER:
				enterOuterAlt(_localctx, 5);
				{
				setState(240);
				match(PLAYER);
				}
				break;
			case ENNEMI:
				enterOuterAlt(_localctx, 6);
				{
				setState(241);
				match(ENNEMI);
				}
				break;
			case MAP:
				enterOuterAlt(_localctx, 7);
				{
				setState(242);
				match(MAP);
				}
				break;
			case RADIO:
				enterOuterAlt(_localctx, 8);
				{
				setState(243);
				match(RADIO);
				}
				break;
			case AMMO:
				enterOuterAlt(_localctx, 9);
				{
				setState(244);
				match(AMMO);
				}
				break;
			case FRUITS:
				enterOuterAlt(_localctx, 10);
				{
				setState(245);
				match(FRUITS);
				}
				break;
			case SODA:
				enterOuterAlt(_localctx, 11);
				{
				setState(246);
				match(SODA);
				}
				break;
			case GRAAL:
				enterOuterAlt(_localctx, 12);
				{
				setState(247);
				match(GRAAL);
				}
				break;
			case NEARBY:
				enterOuterAlt(_localctx, 13);
				{
				setState(248);
				match(NEARBY);
				setState(249);
				match(LBRA);
				setState(250);
				exprD(0);
				setState(251);
				match(COMMA);
				setState(252);
				exprD(0);
				setState(253);
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
		enterRule(_localctx, 18, RULE_exprG);
		int _la;
		try {
			setState(267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(257);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(258);
				match(ID);
				setState(259);
				match(LBRA);
				setState(260);
				exprD(0);
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(261);
					match(COMMA);
					setState(262);
					exprD(0);
					}
				}

				setState(265);
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
		enterRule(_localctx, 20, RULE_action);
		int _la;
		try {
			setState(277);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MOVE:
				enterOuterAlt(_localctx, 1);
				{
				setState(269);
				match(MOVE);
				setState(270);
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
				setState(271);
				match(SHOOT);
				setState(272);
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
				setState(273);
				match(USE);
				setState(274);
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
				setState(275);
				match(DO);
				setState(276);
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
		enterRule(_localctx, 22, RULE_impDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(IMPORT);
			setState(280);
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
		enterRule(_localctx, 24, RULE_clauseWhen);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(WHEN);
			setState(283);
			exprD(0);
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DECLARE) {
				{
				setState(284);
				match(DECLARE);
				setState(285);
				match(LOCAL);
				setState(289); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(286);
					varDecl();
					setState(287);
					match(SEMICOLON);
					}
					}
					setState(291); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				}
			}

			setState(295);
			match(DO);
			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 27)) & ~0x3f) == 0 && ((1L << (_la - 27)) & ((1L << (IF - 27)) | (1L << (WHILE - 27)) | (1L << (SET - 27)) | (1L << (COMPUTE - 27)) | (1L << (NEXT - 27)) | (1L << (SKIPINS - 27)))) != 0)) {
				{
				{
				setState(296);
				instruction();
				}
				}
				setState(301);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(302);
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
		case 7:
			return exprD_sempred((ExprDContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exprD_sempred(ExprDContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3V\u0133\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3"+
		"&\n\3\f\3\16\3)\13\3\3\3\7\3,\n\3\f\3\16\3/\13\3\3\3\3\3\3\3\3\3\3\3\7"+
		"\3\66\n\3\f\3\16\39\13\3\3\3\3\3\3\3\3\3\7\3?\n\3\f\3\16\3B\13\3\5\3D"+
		"\n\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\6\4O\n\4\r\4\16\4P\5\4S\n\4\3"+
		"\4\3\4\7\4W\n\4\f\4\16\4Z\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\7\6i\n\6\f\6\16\6l\13\6\5\6n\n\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\6\6x\n\6\r\6\16\6y\5\6|\n\6\3\6\3\6\7\6\u0080\n\6\f\6\16\6\u0083"+
		"\13\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\7\b\u0090\n\b\f\b\16"+
		"\b\u0093\13\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u009b\n\b\f\b\16\b\u009e\13"+
		"\b\3\b\3\b\7\b\u00a2\n\b\f\b\16\b\u00a5\13\b\3\b\3\b\3\b\3\b\3\b\3\b\7"+
		"\b\u00ad\n\b\f\b\16\b\u00b0\13\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\5\b\u00bd\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00c7\n\t\f\t"+
		"\16\t\u00ca\13\t\5\t\u00cc\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00e2\n\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\7\t\u00ea\n\t\f\t\16\t\u00ed\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0102\n\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\5\13\u010a\n\13\3\13\3\13\5\13\u010e\n\13\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0118\n\f\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\6\16\u0124\n\16\r\16\16\16\u0125\5\16\u0128\n\16"+
		"\3\16\3\16\7\16\u012c\n\16\f\16\16\16\u012f\13\16\3\16\3\16\3\16\2\3\20"+
		"\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\n\4\2\24\24PP\3\2\24\25\4\2**,"+
		",\3\2-\60\3\2\67;\3\2\17\23\3\2\6\n\3\28;\2\u0164\2\34\3\2\2\2\4\36\3"+
		"\2\2\2\6G\3\2\2\2\b]\3\2\2\2\na\3\2\2\2\f\u0088\3\2\2\2\16\u00bc\3\2\2"+
		"\2\20\u00e1\3\2\2\2\22\u0101\3\2\2\2\24\u010d\3\2\2\2\26\u0117\3\2\2\2"+
		"\30\u0119\3\2\2\2\32\u011c\3\2\2\2\34\35\7U\2\2\35\3\3\2\2\2\36\37\7\26"+
		"\2\2\37 \7\22\2\2 C\7\27\2\2!\"\5\b\5\2\"#\7\13\2\2#&\3\2\2\2$&\5\n\6"+
		"\2%!\3\2\2\2%$\3\2\2\2&)\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(-\3\2\2\2)\'\3"+
		"\2\2\2*,\5\16\b\2+*\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.D\3\2\2\2/-"+
		"\3\2\2\2\60\61\5\b\5\2\61\62\7\13\2\2\62\66\3\2\2\2\63\66\5\n\6\2\64\66"+
		"\5\30\r\2\65\60\3\2\2\2\65\63\3\2\2\2\65\64\3\2\2\2\669\3\2\2\2\67\65"+
		"\3\2\2\2\678\3\2\2\28:\3\2\2\29\67\3\2\2\2:;\7F\2\2;<\7G\2\2<@\7H\2\2"+
		"=?\5\32\16\2>=\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2AD\3\2\2\2B@\3\2\2"+
		"\2C\'\3\2\2\2C\67\3\2\2\2DE\3\2\2\2EF\5\6\4\2F\5\3\2\2\2GH\7\30\2\2HR"+
		"\7\31\2\2IJ\7\26\2\2JN\7\32\2\2KL\5\b\5\2LM\7\13\2\2MO\3\2\2\2NK\3\2\2"+
		"\2OP\3\2\2\2PN\3\2\2\2PQ\3\2\2\2QS\3\2\2\2RI\3\2\2\2RS\3\2\2\2ST\3\2\2"+
		"\2TX\7\33\2\2UW\5\16\b\2VU\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y[\3\2"+
		"\2\2ZX\3\2\2\2[\\\7\34\2\2\\\7\3\2\2\2]^\7U\2\2^_\7#\2\2_`\5\f\7\2`\t"+
		"\3\2\2\2ab\7U\2\2bc\7#\2\2cd\7\'\2\2dm\7\3\2\2ej\5\b\5\2fg\7\5\2\2gi\5"+
		"\b\5\2hf\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2kn\3\2\2\2lj\3\2\2\2me\3"+
		"\2\2\2mn\3\2\2\2no\3\2\2\2op\7\4\2\2pq\7\f\2\2q{\t\2\2\2rs\7\26\2\2sw"+
		"\7\32\2\2tu\5\b\5\2uv\7\13\2\2vx\3\2\2\2wt\3\2\2\2xy\3\2\2\2yw\3\2\2\2"+
		"yz\3\2\2\2z|\3\2\2\2{r\3\2\2\2{|\3\2\2\2|}\3\2\2\2}\u0081\7\33\2\2~\u0080"+
		"\5\16\b\2\177~\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082"+
		"\3\2\2\2\u0082\u0084\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0085\7(\2\2\u0085"+
		"\u0086\7U\2\2\u0086\u0087\7\34\2\2\u0087\13\3\2\2\2\u0088\u0089\t\3\2"+
		"\2\u0089\r\3\2\2\2\u008a\u00bd\7J\2\2\u008b\u008c\7\35\2\2\u008c\u008d"+
		"\5\20\t\2\u008d\u0091\7\36\2\2\u008e\u0090\5\16\b\2\u008f\u008e\3\2\2"+
		"\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0094"+
		"\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0095\7\34\2\2\u0095\u00bd\3\2\2\2"+
		"\u0096\u0097\7\35\2\2\u0097\u0098\5\20\t\2\u0098\u009c\7\36\2\2\u0099"+
		"\u009b\5\16\b\2\u009a\u0099\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3"+
		"\2\2\2\u009c\u009d\3\2\2\2\u009d\u009f\3\2\2\2\u009e\u009c\3\2\2\2\u009f"+
		"\u00a3\7\37\2\2\u00a0\u00a2\5\16\b\2\u00a1\u00a0\3\2\2\2\u00a2\u00a5\3"+
		"\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a6\3\2\2\2\u00a5"+
		"\u00a3\3\2\2\2\u00a6\u00a7\7\34\2\2\u00a7\u00bd\3\2\2\2\u00a8\u00a9\7"+
		" \2\2\u00a9\u00aa\5\20\t\2\u00aa\u00ae\7\33\2\2\u00ab\u00ad\5\16\b\2\u00ac"+
		"\u00ab\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2"+
		"\2\2\u00af\u00b1\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b2\7\34\2\2\u00b2"+
		"\u00bd\3\2\2\2\u00b3\u00b4\7!\2\2\u00b4\u00b5\5\24\13\2\u00b5\u00b6\7"+
		"\"\2\2\u00b6\u00b7\5\20\t\2\u00b7\u00bd\3\2\2\2\u00b8\u00b9\7$\2\2\u00b9"+
		"\u00bd\5\20\t\2\u00ba\u00bb\7%\2\2\u00bb\u00bd\5\26\f\2\u00bc\u008a\3"+
		"\2\2\2\u00bc\u008b\3\2\2\2\u00bc\u0096\3\2\2\2\u00bc\u00a8\3\2\2\2\u00bc"+
		"\u00b3\3\2\2\2\u00bc\u00b8\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\17\3\2\2"+
		"\2\u00be\u00bf\b\t\1\2\u00bf\u00e2\5\22\n\2\u00c0\u00e2\5\24\13\2\u00c1"+
		"\u00c2\7U\2\2\u00c2\u00cb\7\3\2\2\u00c3\u00c8\5\20\t\2\u00c4\u00c5\7\5"+
		"\2\2\u00c5\u00c7\5\20\t\2\u00c6\u00c4\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8"+
		"\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2"+
		"\2\2\u00cb\u00c3\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd"+
		"\u00e2\7\4\2\2\u00ce\u00cf\7\3\2\2\u00cf\u00d0\5\20\t\2\u00d0\u00d1\7"+
		"\4\2\2\u00d1\u00e2\3\2\2\2\u00d2\u00e2\7N\2\2\u00d3\u00e2\7O\2\2\u00d4"+
		"\u00d5\t\4\2\2\u00d5\u00d6\7+\2\2\u00d6\u00e2\t\5\2\2\u00d7\u00d8\7)\2"+
		"\2\u00d8\u00e2\5\20\t\n\u00d9\u00e2\7M\2\2\u00da\u00e2\7B\2\2\u00db\u00e2"+
		"\7C\2\2\u00dc\u00dd\7D\2\2\u00dd\u00e2\7E\2\2\u00de\u00df\t\6\2\2\u00df"+
		"\u00e2\7@\2\2\u00e0\u00e2\7A\2\2\u00e1\u00be\3\2\2\2\u00e1\u00c0\3\2\2"+
		"\2\u00e1\u00c1\3\2\2\2\u00e1\u00ce\3\2\2\2\u00e1\u00d2\3\2\2\2\u00e1\u00d3"+
		"\3\2\2\2\u00e1\u00d4\3\2\2\2\u00e1\u00d7\3\2\2\2\u00e1\u00d9\3\2\2\2\u00e1"+
		"\u00da\3\2\2\2\u00e1\u00db\3\2\2\2\u00e1\u00dc\3\2\2\2\u00e1\u00de\3\2"+
		"\2\2\u00e1\u00e0\3\2\2\2\u00e2\u00eb\3\2\2\2\u00e3\u00e4\f\13\2\2\u00e4"+
		"\u00e5\t\7\2\2\u00e5\u00ea\5\20\t\f\u00e6\u00e7\f\3\2\2\u00e7\u00e8\t"+
		"\b\2\2\u00e8\u00ea\5\20\t\4\u00e9\u00e3\3\2\2\2\u00e9\u00e6\3\2\2\2\u00ea"+
		"\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\21\3\2\2"+
		"\2\u00ed\u00eb\3\2\2\2\u00ee\u0102\7\62\2\2\u00ef\u0102\7\63\2\2\u00f0"+
		"\u0102\7\64\2\2\u00f1\u0102\7\65\2\2\u00f2\u0102\7\66\2\2\u00f3\u0102"+
		"\7*\2\2\u00f4\u0102\78\2\2\u00f5\u0102\79\2\2\u00f6\u0102\7\67\2\2\u00f7"+
		"\u0102\7:\2\2\u00f8\u0102\7;\2\2\u00f9\u0102\7,\2\2\u00fa\u00fb\7\61\2"+
		"\2\u00fb\u00fc\7\r\2\2\u00fc\u00fd\5\20\t\2\u00fd\u00fe\7\5\2\2\u00fe"+
		"\u00ff\5\20\t\2\u00ff\u0100\7\16\2\2\u0100\u0102\3\2\2\2\u0101\u00ee\3"+
		"\2\2\2\u0101\u00ef\3\2\2\2\u0101\u00f0\3\2\2\2\u0101\u00f1\3\2\2\2\u0101"+
		"\u00f2\3\2\2\2\u0101\u00f3\3\2\2\2\u0101\u00f4\3\2\2\2\u0101\u00f5\3\2"+
		"\2\2\u0101\u00f6\3\2\2\2\u0101\u00f7\3\2\2\2\u0101\u00f8\3\2\2\2\u0101"+
		"\u00f9\3\2\2\2\u0101\u00fa\3\2\2\2\u0102\23\3\2\2\2\u0103\u010e\7U\2\2"+
		"\u0104\u0105\7U\2\2\u0105\u0106\7\r\2\2\u0106\u0109\5\20\t\2\u0107\u0108"+
		"\7\5\2\2\u0108\u010a\5\20\t\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2\2\2"+
		"\u010a\u010b\3\2\2\2\u010b\u010c\7\16\2\2\u010c\u010e\3\2\2\2\u010d\u0103"+
		"\3\2\2\2\u010d\u0104\3\2\2\2\u010e\25\3\2\2\2\u010f\u0110\7<\2\2\u0110"+
		"\u0118\t\5\2\2\u0111\u0112\7=\2\2\u0112\u0118\t\5\2\2\u0113\u0114\7>\2"+
		"\2\u0114\u0118\t\t\2\2\u0115\u0116\7\33\2\2\u0116\u0118\7?\2\2\u0117\u010f"+
		"\3\2\2\2\u0117\u0111\3\2\2\2\u0117\u0113\3\2\2\2\u0117\u0115\3\2\2\2\u0118"+
		"\27\3\2\2\2\u0119\u011a\7I\2\2\u011a\u011b\7T\2\2\u011b\31\3\2\2\2\u011c"+
		"\u011d\7F\2\2\u011d\u0127\5\20\t\2\u011e\u011f\7\26\2\2\u011f\u0123\7"+
		"\32\2\2\u0120\u0121\5\b\5\2\u0121\u0122\7\13\2\2\u0122\u0124\3\2\2\2\u0123"+
		"\u0120\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0126\3\2"+
		"\2\2\u0126\u0128\3\2\2\2\u0127\u011e\3\2\2\2\u0127\u0128\3\2\2\2\u0128"+
		"\u0129\3\2\2\2\u0129\u012d\7\33\2\2\u012a\u012c\5\16\b\2\u012b\u012a\3"+
		"\2\2\2\u012c\u012f\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e"+
		"\u0130\3\2\2\2\u012f\u012d\3\2\2\2\u0130\u0131\7\34\2\2\u0131\33\3\2\2"+
		"\2\"%\'-\65\67@CPRXjmy{\u0081\u0091\u009c\u00a3\u00ae\u00bc\u00c8\u00cb"+
		"\u00e1\u00e9\u00eb\u0101\u0109\u010d\u0117\u0125\u0127\u012d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}