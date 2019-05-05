
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package com.olc1.analyzer;

import java.util.LinkedList;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class Parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public Parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public Parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\017\000\002\002\004\000\002\002\003\000\002\004" +
    "\005\000\002\004\004\000\002\005\005\000\002\005\003" +
    "\000\002\003\005\000\002\003\005\000\002\003\005\000" +
    "\002\003\005\000\002\003\003\000\002\003\003\000\002" +
    "\003\003\000\002\003\003\000\002\003\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\030\000\014\004\007\005\004\006\014\015\010\016" +
    "\013\001\002\000\016\007\ufff6\010\ufff6\011\ufff6\012\ufff6" +
    "\013\ufff6\014\ufff6\001\002\000\016\007\ufffc\010\ufffc\011" +
    "\021\012\023\013\024\014\022\001\002\000\006\007\032" +
    "\010\016\001\002\000\016\007\ufff7\010\ufff7\011\ufff7\012" +
    "\ufff7\013\ufff7\014\ufff7\001\002\000\016\007\ufff5\010\ufff5" +
    "\011\ufff5\012\ufff5\013\ufff5\014\ufff5\001\002\000\004\002" +
    "\031\001\002\000\016\002\000\004\007\005\004\006\014" +
    "\015\010\016\013\001\002\000\016\007\ufff4\010\ufff4\011" +
    "\ufff4\012\ufff4\013\ufff4\014\ufff4\001\002\000\016\007\ufff3" +
    "\010\ufff3\011\ufff3\012\ufff3\013\ufff3\014\ufff3\001\002\000" +
    "\006\007\017\010\016\001\002\000\014\004\007\005\004" +
    "\006\014\015\010\016\013\001\002\000\016\002\uffff\004" +
    "\uffff\005\uffff\006\uffff\015\uffff\016\uffff\001\002\000\016" +
    "\007\ufffd\010\ufffd\011\021\012\023\013\024\014\022\001" +
    "\002\000\014\004\007\005\004\006\014\015\010\016\013" +
    "\001\002\000\014\004\007\005\004\006\014\015\010\016" +
    "\013\001\002\000\014\004\007\005\004\006\014\015\010" +
    "\016\013\001\002\000\014\004\007\005\004\006\014\015" +
    "\010\016\013\001\002\000\016\007\ufff9\010\ufff9\011\ufff9" +
    "\012\ufff9\013\ufff9\014\ufff9\001\002\000\016\007\ufffa\010" +
    "\ufffa\011\ufffa\012\ufffa\013\024\014\022\001\002\000\016" +
    "\007\ufff8\010\ufff8\011\ufff8\012\ufff8\013\ufff8\014\ufff8\001" +
    "\002\000\016\007\ufffb\010\ufffb\011\ufffb\012\ufffb\013\024" +
    "\014\022\001\002\000\004\002\001\001\002\000\016\002" +
    "\ufffe\004\ufffe\005\ufffe\006\ufffe\015\ufffe\016\ufffe\001\002" +
    "" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\030\000\012\002\010\003\004\004\011\005\005\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\006\003\004\005\014\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\003\017\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\003\027\001\001" +
    "\000\004\003\026\001\001\000\004\003\025\001\001\000" +
    "\004\003\024\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Parser$actions(this);
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
    return action_obj.CUP$Parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    public LinkedList<LinkedList<Nodo>> resultado;

    public String getCadena(String cadena){
        return cadena.substring(1,cadena.length()-1);
    }


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$Parser$actions {


  private final Parser parser;

  /** Constructor */
  CUP$Parser$actions(Parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action_part00000000(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Parser$result;

      /* select the action based on the action number */
      switch (CUP$Parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= INICIO EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		RESULT = start_val;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Parser$parser.done_parsing();
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // INICIO ::= CUERPO 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		LinkedList<LinkedList<Nodo>> a = (LinkedList<LinkedList<Nodo>>)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		resultado = a; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // CUERPO ::= CUERPO Operlst SEMICOLON 
            {
              LinkedList<LinkedList<Nodo>> RESULT =null;
		int lstleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int lstright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		LinkedList<LinkedList<Nodo>> lst = (LinkedList<LinkedList<Nodo>>)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int aleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		LinkedList<Nodo> a = (LinkedList<Nodo>)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		
    lst.add(a);
    RESULT = lst;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("CUERPO",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // CUERPO ::= Operlst SEMICOLON 
            {
              LinkedList<LinkedList<Nodo>> RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		LinkedList<Nodo> a = (LinkedList<Nodo>)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		
    LinkedList<LinkedList<Nodo>> lstnod = new LinkedList<LinkedList<Nodo>>();
    lstnod.add(a);
    RESULT = lstnod;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("CUERPO",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // Operlst ::= Operlst COMMA OPER 
            {
              LinkedList<Nodo> RESULT =null;
		int lstleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int lstright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		LinkedList<Nodo> lst = (LinkedList<Nodo>)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int o2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int o2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Nodo o2 = (Nodo)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
try{
    if(lst.peekLast().esString || o2.esString){
        lst.add(o2);
    } else
    if(lst.peekLast().esDouble && o2.esDouble){
        int retorno = (int) Math.round( ((double) lst.peekLast().getResultado()) + ((double) o2.getResultado()) );
        lst.peekLast().setResultado(retorno);
        lst.peekLast().esString = false;
        lst.peekLast().esDouble = false;
        lst.peekLast().esEntero = true;
    } else 
    if(lst.peekLast().esDouble && o2.esEntero){
        Double retorno = ((double) lst.peekLast().getResultado()) + ( (int) o2.getResultado());
        lst.peekLast().setResultado(retorno);
        lst.peekLast().esString = false;
        lst.peekLast().esDouble = true;
        lst.peekLast().esEntero = false;
    } else
    if(lst.peekLast().esEntero && o2.esDouble){
        Double retorno = ((int) lst.peekLast().getResultado()) + ( (double) o2.getResultado());
        lst.peekLast().setResultado(retorno);
        lst.peekLast().esString = false;
        lst.peekLast().esDouble = true;
        lst.peekLast().esEntero = false;
        System.out.println("multiplicó");
    } else
    if (lst.peekLast().esEntero && o2.esEntero){
        int retorno = ((int) lst.peekLast().getResultado()) + ( (int) o2.getResultado());
        lst.peekLast().setResultado( retorno );
        lst.peekLast().esString = false;
        lst.peekLast().esDouble = false;
        lst.peekLast().esEntero = true;
    }
} catch (Exception ex) {
    System.out.println(ex.getMessage());
}
    //lst.peekLast().setConcatenado(lst.peekLast().getConcatenado() + ", "+  o2.getConcatenado());
    RESULT = lst;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("Operlst",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // Operlst ::= OPER 
            {
              LinkedList<Nodo> RESULT =null;
		int o1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int o1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Nodo o1 = (Nodo)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
    LinkedList<Nodo> nodolst = new LinkedList<Nodo>();
    nodolst.add(o1);
    RESULT =nodolst;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("Operlst",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // OPER ::= OPER MAS OPER 
            {
              Nodo RESULT =null;
		int o1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int o1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Nodo o1 = (Nodo)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int o2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int o2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Nodo o2 = (Nodo)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
    if(o1.esString || o2.esString){
        o1.setResultado(String.valueOf(o1.getResultado()) +" "+  String.valueOf(o2.getResultado())+"");
        o1.esString = true;
        o1.esDouble = false;
        o1.esEntero = false;
        System.out.println("sumó");
    } else
    if(o1.esDouble && o2.esDouble){
        int retorno = (int) Math.round( ((double) o1.getResultado()) + ((double) o2.getResultado()) );
        o1.setResultado(retorno);
        o1.esString = false;
        o1.esDouble = false;
        o1.esEntero = true;
        System.out.println("sumó");
    } else 
    if(o1.esDouble && o2.esEntero){
        Double retorno = ((double) o1.getResultado()) + ( (int) o2.getResultado());
        o1.setResultado(retorno);
        o1.esString = false;
        o1.esDouble = true;
        o1.esEntero = false;
        System.out.println("sumó");
    } else
    if(o1.esEntero && o2.esDouble){
        Double retorno = ((int) o1.getResultado()) + ( (double) o2.getResultado());
        o1.setResultado(retorno);
        o1.esString = false;
        o1.esDouble = true;
        o1.esEntero = false;
        System.out.println("multiplicó");
    } else
    if (o1.esEntero && o2.esEntero){
        int retorno = ((int) o1.getResultado()) + ( (int) o2.getResultado());
        o1.setResultado( retorno );
        o1.esString = false;
        o1.esDouble = false;
        o1.esEntero = true;
        System.out.println("sumó");
    }
    o1.setConcatenado(o1.getConcatenado() + " "+  o2.getConcatenado() + " + " );
    
    RESULT = o1;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("OPER",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // OPER ::= OPER MENOS OPER 
            {
              Nodo RESULT =null;
		int o1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int o1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Nodo o1 = (Nodo)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int o2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int o2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Nodo o2 = (Nodo)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
    if(o1.esString || o2.esString){
        o1.setResultado(String.valueOf(o1.getResultado()) +" "+ String.valueOf(o2.getResultado())+" - ");
        o1.esString = true;
        o1.esDouble = false;
        o1.esEntero = false;
        System.out.println("restó");
    } else
    if(o1.esDouble && o2.esDouble){
        int retorno = (int) Math.round( ((double) o1.getResultado()) - ((double) o2.getResultado()) );
        o1.setResultado(retorno);
        o1.esString = false;
        o1.esDouble = false;
        o1.esEntero = true;
        System.out.println("restó");
    } else 
    if(o1.esDouble && o2.esEntero){
        Double retorno = ((double) o1.getResultado()) - ( (int) o2.getResultado());
        o1.setResultado(retorno);
        o1.esString = false;
        o1.esDouble = true;
        o1.esEntero = false;
        System.out.println("restó");
    } else
    if(o1.esEntero && o2.esDouble){
        Double retorno = ((int) o1.getResultado()) - ( (double) o2.getResultado());
        o1.setResultado(retorno);
        o1.esString = false;
        o1.esDouble = true;
        o1.esEntero = false;
        System.out.println("multiplicó");
    } else
    if (o1.esEntero && o2.esEntero){
        int retorno = ((int) o1.getResultado()) - ( (int) o2.getResultado());
        o1.setResultado( retorno );
        o1.esString = false;
        o1.esDouble = false;
        o1.esEntero = true;
        System.out.println("restó");
    }
    o1.setConcatenado(o1.getConcatenado() + " "+  o2.getConcatenado() + " - " );
    
    RESULT = o1;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("OPER",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // OPER ::= OPER PRODUCTO OPER 
            {
              Nodo RESULT =null;
		int o1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int o1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Nodo o1 = (Nodo)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int o2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int o2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Nodo o2 = (Nodo)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
    if(o1.esString || o2.esString){
        o1.setResultado(String.valueOf(o1.getResultado()) +" "+ String.valueOf(o2.getResultado())+" * ");
        o1.esString = true;
        o1.esDouble = false;
        o1.esEntero = false;
        System.out.println("multiplicó");
    } else
    if(o1.esDouble && o2.esDouble){
        int retorno = (int) Math.round( ((double) o1.getResultado()) * ((double) o2.getResultado()) );
        o1.setResultado(retorno);
        o1.esString = false;
        o1.esDouble = false;
        o1.esEntero = true;
        System.out.println("multiplicó");
    } else 
    if(o1.esDouble && o2.esEntero){
        Double retorno = ((double) o1.getResultado()) * ( (int) o2.getResultado());
        o1.setResultado(retorno);
        o1.esString = false;
        o1.esDouble = true;
        o1.esEntero = false;
        System.out.println("multiplicó");
    } else
    if(o1.esEntero && o2.esDouble){
        Double retorno = ((int) o1.getResultado()) * ( (double) o2.getResultado());
        o1.setResultado(retorno);
        o1.esString = false;
        o1.esDouble = true;
        o1.esEntero = false;
        System.out.println("multiplicó");
    } else
    if (o1.esEntero && o2.esEntero){
        int retorno = ((int) o1.getResultado()) * ( (int) o2.getResultado());
        o1.setResultado( retorno );
        o1.esString = false;
        o1.esDouble = false;
        o1.esEntero = true;
        System.out.println("multiplicó");
    }
    o1.setConcatenado(o1.getConcatenado() + " "+  o2.getConcatenado() + " * " );
    
    RESULT = o1;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("OPER",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // OPER ::= OPER DIVISION OPER 
            {
              Nodo RESULT =null;
		int o1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int o1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Nodo o1 = (Nodo)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int o2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int o2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Nodo o2 = (Nodo)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
    if(o1.esString || o2.esString){
        o1.setResultado(String.valueOf(o1.getResultado()) +" "+ String.valueOf(o2.getResultado())+" / ");
        o1.esString = true;
        o1.esDouble = false;
        o1.esEntero = false;
        System.out.println("dividió");
    } else
    if(o1.esDouble && o2.esDouble){
        int retorno = (int) Math.round( ((double) o1.getResultado()) / ((double) o2.getResultado()) );
        o1.setResultado(retorno);
        o1.esString = false;
        o1.esDouble = false;
        o1.esEntero = true;
        System.out.println("dividió");
    } else 
    if(o1.esDouble && o2.esEntero){
        Double retorno = ((double) o1.getResultado()) / ( (int) o2.getResultado());
        o1.setResultado(retorno);
        o1.esString = false;
        o1.esDouble = true;
        o1.esEntero = false;
        System.out.println("dividió");
    } else
    if(o1.esEntero && o2.esDouble){
        Double retorno = ((int) o1.getResultado()) / ( (double) o2.getResultado());
        o1.setResultado(retorno);
        o1.esString = false;
        o1.esDouble = true;
        o1.esEntero = false;
        System.out.println("multiplicó");
    } else
    if (o1.esEntero && o2.esEntero){
        int retorno = ((int) o1.getResultado()) / ( (int) o2.getResultado());
        o1.setResultado( retorno );
        o1.esString = false;
        o1.esDouble = false;
        o1.esEntero = true;
        System.out.println("dividió");
    }
    o1.setConcatenado(o1.getConcatenado() + " "+  o2.getConcatenado() + " / " );
    
    RESULT = o1;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("OPER",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // OPER ::= ENTERO 
            {
              Nodo RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
    int int01 = 0;
    try{
        int01 = Integer.parseInt(a);
    } catch (Exception ex){
        System.out.println(ex.getMessage());
    }
    RESULT = new Nodo(int01);

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("OPER",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // OPER ::= CADENA 
            {
              Nodo RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
    RESULT = new Nodo(a);

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("OPER",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // OPER ::= TRUE 
            {
              Nodo RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
    RESULT = new Nodo(a);

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("OPER",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // OPER ::= FALSE 
            {
              Nodo RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
    RESULT = new Nodo(a);

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("OPER",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // OPER ::= REAL 
            {
              Nodo RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
    Double double01 = 0.0;
    try{
        double01 = Double.parseDouble(a);
    } catch (Exception ex){
        System.out.println(ex.getMessage());
    }
    RESULT = new Nodo(double01);

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("OPER",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$Parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
              return CUP$Parser$do_action_part00000000(
                               CUP$Parser$act_num,
                               CUP$Parser$parser,
                               CUP$Parser$stack,
                               CUP$Parser$top);
    }
}

}