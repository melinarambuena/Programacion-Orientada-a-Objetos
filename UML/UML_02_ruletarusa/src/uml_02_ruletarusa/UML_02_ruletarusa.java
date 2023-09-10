/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uml_02_ruletarusa;

import Entidad.Juego;
import Entidad.Jugador;
import Entidad.RevolverdeAgua;
import Servicio.JuegoServicio;
import Servicio.JugadorServicio;
import Servicio.RevolverServicio;
import java.util.ArrayList;

/**
 *
 * @author Melina Narambuena
 */
public class UML_02_ruletarusa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        RevolverServicio rs = new RevolverServicio();
        RevolverdeAgua r1 = rs.llenarRevolver();
//        boolean mojar = RevolverServicio.mojar(r1);
//        rs.mojar(r1);
//        rs.siguienteChorro(r1);
        System.out.println(r1.toString());
        Jugador j1 = new Jugador();
        JugadorServicio js = new JugadorServicio();
        ArrayList<Jugador> jugadores = js.crearJugadores(r1);

//        for (Jugador mostrar : jugadores) {
//            System.out.println(mostrar);
//        }
//        js.disparo(r1, jugadores);

        
//        for (Jugador mostrar : jugadores) {
//            System.out.println(mostrar);
//        }

        Juego jue = new Juego();
        JuegoServicio jues = new JuegoServicio();
        
//        jues.llenarJuego(jugadores, r1);
        jues.ronda(r1, jugadores);
        
//        
//        for (Jugador mostrar : jugadores) {
//            System.out.println(mostrar);
//        }
        
//        Jugador j1 = new Jugador();
//        System.out.println("el nombre es: " + j1.getNombre());      
    }

}
