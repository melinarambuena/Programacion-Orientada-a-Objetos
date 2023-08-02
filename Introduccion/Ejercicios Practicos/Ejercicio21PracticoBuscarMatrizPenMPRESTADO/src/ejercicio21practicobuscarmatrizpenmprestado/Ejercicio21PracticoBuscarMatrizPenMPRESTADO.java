/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio21practicobuscarmatrizpenmprestado;

/**
 *
 * @author Melina Narambuena
 */
public class Ejercicio21PracticoBuscarMatrizPenMPRESTADO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        
        int [][] matrizP = {
                {36, 5, 67},
                {89, 90, 75},
                {14, 22, 26}
        };
        
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
        
        
//        contieneMatriz(matriz1, matriz2);

//        for (int i = 0; i < matriz1.length; i++) {
//            for (int j = 0; j < matriz1.length; j++) {
//                System.out.print("[" + matriz1[i][j] + "]");
//
//            }
//            System.out.println("");
//        }
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

}
