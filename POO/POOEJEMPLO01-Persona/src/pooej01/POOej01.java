/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej01;

import java.util.Scanner;
import Entidad.Persona;

/**
 *
 * @author Melina Narambuena
 *
 */
public class POOej01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//Declaracion
//Persona p1;
//p1 = new Persona();

//Inicializacion - creacion
        Scanner leer = new Scanner(System.in);

        Persona p1 = new Persona("Melina", leer.nextInt(), 36797230);
        p1.dni = 36797230;
        p1.edad = 30;
        p1.nombre = "Melina";
        System.out.println(p1.nombre + " " + p1.edad + " " + p1.dni);

        p1.setNombre("Juan");
        p1.getEdad();

        System.out.println(p1.nombre + " " + p1.edad + " " + p1.dni);
        
        manosalaObra( p1);

    }

    public static void manosalaObra(Persona p1) {
        p1.getDni();
        p1.getEdad();
        p1.getNombre();
        System.out.println(p1.nombre + " " + p1.edad + " " + p1.dni);

    }
}
