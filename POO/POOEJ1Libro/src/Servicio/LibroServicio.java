package Servicio;

import Entidades.Libro;
import java.util.Scanner;

public class LibroServicio {

    public Libro altaLibro() {
        //Instanciar objeto de tipo libro
        Libro l1 = new Libro();
        //Lleno los atributos
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el ISBN del libro, por favor:");
        l1.setISBN(leer.nextInt());
        System.out.println("Ingrese el título del libro, por favor:");
        l1.setTitulo(leer.next());
        System.out.println("Ingrese el autor del libro, por favor:");
        l1.setAutor(leer.next());
        System.out.println("Ingrese el número de páginas, por favor:");
        l1.setNumerodePaginas(leer.nextInt());
        return l1;
    }

    public void mostrarInfo(Libro l1) {
        System.out.println("El ISBN del libro es: " + l1.getISBN() + ", el título del libro es: "
                + l1.getTitulo() + ", el autor del libro es: " + l1.getAutor() + ", el número de páginas es:" + l1.getNumerodePaginas());
    }
}
