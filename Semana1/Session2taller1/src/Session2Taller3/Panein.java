/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session2Taller3;

import javax.swing.JOptionPane;

/**
 *
 * @author Pipe
 */
public class Panein {
    
    
    
    public static void main(String[] args) {
        
        String a = JOptionPane.showInputDialog("ingrese una palabra");
        String b = JOptionPane.showInputDialog("ingrese una palabra");
        String c = JOptionPane.showInputDialog("ingrese una palabra");
        
        JOptionPane.showMessageDialog(null, "El mensaje es:\n"+ a+" " + b+" " +c);
    }
}
