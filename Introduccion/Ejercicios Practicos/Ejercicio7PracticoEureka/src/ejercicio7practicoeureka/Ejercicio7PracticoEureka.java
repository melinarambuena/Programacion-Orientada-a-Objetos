/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7practicoeureka;

import java.util.Scanner;

/**
 *
 * @author Melina Narambuena
 */
public class Ejercicio7PracticoEureka {

    /**
     * @param args the command line arguments
     * Ejercicio7_Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
la función equals() en Java.
     * 
     */
    public static void main(String[] args) {
       
        String frase;
                Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase, por favor:");
        frase = leer.nextLine();

        if(frase.equals("eureka")){
            System.out.println("Correcto");
            
            
        }else{
            System.out.println("Incorrecto");
        }
        
        
        
        
        
    }
    
}
