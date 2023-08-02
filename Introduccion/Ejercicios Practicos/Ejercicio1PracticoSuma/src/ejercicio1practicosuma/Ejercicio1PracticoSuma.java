/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1practicosuma;

import java.util.Scanner;

/**
 *
 * @author Melina Narambuena
 */
public class Ejercicio1PracticoSuma {

    /**
     * @param args the command line arguments
     * Ejercicio1_Escribir un programa que pida dos números enteros por teclado 
     * y calcule la suma de los dos. El programa deberá después mostrar el 
     * resultado de la suma
     */
    
    
   
    
    
    public static void main(String[] args) {
        
        int num1;
        int num2;
        int resultado;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer entero, por favor:");
        num1 = leer.nextInt();
        System.out.println("Ingrese el segundo entero, por favor:");
        num2 = leer.nextInt();
        resultado = sumar(num1, num2);
        System.out.println("El resultado de la operación es:" + resultado);
    }
    
     public static int sumar(int num1, int num2){
        int suma;
        
        suma = num1 + num2;
        
        
        return suma;
    }
    
}
