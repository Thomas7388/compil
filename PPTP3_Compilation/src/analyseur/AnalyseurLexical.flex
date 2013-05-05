package analyseur;

import java_cup.runtime.Symbol;


%%
%class AnalyseurLexical
%line
%column
%cup
%{eofval
	return new Symbol(AnalyseurSyntaxiqueSym.EOF) ;
%eofval}

chaine = [a-z][a-zA-Z]*
titre = "=" {chaine} "="
soustitre = "==" {chaine} "=="
li = "*" {chaine}+

%%


{chaine} {return new Symbol(AnalyseurSyntaxiqueSym.CHAINE,yyline,yycolumn,yytext());}
{titre} {return new Symbol(AnalyseurSyntaxiqueSym.TITRE,yyline,yycolumn,yytext());}
{soustitre} {return new Symbol(AnalyseurSyntaxiqueSym.SOUS,yyline,yycolumn,yytext());}
{li} {return new Symbol(AnalyseurSyntaxiqueSym.LI,yyline,yycolumn,yytext());}

\n {return new Symbol(AnalyseurSyntaxiqueSym.SAUT,yyline,yycolumn,yytext());}

. { ; /* on fait rien */ }