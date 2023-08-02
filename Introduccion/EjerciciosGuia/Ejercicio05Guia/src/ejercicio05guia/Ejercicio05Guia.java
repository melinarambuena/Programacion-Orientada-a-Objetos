/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio05guia;

import java.util.Scanner;
/**
 *
 * @author Melina Narambuena
 */
public class Ejercicio05Guia {

    /**
     * @param args the command line arguments
     * Define una variable de tipo boolean, double y char. Guarda información en ellas a través del
Scanner.
     */
    public static void main(String[] args) {
        
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresa el valor del booleano");
        boolean bandera = leer.nextBoolean();
        
        System.out.println("Ingresa el valor del decimal, por favor:");
        double decimal = leer.nextDouble();
        
        System.out.println("Ingrese el valor del char");
        char vocal;
        vocal = leer.next().charAt(0);

   
    }
    
}
