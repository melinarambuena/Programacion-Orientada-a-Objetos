/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10guia;

import java.util.Scanner;

/**
 *
 * @author Melina Narambuena
 */
public class Ejercicio10Guia {

    /**
     * @param args the command line arguments
     * EJERCICIO 10
Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número
ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
       int numero;
       int cont = 0;
       
       
       do{
        System.out.println("Ingrese un número, por favor:");
        
        numero = leer.nextInt();
        
        cont++;
        
           System.out.print(numero);
           
        for (int i = 0; i< numero; i++){
            
            System.out.print( "*");
            
        }
        System.out.println(" ");
       } while (numero > 1 && numero < 20 && cont < 5);
    }
}
  