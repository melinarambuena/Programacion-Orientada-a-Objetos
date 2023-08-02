/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej10array;

import Entidad.Array;
import Servicio.ServicioArray;

/**
 *
 * @author Melina Narambuena
 */
public class POOEJ10Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioArray as = new ServicioArray();
        double[] arregloA = as.devolverVectorA();
        double[] arregloB = as.devolverVectorB();
        System.out.println("Arreglo A: ");
        for (double i : arregloA) {
            System.out.print(i + " ");
        }
        System.out.println("");
        System.out.println("Arreglo B: ");
        for (double i : arregloB) {
            System.out.print(i + " ");
        }
        as.ordenar(arregloA);
        as.llenarBconA(arregloA, arregloB);
        
        
        
        
    }

}
