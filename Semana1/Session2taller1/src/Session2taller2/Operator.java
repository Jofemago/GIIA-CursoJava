/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session2taller2;

/**
 *
 * @author Pipe
 */
public class Operator {
    
    public static void main(String[] args) {
        
        
        if(args.length == 2){
            
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            
            System.out.println("Suma: "+ (a+b));
            System.out.println("resta: "+ (a-b));
            System.out.println("Multiplicacion: "+ (a*b));
            System.out.println("Division: "+ (a / b));
        }else{
            System.out.println("Numero de argumentos invalidos");
        }
    }
}
