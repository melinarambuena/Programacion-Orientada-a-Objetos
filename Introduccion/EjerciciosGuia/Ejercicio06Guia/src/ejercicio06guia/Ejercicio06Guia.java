/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio06guia;
import java.util.Scanner;

/**
 *
 * @author Melina Narambuena
 */
public class Ejercicio06Guia {

    /**Implementar un programa que le pida dos números enteros a usuario y determine si ambos o
alguno de ellos es mayor a 25.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresa el primer número entero, por favor:");
        int num1 = leer.nextInt();
        
        System.out.println("Ingresa el segundo número entero, por favor:");
        int num2 = leer.nextInt();
        
        
        if (num1 > 25 && num2> 25) {
            System.out.println("Ambos enteros ingresados son mayores a 25");
            
        } else if (num1 > 25 && num2 < 25){ 
            System.out.println("El primer número ingresado es mayor a 25 ");
            
            } else if (num1 < 25 && num2 > 25){ 
            System.out.println("El segundo número ingresado es mayor a 25 ");
            
            } else if (num1 < 25 && num2 < 25){ 
            System.out.println("Ambos enteros ingresados son menores a 25 ");
            
            
        }
            
            
        }
                
        
    }
    

