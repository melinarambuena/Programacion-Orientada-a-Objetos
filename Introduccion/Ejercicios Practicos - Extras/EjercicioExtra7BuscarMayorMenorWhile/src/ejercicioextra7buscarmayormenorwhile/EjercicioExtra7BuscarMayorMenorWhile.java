/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra7buscarmayormenorwhile;
import java.util.Scanner;

/**
 *
 * @author Melina Narambuena
 */
public class EjercicioExtra7BuscarMayorMenorWhile {

    /**
     * @param args the command line arguments
     * Ejercicio7_Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
de n números (n>0). El valor de n se solicitará al principio del programa y los números
serán introducidos por el usuario. Realice dos versiones del programa, una usando el
bucle “while” y otra con el bucle “do - while”.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int cantidad;
        int cont = 0;
        double numero;
        double suma = 0;
        double promedio = 0;
        double numeroMin = 0;
        double numeroMax = 0;
        int i = 0;
        System.out.println("Ingrese la cantidad de números a analizar, por favor:");
        cantidad = leer.nextInt();
        
       while(i<cantidad){
           System.out.println("Ingrese un número, por favor");
           numero = leer.nextDouble();
           if (numero>numeroMax) {
               numeroMax = numero;
               
           }
           
           if (numero<numeroMin) {
               numeroMin = numero;
           }
           
           
           suma += numero;
           promedio = suma / cantidad;
           i++;
           
       }
        System.out.println("El valor máximo ingresado es: " + numeroMax+ ", el número mínimo ingresado es: "+numeroMin+" y el promedio es: "+promedio);
    }

}
