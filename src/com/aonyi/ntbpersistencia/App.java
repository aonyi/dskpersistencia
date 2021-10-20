/*
 * Clase APP que contiene el método de entrada a la aplicación
 */
package com.aonyi.ntbpersistencia;
import com.aonyi.ntbpersistencia.controlador.Controlador;

/**
 *
 * @author Fernando Aguirre
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Se crea la clase controladora y se pide la vista
        Controlador controlador = new Controlador();
        

        // llama a la ventana y la muestra
        controlador.mostrarVentanaListaCliente();
    }
    
}
