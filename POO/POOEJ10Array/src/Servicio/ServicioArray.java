/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Array;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Melina Narambuena
 */
public class ServicioArray {
    
    Random ran = new Random();

//    public void llenarMostrarVector() {
//        double[] arregloA = new double[50];
//        double[] arregloB = new double[20];
//        for (int i = 0; i < arregloA.length; i++) {
//
//            arregloA[i] = ran.nextInt(101);
//
//        }
//
//        for (int i = 0; i < arregloB.length; i++) {
//
//            arregloB[i] = ran.nextInt(101);
//
//        }
//
//        for (double i : arregloA) {
//            System.out.print(i + " ");
//        }
//        System.out.println("");
//        for (double i : arregloB) {
//            System.out.print(i + " ");
//        }
//
//    }
    public double[] devolverVectorA() {
        double[] arregloA = new double[50];

        for (int i = 0; i < arregloA.length; i++) {

            arregloA[i] = ran.nextInt(101);

        }
        return arregloA;

    }

    public double[] devolverVectorB() {
        double[] arregloB = new double[20];
        for (int i = 0; i < arregloB.length; i++) {

            arregloB[i] = ran.nextInt(101);

        }

        return arregloB;

    }

    public void ordenar(double[] arregloA) {

        Arrays.sort(arregloA);

        System.out.println("\nEl arreglo ordenado es: ");
        for (double num : arregloA) {
            System.out.print(num + " ");
        }
    }
    
    
    public void llenarBconA(double[] arregloA, double [] arregloB) {
        
        for (int i = 0; i < 10; i++) {
            arregloB [i] = arregloA [i]; 
                    
        }

        for (int i = 10; i < 20; i++) {
            arregloB [i] = 0.5;
        }
        
        System.out.println(" ");
        System.out.println("Ultima funcion");
        for (double i : arregloB) {
            System.out.print(i + " ");
        }
        
        
        

    }
    
    
    
}
