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
public class Cuadrado extends shape{
    
    
    private int lado;
    
    public Cuadrado(int lado){
        
        this.lado = lado;
    }
    @Override
    public double getArea() {
        
        return lado *lado;
    }
    
}
