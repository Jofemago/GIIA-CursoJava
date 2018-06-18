/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session3taller2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pipe
 */
public class EstudianteInformatica extends Estudiante{
    
    private List<String> lenguajesdeprogramacion;
    
    public EstudianteInformatica(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        lenguajesdeprogramacion = new ArrayList<String>();
    }
    
    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Lenguajes de programacion:  ");
        for(int i = 0; i < this.lenguajesdeprogramacion.size() ; i++){
            System.out.println("\t\t\t "+ this.lenguajesdeprogramacion.get(i));
        }
    }
    
    
    public void addLenguajeProgramacion(String lenguaje){
        
        this.lenguajesdeprogramacion.add(lenguaje);
    }
    
}
