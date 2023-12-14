grammar lang;

program     : 'begin' stat+ 'end' ;
stat    : assign
	    | add 
	    | sub 
	    | print
	    | div
	    | compare
	    | mod
	    | exrpession
	    | pow
	    | mult
	    ;
assign      : 'let' ID 'be' (ID | NUM) ;
add         : 'add' (NUM | ID) 'to' ID;
sub         : 'sub' (NUM | ID) 'from' ID;
div         : 'div' ID 'by' (NUM | ID);
compare     : 'compare' (NUM | ID) 'with' (NUM | ID) '=' ID;
mod         : 'mod' ID 'by' (NUM | ID);
exrpession  : (NUM|ID) (OVER|LESS) (NUM|ID) '=' ID;
pow         : ID 'pow' (NUM|ID);
mult        : (NUM|ID) '*' (NUM|ID) '=' ID;


print       : 'print' (NUM | ID);

ID  :   [a-z]+ ;
NUM :   [0-9]+ ;
WS  :   [ \r\t\n]+ -> skip;
OVER : '>';
LESS : '<';



