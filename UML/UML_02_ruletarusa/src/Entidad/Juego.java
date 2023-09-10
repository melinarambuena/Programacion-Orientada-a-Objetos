/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.ArrayList;

/**
 *
 * @author Melina Narambuena
 */
public class Juego {
    private RevolverdeAgua revolver;
    private ArrayList<Jugador> jugadores;     

    public Juego() {
    }

    public Juego(RevolverdeAgua revolver, ArrayList<Jugador> jugadores) {
        this.revolver = revolver;
        this.jugadores = jugadores;
    }

    public RevolverdeAgua getRevolver() {
        return revolver;
    }

    public void setRevolver(RevolverdeAgua revolver) {
        this.revolver = revolver;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    @Override
    public String toString() {
        return "Juego{" + "revolver=" + revolver + ", jugadores=" + jugadores + '}';
    }

    
}
