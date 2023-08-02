/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12guia;

import java.util.Scanner;

/**
 *
 * @author Melina Narambuena
 */
public class Ejercicio12Guia {

    /**
     * @param args the command line arguments
     * EJERCICIO 12
Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, validando
que el primer numero múltiplo del segundo y e imprima si el primer numero es múltiplo del
segundo, sino informe que no lo son.
     * 
     */
    public static void main(String[] args) {
        int num1;
        int num2;
        
    Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer numero, por favor:");
        num1 = leer.nextInt();
        
        System.out.println("Ingrese el segundo numero, por facor:");
        num2 = leer.nextInt();
    
        EsMultiplo(num1,num2);
        
     
    }
    
    public static void EsMultiplo (int num1, int num2){
        
        if (num1%num2 == 0){
            
            System.out.println("El primer número es múltiplo del segundo");
        }else if (num1%num2!=0){
            System.out.println("El primer número no es mútiplo del segundo");
        }
        
    }
    
}

