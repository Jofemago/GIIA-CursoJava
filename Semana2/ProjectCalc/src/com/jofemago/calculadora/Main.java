/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jofemago.calculadora;

/**
 *
 * @author Pipe
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        // TODO code application logic here
        
        Calculadora n = new Calculadora();
        
        try {
            System.out.println(n.inverso("0"));
        }catch(InvalidOperatorException ex){
            System.err.println("Error: " + ex.getMessage());
        }
        
        
        /*
        try{
            System.out.println(n.division("100", "0", 10));
            System.out.println(n.division("10", "11", 2));
            System.out.println(n.division("3", "7", 8));
            System.out.println(n.division("8", "ff", 16));
        }catch(Exception e){
            System.err.println("error: "+e.getMessage());
        }
        */
        /*
        try{
            System.out.println(n.multiplicacion("100", "100", 10));
            System.out.println(n.multiplicacion("10", "11", 2));
            System.out.println(n.multiplicacion("3", "7", 8));
            System.out.println(n.multiplicacion("8", "ff", 16));
        }catch(Exception e){
            System.err.println("error: "+e.getMessage());
        }*/
        /*
        try{
            System.out.println(n.suma("100", "100", 10));
            System.out.println(n.suma("10", "11", 2));
            System.out.println(n.suma("3", "7", 8));
            System.out.println(n.suma("8", "7", 16));
        }catch(Exception e){
            System.err.println("error: "+e.getMessage());
        }
        */
        /*
        try{
            System.out.println(n.resta("100", "100", 10));
            System.out.println(n.resta("10", "11", 2));
            System.out.println(n.resta("3", "7", 8));
            System.out.println(n.resta("f", "ff", 16));
        }catch(Exception e){
            System.err.println("error: "+e.getMessage());
        }*/
        /*
        try{
            System.out.println(n.suma("100", "100", 10));
            System.out.println(n.suma("10", "11", 2));
            System.out.println(n.suma("3", "7", 8));
            System.out.println(n.suma("8", "7", 16));
        }catch(Exception e){
            System.err.println("error: "+e.getMessage());
        }*/
        /*
        try{
            //prueba de las conversiones de hexadecimales
            System.out.println(n.decimalToBinario("1615"));
            System.out.println(n.decimalToHexa("1615"));
            System.out.println(n.decimalToOctal("1615"));
        }catch(BadConversionException ex){
            System.err.println("error: " + ex.getMessage());
        }
        */
        /*
        try{
            //prueba de las conversiones de hexadecimales
            System.out.println(n.binarioToDecimal("11001001111"));
            System.out.println(n.binarioToHexa("11001001111"));
            System.out.println(n.binarioToOctal("11001001111"));
        }catch(BadConversionException ex){
            System.err.println("error: " + ex.getMessage());
        }
        */
        /*
        try{
            //prueba de las conversiones de hexadecimales
            System.out.println(n.hexaToBinario("64f"));
            System.out.println(n.hexaToDecimal("64f"));
            System.out.println(n.hexaToOctal("64f"));
        }catch(BadConversionException ex){
            System.err.println("error: " + ex.getMessage());
        }
        */
        
        /*
        try{
            //prueba de las conversiones de octal
            System.out.println(n.octalToHexa("3117"));
            System.out.println(n.octalToBinario("3117"));
            System.out.println(n.octalToDecimal("3117"));
        }catch(BadConversionException ex){
            System.err.println("error: " + ex.getMessage());
        }
        */
    }
    
}
