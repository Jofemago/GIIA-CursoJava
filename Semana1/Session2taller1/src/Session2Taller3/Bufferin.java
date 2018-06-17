/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session2Taller3;

import java.io.*;


/**
 *
 * @author Pipe
 */
public class Bufferin {
    public static void main(String[] args) {
        
        
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        String a = "";
        String b = "";
        String c = "";
        int n = 1;
        
        try{
            System.out.println("Ingrese una palabra: ");
            a = dataIn.readLine();
        }catch(IOException e){
            System.out.println("Error al ingresar la numero :"+ n);
        }
        
        n+=1;
        
        try{
            System.out.println("Ingrese una palabra: ");
            b = dataIn.readLine();
        }catch(IOException e){
            System.out.println("Error al ingresar la numero :"+ n);
        }
        
        n+=1;
        
        try{
            System.out.println("Ingrese una palabra: ");
            c = dataIn.readLine();
        }catch(IOException e){
            System.out.println("Error al ingresar la numero :"+ n);
        }
        
        n+=1;
        
        System.out.println(a + " " + b + " " + c);
    }
}
