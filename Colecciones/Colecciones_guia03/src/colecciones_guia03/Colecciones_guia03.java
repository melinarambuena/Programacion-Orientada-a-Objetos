/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones_guia03;

import Entidad.Libro;
import java.util.ArrayList;

/**
 *
 * @author Melina Narambuena
 */
public class Colecciones_guia03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    ArrayList<Libro> libros = new ArrayList();
    Libro libro = new Libro();
    libro.setTitulo("Harry Potter y la Piedra Filosofal");
    Libro libro2 = new Libro();
    libro2.setTitulo("Harry Potter y la Camara Secreta");
    Libro libro3 = new Libro();
    libro3.setTitulo("Harry Potter y el Prisionero de Azkaban");
    Libro libro4 = new Libro();
    libro4.setTitulo("Harry Potter y el Caliz de Fuego");
    Libro libro5 = new Libro();
    libro5.setTitulo("Harry Potter y el Principe Mestizo");
    Libro libro6 = new Libro();
    libro6.setTitulo("Harry Potter y las Reliquias de la Muerte ");

    libros.add(libro);
    libros.add(libro2);
    libros.add(libro3);
    libros.add(libro4);
    libros.add(libro5);
    libros.add(libro6);

    for(Libro ejemplar : libros){
        System.out.println(ejemplar);
    }


    }
    
}
