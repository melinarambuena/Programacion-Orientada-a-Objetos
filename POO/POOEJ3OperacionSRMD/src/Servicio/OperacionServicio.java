
package Servicio;

import Entidades.Operacion;
import java.util.Scanner;


public class OperacionServicio {
   
   /* Método para crearOperacion(): que le pide al usuario los dos números y los guarda
en los atributos del objeto. 
Método sumar(): calcular la suma de los números y devolver el resultado al main. 
Método restar(): calcular la resta de los números y devolver el resultado al main 
    */
    
    public Operacion crearOperacion(){
        //Instanciar objeto de tipo libro
        Scanner leer = new Scanner (System.in);
        Operacion O1 = new Operacion();
        //Lleno los atributos
        System.out.println("Ingrese el primer número, por favor:");
        O1.setNum1(leer.nextInt());
        System.out.println("Ingrese el segundo número, por favor:");
        O1.setNum2(leer.nextInt());
        
        return O1;
    }
    
    public static double suma(double num1, double num2){
        double suma = num1 + num2;
        return suma;
    }
    
    public static double resta(double num1, double num2){
        double resta = num1 - num2;
        return resta;
    }
    
    public static double multiplica(double num1, double num2){
        return num1 * num2;
        
       
    }

    
    public static double divide(double num1, double num2){
        
        if (num2 == 0) {
            System.out.println("Error: no se puede dividir por 0");
            return 0;
            
        }
        return num1 / num2;
    }
}
