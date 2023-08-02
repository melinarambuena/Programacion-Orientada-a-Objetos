/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra1calculardiasyhoras;

import java.util.Scanner;

/**
 *
 * @author Melina Narambuena
 */
public class EjercicioExtra1CalcularDiasyHoras {

    /**
     * @param args the command line arguments
     * EjercicioExtra1_Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
     */
    
        public static void minutosadiashoras() {
        Scanner leer = new Scanner(System.in);
        double min;
        double hr;
        double dia;
        double resto;
        System.out.println("Ingrese la cantidad de minutos que desea convertir, por favor:");
        min = leer.nextInt();
//        dia = 1440 min;
//        hr = 60 min;

        dia = min / 1440;
        resto = (double) min % 1440;
        min = resto / 60;
            System.out.println("La cantidad de minutos introducida equivale a: "+Math.floor(dia)+" día/s.");
            System.out.println("La cantidad de minutos introducida equivale a: "+Math.floor(min)+" minuto/s.");
    }

    public static void main(String[] args) {
minutosadiashoras();
    }

}
