
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Sun May 05 18:03:32 CEST 2013
//----------------------------------------------------

package analyseur;

import java_cup.runtime.*;
import java.util.*;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Sun May 05 18:03:32 CEST 2013
  */
public class AnalyseurSyntaxiqueCup extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public AnalyseurSyntaxiqueCup() {super();}

  /** Constructor which sets the default scanner. */
  public AnalyseurSyntaxiqueCup(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public AnalyseurSyntaxiqueCup(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\012\000\002\002\004\000\002\002\004\000\002\002" +
    "\003\000\002\005\002\000\002\003\005\000\002\003\004" +
    "\000\002\004\003\000\002\004\003\000\002\004\003\000" +
    "\002\004\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\016\000\014\003\006\004\004\005\013\006\007\010" +
    "\010\001\002\000\004\007\ufffa\001\002\000\004\002\020" +
    "\001\002\000\004\007\017\001\002\000\004\007\ufff8\001" +
    "\002\000\004\007\ufffb\001\002\000\004\007\ufffe\001\002" +
    "\000\016\002\uffff\003\006\004\004\005\013\006\007\010" +
    "\010\001\002\000\004\007\ufff9\001\002\000\004\002\001" +
    "\001\002\000\004\007\016\001\002\000\016\002\ufffd\003" +
    "\ufffd\004\ufffd\005\ufffd\006\ufffd\010\ufffd\001\002\000\016" +
    "\002\ufffc\003\ufffc\004\ufffc\005\ufffc\006\ufffc\010\ufffc\001" +
    "\002\000\004\002\000\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\016\000\010\002\004\003\011\004\010\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\005\014\001\001\000" +
    "\010\002\013\003\011\004\010\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$AnalyseurSyntaxiqueCup$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$AnalyseurSyntaxiqueCup$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$AnalyseurSyntaxiqueCup$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



	public void report_error(String message, Object info) {
		String m = "Erreur de syntaxe";
		if (info instanceof Symbol) {
			Symbol s = ((Symbol) info);
			if (s.left >= 0) /* Numero de ligne */
				m = m + " ligne : " + (s.left+1);
		}
		System.out.println(m);
	} 

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$AnalyseurSyntaxiqueCup$actions {

 
	private static Boolean isC = false;
	private static Boolean isT = false;
	private static Boolean isS = false;
	private static Boolean isL = false;
 
  private final AnalyseurSyntaxiqueCup parser;

  /** Constructor */
  CUP$AnalyseurSyntaxiqueCup$actions(AnalyseurSyntaxiqueCup parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$AnalyseurSyntaxiqueCup$do_action(
    int                        CUP$AnalyseurSyntaxiqueCup$act_num,
    java_cup.runtime.lr_parser CUP$AnalyseurSyntaxiqueCup$parser,
    java.util.Stack            CUP$AnalyseurSyntaxiqueCup$stack,
    int                        CUP$AnalyseurSyntaxiqueCup$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$AnalyseurSyntaxiqueCup$result;

      /* select the action based on the action number */
      switch (CUP$AnalyseurSyntaxiqueCup$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // expr ::= SOUS 
            {
              Object RESULT =null;
		int cleft = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxiqueCup$stack.peek()).left;
		int cright = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxiqueCup$stack.peek()).right;
		String c = (String)((java_cup.runtime.Symbol) CUP$AnalyseurSyntaxiqueCup$stack.peek()).value;
		
	//System.out.println("<h2>" + c + "</h2>");
	isS = true;
	RESULT = c;

              CUP$AnalyseurSyntaxiqueCup$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxiqueCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxiqueCup$stack.peek()), RESULT);
            }
          return CUP$AnalyseurSyntaxiqueCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // expr ::= TITRE 
            {
              Object RESULT =null;
		int cleft = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxiqueCup$stack.peek()).left;
		int cright = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxiqueCup$stack.peek()).right;
		String c = (String)((java_cup.runtime.Symbol) CUP$AnalyseurSyntaxiqueCup$stack.peek()).value;
		
	//System.out.println("<h1>" + c + "</h1>");
	isT = true;
	RESULT = c;

              CUP$AnalyseurSyntaxiqueCup$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxiqueCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxiqueCup$stack.peek()), RESULT);
            }
          return CUP$AnalyseurSyntaxiqueCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // expr ::= LI 
            {
              Object RESULT =null;
		int cleft = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxiqueCup$stack.peek()).left;
		int cright = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxiqueCup$stack.peek()).right;
		String c = (String)((java_cup.runtime.Symbol) CUP$AnalyseurSyntaxiqueCup$stack.peek()).value;
		
	//System.out.println("<li>" + c + "</li>");
	isL = true;
	RESULT = c;

              CUP$AnalyseurSyntaxiqueCup$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxiqueCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxiqueCup$stack.peek()), RESULT);
            }
          return CUP$AnalyseurSyntaxiqueCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // expr ::= CHAINE 
            {
              Object RESULT =null;
		int cleft = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxiqueCup$stack.peek()).left;
		int cright = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxiqueCup$stack.peek()).right;
		String c = (String)((java_cup.runtime.Symbol) CUP$AnalyseurSyntaxiqueCup$stack.peek()).value;
		
	//System.out.println("<p>" + c + "</p>");
	isC = true;
	RESULT = c;

              CUP$AnalyseurSyntaxiqueCup$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxiqueCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxiqueCup$stack.peek()), RESULT);
            }
          return CUP$AnalyseurSyntaxiqueCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // expression ::= error SAUT 
            {
              Object RESULT =null;

              CUP$AnalyseurSyntaxiqueCup$result = parser.getSymbolFactory().newSymbol("expression",1, ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxiqueCup$stack.elementAt(CUP$AnalyseurSyntaxiqueCup$top-1)), ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxiqueCup$stack.peek()), RESULT);
            }
          return CUP$AnalyseurSyntaxiqueCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // expression ::= expr NT$0 SAUT 
            {
              Object RESULT =null;
              // propagate RESULT from NT$0
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP$AnalyseurSyntaxiqueCup$stack.elementAt(CUP$AnalyseurSyntaxiqueCup$top-1)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxiqueCup$stack.elementAt(CUP$AnalyseurSyntaxiqueCup$top-2)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxiqueCup$stack.elementAt(CUP$AnalyseurSyntaxiqueCup$top-2)).right;
		Object e = (Object)((java_cup.runtime.Symbol) CUP$AnalyseurSyntaxiqueCup$stack.elementAt(CUP$AnalyseurSyntaxiqueCup$top-2)).value;

              CUP$AnalyseurSyntaxiqueCup$result = parser.getSymbolFactory().newSymbol("expression",1, ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxiqueCup$stack.elementAt(CUP$AnalyseurSyntaxiqueCup$top-2)), ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxiqueCup$stack.peek()), RESULT);
            }
          return CUP$AnalyseurSyntaxiqueCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // NT$0 ::= 
            {
              Object RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxiqueCup$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxiqueCup$stack.peek()).right;
		Object e = (Object)((java_cup.runtime.Symbol) CUP$AnalyseurSyntaxiqueCup$stack.peek()).value;
 	
	if(isC)
		System.out.println("<p>"+e+"</p>");
	if(isL)
		System.out.println("  <li>"+e+"</li>");
	if(isT)
		System.out.println("<h1>"+e+"</h1>");
	if(isS)
		System.out.println("<h2>"+e+"</h2>");
	isC = false; isL = false; isT = false; isS = false; 

              CUP$AnalyseurSyntaxiqueCup$result = parser.getSymbolFactory().newSymbol("NT$0",3, ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxiqueCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxiqueCup$stack.peek()), RESULT);
            }
          return CUP$AnalyseurSyntaxiqueCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // seq_expressions ::= expression 
            {
              Object RESULT =null;

              CUP$AnalyseurSyntaxiqueCup$result = parser.getSymbolFactory().newSymbol("seq_expressions",0, ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxiqueCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxiqueCup$stack.peek()), RESULT);
            }
          return CUP$AnalyseurSyntaxiqueCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= seq_expressions EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxiqueCup$stack.elementAt(CUP$AnalyseurSyntaxiqueCup$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxiqueCup$stack.elementAt(CUP$AnalyseurSyntaxiqueCup$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$AnalyseurSyntaxiqueCup$stack.elementAt(CUP$AnalyseurSyntaxiqueCup$top-1)).value;
		RESULT = start_val;
              CUP$AnalyseurSyntaxiqueCup$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxiqueCup$stack.elementAt(CUP$AnalyseurSyntaxiqueCup$top-1)), ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxiqueCup$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$AnalyseurSyntaxiqueCup$parser.done_parsing();
          return CUP$AnalyseurSyntaxiqueCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // seq_expressions ::= expression seq_expressions 
            {
              Object RESULT =null;

              CUP$AnalyseurSyntaxiqueCup$result = parser.getSymbolFactory().newSymbol("seq_expressions",0, ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxiqueCup$stack.elementAt(CUP$AnalyseurSyntaxiqueCup$top-1)), ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxiqueCup$stack.peek()), RESULT);
            }
          return CUP$AnalyseurSyntaxiqueCup$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

