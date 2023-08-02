/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5practicomathsqrt;

import java.util.Scanner;

/**
 *
 * @author Melina Narambuena
 */
public class Ejercicio5PracticoMathSqrt {

    /**
     * @param args the command line arguments
     * Ejercicio5_Escribir un programa que lea un número entero por teclado y muestre por pantalla el
    doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
     */
    public static void main(String[] args) {
        double num;
        double raiz;
        double doble;
        double triple;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número entero, por favor:");
        num = leer.nextDouble();
        
        raiz = Math.sqrt(num);
        doble = num*2;
        triple = num*3;
        
        System.out.println("La raíz del número entero es:" + raiz);
        System.out.println("El doble del número ingresado es:" + doble);
        System.out.println("El triple del número ingresado es:" + triple);
    }
    
}
