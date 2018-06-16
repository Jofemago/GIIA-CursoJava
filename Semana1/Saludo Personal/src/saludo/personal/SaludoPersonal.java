/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saludo.personal;

/**
 *
 * @author Pipe
 */
public class SaludoPersonal {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // TODO code application logic here
        
        if(  args.length > 0){
            
            System.out.println(args[0] + ", Bienvenido al curso de Programacion en Java ");
            return;
        }
        System.out.println("No conozco tu nombre");
    }
    
}
