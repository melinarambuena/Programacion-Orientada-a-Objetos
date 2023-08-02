/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12practicosubstringlengthequals;

import java.util.Scanner;

/**
 *
 * @author Melina Narambuena
 */
public class Ejercicio12PracticoSubstringLengthEquals {

    /**
     * @param args the command line arguments
     * Ejercicio12_Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        String frase;
        int largo;
        String letraP;
        String letraU;
        
        
        System.out.println("Igrese una frase que comience con X y termine en O, por favor:");
        frase = leer.nextLine();
        
        largo = frase.length();
        letraP = frase.substring(0,1);
        letraU = frase.substring(4,5);
             
        if ((letraP.equals("X")&& letraU.equals("O")&& largo == 5)) {
            System.out.println("La frase es correcta");
        }else{
            System.out.println("La frase es incorrecta");
        }
        
        
        
        
    }
    
}
