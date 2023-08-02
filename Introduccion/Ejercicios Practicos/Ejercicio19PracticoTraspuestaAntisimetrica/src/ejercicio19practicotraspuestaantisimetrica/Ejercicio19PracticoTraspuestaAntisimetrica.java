/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio19practicotraspuestaantisimetrica;

/**
 *
 * @author Melina Narambuena
 */
public class Ejercicio19PracticoTraspuestaAntisimetrica {

    /**
     * @param args the command line arguments
     * Ejercicio19_Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
     */
    
    
   

 
    
    
    public static void main(String[] args) {
        System.out.println("La mnatriz a analizar es:");
        int[][] matriz = {{0, -2, 4}, {2, 0, 2}, {-4, -2, 0}};
        int[][] antiSimetrica = new int[3][3];
        int[][] traspuesta = new int[3][3];
        boolean pruebaerror = false;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");

        }
        System.out.println("La matriz traspuesta es:");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                traspuesta[i][j] = matriz[j][i];

                System.out.print("[" + traspuesta[i][j] + "]");
            }
            System.out.println("");
        }

        System.out.println("La matriz inversa es:");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                antiSimetrica[i][j] = matriz[i][j] * -1;
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("[" + antiSimetrica[i][j] + "]");
            }
            System.out.println("");

        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (antiSimetrica[i][j] == traspuesta[i][j]) {
                    pruebaerror = true;

                }

            }

        }

        if (pruebaerror) {
            System.out.println("La matriz es anti simetrica");
        }

    }

}



