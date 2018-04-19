grammar B314;
import B314Words;

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
            EOF
            ;

clauseDefault: BY DEFAULT
                (DECLARE LOCAL (varDecl SEMICOLON)+)?
                DO (instruction)+ DONE
                ;
varDecl: ID AS type
         ;
fctDecl: ID AS FUNCTION LPAR (varDecl (COMMA varDecl)*)? RPAR COLON (scalar | VOID)
         (DECLARE LOCAL (varDecl SEMICOLON)+) ?
         DO (instruction)+ RETURN (exprD | VOID) DONE
         ;

type: scalar | array ;

scalar : BOOLEAN | INTEGER | SQUARE ;

array : scalar LBRA INT (COMMA INT)? RBRA;

instruction: SKIPINS
             | IF exprBool THEN instruction + DONE
             | IF exprBool THEN instruction + ELSE instruction + DONE
             | WHILE exprBool DO instruction + DONE
             | SET exprG TO exprD
             | COMPUTE exprD
             | NEXT action
             ;
exprD:  exprG
       | ID LPAR (exprD (COMMA exprD)*)? RPAR
       | exprCase
       | LPAR exprD RPAR
       | exprBool
       | exprEnt
       ;
       /*
exprBool:
        TRUE | FALSE
       | (ENNEMI|GRAAL) IS ( NORTH | SOUTH | EAST | WEST)
//       | exprBool (AND | OR | SMALLER | BIGGER | EQUAL) exprBool
       | exprBool (AND | OR | EQUAL) exprBool // ref 5.2.1 Verification des types, point 2 (and, or) & 5 (equal)
       | NOT exprBool
       | exprEnt (SMALLER | BIGGER | EQUAL) exprEnt // ref 5.2.1 point 4 & 5
       | exprCase EQUAL exprCase // ref 5.2.1 point 5 (l'expr est bien typee si les operands sont tous les deux de type de case)
       | ID LPAR (exprD (COMMA exprD)*)? RPAR // une fonction retournant un boolean
       | LPAR exprBool RPAR // pour couvrir tous les formes d'une expression droite
       | exprG // pour couvrir tous les formes d'une expression droite
       ;
*/
exprBool:
        TRUE | FALSE
       | (ENNEMI|GRAAL) IS ( NORTH | SOUTH | EAST | WEST)
//       | exprBool (AND | OR | SMALLER | BIGGER | EQUAL) exprBool
       | NOT exprBool
       | ID LPAR (exprD (COMMA exprD)*)? RPAR // une fonction retournant un boolean
       | LPAR exprBool RPAR // pour couvrir tous les formes d'une expression droite
       | exprG EQUAL exprG
       | exprCase EQUAL exprCase // ref 5.2.1 point 5 (l'expr est bien typee si les operands sont tous les deux de type de case)
       | exprEnt (SMALLER | BIGGER | EQUAL) exprEnt // ref 5.2.1 point 4 & 5
       | exprBool (AND | OR |EQUAL ) exprBool // ref 5.2.1 Verification des types, point 2 (and, or) & 5 (equal)
       | exprG // pour couvrir tous les formes d'une expression droite
       ;

exprEnt:
        (MINUS)? INT
       | LATITUDE | LONGITUDE | GRID SIZE
       | (MAP | RADIO | AMMO | FRUITS | SODA) COUNT
       | LIFE
       | exprEnt (PLUS | MINUS | MULT | DIV | MODULO ) exprEnt
       | ID LPAR (exprD (COMMA exprD)*)? RPAR // fonction retournant un entier
       | LPAR exprEnt RPAR // pour couvrir tous les formes d'une expression droite
       | exprG // pour couvrir tous les formes d'une expression droite
       ;   //  https://stackoverflow.com/questions/20791690/how-to-avoid-mutual-left-recursion-in-antlr-4
           // problèmes de mutual-left-recursion nous force a inculre exprBool et exprEnt dans exprD.
exprCase: DIRT | ROCK| VINES | ZOMBIE | PLAYER | ENNEMI | MAP | RADIO | AMMO | FRUITS | SODA | GRAAL
       | NEARBY LBRA exprEnt COMMA exprEnt RBRA
       | ID LPAR (exprD (COMMA exprD)*)? RPAR // fonction retournant une value de type Square
       | exprG // un ID de type Square ou un element d'un array de type Square
       ;
exprG: ID
       | ID LBRA exprEnt (COMMA exprEnt)? RBRA
       ;
action: MOVE ( NORTH | SOUTH | EAST | WEST)
        | SHOOT ( NORTH | SOUTH | EAST | WEST)
        | USE ( MAP | RADIO | FRUITS | SODA)
        | DO NOTHING
        ;

impDecl: IMPORT FILEDECL ;

clauseWhen: WHEN exprBool
            (DECLARE LOCAL (varDecl SEMICOLON)+)?
            DO (instruction)+ DONE
            ;
