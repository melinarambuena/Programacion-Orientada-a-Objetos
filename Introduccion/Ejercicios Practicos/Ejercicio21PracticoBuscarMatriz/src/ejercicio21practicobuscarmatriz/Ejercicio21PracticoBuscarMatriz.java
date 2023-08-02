/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio21practicobuscarmatriz;

/**
 *
 * @author Melina Narambuena
 */
public class Ejercicio21PracticoBuscarMatriz {

    /**
     * @param args the command line arguments
     * 
     * 
     * 
     * 
     * Ejercicio21_Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que
se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una
que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de
la matriz M en la cual empieza el primer elemento de la submatriz P.
Ejemplo:
* 
*               Matriz 10x10                                               Matriz 3x3
     * int[][] matrizContenedora = {
            { 1, 26, 36, 47,  5,  6, 72, 81, 95, 10},
            {11, 12, 13, 21, 41, 22, 67, 20, 10, 61},                   {36, 5, 67}
            {56, 78, 87, 90,  9, 90, 17, 12, 87, 67},                   {89, 90, 75}
            {41, 87, 24, 56, 97, 74, 87, 42, 64, 35},                   {14, 22, 26}
            {32, 76, 79,  1, 36,  5, 67, 96, 12, 11},             
            {99, 13, 54, 88, 89, 90, 75, 12, 41, 76},
            {67, 78, 87, 45, 14, 22, 26, 42, 56, 78},
            {98, 45, 34, 23, 32, 56, 74, 16, 19, 18},
            {24, 67, 97, 46, 87, 13, 67, 89, 93, 24},
            {21, 68, 78, 97, 90, 67, 12, 41, 65, 12}
        };
        * 
        * 
        * Como podemos observar nuestra submatriz P se encuentra en la matriz M en los índices:
4,4 - 4,5 - 4,6 - 5,4 - 5,5 - 5,6 - 6,4 - 6,5 - 6,6.
        * 
     */
    
    
    public static void llenarMatrizM(){
        
        
    int[][] matrizM =   {
            { 1, 26, 36, 47,  5,  6, 72, 81, 95, 10},
            {11, 12, 13, 21, 41, 22, 67, 20, 10, 61},
            {56, 78, 87, 90,  9, 90, 17, 12, 87, 67},
            {41, 87, 24, 56, 97, 74, 87, 42, 64, 35},
            {32, 76, 79,  1, 36,  5, 67, 96, 12, 11},
            {99, 13, 54, 88, 89, 90, 75, 12, 41, 76},
            {67, 78, 87, 45, 14, 22, 26, 42, 56, 78},
            {98, 45, 34, 23, 32, 56, 74, 16, 19, 18},
            {24, 67, 97, 46, 87, 13, 67, 89, 93, 24},
            {21, 68, 78, 97, 90, 67, 12, 41, 65, 12}
        };     
        
    }
    
    
    public static void llenarMatrizP(){
        int [][] matrizP = {
                {36, 5, 67},
                {89, 90, 75},
                {14, 22, 2}
        };
        
        
    }
    
    public static void contieneMatriz(int[][] matrizM, int[][] matrizP){  
        int[][] comparador = new int[matrizP.length][matrizP.length];
        int inicioI = 0;
        int inicioJ = 0;
        int finI = matrizP.length;
        int finJ = matrizP.length; 
        int match = 0;
        int posicionX = 0;
        int posicionY = 0;
        while (finI < matrizM.length+1 && finJ < matrizM.length+1){                         
            for(int i=inicioI, k=0; i<finI && k<matrizP.length; i++, k++){
                for(int j=inicioJ, l=0; j<finJ && l<matrizP[k].length; j++, l++){                    
                    comparador[k][l] = matrizM[i][j];
                    if(comparador[k][l] == matrizP[k][l]){
                        match += 1;
                        if (match == 1){
                            posicionX = i;
                            posicionY = j;
                        }
                        if (match == matrizP.length*matrizP.length){
                            System.out.println("Matriz encontrada");
                            System.out.println("Posicion a partir de la cual se halla la submatriz: (" + posicionX + "," + posicionY + ")");
                            break;
                        }
                    }
                }                                
            }                       
            if(match != matrizP.length*matrizP.length){
                match = 0;
            }else {
                break;
            }
            inicioJ += 1;
            finJ += 1;
            if(inicioJ == matrizM.length-matrizP.length+1){
                inicioI += 1;
                finI += 1;
                inicioJ = 0;
                finJ = matrizP.length;
            }            
        }
        if (match != matrizP.length*matrizP.length){
            System.out.println("Matriz NO encontrada");
        }
    }
    public static void main(String[] args) {
        llenarMatrizM();
        llenarMatrizP();
        int[][] matriz1 = new int[10][10];
        int[][] matriz2 = new int[3][3];
        contieneMatriz(matriz1, matriz2);

        for (int i = 0; i < matrizP.length; i++) {
            for (int j = 0; j < matrizP.length; j++) {
                System.out.print("[" + matriz1[i][j] + "]");

            }
            System.out.println("");
        }
    }

}
