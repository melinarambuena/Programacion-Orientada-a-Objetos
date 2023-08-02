/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Perro;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Melina Narambuena
 * Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista.  Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
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
       System.out.println("La lista de razas de perros es:");
     for (String mostrar: razasP ){
            System.out.println(mostrar);
        }
    
    return p1;
   }
   
   public void buscarEliminar(){
       System.out.println("Ingrese una raza a buscar, por favor: ");
       String buscar = leer.next();
       Iterator<String> it = razasP.iterator();
       while (it.hasNext()){
       String aux = it.next();
           if (aux.equals(buscar)) {  
           it.remove();
           System.out.println("La lista con la raza eliminada es:");
           razasP.forEach((e) -> System.out.println(e));
        }else{
           System.out.println("La raza buscar no se encuentra en la lista.");
           System.out.println("La lista de razas de perro es:");
           razasP.forEach((e) -> System.out.println(e));
           }
   }
       
       
   }
   
   
   
}
