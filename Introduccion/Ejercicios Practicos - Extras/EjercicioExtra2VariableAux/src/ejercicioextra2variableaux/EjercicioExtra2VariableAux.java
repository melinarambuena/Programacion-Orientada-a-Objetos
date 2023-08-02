/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra2variableaux;

/**
 *
 * @author Melina Narambuena
 */
public class EjercicioExtra2VariableAux {

    /**
     * @param args the command line arguments
     * Ejercicio2_Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C
tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.

     */
    
    public static void cambiarvalores(){
        int A = 5;
        int B = 10;
        int C = 43;
        int D = 9;
        int aux;
        
        System.out.println("Valor inicial de A="+A);
        System.out.println("Valor inicial de B="+B);
        System.out.println("Valor inicial de C="+C);
        System.out.println("Valor inicial de D="+D);
        
        aux = B;
    
        B = C;
        C = A;
        A = D;
        D = aux;
        System.out.println("");
        
        System.out.println("Valor final de A="+A);
        System.out.println("Valor final de B="+B);
        System.out.println("Valor final de C="+C);
        System.out.println("Valor final de D="+D);
        
        
        
        
    }
    
    
    
    public static void main(String[] args) {
        
        cambiarvalores();
        
    }
    
}
