/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6practicoparimpar;

import java.util.Scanner;

/**
 *
 * @author Melina Narambuena
 */
public class Ejercicio6PracticoParImpar {

    /**
     * @param args the command line arguments
     * Ejercicio6_Crear un programa que dado un numero determine si es par o impar.
     */
    
    public static void parImpar(){
        Scanner leer = new Scanner(System.in);
        double numero;
        System.out.println("Ingrese el numero entero");
        numero = leer.nextDouble();
        
        if(numero%2==0){
                System.out.println("El número ingresado es par");  
                
                
                }else if(numero%2!=0){
                    System.out.println("El número ingresado es impar");
                }
    }
    
    
    
    public static void main(String[] args) {
        
parImpar();
    }
    
}
