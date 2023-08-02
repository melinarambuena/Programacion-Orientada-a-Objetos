/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio17practicocontardigitos;

import java.util.Scanner;

/**
 *
 * @author Melina Narambuena
 */
public class Ejercicio17PracticoContarDigitos {

    /**
     * @param args the command line arguments
     * Ejercicio17_ Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
     * 
     * 
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int tamanio;
        int numero;
        int cont;

        System.out.println("Ingrese el tamaño de su vector, por favor:");
        tamanio = leer.nextInt();

        int[] vector = new int[tamanio];
        cont = 0;
        for (int i = 0; i < tamanio; i++) {

            vector[i] = (int) (Math.random() * 100000);

            

        
        }
        
        
        
        for (int i = 0; i < tamanio; i++) {
            
            while (vector[i] > 0) {
                
                
                
                vector[i] =  vector[i] /10;
                cont = cont +1;
        
    

        }
            System.out.println("El número tiene " + cont + " digitos");
            
        }
        
        
        
        
        

    }

}



//vector[i] = Math.trunc(vector[i] /10);