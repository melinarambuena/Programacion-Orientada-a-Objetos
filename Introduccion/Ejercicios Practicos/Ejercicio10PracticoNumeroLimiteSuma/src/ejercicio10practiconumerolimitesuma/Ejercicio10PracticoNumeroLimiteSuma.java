/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10practiconumerolimitesuma;

import java.util.Scanner;

/**
 *
 * @author Melina Narambuena
 * 
 */
public class Ejercicio10PracticoNumeroLimiteSuma {

    /**
     * @param args the command line arguments
     * 
     *EJERCICIO_10 Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial. 
     * 
     */
    public static void main(String[] args) {
                Scanner leer = new Scanner (System.in);
                int valorLimite;
                int suma;
                int num1;
                System.out.println("Ingrese un valor límite positivo, por favor:");
                valorLimite = leer.nextInt();
                suma = 0;
                
                do{
                System.out.println("Ingrese un número, por favor:");
                num1 = leer.nextInt();
                suma = suma + num1;
                
                }while(suma<valorLimite);
    }
    
}
