package analyseur;

import java_cup.runtime.Symbol;
import java.io.*;


public class Main 
{
	
	public static void main(String[] args) throws Exception {
		AnalyseurLexical yy ;
		if (args.length > 0)
			yy = new AnalyseurLexical(new FileInputStream(args[0]));
		else
			yy = new AnalyseurLexical(System.in) ;
			AnalyseurSyntaxiqueCup p = new AnalyseurSyntaxiqueCup(yy);
			Symbol result = p.parse( );
	}
}
