/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11practicomenu;

import java.util.Scanner;

/**
 *
 * @author Melina Narambuena
 */
public class Ejercicio11PracticoMenu {

    /**
     * @param args the command line arguments
     * Ejercicio11_Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
programa, caso contrario se vuelve a mostrar el menú.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int num1;
        int num2;
        int total;
        int opcion;
        double diferencia;
        int producto;
        double cociente;
        char respuesta;
        boolean pruebaerror;
        System.out.println("Ingrese un número entero, por favor:");
        num1 = leer.nextInt();
        System.out.println("Ingrese otro número entero, por favor:");
        num2 = leer.nextInt();

      
        pruebaerror = true; 
        
       
                do {

                    System.out.println("MENU");
                    System.out.println("1. Sumar");
                    System.out.println("2. Restar");
                    System.out.println("3. Multiplicar");
                    System.out.println("4. Dividir");
                    System.out.println("5. Salir");
                    System.out.println("Elija opción:");
                    opcion = leer.nextInt();
                    switch (opcion) {
                        case 1:
                            total = num1 + num2;
                            System.out.println("El total de la suma es: " + total);
                            break;
                        case 2:
                            diferencia = num1 - num2;
                            System.out.println("La diferencia de la resta es: "+diferencia);
                            break;
                        case 3:
                            producto = num1 * num2;
                            System.out.println("El producto de su multiplicación es: "+producto);
                            break;
                        case 4:
                            cociente = (double) num1 / num2;
                            System.out.println("El cociente de su división es:"+cociente);
                            break;
                        case 5:
                            System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                           
                            respuesta = leer.next().charAt(0);
                                                 

                            
                            
                            if(respuesta=='S'){
                                pruebaerror = false;
                            }else{
                                System.out.println("Apretaste la N capo, aca va el menú de nuevo :P");
                            }
                            break;
                    }

                }while (pruebaerror);
                   
                }
    }


        
    


                     
        
                
                
                
        
  
//public static Scanner leer(){
//Scanner leer = new Scanner(System.in);
//return leer;
//}
//
