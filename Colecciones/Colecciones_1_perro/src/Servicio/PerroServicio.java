/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Perro;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Melina Narambuena
 */
public class PerroServicio {
  Scanner leer = new Scanner(System.in).useDelimiter("\n");
  ArrayList<String> razasP = new ArrayList();
  
   public Perro crearPerro(){
    Perro p1 = new Perro();
    String respuesta;
            String raza;
    do {
        System.out.println("Ingrese una raza de perro, por favor:");
        raza = leer.next();
        razasP.add(raza);
        System.out.println("¿Desea ingresar otra raza? s/n");
        respuesta = leer.next();
        
        } while (respuesta.equalsIgnoreCase("s"));
     System.out.println("Las razas de perros ingresadas son:");
     for (String mostrar: razasP ){
            System.out.println(mostrar);
        }
    
    return p1;
   }
   
   
//public void imgresarRaza(){
//            String respuesta;
//            String raza;
//    do {
//        System.out.println("Ingrese una raza de perro, por favor:");
//        raza = leer.next();
//        razasP.add(raza);
//        System.out.println("¿Desea ingresar otra raza? s/n");
//        respuesta = leer.next();
//        
//        } while (respuesta.equalsIgnoreCase("s"));
//    
//}
}
