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
public class Session3taller1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        LibretaDeDirecciones libreta = new LibretaDeDirecciones();
        
        //Agregamos varios registros
        libreta.AñadirEntrada("felipe", "111111", "Cartago", "maringonzalezf@gmail.com");
        libreta.AñadirEntrada("jairo", "222222", "pereira", "jairo@gmail.com");
        libreta.AñadirEntrada("juan", "3333333", "manizalez", "juan@gmail.com");
        libreta.AñadirEntrada("pedro", "44444", "Cartago", "pedro@gmail.com");
        libreta.AñadirEntrada("ricardo", "55555", "venezuela", "ricardo@gmail.com");
        libreta.AñadirEntrada("liliana", "111111", "jupyter", "liliana@gmail.com");
        libreta.AñadirEntrada("Martha", "111111", "Cartago", "martgaf@gmail.com");
        libreta.AñadirEntrada("johan", "111111", "Cartago", "johan@gmail.com");
        
        
        //mostramos las entradas
        libreta.listarEntradas();
        
        
        
        //borramos algunas entradas
        libreta.BorrarEntrada(0);
        libreta.BorrarEntrada(4);
        libreta.BorrarEntrada(5);
        
        
        //mostramos las entradas
        libreta.listarEntradas();
        
        
        //modificamos
        libreta.actualizarEntrada(0, "prueba", "prueba", "prueba", "prueba");
        
        //listamos
        
        libreta.listarEntradas();
    }
    
}
