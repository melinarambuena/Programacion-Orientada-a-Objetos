/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra3esvocalono;
import java.util.Scanner;


/**
 *
 * @author Melina Narambuena
 * Ejercicio3_Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
 */
public class EjercicioExtra3EsVocalONo {

    /**
     * @param args the command line arguments
     */
    
    public static void esVocalONo(){
        Scanner leer = new Scanner (System.in);
        String letra;
        System.out.println("Ingrese una letra por favor:");
        letra = leer.nextLine();
        if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
            System.out.println("La letra ingresada es una vocal.");
            
            
        }else{
            System.out.println("La letra ingresada no es una vocal.");
        }
        
        
    }
    
    public static void main(String[] args) {
        esVocalONo();

    }
    
}
