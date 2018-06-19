/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adicional.primero;

/**
 *
 * @author Pipe
 */
public class Factura extends Precio {
    
    private String emisor;
    private String cliente;
    
    public Factura(String emisor, String cliente){
        
        this.pesos = pesos;
        this.emisor = emisor;
       
    }
    
    public void imprimirFactura(){
        
        
        System.out.println("Emisor : " + this.emisor);
        System.out.println("Cliente: " + this.cliente);
        System.out.println("Total a pagar: " + this.pesos);
    }
    
}
