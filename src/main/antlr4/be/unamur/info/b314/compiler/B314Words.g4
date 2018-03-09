lexer grammar B314Words;

//symbols and operators
LPAR: '(';
RPAR: ')';
COMMA: ',';
PLUS: '+';
MINUS: '-';
MULT: '*';
DIV: '/';
MODULO: '%';
SEMICOLON: ';';
COLON: ':';
LBRA: '[';
RBRA: ']';
EQUAL: '=';
SMALLER: '<';
BIGGER: '>';
AND: 'and';
OR: 'or';


//words
DECLARE: 'declare';
RETAIN: 'retain';
BY: 'by';
DEFAULT: 'default';
LOCAL: 'local';
DO: 'do';
DONE: 'done';
IF: 'if';
THEN: 'then';
ELSE: 'else';
WHILE: 'while';
SET: 'set';
TO: 'to';
AS: 'as';
COMPUTE: 'compute';
NEXT: 'next';
SQUARE: 'square';
FUNCTION: 'function';
RETURN: 'return';
NOT: 'not';
ENNEMI: 'ennemi';
IS: 'is';
GRAAL: 'graal';
NORTH: 'north';
SOUTH: 'south';
EAST: 'east';
WEST: 'west';
NEARBY: 'nearby';
DIRT: 'dirt';
ROCK: 'rock';
VINES: 'vines';
ZOMBIE: 'zombie';
PLAYER: 'player';
AMMO: 'ammo';
MAP: 'map';
RADIO: 'radio';
FRUITS: 'fruits';
SODA: 'soda' ;
MOVE: 'move';
SHOOT: 'shoot';
USE: 'use';
NOTHING: 'nothing';
COUNT: 'count';
LIFE: 'life';
LATITUDE: 'latitude';
LONGITUDE: 'longitude';
GRID: 'grid';
SIZE: 'size';
WHEN: 'when';
YOUR: 'your';
TURN: 'turn';
IMPORT: 'import';
SKIPINS: 'skip';

// Types
BOOLEAN: 'boolean';
INTEGER: 'integer';
INT: (MINUS)? [1-9](DIGIT)*| '0' ;
TRUE: 'true';
FALSE: 'false';
VOID: 'void';

//SCALAR : BOOLEAN
//         | INTEGER
//         | SQUARE
//         ;
//ARRAY : SCALAR LBRA INT (COMMA INT)? RBRA
//        ;

// Comments -> ignored
COMMENT: '/*' .*? '*/' -> skip;

// Whitespaces -> ignored
NEWLINE: '\r'? '\n'  -> skip ;
WS: [ \t]+ -> skip ;

// Identifiers
FILEDECL: ID'.wld';
ID: LETTER (LETTER | DIGIT)* ;
fragment LETTER: 'A'..'Z' | 'a'..'z' ;
fragment DIGIT: '0'..'9' ;
