grammar Rogue;

// **
// Parser
// **


calc: block EOF;

statements: statement | statement statements;

statement: expression ';';

//Expressions: Expression Expressions;

stat: 'while' '(' lexpr ')' block // match WHILE statement
| 'if' '(' lexpr ')' block
| block // match a block of statements
| expression ';'
;
block: '{' stat* '}' ;

lexpr
 : expression CompareOperator expression
 | LogicalUnaryOperator lexpr
 | lexpr LogicalBinaryOperator lexpr
 ;



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
CompareOperator: '<' | '>' | '==';
LogicalUnaryOperator: '!';
LogicalBinaryOperator: '&&' | '||' | '^';

ID: LETTER (LETTER | DIGIT)*;

DIGIT: DIGIT_RULE;
Types: Types_Rule;
// Whitespace
WS: [ \t\r\n]+ -> skip;


fragment LETTER: [A-z];
fragment DIGIT_RULE
    :'0'
    | '1'..'9' '0'..'9'*;
fragment Types_Rule
    : 'char'
    | 'int'
    | 'float'
    ;