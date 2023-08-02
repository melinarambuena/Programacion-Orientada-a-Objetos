/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11practicomenuprestado;
import java.util.Scanner;


/**
 *
 * @author Melina Narambuena
 */
public class Ejercicio11PracticoMENUprestado {

    /**
     * @param args the command line arguments
     * 11. Realizar un programa que pida dos números enteros positivos por teclado y muestre por
    pantalla el siguiente menú:
     */
    public static void main(String[] args) {
        

	Scanner leer = new Scanner(System.in);
        double num1,num2;
        int choice;
        char letter;
        boolean active = true;

        System.out.println("Ingrese el primer numero:");
        num1 = leer.nextDouble();
        System.out.println("Ingrese el segundo numero:");
        num2 = leer.nextDouble();

        do {
            System.out.println("---MENU---");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("----------");
            System.out.println();
            System.out.println("Ingrese la operacion a realizar:");
            choice = leer.nextInt();

            switch (choice) {
                case 1 : {
                    System.out.println("La suma de los numeros es: " + (num1 + num2));
                    System.out.println();
                }
                case 2 : {
                    System.out.println("La suma de los numeros es: " + (num1 - num2));
                    System.out.println();
                }
                case 3 : {
                    System.out.println("La suma de los numeros es: " + (num1 * num2));
                    System.out.println();
                }
                case 4 : {
                    System.out.println("La suma de los numeros es: " + (num1 / num2));
                    System.out.println();
                }
                case 5 : {
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    letter = leer.next().charAt(0);
                    if (letter == 'S') {
                        active = false;
                        System.out.println("Hasta luego...!");
                    } else {
                        System.out.println("Volviendo al menu principal...");
                    }
                    System.out.println();
                }
                default : {
                    System.out.println("La opcion ingresada no es valida, intente nuevamente...");
                    System.out.println();
                }
            }
        } while (active);
    }
    
}
