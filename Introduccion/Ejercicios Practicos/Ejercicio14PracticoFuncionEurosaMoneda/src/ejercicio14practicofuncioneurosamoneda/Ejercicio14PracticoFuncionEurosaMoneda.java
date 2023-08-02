/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14practicofuncioneurosamoneda;

import java.util.Scanner;

/**
 *
 * @author Melina Narambuena
 */
public class Ejercicio14PracticoFuncionEurosaMoneda {

    /**
     * @param args the command line arguments
     * Ejercicio14_Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
 * 0.86 libras es un 1 €
 * 1.28611 $ es un 1 €
 * 129.852 yenes es un 1 €
     */

    public static void mostrarCambio(){
        Scanner leer = new Scanner(System.in);
        double euros;
        double yenes;
        System.out.println("Introduzca la cantidad de euros que desea convertir, por favor:");
        euros = leer.nextDouble();
        
        System.out.println(euros + " euros son " + euros * 129.852 + " yenes");        
        
        
        
    }
    public static void main(String[] args) {
mostrarCambio();
                

        
        
    }
    
}
