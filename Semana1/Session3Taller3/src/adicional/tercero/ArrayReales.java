/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adicional.tercero;

/**
 *
 * @author Pipe
 */
public class ArrayReales implements Estadisticas {

    
    double [] atributos;
    
    public ArrayReales(double [] arr){
        
        atributos = arr;
    }
    
    @Override
    public double minimo() {
       double res = 0;
       
       if(this.atributos.length <= 0 ){
           System.out.println("No tiene elementos");
       }else{
            res = this.atributos[0];
            for(int i = 0; i < this.atributos.length ; i++){
                
                if(res > this.atributos[i])
                    res = this.atributos[i];
            }   
       }
       return res;
    }

    @Override
    public double maximo() {
       double res = 0;
       
       if(this.atributos.length <= 0 ){
           System.out.println("No tiene elementos");
       }else{
            res = this.atributos[0];
            for(int i = 0; i < this.atributos.length ; i++){
                
                if(res < this.atributos[i])
                    res = this.atributos[i];
            }   
       }
       return res;
    }

    @Override
    public double sumatorio() {
        double res = 0;
       for(int i = 0; i < this.atributos.length ; i++)
           res += this.atributos[i];
       return res;
    }
    
    
    public static void main(String[] args) {
        double nums[] = {1.2,22.6,7.8,0.5,-50.6};
        ArrayReales pr = new ArrayReales(nums);
        
        System.out.println("Minimo: " + pr.minimo());
        System.out.println("Maximo: " + pr.maximo());
        System.out.println("Sumatorio: " + pr.sumatorio());
    }
    
}
