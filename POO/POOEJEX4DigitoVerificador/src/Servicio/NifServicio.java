/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.nif;
import java.util.Scanner;

/**
 *
 * @author Melina Narambuena
 */
public class NifServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public nif crearNif(){
        nif n1 = new nif();
        System.out.println("Ingrese su D.N.I., por favor: ");
        n1.setDNI(leer.nextInt());
        
        int resto = n1.getDNI()%23;
//        char [] asignarLetra = new char [resto];
//        asignarLetra[0] = 'T';
//        asignarLetra[1] = 'R';
//        asignarLetra[2] = 'W';
        char[] asignarLetra = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        if (resto >= 0 && resto <=22) {
            
            for (int i = 0; i < asignarLetra.length; i++) {
//                System.out.println("vector en posicion [" +i+ "] es el siguiente valor" +asignarLetra[i]);
                if (resto == i) {
//                    n1.setLetra(letra);
                      n1.setLetra(asignarLetra[i]);
                }
            }

        
        
        }else{
            System.out.println("El número de D.N.I no se corresponde con ninguna letra");
        }
        
        
        return n1;
    }
    
    
    public void mostrar(nif n1){
        System.out.println("El N.I.F. del D.N.I. ingresado es: " + n1.getDNI()+"-"+n1.getLetra());
    }
    
}
