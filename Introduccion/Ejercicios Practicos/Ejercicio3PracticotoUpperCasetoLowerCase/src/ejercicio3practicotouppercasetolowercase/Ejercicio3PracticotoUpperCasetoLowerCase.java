/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3practicotouppercasetolowercase;

import java.util.Scanner;

/**
 *
 * @author Melina Narambuena
 */
public class Ejercicio3PracticotoUpperCasetoLowerCase {

    /**
     * @param args the command line arguments
     * Ejercicio3_Escribir un programa que pida una frase y la muestre toda en 
     * mayúsculas y después toda en minúsculas. Nota: investigar la función 
     * toUpperCase() y toLowerCase() en Java.

     */
    public static void main(String[] args) {
                Scanner leer = new Scanner(System.in);
                String frase;
        System.out.println("Ingrese una frase, por favor:");
frase = leer.nextLine();

        
        System.out.println("La frase ingresada en minúscula es: "+frase.toLowerCase());
        System.out.println("La frase ingresada en mayúscula es: " + frase.toUpperCase());
        
    }
    
}
