package pooej1;

import Entidades.Libro;
import Servicio.LibroServicio;

public class POOEJ1 {

    public static void main(String[] args) {
        LibroServicio ls = new LibroServicio();
        Libro l1 = ls.altaLibro();
        ls.mostrarInfo(l1);
//        l1.altaLibro();
    }

}
