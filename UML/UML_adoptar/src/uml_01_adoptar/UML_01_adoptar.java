/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uml_01_adoptar;

import Entidad.Perro;
import Entidad.Persona;
import java.util.ArrayList;
import java.util.List;
import sun.util.calendar.JulianCalendar;

/**
 *
 * @author Melina Narambuena
 */
public class UML_01_adoptar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Perro p1 = new Perro("Pipa", "callejero", 7, "mediano");
        Perro p2 = new Perro("Pepo", "callejero", 7, "mediano" );
        Persona pe1 = new Persona("Julian", "Alvarez", 26, 42892740, p1);
        Persona pe2 = new Persona("Jorge", "Cardenas", 20, 46797805, p2);
        
        List<Persona> personas = new ArrayList();
        personas.add(pe2);
        personas.add(pe1);
        
        System.out.println("La lista de personas con sus mascotas es:");

        for (Persona mostrar : personas) {
            System.out.println(mostrar);
        }
        
        
        
        
    }
    
}
