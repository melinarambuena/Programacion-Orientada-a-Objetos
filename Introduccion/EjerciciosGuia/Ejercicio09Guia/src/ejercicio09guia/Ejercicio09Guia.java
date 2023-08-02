/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio09guia;

import java.util.Scanner;

/**
 *
 * @author Melina Narambuena
 */
public class Ejercicio09Guia {

    /**
     * @param args the command line arguments
     * EJERCICIO 9
Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del
bucle y mostrar el mensaje "Se capturó el numero cero". El programa deberá calcular y mostrar el
resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse.
Nota: recordar el uso de la sentencia break.
     */
    public static void main(String[] args) {
                Scanner leer = new Scanner(System.in);

        int cont = 0;
        int numero;
        int suma = 0;
        int sumanegativos = 0; 
        
        do{
            System.out.println("Ingrese un número, por favor:");
            numero = leer.nextInt();
            cont++;
            if (numero<0){
               continue;
            }
            suma= suma + numero;
            
            if (numero == 0) {
                System.out.println("Se capturó el número 0 ");
                break;
            }
        } while (cont <= 19 );
        
        System.out.println("La suma de los números ingresados es: "+suma);
        
            }
    
}
