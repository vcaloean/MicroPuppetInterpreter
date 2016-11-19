grammar PuppetGrammar ;

//========================================================================================
// Lexer Rules
//========================================================================================

/* order is IMPORTANT for lexer rules */

NOT                 : '!'   ;
AND                 : 'and' ;
OR                  : 'or'  ;
EQ                  : '=='  ;
NEQ                 : '!='  ;
LT                  : '<'   ;
GT                  : '>'   ;
LE                  : '<='  ;
GE                  : '>='  ;
REGMATCH            : '=~'  ;
REGNONMATCH         : '!~'  ;
IN                  : 'in'  ;
PLUS                : '+'   ;
SUB                 : '-'   ;
DIV                 : '/'   ;
MULT                : '*'   ;
MOD                 : '%'   ;
LEFTSHIFT           : '<<'  ;
RIGHTSHIFT          : '>>'  ;

INT                 : [0-9]+            ;
FLOAT               : [0-9]* '.' [0-9]+ ;

BOOLEAN             : 'true' | 'false' ;

RESOURCE_TYPE       : 'user' | 'file' | 'package' ;

/* must start with a letter, then can be followed by a letter, number, or underscore */
IDENTIFIER          : [a-zA-Z] ([a-zA-Z0-9_])* ;

/* accept anything between double or single quotes */
STRING_LITERAL      : '\"' .*? '\"' | '\'' .*? '\'' ;

/* skip comments and whitespace*/
COMMENT             : ( '//' ~( '\r' | '\n' )* 
                      | '/*' .*? '*/'  
                      | '#%' ~( '\r' | '\n' )*) -> skip ;
WS                  : [ \t\r\n]+ -> skip ;

//========================================================================================
// Parser Rules
//========================================================================================

puppetAssignment : puppetLocalVariable '=' puppetValueExp ;

puppetAttributeBody : puppetAttributeValue (',' puppetAttributeValue)* (',')? ;

puppetAttributeValue : IDENTIFIER '=>' puppetValueExp ;

puppetCase : 'case' puppetValueExp '{' puppetCaseBody '}' ;

puppetCaseBody : (puppetCaseElement)+ ;

puppetCaseElement : puppetValue ':' '{' (puppetStatements | /* episilon */) '}' ;

puppetClass : 'class' puppetClassName (puppetParaSeq)? (puppetClassInherits)? 
  '{' (puppetStatements | /* episilon */) '}' ;

puppetClassDecl : 'class' '{' STRING_LITERAL ':' puppetAttributeBody '}' ;

puppetClassInherits : 'inherits' puppetClassName ;

puppetClassName
  : IDENTIFIER '::' puppetClassName                                   # puppetClassNameScoped
  | IDENTIFIER                                                        # puppetClassNameEnd
  ;

puppetCustomSkip : 'skip' ;

puppetCustomScope : 'scope' puppetCustomScopeSpec '{' ( puppetStatements | /* episilon */ ) '}' ;

puppetCustomScopeSpec
  : '(' puppetCustomScopeSpec IDENTIFIER ')'                          # puppetCustomScopeDef
  | ( '::' | '::' puppetClassName | '::' puppetNodeSpecs )            # puppetCustomScopeRest
  ;

puppetDefinedResDecl : IDENTIFIER '{' puppetValueExp ':' puppetAttributeBody '}' ;

puppetDefinedResType : 'define' IDENTIFIER puppetParaSeq '{' (puppetStatements | /* episilon */) '}' ;

puppetIf : 'if' puppetValueExp '{' (puppetStatements | /* episilon */) '}' puppetIfContinuation ;

puppetIfContinuation
  : 'elsif' puppetValueExp '{'
    (puppetStatements | /* episilon */) '}' puppetIfContinuation      # puppetIfElse
  | 'else' '{' (puppetStatements | /* episilon */) '}'                # puppetElse
  | /* episilon */                                                    # puppetIfEnd
  ;

puppetInclude : 'include' puppetClassName ;

puppetLocalVariable : '$' IDENTIFIER ;

puppetNode : 'node' puppetNodeSpecs '{' (puppetStatements | /* episilon */) '}' ;

puppetNodeSpecs
  : STRING_LITERAL (',' STRING_LITERAL)*                              # puppetNameNotDefault
  | 'default'                                                         # puppetNameDefault
  ;

puppetParameter : puppetVariable ('=' puppetValueExp)? ;

puppetParaSeq : '(' puppetParameter (',' puppetParameter)* ')' ;

/* used for sequential program elements */
puppetProgram : (puppetProgramElement)+ ;

puppetProgramElement
  : puppetClass
  | puppetNode
  | puppetDefinedResType
  | puppetStatements
  ;

puppetQualifiedVariable : '$' puppetScope '::' IDENTIFIER ;

puppetResource : RESOURCE_TYPE '{' puppetValueExp ':' puppetAttributeBody '}' ;

puppetScope : '::' puppetClassName                                    # puppetScopeFull
  | /* epsilon */                                                     # puppetScopeEmpty
  ;

puppetSelectorBody : puppetSelectorElement (',' puppetSelectorElement)* (',')? ;

puppetSelectorElement
  : puppetValueExp '=>' puppetValueExp                                # puppetSelectorNotDefault
  | 'default'      '=>' puppetValueExp                                # puppetSelectorDefault
  ;

/* used for sequential statement elements */
puppetStatements : puppetStatementElement ((',')? puppetStatementElement)* ;

puppetStatementElement
  : puppetValueExp
  | puppetDefinedResDecl
  | puppetResource
  | puppetAssignment
  | puppetInclude
  | puppetClassDecl
  | puppetCustomSkip
  | puppetCustomScope
  | puppetIf
  | puppetUnless
  | puppetCase
  ;

puppetUnless : 'unless' puppetValueExp '{' (puppetStatements | /* episilon */) '}' ;

puppetValue : INT | BOOLEAN | FLOAT | STRING_LITERAL ;

/* selector was moved entirely into here to avoid left-recursiveness
   it still operates as normal */
puppetValueExp 
  : puppetValue                   /* not used but required */         # puppetExprToValue
  | puppetVariable                /* not used but required */         # puppetExprToVariable
  | '(' puppetValueExp ')'        /* not used but required */         # puppetParaExpr
  | NOT puppetValueExp                                                # puppetNotExpr
  | puppetValueExp '?' '{' puppetSelectorBody '}'                     # puppetSelector
  | puppetValueExp IN                       puppetValueExp            # puppetInExpr
  | puppetValueExp (REGMATCH | REGNONMATCH) puppetValueExp            # puppetRegExpr
  | puppetValueExp (MULT | DIV | MOD)       puppetValueExp            # puppetMultExpr
  | puppetValueExp (PLUS | SUB)             puppetValueExp            # puppetAddExpr
  | puppetValueExp (LEFTSHIFT | RIGHTSHIFT) puppetValueExp            # puppetShiftExpr
  | puppetValueExp (EQ | NEQ)               puppetValueExp            # puppetEqExpr
  | puppetValueExp (LT | GT | LE | GE)      puppetValueExp            # puppetCompExpr
  | puppetValueExp AND                      puppetValueExp            # puppetAndExpr
  | puppetValueExp OR                       puppetValueExp            # puppetOrExpr
  ;

puppetVariable : puppetLocalVariable | puppetQualifiedVariable ;
