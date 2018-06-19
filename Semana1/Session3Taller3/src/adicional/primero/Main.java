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
public class Main {
    
    public static void main(String[] args) {
        
        Factura venta = new Factura("Felipe" , "Karol");
        venta.setPesos(100000);
        venta.imprimirFactura();
        
    }
}
