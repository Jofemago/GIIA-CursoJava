/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hexa;

import java.util.Scanner;

/**
 *
 * @author Pipe
 */
public class HexaToInt {
    
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String num = sc.next();
        //System.out.println(num);
            
        try{
            int n = Integer.parseInt(num, 16);
            System.out.println("Su numero es: " + n);
        }catch(NumberFormatException x){
            System.out.println("El numero fue mal escrito, no es hexadecimal");
        }
    }
}
