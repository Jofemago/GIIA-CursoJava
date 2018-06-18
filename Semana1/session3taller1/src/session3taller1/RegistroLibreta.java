/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session3taller1;

/**
 *
 * @author Pipe
 */
public class RegistroLibreta {
     
    
    private String nombre;
    private String direccion;
    private String telefono;
    private String email;
    
    
    public RegistroLibreta(){
        nombre = "";
        direccion = "";
        telefono = "";
        email = "";
    }
    
    public RegistroLibreta(String name, String dir, String tel, String em){
        nombre = name;
        direccion = dir;
        telefono = tel;
        email = em;
        
    }
    
    
    public void setNombre (String x){
        
        nombre = x;
    }
    public void setTelefono (String x){
        
        telefono = x;
    }
    public void setDireccion (String x){
        
        direccion = x;
    }
    public void setEmail(String x){
        
         email = x;
    }
    
    public String getNombre (){
        return nombre;
    }
    
    public String getTelefono (){
        return telefono;
    }
    
    public String getDireccion (){
        return direccion;
    }
    
    public String getEmail (){
        return email;
    }
}
