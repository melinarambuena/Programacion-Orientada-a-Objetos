/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Jugador;
import Entidad.RevolverdeAgua;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import sun.nio.cs.ext.SJIS_0213;

/**
 *
 * @author Melina Narambuena
 */
public class JugadorServicio {

    Scanner leer = new Scanner(System.in);

    public ArrayList<Jugador> crearJugadores(RevolverdeAgua r1) {
        int cantidad;
        int numeroJ = 0;
        String nombre;

        System.out.println("¿Cuántos jugadores forman parte del juego?");
        cantidad = leer.nextInt();

        if (cantidad > 6 || cantidad < 1) {
            cantidad = 6;
            
        }

//        RevolverdeAgua r1 = new RevolverdeAgua();
        ArrayList<Jugador> jugadores = new ArrayList();

        for (int i = 0; i < cantidad; i++) {
            Jugador j1 = new Jugador();
            numeroJ = numeroJ + 1;
            j1.setId(numeroJ);
            nombre = "Jugador " + numeroJ;
            j1.setNombre(nombre);

//            System.out.println("posicion actual: " + r1.getPosicionActual() + "posicion agua: " + r1.getPosicionAgua());
            if (r1.getPosicionActual() == r1.getPosicionAgua()) {
                j1.setMojado(true);
            }

            jugadores.add(j1);

        }

        return jugadores;
    }

    public  boolean disparo(RevolverdeAgua r1, ArrayList<Jugador> jugadores) {
        boolean mojado = false;

        RevolverServicio rs = new RevolverServicio();
        rs.mojar(r1);
        rs.siguienteChorro(r1);

        for (int i = 0; i < jugadores.size(); i++) {

            Jugador j1 = jugadores.get(i);

            if (r1.getPosicionActual() == r1.getPosicionAgua() ) {

                j1.setMojado(true);

                mojado = true;
                return mojado;
            }
        }

//        System.out.println("posicion actual: " + r1.getPosicionActual() + "posicion agua: " + r1.getPosicionAgua());

        return mojado;
    }

}
