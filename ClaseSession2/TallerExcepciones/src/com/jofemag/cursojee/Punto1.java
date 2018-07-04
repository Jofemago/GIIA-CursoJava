/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jofemag.cursojee;

/**
 *
 * @author Pipe
 */
public class Punto1 {

    
  
    public char esHexadecimalValido(String cadena) {

        String validos = "0123456789ABCDEF";
        for (char c : cadena.toCharArray()) {
            if (validos.indexOf(c) == -1) {
                return c;
            }
        }
        return '\0';
    }

    public Long convertirHexatoDec(String cadena) throws ParseStringtoHexadecimalException {
        char caracter = this.esHexadecimalValido(cadena);
        if ( caracter != '\0') {
            throw new ParseStringtoHexadecimalException(" El caracter '"+ caracter +"' no es valido");
        }
        return null;
    }

    public static void main(String[] args) {
        // TODO code application logic here

        Punto1 p = new Punto1();

        try {
            Long conversion = p.convertirHexatoDec("AAAAJ");
            System.out.println("El numero hexadimal es: " + conversion);
        } catch (ParseStringtoHexadecimalException ex) {
            System.err.println("Error en el formato de la cadena Hexadecimal" + ex.getMessage());
        }

    }

}
