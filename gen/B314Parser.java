// Generated from C:/Users/thibaut/IdeaProjects/b314-compiler/src/main/antlr4/be/unamur/info/b314/compiler\B314.g4 by ANTLR 4.7
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
		LONGITUDE=65, GRID=66, SIZE=67, BOOLEAN=68, INTEGER=69, INT=70, TRUE=71, 
		FALSE=72, VOID=73, COMMENT=74, NEWLINE=75, WS=76, ID=77, NUMBER=78;
	public static final int
		RULE_root = 0, RULE_programme = 1, RULE_clauseDefault = 2, RULE_varDecl = 3, 
		RULE_fctDecl = 4, RULE_type = 5, RULE_instruction = 6, RULE_exprD = 7, 
		RULE_exprCase = 8, RULE_exprG = 9, RULE_action = 10;
	public static final String[] ruleNames = {
		"root", "programme", "clauseDefault", "varDecl", "fctDecl", "type", "instruction", 
		"exprD", "exprCase", "exprG", "action"
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
			setState(22);
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
			setState(24);
			match(DECLARE);
			setState(25);
			match(AND);
			setState(26);
			match(RETAIN);
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				setState(31);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(27);
					varDecl();
					setState(28);
					match(SEMICOLON);
					}
					break;
				case 2:
					{
					setState(30);
					fctDecl();
					}
					break;
				}
				}
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << SET) | (1L << COMPUTE) | (1L << NEXT))) != 0)) {
				{
				{
				setState(36);
				instruction();
				}
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(42);
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
			setState(44);
			match(BY);
			setState(45);
			match(DEFAULT);
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DECLARE) {
				{
				setState(46);
				match(DECLARE);
				setState(47);
				match(LOCAL);
				setState(51); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(48);
					varDecl();
					setState(49);
					match(SEMICOLON);
					}
					}
					setState(53); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				}
			}

			setState(57);
			match(DO);
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << SET) | (1L << COMPUTE) | (1L << NEXT))) != 0)) {
				{
				{
				setState(58);
				instruction();
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(64);
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
			setState(66);
			match(ID);
			setState(67);
			match(AS);
			setState(68);
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
			setState(70);
			match(ID);
			setState(71);
			match(AS);
			setState(72);
			match(FUNCTION);
			setState(73);
			match(LPAR);
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(74);
				varDecl();
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(75);
					match(COMMA);
					setState(76);
					varDecl();
					}
					}
					setState(81);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(84);
			match(RPAR);
			setState(85);
			match(COLON);
			setState(86);
			_la = _input.LA(1);
			if ( !(_la==SCALAR || _la==VOID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DECLARE) {
				{
				setState(87);
				match(DECLARE);
				setState(88);
				match(LOCAL);
				setState(92); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(89);
					varDecl();
					setState(90);
					match(SEMICOLON);
					}
					}
					setState(94); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				}
			}

			setState(98);
			match(DO);
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << SET) | (1L << COMPUTE) | (1L << NEXT))) != 0)) {
				{
				{
				setState(99);
				instruction();
				}
				}
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(105);
			match(RETURN);
			setState(106);
			match(ID);
			setState(107);
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
			setState(109);
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
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				match(IF);
				setState(112);
				exprD(0);
				setState(113);
				match(THEN);
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << SET) | (1L << COMPUTE) | (1L << NEXT))) != 0)) {
					{
					{
					setState(114);
					instruction();
					}
					}
					setState(119);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(120);
				match(DONE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				match(IF);
				setState(123);
				exprD(0);
				setState(124);
				match(THEN);
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << SET) | (1L << COMPUTE) | (1L << NEXT))) != 0)) {
					{
					{
					setState(125);
					instruction();
					}
					}
					setState(130);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(131);
				match(ELSE);
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << SET) | (1L << COMPUTE) | (1L << NEXT))) != 0)) {
					{
					{
					setState(132);
					instruction();
					}
					}
					setState(137);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(138);
				match(DONE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(140);
				match(WHILE);
				setState(141);
				exprD(0);
				setState(142);
				match(DO);
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << SET) | (1L << COMPUTE) | (1L << NEXT))) != 0)) {
					{
					{
					setState(143);
					instruction();
					}
					}
					setState(148);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(149);
				match(DONE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(151);
				match(SET);
				setState(152);
				exprG();
				setState(153);
				match(TO);
				setState(154);
				exprD(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(156);
				match(COMPUTE);
				setState(157);
				exprD(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(158);
				match(NEXT);
				setState(159);
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
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(163);
				exprCase();
				}
				break;
			case 2:
				{
				setState(164);
				exprG();
				}
				break;
			case 3:
				{
				setState(165);
				match(ID);
				setState(166);
				match(LPAR);
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << NOT) | (1L << ENNEMI) | (1L << GRAAL) | (1L << NEARBY) | (1L << DIRT) | (1L << ROCK) | (1L << VINES) | (1L << ZOMBIE) | (1L << PLAYER) | (1L << AMMO) | (1L << MAP) | (1L << RADIO) | (1L << FRUITS) | (1L << SODA) | (1L << LIFE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LATITUDE - 64)) | (1L << (LONGITUDE - 64)) | (1L << (GRID - 64)) | (1L << (INT - 64)) | (1L << (TRUE - 64)) | (1L << (FALSE - 64)) | (1L << (ID - 64)))) != 0)) {
					{
					setState(167);
					exprD(0);
					setState(172);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(168);
						match(COMMA);
						setState(169);
						exprD(0);
						}
						}
						setState(174);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(177);
				match(RPAR);
				}
				break;
			case 4:
				{
				setState(178);
				match(LPAR);
				setState(179);
				exprD(0);
				setState(180);
				match(RPAR);
				}
				break;
			case 5:
				{
				setState(182);
				match(TRUE);
				}
				break;
			case 6:
				{
				setState(183);
				match(FALSE);
				}
				break;
			case 7:
				{
				setState(184);
				_la = _input.LA(1);
				if ( !(_la==ENNEMI || _la==GRAAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(185);
				match(IS);
				setState(186);
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
				setState(187);
				match(NOT);
				setState(188);
				exprD(8);
				}
				break;
			case 9:
				{
				setState(189);
				match(INT);
				}
				break;
			case 10:
				{
				setState(190);
				match(LATITUDE);
				}
				break;
			case 11:
				{
				setState(191);
				match(LONGITUDE);
				}
				break;
			case 12:
				{
				setState(192);
				match(GRID);
				setState(193);
				match(SIZE);
				}
				break;
			case 13:
				{
				setState(194);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AMMO) | (1L << MAP) | (1L << RADIO) | (1L << FRUITS) | (1L << SODA))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(195);
				match(COUNT);
				}
				break;
			case 14:
				{
				setState(196);
				match(LIFE);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(207);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(205);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new ExprDContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprD);
						setState(199);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(200);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << SMALLER) | (1L << BIGGER) | (1L << AND) | (1L << OR))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(201);
						exprD(10);
						}
						break;
					case 2:
						{
						_localctx = new ExprDContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprD);
						setState(202);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(203);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MULT) | (1L << DIV) | (1L << MODULO))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(204);
						exprD(2);
						}
						break;
					}
					} 
				}
				setState(209);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
			setState(229);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIRT:
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				match(DIRT);
				}
				break;
			case ROCK:
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				match(ROCK);
				}
				break;
			case VINES:
				enterOuterAlt(_localctx, 3);
				{
				setState(212);
				match(VINES);
				}
				break;
			case ZOMBIE:
				enterOuterAlt(_localctx, 4);
				{
				setState(213);
				match(ZOMBIE);
				}
				break;
			case PLAYER:
				enterOuterAlt(_localctx, 5);
				{
				setState(214);
				match(PLAYER);
				}
				break;
			case ENNEMI:
				enterOuterAlt(_localctx, 6);
				{
				setState(215);
				match(ENNEMI);
				}
				break;
			case MAP:
				enterOuterAlt(_localctx, 7);
				{
				setState(216);
				match(MAP);
				}
				break;
			case RADIO:
				enterOuterAlt(_localctx, 8);
				{
				setState(217);
				match(RADIO);
				}
				break;
			case AMMO:
				enterOuterAlt(_localctx, 9);
				{
				setState(218);
				match(AMMO);
				}
				break;
			case FRUITS:
				enterOuterAlt(_localctx, 10);
				{
				setState(219);
				match(FRUITS);
				}
				break;
			case SODA:
				enterOuterAlt(_localctx, 11);
				{
				setState(220);
				match(SODA);
				}
				break;
			case GRAAL:
				enterOuterAlt(_localctx, 12);
				{
				setState(221);
				match(GRAAL);
				}
				break;
			case NEARBY:
				enterOuterAlt(_localctx, 13);
				{
				setState(222);
				match(NEARBY);
				setState(223);
				match(LBRA);
				setState(224);
				exprD(0);
				setState(225);
				match(COMMA);
				setState(226);
				exprD(0);
				setState(227);
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
			setState(241);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(232);
				match(ID);
				setState(233);
				match(LBRA);
				setState(234);
				exprD(0);
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(235);
					match(COMMA);
					setState(236);
					exprD(0);
					}
				}

				setState(239);
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
			setState(251);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MOVE:
				enterOuterAlt(_localctx, 1);
				{
				setState(243);
				match(MOVE);
				setState(244);
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
				setState(245);
				match(SHOOT);
				setState(246);
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
				setState(247);
				match(USE);
				setState(248);
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
				setState(249);
				match(DO);
				setState(250);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3P\u0100\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\"\n\3\f\3\16\3%\13"+
		"\3\3\3\7\3(\n\3\f\3\16\3+\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\6\4"+
		"\66\n\4\r\4\16\4\67\5\4:\n\4\3\4\3\4\7\4>\n\4\f\4\16\4A\13\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6P\n\6\f\6\16\6S\13\6\5\6"+
		"U\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\6\6_\n\6\r\6\16\6`\5\6c\n\6\3\6"+
		"\3\6\7\6g\n\6\f\6\16\6j\13\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\7"+
		"\bv\n\b\f\b\16\by\13\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u0081\n\b\f\b\16\b"+
		"\u0084\13\b\3\b\3\b\7\b\u0088\n\b\f\b\16\b\u008b\13\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\7\b\u0093\n\b\f\b\16\b\u0096\13\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\5\b\u00a3\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00ad"+
		"\n\t\f\t\16\t\u00b0\13\t\5\t\u00b2\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00c8\n\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\7\t\u00d0\n\t\f\t\16\t\u00d3\13\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00e8\n\n"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00f0\n\13\3\13\3\13\5\13\u00f4\n"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00fe\n\f\3\f\2\3\20\r\2\4\6\b"+
		"\n\f\16\20\22\24\26\2\n\4\2\24\24KK\3\2\24\25\4\2**,,\3\2-\60\3\2\67;"+
		"\3\2\17\23\3\2\6\n\3\28;\2\u012a\2\30\3\2\2\2\4\32\3\2\2\2\6.\3\2\2\2"+
		"\bD\3\2\2\2\nH\3\2\2\2\fo\3\2\2\2\16\u00a2\3\2\2\2\20\u00c7\3\2\2\2\22"+
		"\u00e7\3\2\2\2\24\u00f3\3\2\2\2\26\u00fd\3\2\2\2\30\31\7O\2\2\31\3\3\2"+
		"\2\2\32\33\7\26\2\2\33\34\7\22\2\2\34#\7\27\2\2\35\36\5\b\5\2\36\37\7"+
		"\13\2\2\37\"\3\2\2\2 \"\5\n\6\2!\35\3\2\2\2! \3\2\2\2\"%\3\2\2\2#!\3\2"+
		"\2\2#$\3\2\2\2$)\3\2\2\2%#\3\2\2\2&(\5\16\b\2\'&\3\2\2\2(+\3\2\2\2)\'"+
		"\3\2\2\2)*\3\2\2\2*,\3\2\2\2+)\3\2\2\2,-\5\6\4\2-\5\3\2\2\2./\7\30\2\2"+
		"/9\7\31\2\2\60\61\7\26\2\2\61\65\7\32\2\2\62\63\5\b\5\2\63\64\7\13\2\2"+
		"\64\66\3\2\2\2\65\62\3\2\2\2\66\67\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28"+
		":\3\2\2\29\60\3\2\2\29:\3\2\2\2:;\3\2\2\2;?\7\33\2\2<>\5\16\b\2=<\3\2"+
		"\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@B\3\2\2\2A?\3\2\2\2BC\7\34\2\2C\7\3"+
		"\2\2\2DE\7O\2\2EF\7#\2\2FG\5\f\7\2G\t\3\2\2\2HI\7O\2\2IJ\7#\2\2JK\7\'"+
		"\2\2KT\7\3\2\2LQ\5\b\5\2MN\7\5\2\2NP\5\b\5\2OM\3\2\2\2PS\3\2\2\2QO\3\2"+
		"\2\2QR\3\2\2\2RU\3\2\2\2SQ\3\2\2\2TL\3\2\2\2TU\3\2\2\2UV\3\2\2\2VW\7\4"+
		"\2\2WX\7\f\2\2Xb\t\2\2\2YZ\7\26\2\2Z^\7\32\2\2[\\\5\b\5\2\\]\7\13\2\2"+
		"]_\3\2\2\2^[\3\2\2\2_`\3\2\2\2`^\3\2\2\2`a\3\2\2\2ac\3\2\2\2bY\3\2\2\2"+
		"bc\3\2\2\2cd\3\2\2\2dh\7\33\2\2eg\5\16\b\2fe\3\2\2\2gj\3\2\2\2hf\3\2\2"+
		"\2hi\3\2\2\2ik\3\2\2\2jh\3\2\2\2kl\7(\2\2lm\7O\2\2mn\7\34\2\2n\13\3\2"+
		"\2\2op\t\3\2\2p\r\3\2\2\2qr\7\35\2\2rs\5\20\t\2sw\7\36\2\2tv\5\16\b\2"+
		"ut\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2xz\3\2\2\2yw\3\2\2\2z{\7\34\2"+
		"\2{\u00a3\3\2\2\2|}\7\35\2\2}~\5\20\t\2~\u0082\7\36\2\2\177\u0081\5\16"+
		"\b\2\u0080\177\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083"+
		"\3\2\2\2\u0083\u0085\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u0089\7\37\2\2"+
		"\u0086\u0088\5\16\b\2\u0087\u0086\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087"+
		"\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008c\3\2\2\2\u008b\u0089\3\2\2\2\u008c"+
		"\u008d\7\34\2\2\u008d\u00a3\3\2\2\2\u008e\u008f\7 \2\2\u008f\u0090\5\20"+
		"\t\2\u0090\u0094\7\33\2\2\u0091\u0093\5\16\b\2\u0092\u0091\3\2\2\2\u0093"+
		"\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0097\3\2"+
		"\2\2\u0096\u0094\3\2\2\2\u0097\u0098\7\34\2\2\u0098\u00a3\3\2\2\2\u0099"+
		"\u009a\7!\2\2\u009a\u009b\5\24\13\2\u009b\u009c\7\"\2\2\u009c\u009d\5"+
		"\20\t\2\u009d\u00a3\3\2\2\2\u009e\u009f\7$\2\2\u009f\u00a3\5\20\t\2\u00a0"+
		"\u00a1\7%\2\2\u00a1\u00a3\5\26\f\2\u00a2q\3\2\2\2\u00a2|\3\2\2\2\u00a2"+
		"\u008e\3\2\2\2\u00a2\u0099\3\2\2\2\u00a2\u009e\3\2\2\2\u00a2\u00a0\3\2"+
		"\2\2\u00a3\17\3\2\2\2\u00a4\u00a5\b\t\1\2\u00a5\u00c8\5\22\n\2\u00a6\u00c8"+
		"\5\24\13\2\u00a7\u00a8\7O\2\2\u00a8\u00b1\7\3\2\2\u00a9\u00ae\5\20\t\2"+
		"\u00aa\u00ab\7\5\2\2\u00ab\u00ad\5\20\t\2\u00ac\u00aa\3\2\2\2\u00ad\u00b0"+
		"\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0"+
		"\u00ae\3\2\2\2\u00b1\u00a9\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\3\2"+
		"\2\2\u00b3\u00c8\7\4\2\2\u00b4\u00b5\7\3\2\2\u00b5\u00b6\5\20\t\2\u00b6"+
		"\u00b7\7\4\2\2\u00b7\u00c8\3\2\2\2\u00b8\u00c8\7I\2\2\u00b9\u00c8\7J\2"+
		"\2\u00ba\u00bb\t\4\2\2\u00bb\u00bc\7+\2\2\u00bc\u00c8\t\5\2\2\u00bd\u00be"+
		"\7)\2\2\u00be\u00c8\5\20\t\n\u00bf\u00c8\7H\2\2\u00c0\u00c8\7B\2\2\u00c1"+
		"\u00c8\7C\2\2\u00c2\u00c3\7D\2\2\u00c3\u00c8\7E\2\2\u00c4\u00c5\t\6\2"+
		"\2\u00c5\u00c8\7@\2\2\u00c6\u00c8\7A\2\2\u00c7\u00a4\3\2\2\2\u00c7\u00a6"+
		"\3\2\2\2\u00c7\u00a7\3\2\2\2\u00c7\u00b4\3\2\2\2\u00c7\u00b8\3\2\2\2\u00c7"+
		"\u00b9\3\2\2\2\u00c7\u00ba\3\2\2\2\u00c7\u00bd\3\2\2\2\u00c7\u00bf\3\2"+
		"\2\2\u00c7\u00c0\3\2\2\2\u00c7\u00c1\3\2\2\2\u00c7\u00c2\3\2\2\2\u00c7"+
		"\u00c4\3\2\2\2\u00c7\u00c6\3\2\2\2\u00c8\u00d1\3\2\2\2\u00c9\u00ca\f\13"+
		"\2\2\u00ca\u00cb\t\7\2\2\u00cb\u00d0\5\20\t\f\u00cc\u00cd\f\3\2\2\u00cd"+
		"\u00ce\t\b\2\2\u00ce\u00d0\5\20\t\4\u00cf\u00c9\3\2\2\2\u00cf\u00cc\3"+
		"\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2"+
		"\21\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00e8\7\62\2\2\u00d5\u00e8\7\63"+
		"\2\2\u00d6\u00e8\7\64\2\2\u00d7\u00e8\7\65\2\2\u00d8\u00e8\7\66\2\2\u00d9"+
		"\u00e8\7*\2\2\u00da\u00e8\78\2\2\u00db\u00e8\79\2\2\u00dc\u00e8\7\67\2"+
		"\2\u00dd\u00e8\7:\2\2\u00de\u00e8\7;\2\2\u00df\u00e8\7,\2\2\u00e0\u00e1"+
		"\7\61\2\2\u00e1\u00e2\7\r\2\2\u00e2\u00e3\5\20\t\2\u00e3\u00e4\7\5\2\2"+
		"\u00e4\u00e5\5\20\t\2\u00e5\u00e6\7\16\2\2\u00e6\u00e8\3\2\2\2\u00e7\u00d4"+
		"\3\2\2\2\u00e7\u00d5\3\2\2\2\u00e7\u00d6\3\2\2\2\u00e7\u00d7\3\2\2\2\u00e7"+
		"\u00d8\3\2\2\2\u00e7\u00d9\3\2\2\2\u00e7\u00da\3\2\2\2\u00e7\u00db\3\2"+
		"\2\2\u00e7\u00dc\3\2\2\2\u00e7\u00dd\3\2\2\2\u00e7\u00de\3\2\2\2\u00e7"+
		"\u00df\3\2\2\2\u00e7\u00e0\3\2\2\2\u00e8\23\3\2\2\2\u00e9\u00f4\7O\2\2"+
		"\u00ea\u00eb\7O\2\2\u00eb\u00ec\7\r\2\2\u00ec\u00ef\5\20\t\2\u00ed\u00ee"+
		"\7\5\2\2\u00ee\u00f0\5\20\t\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2"+
		"\u00f0\u00f1\3\2\2\2\u00f1\u00f2\7\16\2\2\u00f2\u00f4\3\2\2\2\u00f3\u00e9"+
		"\3\2\2\2\u00f3\u00ea\3\2\2\2\u00f4\25\3\2\2\2\u00f5\u00f6\7<\2\2\u00f6"+
		"\u00fe\t\5\2\2\u00f7\u00f8\7=\2\2\u00f8\u00fe\t\5\2\2\u00f9\u00fa\7>\2"+
		"\2\u00fa\u00fe\t\t\2\2\u00fb\u00fc\7\33\2\2\u00fc\u00fe\7?\2\2\u00fd\u00f5"+
		"\3\2\2\2\u00fd\u00f7\3\2\2\2\u00fd\u00f9\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fe"+
		"\27\3\2\2\2\33!#)\679?QT`bhw\u0082\u0089\u0094\u00a2\u00ae\u00b1\u00c7"+
		"\u00cf\u00d1\u00e7\u00ef\u00f3\u00fd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}