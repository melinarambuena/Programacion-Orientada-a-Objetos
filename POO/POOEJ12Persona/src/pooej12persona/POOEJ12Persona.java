/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej12persona;

import Entidad.Persona;
import Servicio.PersonaServicio;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Melina Narambuena
 */
public class POOEJ12Persona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        PersonaServicio ps = new PersonaServicio();
        Persona p1 = ps.crearPersona();
        Date fecha = p1.getFecha();
        System.out.println("fecha del main: " + fecha);
        int edad = PersonaServicio.calcularEdad(fecha);
        System.out.println("La edad de la persona es: " + edad);
        Persona p2 = new Persona();
        boolean bandera = ps.menorQue(fecha, edad, p2);
        System.out.println("La persona ingresada es menor a la persona P1: " + bandera);
        ps.mostrarPersona(p2);

    }

}
