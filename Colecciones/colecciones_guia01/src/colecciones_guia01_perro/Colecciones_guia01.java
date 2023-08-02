/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones_guia01_perro;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * @author Melina Narambuena
 */
public class Colecciones_guia01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        lista, conjunto, mapa
        ArrayList<Integer> numerosA = new ArrayList();
        int x = 20;
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        
        numerosA.add(x);
        numerosA.add(a);
        numerosA.add(b);
        numerosA.add(c);
        numerosA.add(d);

        HashSet<Integer> numerosB = new HashSet();
        Integer y = 20;
        Integer e = 1;
        Integer f = 2;
        Integer g = 3;
        Integer h = 4;
        
        HashMap<Integer, String> alumnos = new HashMap();
        int dni = 35797130;
        int dni1 = 35797130;
        int dni2 = 35797130;
        int dni3 = 35797130;
        int dni4 = 35797130;
        String nombreAlumno = "Pepe"; 
        String nombreAlumno1 = "Pepa"; 
        String nombreAlumno2 = "Pepi"; 
        String nombreAlumno3 = "Pepo"; 
        String nombreAlumno4 = "Pepu"; 

        alumnos.put(dni, nombreAlumno);
        alumnos.put(dni1, nombreAlumno1);
        alumnos.put(dni2, nombreAlumno2);
        alumnos.put(dni3, nombreAlumno3);
        alumnos.put(dni4, nombreAlumno4);

        
    }
    
}
