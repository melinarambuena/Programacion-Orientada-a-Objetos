/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio03guia;

/**
 *
 * @author Melina Narambuena
 */
public class Ejercicio03Guia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

int numA = 3;
int numB = 5;
int suma;
int resta;
suma = numA + numB;
resta = numA - numB;
double division = numA / numB;
boolean bandera = numA > numB;
numA++;

        System.out.println("El resultado de la suma es:" + suma + " " + numA++ + bandera);

    }
    
}
