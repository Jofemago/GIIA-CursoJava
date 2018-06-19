/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adicional.cuarto;

/**
 *
 * @author Pipe
 */
public class Math3 implements Extremos{

    @Override
    public int min(int[] a) {
        int res  = 0;
        if(a.length <= 0){
            System.out.println("Sin elementos");
        }else{
            res = a[0];
            for(int i = 0; i < a.length ; i++){
                
                if( res > a[i])
                    res = a[i];
            }
        }
        return res;
    }

    @Override
    public int max(int[] a) {
        int res = 0;
        if(a.length <= 0){
            System.out.println("Sin elementos");
        }else{
            res = a[0];
            for(int i = 0; i < a.length ; i++){
                
                if( res < a[i])
                    res = a[i];
            }
        }
        return res;
    }

    @Override
    public double min(double[] a) {
        double res  = 0;
        if(a.length <= 0){
            System.out.println("Sin elementos");
        }else{
            res =  a[0];
            for(int i = 0; i < a.length ; i++){
                
                if( res > a[i])
                    res = a[i];
            }
        }
        return res;
    }

    @Override
    public double max(double[] a) {
        double res = 0;
        if(a.length <= 0){
            System.out.println("Sin elementos");
        }else{
            res = a[0];
            for(int i = 0; i < a.length ; i++){
                
                if( res < a[i])
                    res = a[i];
            }
        }
        return res;
    }
    
    
    public static void main(String[] args) {
        int a1[] = {5,6,8,3,4,7};
        double a2[] = {5.2,7.9,6.4};
        Math3 k = new Math3();
        System.out.println("Enteros");
        System.out.println("Minimo: " + k.min(a1));
        System.out.println("Minimo: " + k.max(a1) + "\n");
        
        System.out.println("Flotantes");
        System.out.println("Minimo: " + k.min(a2));
        System.out.println("Minimo: " + k.max(a2) + "\n");
    }
}
