/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.olc1.analyzer;


import java.util.LinkedList;
/**
 *
 * @author otzoy
 */
public class Nodo {
    /**
     * Guarda el objeto que se analizó y con el que se puede operar
     */
    private Object resultado;
    /**
     * Cadena que concatena lo que ha encontrado el analizador sintáctico
     */
    private String concatenado ="";
    /**
     * Determina el tipo de dato guardado
     */
    public boolean esEntero;
    public boolean esDouble;
    public boolean esString;
    
    public Nodo( Object resultado){
        this.resultado = resultado;
        this.concatenado = String.valueOf(resultado);
        //Determina el tipo de dato que se guardó
        esEntero = (resultado instanceof Integer);
        esDouble = (resultado instanceof Double);
        esString = (resultado instanceof String);
        System.out.println(resultado + " "+ esEntero + " " + esDouble + " " + esString);
    }

    public Object getResultado() {       
        return resultado;
    }

    public void setResultado(Object resultado) {
        this.resultado = resultado;
    }

    public String getConcatenado() {
        return concatenado;
    }

    public void setConcatenado(String concatenado) {
        this.concatenado = concatenado;
    }   
}
