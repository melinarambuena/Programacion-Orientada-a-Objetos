/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio08guia;
import java.util.Scanner;

/**
 *
 * @author Melina Narambuena
 */
public class Ejercicio08Guia {

    /**
     * @param args the command line arguments
* EJERCICIO 8
Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota se
pedirá de nuevo hasta que la nota sea correcta.
     * 
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int nota;
        System.out.println("Ingrese una nota válida, por favor:");
        nota = leer.nextInt();
        
        while (nota < 0 || nota > 10 ){
            System.out.println("La nota ingresada no representa un valor aceptado, ingresela nuevamente, por favor:");
            nota = leer.nextInt();
            
        }
    }
    
}
