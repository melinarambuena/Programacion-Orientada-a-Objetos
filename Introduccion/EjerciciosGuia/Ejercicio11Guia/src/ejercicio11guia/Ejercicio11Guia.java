/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11guia;

import java.util.Scanner;

/**
 *
 * @author Melina Narambuena
 */
public class Ejercicio11Guia {

    /**
     * @param args the command line arguments
     * EJERCICIO 11
Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada
en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se
reemplaza por el carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las
vocales acentuadas) se mantienen sin cambios.
a e i o u
@ # $ % *
Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación
correspondiente. Utilice la estructura “según” para la transformación.
Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10
     */
    public static void main(String[] args) {
        
        
        String frase;
        int largo;
        
                
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese una frase, por favor:");
        frase = leer.nextLine();
        
        largo = frase.length();
        System.out.println("La frase cambiada es: " + codificar(frase, largo));
        
    }
    

    public static String codificar(String frase, int largo){
        String letra;
        String frase2 = "";
        
        for (int i = 0; i < largo-1; i++){
          
        letra = frase.substring(i,i+1);
           
        switch (letra){
            case "a": 
                frase = frase.replace(letra,"@");
                 break;       
            case "e": 
                frase = frase.replace(letra,"#");
                 break;       
            case "i": 
                frase = frase.replace(letra,"$");
                 break;     
            case "o":
                frase = frase.replace(letra,"%");
                 break;      
            case "u":
                frase = frase.replace(letra,"*");
                break;
            
            default: 
                frase  = frase.replace(letra,letra);
                        }
        

        
        }
        return frase;
    }

}
        
//"mesquite in your cellar".replace('e', 'o')
//         returns "mosquito in your collar"
