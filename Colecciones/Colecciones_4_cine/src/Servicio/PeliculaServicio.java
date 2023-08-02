/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Pelicula;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;


/**
 *
 * @author Melina Narambuena
 */
public class PeliculaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public ArrayList<Pelicula> crearPelicula() {
        ArrayList<Pelicula> listaPeliculas = new ArrayList();

        String respuesta;

        do {

            System.out.println("¿Desea agregar una pelicula, s/n?");
            respuesta = leer.next();

            if (respuesta.equalsIgnoreCase("s")) {
                Pelicula p1 = new Pelicula();

                System.out.println("Ingrese el título, por favor:");
                String titulo = leer.next();
                p1.setTitulo(titulo);

                System.out.println("Ingrese el director, por favor:");
                String director = leer.next();
                p1.setDirector(director);

                System.out.println("Ingrese la duración, por favor:");
                int duracion = leer.nextInt();
                p1.setDuracion(duracion);


                listaPeliculas.add(p1);
                
            }

        } while (respuesta.equalsIgnoreCase("s"));

        return listaPeliculas;
    }

    public void mostrarPelicula(ArrayList<Pelicula> listaPeliculas) {
        System.out.println("Las lista de películas es:");
        for (Pelicula mostrar : listaPeliculas) {
            System.out.println(mostrar);
        }
    }

    public void mostrarMenor(ArrayList<Pelicula> listaPeliculas){
        System.out.println("Las peliculas con duración mayor a 1 hora son:");
        for (int i = 0; i < listaPeliculas.size(); i++) {
            Pelicula p1 = listaPeliculas.get(i);
            
            if (p1.getDuracion()> 1) {
                System.out.println(p1);
            }
            

        }
    }

    public void ordenaMayorMenor(ArrayList<Pelicula> listaPeliculas){
        
        // Crear un Comparator para comparar por duración de mayor a menor
        Comparator<Pelicula> comparadorDuracion = new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula p1, Pelicula p2) {
                return Integer.compare(p2.getDuracion(), p1.getDuracion());
            }
        };

        // Ordenar la lista de películas utilizando el Comparator
        Collections.sort(listaPeliculas, comparadorDuracion);

        // Imprimir la lista ordenada
        System.out.println("La lista de mayor a menor es:");
        for (Pelicula mostrar : listaPeliculas) {
            System.out.println(mostrar);
        }
              
}
    
    public void ordenaMenorMayor(ArrayList<Pelicula> listaPeliculas){
        // Crear un Comparator para comparar por duración de mayor a menor
        Comparator<Pelicula> comparadorDuracion = new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula p1, Pelicula p2) {
                return Integer.compare(p2.getDuracion(), p1.getDuracion());
            }
        };

        // Ordenar la lista de películas utilizando el Comparator
        Collections.sort(listaPeliculas, comparadorDuracion.reversed());

        // Imprimir la lista ordenada
        System.out.println("La lista de menor a mayor es:");
        for (Pelicula mostrar : listaPeliculas) {
            System.out.println(mostrar);
        }
    }
    
    public void ordenarTitulo(ArrayList<Pelicula> listaPeliculas){
        // Crear un Comparator para comparar por duración de mayor a menor
        Comparator<Pelicula> comparadorTitulo = new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula p1, Pelicula p2) {
               return p1.getTitulo().compareTo(p2.getTitulo());
            }
        };

        // Ordenar la lista de películas utilizando el Comparator
        Collections.sort(listaPeliculas, comparadorTitulo);
        
        // Imprimir la lista ordenada
        System.out.println("La lista ordenada alfabeticamente por título es:");
        for (Pelicula mostrar : listaPeliculas) {
            System.out.println(mostrar);
        }
    }
    
    public void ordenarDirector(ArrayList<Pelicula> listaPeliculas){
        // Crear un Comparator para comparar por duración de mayor a menor
        Comparator<Pelicula> comparadorDirector = new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula p1, Pelicula p2) {
               return p1.getDirector().compareTo(p2.getDirector());
            }
        };

        // Ordenar la lista de películas utilizando el Comparator
        Collections.sort(listaPeliculas, comparadorDirector);
        
        // Imprimir la lista ordenada
        System.out.println("La lista ordenada alfabeticamente por director es:");
        for (Pelicula mostrar : listaPeliculas) {
            System.out.println(mostrar);
        }
    }
}

