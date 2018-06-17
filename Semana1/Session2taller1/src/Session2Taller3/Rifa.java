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
public class Rifa {
    
    
    public static void main(String[] args) {
        
        int a = new java.util.Random().nextInt(100);
        System.out.println(a);
        
        System.out.println("Adivina cual es el numero, tienes infinitos intentos ;D");
        boolean find = false;
        Scanner scanin = new Scanner(System.in);
        
        
        while(!find ){
            
            System.out.println("Intentelo pues");
            String obtener = scanin.nextLine();
            
            try{
                Integer.parseInt(obtener);
                
            }catch(NumberFormatException ex){
                System.out.println("No es un numero intente de nuevo");
                continue;
            }
            
            int num = Integer.parseInt(obtener);
            if(num == a ){
                find = true;
            }else if(num > a){
                System.out.println("El numero que buscas es menor");
            }else if(num < a){
                System.out.println("El numero que buscar es mayor ");
            }
                       
        }
        System.out.println("Ganó");
    }
}
