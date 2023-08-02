/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cadena;
import java.util.Scanner;
//import java.lang.*;
//
//import java.io.*;
//
//import java.util.*;

/**
 *
 * @author Melina Narambuena
 */
public class ServicioCadena {

    Scanner leer = new Scanner(System.in);

    public Cadena crearCadena() {

        Cadena c1 = new Cadena();
        System.out.println("Ingrese una frase, por favor: ");
        c1.setCadena(leer.nextLine());
//        System.out.println("longitud: " + c1.getCaracteres(c1.getCadena()));
        return c1;
    }

    public static int mostrarVocales(Cadena c1, String cadena, int caracteres) {
        String caracter;
        int c = 0;

        for (int i = 0; i < caracteres; i++) {

            caracter = cadena.substring(i, i + 1);

            if (caracter.equalsIgnoreCase("A") || caracter.equalsIgnoreCase("E") || caracter.equalsIgnoreCase("I") || caracter.equalsIgnoreCase("O") || caracter.equalsIgnoreCase("U")) {
                c++;

            }
        }
        return c;
    }

    public void invertirFrase(int caracteres, String cadena) {
        while (caracteres > 0) {

            System.out.print(cadena.charAt(caracteres - 1));

            caracteres--;
//            System.out.println(" ");
        }

        //////Java program to reverse a string using for
//        char[] resultarray = cadena.toCharArray();
//
//        //iteration
//        for (int i = caracteres - 1; i >= 0; i--) // print reversed String
//        {
//            System.out.print(resultarray[i]);
//        }
// Java program to reverse a string using While loop
//String stringInput = cadena;   
        //Get the String length
//    int iStrLength=stringInput.length();    
        //Using While loop
        System.out.println(" ");

    }

    public void vecesRepetido(int caracteres, String cadena) {

        String caracter;
        int c = 0;
        System.out.println("Ingrese un caracter a buscar en la frase, por favor:");
        String buscar = leer.next();

        for (int i = 0; i < caracteres; i++) {

            caracter = cadena.substring(i, i + 1);

            if (caracter.equalsIgnoreCase(buscar)) {
                c++;

            }
        }
        System.out.println("En la frase existen " + c + " vez/ veces la letra: " + buscar);

    }

    public void compararLongitud(String cadena) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese otra frase, por favor:");
        String fraseNueva = leer.nextLine();

        System.out.println("frase nueva:" + fraseNueva);
        if (fraseNueva.length() < cadena.length()) {
            System.out.println("La frase nueva ingresada: " + fraseNueva + "  es menor a la primera frase ingresada: " + cadena);

        } else if (fraseNueva.length() > cadena.length()) {

            System.out.println("La frase nueva ingresada: " + fraseNueva + " es mayor a la primera frase ingresada: " + cadena);
        } else {
            System.out.println("La frase nueva ingresada: " + fraseNueva + "es igual en longitud a la primera frase ingresada: " + cadena);
        }

    }

    public void unirFrases(String cadena) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese otra frase, por favor: ");
        String fraseNueva1 = leer.nextLine();
        System.out.println("La frase unida es: " + cadena.concat(fraseNueva1));

    }

    public void reemplazar(int caracteres, String cadena) {
        String caracter;
        System.out.println("Ingrese el caracter que reemplazará a la letra a, por favor:");
        String letra = leer.next();
        for (int i = 0; i < 10; i++) {
            caracter = cadena.substring(i, i + 1);

            if (caracter.equalsIgnoreCase("a")) {

                cadena = cadena.replace(caracter, letra);

            }
        }
        System.out.println("frase cambiada:" + cadena);

    }

//    Método contiene(String letra), deberá comprobar si la frase contiene una letra que
//ingresa el usuario y devuelve verdadero si la contiene y falso si no. 
    
    public void contiene(String cadena){
        System.out.println("Ingrese la letra a buscar en la primera frase , por favor:");
        String buscar = leer.next();
        String caracter;
        boolean aux = false;
        
         for (int i = 0; i < 10; i++) {
            caracter = cadena.substring(i, i + 1);

            if (caracter.equalsIgnoreCase(buscar)) {
             aux = true;
                                        
            }
        }
         
         
         System.out.println("El resultado de la búsqueda es: "+ aux);
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
