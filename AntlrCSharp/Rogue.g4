grammar Rogue;

// **
// Parser
// **


calc: statements EOF;

statements: statement | statement statements;

statement: expression ';';

//Expressions: Expression Expressions;

stat: 'while' '(' expression ')' stat // match WHILE statement
| block // match a block of statements
;
block: '{' stat* '}' ;

identifierDecleration
    : type ID;

expression
 : INT OPERATOR expression   #NormalExpression
 | INT                      #IntExpression
 ;

auxillary
    : INT           #IntAux
    | expression    #ExprAux
    ;


type
    : Types;



// **
// Lexer
// **


INT: DIGIT;
OPERATOR: '+' | '-' | '*' | '/';

ID: LETTER (LETTER | DIGIT)*;

DIGIT: DIGIT_RULE;

// Whitespace
WS: [ \t\r\n]+ -> skip;


fragment LETTER: [A-z];
fragment DIGIT_RULE
    :'0'
    | '1'..'9' '0'..'9'*;
fragment Types
    : 'char'
    | 'int'
    | 'float'
    ;