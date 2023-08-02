/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4practicofarenheit;

import java.util.Scanner;

/**
 *
 * @author Melina Narambuena
 */
public class Ejercicio4PracticoFarenheit {

    /**
     * @param args the command line arguments
     * Ejercicio4_Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
     */
   
    
    public static void main(String[] args) {
        double F;
        int grados;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los °C que desea convertir");
        grados = leer.nextInt();
        
        F = 32 + (9 * grados / 5);
        System.out.println(+grados +"°C son " +F+" grados Farenheit");
    }
    
}
