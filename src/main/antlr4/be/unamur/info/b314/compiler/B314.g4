grammar B314;
import B314Words;

root: ID;
programme: DECLARE AND RETAIN
                ( varDecl SEMICOLON | fctDecl )*
                ( instruction )*
                clauseDefault
                ;
clauseDefault: BY DEFAULT
                (DECLARE LOCAL (varDecl SEMICOLON)+)?
                DO (instruction)* DONE          //instruction + -> *
                ;
varDecl: ID AS type
         ;
fctDecl: ID AS FUNCTION LPAR (varDecl (COMMA varDecl)*)? RPAR COLON (SCALAR | VOID)
         (DECLARE LOCAL (varDecl SEMICOLON)+) ?
         DO (instruction)* RETURN ID DONE           //instruction + -> *
         ;
type: SCALAR | ARRAY
       ;
instruction: IF exprD THEN instruction * DONE           //instruction + -> *
             | IF exprD THEN instruction * ELSE instruction * DONE          //instruction + -> *
             | WHILE exprD DO instruction * DONE            //instruction + -> *
             | SET exprG TO exprD
             | COMPUTE exprD
             | NEXT action
             ;   // le "skip" repésente un string vide. or il y en a une infinité => il suffit de rendre "insruction" facultatif partout (+ -> *)
                 // https://stackoverflow.com/questions/13289263/antlr-empty-condition-not-working
exprD: exprCase
       | exprG
       | ID LPAR (exprD (COMMA exprD)*)? RPAR
       | LPAR exprD RPAR
       //exprBool
       | TRUE | FALSE
       | (ENNEMI|GRAAL) IS ( NORTH | SOUTH | EAST | WEST)
       | exprD (AND | OR | SMALLER | BIGGER | EQUAL) exprD
       | NOT exprD
       //exprEnt
       | INT
       | LATITUDE | LONGITUDE | GRID SIZE
       | (MAP | RADIO | AMMO | FRUITS | SODA) COUNT
       | LIFE
       | exprD (PLUS | MINUS | MULT | DIV | MODULO ) exprD
       ;   //  https://stackoverflow.com/questions/20791690/how-to-avoid-mutual-left-recursion-in-antlr-4
           // problèmes de mutual-left-recursion nous force a inculre exprBool et exprEnt dans exprD.
exprCase: DIRT | ROCK| VINES | ZOMBIE | PLAYER | ENNEMI | MAP | RADIO | AMMO | FRUITS | SODA | GRAAL
          | NEARBY LBRA exprD COMMA exprD RBRA
          ;
/* compressed into exprD
exprBool: TRUE | FALSE
          | ENNEMI IS ( NORTH | SOUTH | EAST | WEST)
          | GRAAL IS ( NORTH | SOUTH | EAST | WEST)
          | exprD AND exprD
          | exprD OR exprD
          | NOT exprD
          | exprD SMALLER exprD
          | exprD BIGGER exprD
          | exprD EQUAL exprD
          ; */

/*  compressed into exprD
exprEnt: INT
         | LATITUDE | LONGITUDE | GRID SIZE
         | (MAP | RADIO | AMMO | FRUITS | SODA) COUNT
         | LIFE
         | exprD PLUS exprD
         | exprD MINUS exprD
         | exprD MULT exprD
         | exprD DIV exprD
         | exprD MODULO exprD
         ; */
exprG: ID
       | ID LBRA exprD (COMMA exprD)? RBRA
       ;
action: MOVE ( NORTH | SOUTH | EAST | WEST)
        | SHOOT ( NORTH | SOUTH | EAST | WEST)
        | USE ( MAP | RADIO | FRUITS | SODA)
        | DO NOTHING
        ;