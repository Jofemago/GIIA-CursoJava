/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Diamantes;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Pipe
 */
public class Diamante {
    
    public static void makeDiamante(int n){
        
        assert n < 0: "no puedo usar numeros negativos";
        if(n == 3){
            System.out.println("  *\n"
                    + " ***\n"
                    + "*****\n"
                    + " ***\n"
                    + "  *");
            
            return;
        }
        System.out.println("No tengo diamantes para ese número, disculpe");
    }
    
    public static void main(String[] args) {
        
        Scanner sc;
        sc = new Scanner(System.in);
        int n;
        try{
            System.out.println("Ingrese un numero: ");
            n = sc.nextInt();  
        }catch(InputMismatchException e){
            System.out.println("Lo hiciste mal, vamos a cancelar el programa");
            n = -1;
        }
        
        makeDiamante(n);
    }
    
}
