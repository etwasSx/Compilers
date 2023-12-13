grammar lang;

program     : 'begin' stat+ 'end' ;
stat    : assign
	    | add 
	    | sub 
	    | print
	    | div
	    | compare
	    | mod
	    ;
assign      : 'let' ID 'be' (ID | NUM) ;
add         : 'add' (NUM | ID) 'to' ID;
sub         : 'sub' (NUM | ID) 'from' ID;
div         : 'div' ID 'by' (NUM | ID);
compare     : 'compare' (NUM | ID) 'with' (NUM | ID) 'save_in' ID;
mod         : 'mod' ID 'by' (NUM | ID);


print       : 'print' (NUM | ID);

ID  :   [a-z]+ ;
NUM :   [0-9]+ ;
WS  :   [ \r\t\n]+ -> skip;


