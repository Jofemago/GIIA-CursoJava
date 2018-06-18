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
public class Estudiante {
    
    private String nombre;
    private String apellido;
    private int edad;
    
    public Estudiante(String nombre, String apellido, int edad){
        
        this.nombre = nombre;
        this.edad = edad;
        this.apellido = apellido;
    }
    
    public String getNombre(){
        
        return this.nombre;
    }
    
    public String getApellido(){
        
        return this.apellido;
    }
    
    public int getEdad(){
        
        return this.edad;
    }
    
    public void mostrarInfo(){
        
        System.out.println("Nombre: "+ this.getNombre());
        System.out.println("Apellido: " + this.getApellido());
        System.out.println("Edad: "+ this.getEdad());
    }
    
    
}
