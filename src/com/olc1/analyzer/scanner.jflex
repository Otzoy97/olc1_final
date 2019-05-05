package com.olc1.analyzer;

import java_cup.runtime.Symbol;

%%
%{

%}

%cupsym sym
%class Scanner
%cup 
%public
%unicode
%line
%column
%char
%ignorecase
%full

ENTERO = [0-9]+
DECIMAL = {ENTERO}"."{ENTERO}
CADENA = [\"][^\"\n]*[\"\n] | [\'][^\'\n][\'\n]
ESPACIO = \t\f | " " | \r| \n

%%
{ENTERO} {
    //System.out.println(yytext());
    return new Symbol(sym.ENTERO, yycolumn, yyline, yytext());
}
{CADENA} {
    //System.out.println(yytext());
    return new Symbol(sym.CADENA, yycolumn, yyline, yytext());
}
{ESPACIO} {

}
{DECIMAL} {
    //System.out.println(yytext());
    return new Symbol(sym.REAL, yycolumn, yyline, yytext());
}
    "+" {
        //System.out.println(yytext());
        return new Symbol(sym.MAS,yycolumn,yyline,yytext());
    }
    "-" {
        ///System.out.println(yytext());
        return new Symbol(sym.MENOS,yycolumn,yyline,yytext());
    }
    "*" {
        //System.out.println(yytext());
        return new Symbol(sym.PRODUCTO,yycolumn,yyline,yytext());
    }
    "/" {
        //System.out.println(yytext());
        return new Symbol(sym.DIVISION,yycolumn,yyline,yytext());
    }
    "true" {
        ///System.out.println(yytext());
        return new Symbol(sym.TRUE,yycolumn,yyline,yytext());
    }
    "false" {
        //System.out.println(yytext());
        return new Symbol(sym.FALSE,yycolumn,yyline,yytext());
    }
    ";" {
        //System.out.println(yytext());
        return new Symbol(sym.SEMICOLON,yycolumn,yyline,yytext());
    }
    "," {
        //System.out.println(yytext());
        return new Symbol(sym.COMMA,yycolumn,yyline,yytext());
    }