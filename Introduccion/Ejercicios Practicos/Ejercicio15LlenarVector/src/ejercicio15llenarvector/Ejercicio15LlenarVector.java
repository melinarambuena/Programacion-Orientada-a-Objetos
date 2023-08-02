/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio15llenarvector;

/**
 *
 * @author Melina Narambuena
 */
public class Ejercicio15LlenarVector {
    
public static void mostrarArreglo1 (){
    int[] arreglo1 = new int[100];
for (int i = 0; i < 100; i++) {
    arreglo1[i] = i;
}
     for(int i=99; i>=0; i--) {
            System.out.println(arreglo1[i]);
        }
    
}

    /**
     * @param args the command line arguments
     * Ejercicio15_Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.
     */
    
    
    
    
    public static void main(String[] args) {
mostrarArreglo1 ();    }
    
}
