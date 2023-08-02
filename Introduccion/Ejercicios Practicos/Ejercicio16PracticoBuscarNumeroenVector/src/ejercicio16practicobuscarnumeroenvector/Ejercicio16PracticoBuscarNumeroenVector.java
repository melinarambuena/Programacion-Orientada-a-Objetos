/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio16practicobuscarnumeroenvector;

import java.util.Scanner;

/**
 *
 * @author Melina Narambuena
 */
public class Ejercicio16PracticoBuscarNumeroenVector {

    /**
     * @param args the command line arguments
     * Ejercicio16_Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
     * 
     */
    
    
    public static int pruebayerror(){
    Scanner leer = new Scanner(System.in);
    int cont;
        int tamanio;
        int buscar;
        System.out.println("Ingrese el tamaño de su vector, por favor:");
        tamanio = leer.nextInt();
        int[] vector = new int[tamanio];
        cont = 0;
        for (int i = 0; i < tamanio; i++) {
        vector[i] = (int) (Math.random()*100);}
        
            System.out.println("Ingrese un número a buscar, por favor:");
            buscar = leer.nextInt();
            
            for (int j = 0; j < tamanio; j++) {
                if (vector[j] == buscar) {
                    cont = cont + 1;
                    System.out.println(cont);
                    return j;

                }  
                
            }
            
        }
    }

    public static void main(String[] args) {

        
        int retorno = pruebayerror();
        System.out.println(retorno);
    }
    
}
