/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra6promedioalturas;
import java.util.Scanner;

/**
 *
 * @author Melina Narambuena
 */
public class EjercicioExtra6PromedioAlturas {

    /**
     * @param args the command line arguments Ejercicio6_Leer la altura de N
     * personas y determinar el promedio de estaturas que se encuentran por
     * debajo de 1.60 mts. y el promedio de estaturas en general.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int cantidad;
        double altura;
        double sumaAlturas = 0;
        int cont = 0;
        int cont1 = 0;
        double suma = 0;
        double promedio;
        double promedioGeneral;
        System.out.println("Ingrese la cantidad de personas cuya altura desea peomediar, por favor:");
        cantidad = leer.nextInt();

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese las alturas de las personas, por favor:");
            altura = leer.nextDouble();

            if (altura <= 1.60) {
                sumaAlturas = sumaAlturas + altura;
                cont++;
            } else {
                suma = suma + altura;
                cont1++;
            }
        }

        promedio = sumaAlturas / cont++;
        promedioGeneral = suma / cont1++;
        System.out.println("El promedio de las alturas por debajo de 1.60 es " + promedio);
        System.out.println("El promedio de las alturas en general es " + promedioGeneral);

    }

}
