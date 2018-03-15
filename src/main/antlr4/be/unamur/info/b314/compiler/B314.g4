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
fctDecl: ID AS FUNCTION LPAR (varDecl (COMMA varDecl)*)? RPAR COLON (scalar | VOID)
         (DECLARE LOCAL (varDecl SEMICOLON)+) ?
         DO (instruction)+ RETURN ID DONE
         ;

type: scalar | array ;

scalar : BOOLEAN | INTEGER | SQUARE ;

array : scalar LBRA INT (COMMA INT)? RBRA;

instruction: SKIPINS
             | IF exprD THEN instruction + DONE
             | IF exprD THEN instruction + ELSE instruction + DONE
             | WHILE exprD DO instruction + DONE
             | SET exprG TO exprD
             | COMPUTE exprD
             | NEXT action
             ;
exprD:  exprG
       | exprCase
       | ID LPAR (exprD (COMMA exprD)*)? RPAR
       | LPAR exprD RPAR
       | exprBool
       | exprEnt
       ;

exprBool:
        TRUE | FALSE
       | (ENNEMI|GRAAL) IS ( NORTH | SOUTH | EAST | WEST)
       | exprBool (AND | OR | EQUAL) exprBool // ref 5.2.1 Verification des types, point 2 (and, or) & 5 (equal)
       | NOT exprBool
       | exprEnt (SMALLER | BIGGER | EQUAL) exprEnt // ref 5.2.1 point 4 & 5
       | exprCase EQUAL exprCase // ref 5.2.1 point 5 (l'expr est bien typee si les operands sont tous les deux de type de case)
       | ID LPAR (exprD (COMMA exprD)*)? RPAR // une fonction retournant un boolean
       | LPAR exprBool RPAR // pour couvrir tous les formes d'une expression droite
       | exprG // pour couvrir tous les formes d'une expression droite
       ;

exprEnt:
        INT
       | LATITUDE | LONGITUDE | GRID SIZE
       | (MAP | RADIO | AMMO | FRUITS | SODA) COUNT
       | LIFE
       | exprEnt (PLUS | MINUS | MULT | DIV | MODULO ) exprEnt
       | ID LPAR (exprD (COMMA exprD)*)? RPAR 
       | LPAR exprEnt RPAR 
       | exprG 
       ;  

exprCase: DIRT | ROCK| VINES | ZOMBIE | PLAYER | ENNEMI | MAP | RADIO | AMMO | FRUITS | SODA | GRAAL
       | NEARBY LBRA exprEnt COMMA exprEnt RBRA
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

clauseWhen: WHEN exprD
            (DECLARE LOCAL (varDecl SEMICOLON)+)?
            DO (instruction)+ DONE
            ;
