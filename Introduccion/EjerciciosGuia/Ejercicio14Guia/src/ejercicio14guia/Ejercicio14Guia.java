/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14guia;

import java.util.Scanner;

/**
 *
 * @author Melina Narambuena
 */
public class Ejercicio14Guia {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        String[] Equipo =new String[8];
        
        for (int i = 0; i <8; i++){
            System.out.println("Ingrese el miembro del equipo, por favor:");
            Equipo[i] = leer.nextLine();
        }
        
    }
    
}
