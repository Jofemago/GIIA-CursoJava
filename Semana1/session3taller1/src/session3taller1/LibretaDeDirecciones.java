/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session3taller1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pipe
 */
public class LibretaDeDirecciones {
    
    private List<RegistroLibreta> registros;
   
    public LibretaDeDirecciones(){
        
        registros = new ArrayList<RegistroLibreta>();
    }
    
    
    public void AñadirEntrada(String nombre, String telefono, String direccion, String email){
        
        
        if(registros.size() < 100){//solo voy admitir 100 registros
            RegistroLibreta p = new RegistroLibreta(nombre, telefono, direccion,email);
            registros.add(p);
            System.out.println("Se ha añadido un registro satisfactoriamente" + registros.size());
        }
        
    }
    
    
    public void BorrarEntrada(int index){
        System.out.println("\nBORRADO");
        if(index < 0 || index >= registros.size()){
            
            System.out.println("Indice invalido, intente con otro");
        }else{
            
            System.out.println("Eliminado exitoso");
            RegistroLibreta remove = registros.remove(index);
            
            System.out.println("Estos son los datos del registro que se han eliminado:\n");
            System.out.println("\tNombre: " +remove.getNombre());
            System.out.println("\tTelefono: " +remove.getTelefono());
            System.out.println("\tDireccion: " +remove.getDireccion());
            System.out.println("\tEmail: " +remove.getEmail());
            
            
        }
        
    }
    
    public void buscarEntrada(int index){
        if(index < 0 || index >= registros.size()){
            
            System.out.println("Indice invalido, intente con otro");
        }else{
            System.out.println("El registro del indice "+ index + " es: ");
            RegistroLibreta remove = registros.get(index);
            
            //System.out.println("Estos son los datos del registro que se han eliminado:\n");
            System.out.println("\tNombre: " +remove.getNombre());
            System.out.println("\tTelefono: " +remove.getTelefono());
            System.out.println("\tDireccion: " +remove.getDireccion());
            System.out.println("\tEmail: " +remove.getEmail() + "\n");
        }
    }
    
    public void listarEntradas(){
        System.out.println("\nLISTAR");
        for(int i = 0 ; i < registros.size(); i++){
            buscarEntrada(i);
        }
    }
    
    
    public void actualizarEntrada(int index, String nombre, String telefono, String direccion, String email){
        
        
        if(registros.size() < 100){//solo voy admitir 100 registros
            RegistroLibreta p = registros.get(index);
            
            p.setNombre(nombre);
            p.setTelefono(telefono);
            p.setDireccion(direccion);
            p.setEmail(email);
                    
            System.out.println("Se ha modificado un registro satisfactoriamente" );
        }
        
    }
}
