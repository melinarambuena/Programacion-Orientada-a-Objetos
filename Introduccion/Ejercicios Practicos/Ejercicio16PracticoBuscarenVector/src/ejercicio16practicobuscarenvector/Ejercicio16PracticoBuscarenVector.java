/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio16practicobuscarenvector;

import java.util.Scanner;

/**
 *
 * @author Melina Narambuena
 */
public class Ejercicio16PracticoBuscarenVector {

    /**
     * @param args the command line arguments
     * Ejercicio16_Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido.
     */
    
    public static void buscar() {
        int valor;
        int tamanio;
        int buscar;
        int cont;
        int pruebaerror;
        boolean numero = true;
        boolean repetido = false;
        cont = 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de su vector, por favor:");
        tamanio = leer.nextInt();

        int[] vector = new int[tamanio];

        for (int i = 0; i < tamanio; i++) {
            vector[i] = (int) (Math.random() * 100);

        }
        
        System.out.println("Ingrese el número que desea buscar, por favor:");
        buscar = leer.nextInt();

        for (int i = 0; i < tamanio; i++) {

            if (vector[i] == buscar) {
                cont = cont + 1;
                System.out.println("El número se encuentra en la posición "+i);
                if (cont > 1) {
                    repetido = true;
                }
            } else {
                numero = false;
            }
            
        }

        if(cont == 0){
            System.out.println("El número no se encuentra en NINGUN LADO");
        }
                        

        if (repetido) {
            System.out.println("El número se encuentra en más de una posicion.");

        } 

    }

    public static void main(String[] args) {

        buscar();

    }

}
