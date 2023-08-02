/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Punto;
import java.util.Scanner;

/**
 *
 * @author Melina Narambuena
 */
public class ServicioPuntos {
    
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Punto crearPuntos() {
        //instancia un objeto de tipo vendedor
        Punto p1 = new Punto();
        //LLeno los atributos
        System.out.println("Ingrese la coordenada del punto x1, por favor:");
        p1.setX1(leer.nextDouble());
        System.out.println("Ingrese la coordenada del punto y1, por favor:");
        p1.setY1(leer.nextDouble());
        System.out.println("Ingrese la coordenada del punto x2, por favor:");
        p1.setX2(leer.nextDouble());
        System.out.println("Ingrese la coordenada del punto y2, por favor:");
        p1.setY2(leer.nextDouble());
       
        return p1;
    }
    
    public static double calcularDistancia(Punto p1){
        
        double distanciaPuntos = Math.sqrt(Math.pow((p1.getX2() - p1.getX1()), 2) + Math.pow((p1.getY2()-p1.getY1()), 2));
        

        return distanciaPuntos;
        
    }
    
    
    
}
