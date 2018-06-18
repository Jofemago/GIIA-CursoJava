/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session3taller2;

/**
 *
 * @author Pipe
 */
public class Session3taller2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        EstudianteInformatica felipe = new EstudianteInformatica("felipe", "marin", 22);
        
        felipe.mostrarInfo();
        
        felipe.addLenguajeProgramacion("c++");
        felipe.addLenguajeProgramacion("java");
        felipe.addLenguajeProgramacion("python");
        
        System.out.println("");
        felipe.mostrarInfo();
    }
    
}
