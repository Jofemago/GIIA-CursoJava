/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session2Taller3;

import java.util.Scanner;

/**
 *
 * @author Pipe
 */
public class Escanerin {
    
    public static void main(String[] args) {
        Scanner scanin = new Scanner(System.in);
        System.out.println("Ingrese tres palabras separadas por enter: ");
        String a = scanin.nextLine();
        String b = scanin.nextLine();
        String c = scanin.nextLine();
        
        
        System.out.println(a + " " + b + " " + c);
    }
}
