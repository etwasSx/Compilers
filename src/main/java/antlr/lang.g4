grammar lang;

program     : 'begin' stat+ 'end' ;
stat    : assign
	    | add 
	    | sub 
	    | print
	    | div
	    | compare
	    | mod
	    | or
	    | and
	    ;
assign      : 'let' ID 'be' (ID | NUM) ;
add         : 'add' (NUM | ID) 'to' ID;
sub         : 'sub' (NUM | ID) 'from' ID;
div         : 'div' (NUM | ID) 'by' ID;
compare     : 'compare' (NUM | ID) 'with' (NUM | ID);
mod         : 'mod' (NUM | ID) 'by' ID;
or          : 'or' (ID | 'true' | 'false') 'with' (ID | 'true' | 'false');
and         : 'and' (ID | 'true' | 'false') 'with' (ID | 'true' | 'false');



print       : 'print' (NUM | ID);

ID  :   [a-z]+ ;
NUM :   [0-9]+ ;
WS  :   [ \r\t\n]+ -> skip;


