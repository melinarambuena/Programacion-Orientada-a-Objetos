/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2practiconombre;

import java.util.Scanner;

/**
 *
 * @author Melina Narambuena
 */
public class Ejercicio2PracticoNombre {

    /**
     * @param args the command line arguments
     * Ejercicio2_Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
pantalla.
     */
    public static void main(String[] args) {
                Scanner leer = new Scanner(System.in);
                String nombre;
        System.out.println("Ingrese su nombre, por favor:");
        nombre = leer.nextLine();
        
        System.out.println("Su nombre es:" + nombre);
    }
    
}
