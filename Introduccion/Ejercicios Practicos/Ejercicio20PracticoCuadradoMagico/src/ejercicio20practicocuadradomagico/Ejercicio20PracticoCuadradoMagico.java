/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio20practicocuadradomagico;

import java.util.Scanner;

/**
 *
 * @author Melina Narambuena
 */
public class Ejercicio20PracticoCuadradoMagico {

    /**
     * @param args the command line arguments
     * Ejercicio20_Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
     */
    
    
    
    
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        boolean aux = false;
        int sumaDiagonal;
        int sumaDInversa;
        int sumaC;
        int[] vector2 = new int[3];
        int[] vector1 = new int[3];
        int sumaF;
        sumaDiagonal = 0;
        sumaDInversa = 0;
        boolean confirmarvalores = false;
        int[][] matriz = new int[3][3];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("Ingrese un número para la posición [" + i + "," + j + "]:");
                matriz[i][j] = leer.nextInt();
                if (matriz[i][j] < 10 && matriz[i][j] > 0) {
                    confirmarvalores = true;

                } else {

                    System.out.println("El número ingresado no es válido, ingrese el número para la posición: [" + i + "," + j + "], nuevamente:");
                    matriz[i][j] = leer.nextInt();

                }

            }
        }
        
        
//Sumar filas
        for (int i = 0; i < matriz.length; i++) {
            sumaF = 0;
            for (int j = 0; j < matriz.length; j++) {
                sumaF = sumaF + matriz[i][j];

            }
            vector1[i] = sumaF;
        }
        
        
        
        
        
        
//Sumar columnas
        for (int j = 0; j < matriz.length; j++) {
            sumaC = 0;
            for (int i = 0; i < matriz.length; i++) {
                sumaC = sumaC + matriz[i][j];
            }
            vector2[j] = sumaC;
        }
        
// Comparar filas y columnas
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (vector1[i] == vector2[j]) {
                    aux = true;

                }
            }
        }

//Mostrar matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {

                System.out.print("[" + matriz[i][j] + "]");

            }
            System.out.println("");
        }
//Suma Diagonal

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i == j) {
                    sumaDiagonal = sumaDiagonal + matriz[i][j];
                }
            }

        }
//Suma Diagonal Inversa

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i + j == matriz.length - 1) {
                    sumaDInversa = sumaDInversa + matriz[i][j];
                }
            }
        }

//Chequear si es magica o no
        if (aux == true && sumaDInversa == sumaDiagonal) {
            System.out.println("Su matriz es mágica :)");
        } else {
            System.out.println("Su matriz no es mágica :(");
        }
    }

}
