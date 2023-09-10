/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Juego;
import Entidad.Jugador;
import Entidad.RevolverdeAgua;
import java.util.ArrayList;

/**
 *
 * @author Melina Narambuena
 */
public class JuegoServicio {

    public void llenarJuego(ArrayList<Jugador> jugadores, RevolverdeAgua r1) {
        Juego jue = new Juego();
        jue.setJugadores(jugadores);
        jue.setRevolver(r1);
    }

    public void ronda(RevolverdeAgua r1, ArrayList<Jugador> jugadores) {
        RevolverServicio rs = new RevolverServicio();

        JugadorServicio js = new JugadorServicio();
        boolean bandera;

//        for (Jugador j1 : jugadores) {
//            System.out.println(j1);
//        }
        do {
            
            bandera = rs.mojar(r1);
            System.out.println(bandera);
//            rs.siguienteChorro(r1);
            js.disparo(r1, jugadores);
            
            System.out.println("la posicion actual es:" + r1.getPosicionActual() + "la posicion del agua es:" + r1.getPosicionAgua());
        for (Jugador mostrar : jugadores) {
                System.out.println(mostrar);
            }

        } while (r1.getPosicionActual() != r1.getPosicionAgua());
    }

}
