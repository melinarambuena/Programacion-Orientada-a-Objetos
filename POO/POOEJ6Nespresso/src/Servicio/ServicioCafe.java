/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cafetera;
import java.util.Scanner;

/**
 *
 * @author Melina Narambuena
 */
public class ServicioCafe {

    Scanner leer = new Scanner(System.in);

    public Cafetera llenarCafetera(double capacidadMaxima, double cantidadActual) {
                Cafetera c1 = new Cafetera();

        if (capacidadMaxima != cantidadActual) {
            cantidadActual = capacidadMaxima;
        }
                    return c1;

    }

//    Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
//tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
//cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
//método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
//cuanto quedó la taza. 
    public void servirTaza(double capacidadMaxima, double cantidadActual) {
        System.out.println("Ingrese el tamaño de una taza vacía, por favor:");
        double medidaTaza = leer.nextDouble();
        System.out.println("Se llenara la taza con " + medidaTaza);
        if (cantidadActual < medidaTaza) {
            System.out.println("La cantidad que desea no existe en la cafetera, la maquina le servira " + cantidadActual);
            System.out.println("Su taza se llenó con " + (medidaTaza -cantidadActual) );

        }

    }

    public void vaciarCafetera(double cantidadActual) {
        cantidadActual = 0;
        System.out.println("La cantidad de cafe que posee la cafetera es: " + cantidadActual);
    }

    public void agregarCafe(double cantidadActual) {
        System.out.println("Ingrese la cantidad de cafe a agregar, por favor: ");
        double cantidadCafe = leer.nextDouble();
        double nuevaCantidad = cantidadActual + cantidadCafe;
        System.out.println("La cantidad actual de cafe es:  " + nuevaCantidad);
    }

}
