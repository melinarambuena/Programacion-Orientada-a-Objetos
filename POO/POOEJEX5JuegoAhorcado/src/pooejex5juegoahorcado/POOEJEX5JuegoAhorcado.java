/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejex5juegoahorcado;

import Entidad.Ahorcado;
import Servicio.AhorcadoServicio;

/**
 *
 * @author Melina Narambuena
 */
public class POOEJEX5JuegoAhorcado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AhorcadoServicio as = new AhorcadoServicio();
//        Ahorcado a1 = new Ahorcado();
        Ahorcado a1 = as.crearJuego();
//        as.longitud(a1);
//        String letra = as.buscar(a1);
//        as.encontradas(a1, letra);
//        as.intentos(a1);
          as.juego(a1);
    }
    
}
