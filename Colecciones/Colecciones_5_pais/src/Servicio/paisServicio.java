/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Pais;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import sun.awt.image.ByteBandedRaster;

/**
 * Se requiere un programa que lea y guarde países, y para evitar que se
 * ingresen repetidos usaremos un conjunto. El programa pedirá un país en un
 * bucle, se guardará el país en el conjunto y después se le preguntará al
 * usuario si quiere guardar otro país o si quiere salir, si decide salir, se
 * mostrará todos los países guardados en el conjunto. (Recordemos hacer los
 * servicios en la clase correspondiente) Después deberemos mostrar el conjunto
 * ordenado alfabéticamente: para esto recordar cómo se ordena un conjunto. Por
 * último, al usuario se le pedirá un país y se recorrerá el conjunto con un
 * Iterator, se buscará el país en el conjunto y si está en el conjunto se
 * eliminará el país que ingresó el usuario y se mostrará el conjunto. Si el
 * país no se encuentra en el conjunto se le informará al usuario.
 *
 * @author Melina Narambuena
 */
public class paisServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public HashSet<Pais> crearPais() {
        HashSet<Pais> paises = new HashSet();
        String pais;
        String respuesta;
        String respuesta2;

        do {
            System.out.println("¿Desea ingresar un país? s/n");
            respuesta = leer.next();

            if (respuesta.equalsIgnoreCase("s")) {

                Pais p1 = new Pais();
                paises.add(p1);
                System.out.println("Ingrese el país, por favor:");
                pais = leer.next();

                p1.setNombre(pais);
            }

            if (respuesta.equalsIgnoreCase("n")) {
                System.out.println("La lista de paises es:");
                for (Pais mostrar : paises) {
                    System.out.println(mostrar);
                }
            }

        } while (respuesta.equalsIgnoreCase("s"));

        return paises;
    }

    public void ordenAlfabetico(HashSet<Pais> paises) {
        // Crear un Comparator para comparar por duración de mayor a menor
        Comparator<Pais> comparadorNombre = new Comparator<Pais>() {
            @Override
            public int compare(Pais p1, Pais p2) {
                return p1.getNombre().compareTo(p2.getNombre());
            }
        };

        // Ordenar la lista de países utilizando el Comparator
        ArrayList<Pais> listaOrdenada = new ArrayList<>(paises);
        Collections.sort(listaOrdenada, comparadorNombre);

        // Imprimir la lista ordenada
        System.out.println("La lista ordenada alfabeticamente es:");
        for (Pais mostrar : listaOrdenada) {
            System.out.println(mostrar);
        }
    }

    public void recorrer(HashSet<Pais> paises) {
        String buscarPais;
        System.out.println("Ingrese el país a buscar y eliminar, por favor:");
        buscarPais = leer.next();
        
        Iterator<Pais> it = paises.iterator();
        while (it.hasNext()) {
            Pais buscar = it.next();
            
            if (buscarPais.equals(buscar.getNombre())) {
                it.remove();
            }else{
                System.out.println("No se encontró el país a buscar.");
            }
            
        }
        
        paises.forEach((e) -> System.out.println(e));
    }

}
