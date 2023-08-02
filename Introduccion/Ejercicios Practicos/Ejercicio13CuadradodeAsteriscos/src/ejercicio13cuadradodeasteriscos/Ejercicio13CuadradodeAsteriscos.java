/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13cuadradodeasteriscos;

import java.util.Scanner;

/**
 *
 * @author Melina Narambuena
 */
public class Ejercicio13CuadradodeAsteriscos {

    /**
     * @param args the command line arguments
     * Ejercicio12_Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
        cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
        * * * *
        *     *
        *     *
        * * * *
     */
    public static void main(String[] args) {

                Scanner leer = new Scanner(System.in);
                int num1;
                System.out.println("Ingrese un número, por favor:");
                num1 = leer.nextInt();
                
                for (int a = 1; a <= num1; a++) {
                    for (int b = 1; b <= num1; b++) {
                        
                        if (a==1 || a==num1 || b==1 || b==num1) {
                            System.out.print("*");
                            
                        }else{
                            System.out.print(" ");
                        }
                        
                    }
                    System.out.println(" ");
        }

    }
    
}
