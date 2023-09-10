/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagramas_guia_02;

import Entidad.Equipo;
import Entidad.Jugador;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Melina Narambuena
 */
public class Diagramas_guia_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Jugador j1 = new Jugador("marcos","j","delantero", 5);
        Equipo e1 = new Equipo();
        List<Jugador> jugadores = new ArrayList();
        e1.setJugadores(jugadores);
        jugadores.add(j1);
        
        System.out.println("La lista de jugadores es:");
        
        for (Jugador mostrar : jugadores) {
            System.out.println(mostrar);
        }
        
        
        
        
        
        
        













    }
    
}
