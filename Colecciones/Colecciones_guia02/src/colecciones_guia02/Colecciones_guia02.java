/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones_guia02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 *
 * @author Melina Narambuena
 */
public class Colecciones_guia02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creo una lista
        ArrayList<Integer> numerosA = new ArrayList();
        int x = 20;
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        //agrego elementos a la lista
        numerosA.add(x);
        numerosA.add(a);
        numerosA.add(b);
        numerosA.add(c);
        numerosA.add(d);
        //muestro elementos
        for (Integer mostrar: numerosA ){
            System.out.println(mostrar);
        }
        //elimino un elemento
        numerosA.remove(0);
        //recorro nuevamente la lista
        for (Integer mostrar: numerosA ){
            System.out.println(mostrar);
        }
        //declaro una coleccion
        HashSet<Integer> numerosB = new HashSet();
        Integer y = 20;
        Integer e = 11;
        Integer f = 12;
        Integer g = 13;
        Integer h = 14;
        //agrego elementos
        numerosB.add(y);
        numerosB.add(e);
        numerosB.add(f);
        numerosB.add(g);
        numerosB.add(h);
        //recorro la coleccion
         for (Integer mostrar1: numerosB ){
            System.out.println(mostrar1);
        }
        //elimino un elemento 
        numerosB.remove(20);
        //recorro la coleccion
         for (Integer mostrar1: numerosB ){
            System.out.println(mostrar1);
        }
        // creo un mapa 
        HashMap<Integer, String> alumnos = new HashMap();
        int dni = 35797130;
        int dni1 = 35797131;
        int dni2 = 35797132;
        int dni3 = 35797133;
        int dni4 = 35797134;
        String nombreAlumno = "Pepe"; 
        String nombreAlumno1 = "Pepa"; 
        String nombreAlumno2 = "Pepi"; 
        String nombreAlumno3 = "Pepo"; 
        String nombreAlumno4 = "Pepu"; 
        //agrego los elementos al mapa
        alumnos.put(dni, nombreAlumno);
        alumnos.put(dni1, nombreAlumno1);
        alumnos.put(dni2, nombreAlumno2);
        alumnos.put(dni3, nombreAlumno3);
        alumnos.put(dni4, nombreAlumno4);
        //recorrer con mapa entry
        
        for (Map.Entry<Integer, String> entry : alumnos.entrySet()) {
            System.out.println("dni: " + entry.getKey() + " nombre: " + entry.getValue());   
        }
        //recorrer sin mapa entry
        System.out.println("Mostrar solo las llaves: ");
        for (Integer llaves : alumnos.keySet()){
            System.out.println("dni: " + llaves);
        }
        System.out.println("Mostrar solo los nombres: ");
        for (String nombres : alumnos.values()){
            System.out.println("Nombres: " + nombres);
        }
        
        //elimina un elemento
        alumnos.remove(35797131);
        //recorrer con mapa entry
        System.out.println("Mostrar nombres + dni: ");
         for (Map.Entry<Integer, String> entry : alumnos.entrySet()) {
            System.out.println(" dni: " + entry.getKey() + " nombre: " + entry.getValue());   
        }
        
         //recorrer sin mapa entry
        System.out.println("Mostrar solo las llaves: ");
        for (Integer llaves : alumnos.keySet()){
            System.out.println("dni: " + llaves);
        }
        System.out.println("Mostrar solo los nombres: ");
        for (String nombres : alumnos.values()){
            System.out.println("Nombres: " + nombres);
        }
         
         
         
    }
    
}
