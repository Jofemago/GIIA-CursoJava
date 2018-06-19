/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adicional.segundo;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Pipe
 */
public final class Math2 {
    
    
    public static double min(double []array){
       double x = 0;
        if(array.length > 0){
            
            x = array[0];
            for(int i = 0; i < array.length; i++){
                
                if(x > array[i]){
                    
                    x = array[i];
                }
            }
        }else{
            System.out.println("No tiene elementos el arreglo");
            //return 0;
        }
        return x;
       
    }
    
    public static double max(double []array){
       double x = 0;
        if(array.length > 0){
            
            x = array[0];
            for(int i = 0; i < array.length; i++){
                
                if(x < array[i]){
                    
                    x = array[i];
                }
            }
        }else{
            System.out.println("No tiene elementos el arreglo");
            //return 0;
        }
        return x;
       
    }
    
    public static double sumatorio(double [] arr){
        
        double res = 0;
        
        for(int i = 0; i < arr.length ; i++){
            res += arr[i];
        }
            
        return res;
    }
    
    
    public static double mediaArtimetica(double [] arr){
        double res = 0;
        if(arr.length > 0){
            res = sumatorio(arr);
            res /= arr.length;
        }
        return res;
    }
    
    public static double MediaGeometrica(double [] arr){
        double res = 1;
        
        if(arr.length > 0){
            
            for(int i = 0; i < arr.length ; i++)
                res *= arr[i];
            
            res = Math.pow(res, 1 / arr.length);
            
            
        }
        
        return res;
    }
    
    public static void main(String[] args) {
        
        Random rd = new java.util.Random();//.nextDouble()
        
        double [] arr = new double[10];
        
        for(int i = 0; i < 10 ; i++){
            arr[i] = rd.nextDouble();
        }
        
        System.out.println(Arrays.toString(arr));
        System.out.println("Minimo: " + min(arr));
        System.out.println("Maximo: "+ max(arr));
        System.out.println("Sumatorio: "+ sumatorio(arr));
        System.out.println("Media Aritmetica: "+ mediaArtimetica(arr));
        System.out.println("Media Geometrica: "+ MediaGeometrica(arr));
        
    }
}
