/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones_4_pelicula;

import Entidad.Pelicula;
import Servicio.PeliculaServicio;
import java.util.ArrayList;

/**
 *
 * @author Melina Narambuena
 */
public class Colecciones_4_pelicula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    PeliculaServicio ps = new PeliculaServicio();
    ArrayList<Pelicula> listaPeliculas = ps.crearPelicula();
    ps.mostrarPelicula(listaPeliculas);
    ps.mostrarMenor(listaPeliculas);
    ps.mostrarMenor(listaPeliculas);
    ps.ordenaMayorMenor(listaPeliculas);
    ps.ordenaMenorMayor(listaPeliculas);
    ps.ordenarTitulo(listaPeliculas);
    ps.ordenarDirector(listaPeliculas);
    }
    
}
