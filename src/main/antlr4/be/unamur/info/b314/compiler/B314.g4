grammar B314;
import B314Words;

root: ID;
programme: DECLARE AND RETAIN
            ((
                ( varDecl SEMICOLON | fctDecl )*
                ( instruction )*
            ) | (
                ( varDecl SEMICOLON | fctDecl | impDecl )*
                WHEN YOUR TURN
                ( clauseWhen )*
            ))
            clauseDefault
            ;

clauseDefault: BY DEFAULT
                (DECLARE LOCAL (varDecl SEMICOLON)+)?
                DO (instruction)+ DONE
                ;
varDecl: ID AS type
         ;
fctDecl: ID AS FUNCTION LPAR (varDecl (COMMA varDecl)*)? RPAR COLON (SCALAR | VOID)
         (DECLARE LOCAL (varDecl SEMICOLON)+) ?
         DO (instruction)+ RETURN ID DONE
         ;
type: scalar | array
       ;
scalar : BOOLEAN
         | INTEGER
         | SQUARE
         ;
array : scalar LBRA INT (COMMA INT)? RBRA
        ;
instruction: SKIPINS
             | IF exprD THEN instruction + DONE
             | IF exprD THEN instruction + ELSE instruction + DONE
             | WHILE exprD DO instruction + DONE
             | SET exprG TO exprD
             | COMPUTE exprD
             | NEXT action
             ;
exprD: exprCase
       | exprG
       | ID LPAR (exprD (COMMA exprD)*)? RPAR
       | LPAR exprD RPAR
       | exprBool
       | exprEnt
       ;
exprBool:
        TRUE | FALSE
       | (ENNEMI|GRAAL) IS ( NORTH | SOUTH | EAST | WEST)
       | exprBool (AND | OR | SMALLER | BIGGER | EQUAL) exprBool
       | NOT exprBool
       ;
exprEnt:
        INT
       | LATITUDE | LONGITUDE | GRID SIZE
       | (MAP | RADIO | AMMO | FRUITS | SODA) COUNT
       | LIFE
       | exprEnt (PLUS | MINUS | MULT | DIV | MODULO ) exprEnt
       ;   //  https://stackoverflow.com/questions/20791690/how-to-avoid-mutual-left-recursion-in-antlr-4
           // problèmes de mutual-left-recursion nous force a inculre exprBool et exprEnt dans exprD.
exprCase: DIRT | ROCK| VINES | ZOMBIE | PLAYER | ENNEMI | MAP | RADIO | AMMO | FRUITS | SODA | GRAAL
          | NEARBY LBRA exprD COMMA exprD RBRA
          ;
exprG: ID
       | ID LBRA exprD (COMMA exprD)? RBRA
       ;
action: MOVE ( NORTH | SOUTH | EAST | WEST)
        | SHOOT ( NORTH | SOUTH | EAST | WEST)
        | USE ( MAP | RADIO | FRUITS | SODA)
        | DO NOTHING
        ;

impDecl: IMPORT FILEDECL ;

clauseWhen: WHEN exprD
            (DECLARE LOCAL (varDecl SEMICOLON)+)?
            DO (instruction)+ DONE
            ;
