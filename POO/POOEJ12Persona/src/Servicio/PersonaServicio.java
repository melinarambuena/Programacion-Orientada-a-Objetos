/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Melina Narambuena
 */
public class PersonaServicio {

    Scanner leer = new Scanner(System.in);

    public Persona crearPersona() {
        Persona p1 = new Persona();
        System.out.println("Ingrese el nombre, por favor: ");
        p1.setNombre(leer.next());
        System.out.println("Ingrese el día de nacimiento, por favor: ");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes de nacimiento, por favor:");
        int mes = leer.nextInt();
        System.out.println("Ingrese el año de nacimiento, por favor: ");
        int anio = leer.nextInt();

        Date fecha = new Date(anio - 1900, mes - 1, dia);
        p1.setFecha(fecha);

        return p1;
    }

    public static int calcularEdad(Date fecha) {

        Date fechaActual = new Date();
        int edad = fechaActual.getYear() - fecha.getYear();
        return edad;
    }

    public boolean menorQue(Date fecha, int edad, Persona p2) {
        System.out.println("Ingrese el nombre, por favor: ");
        p2.setNombre(leer.next());
        System.out.println("Ingrese el día de nacimiento, por favor: ");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes de nacimiento, por favor:");
        int mes = leer.nextInt();
        System.out.println("Ingrese el año de nacimiento, por favor: ");
        int anio = leer.nextInt();

        fecha = new Date(anio - 1900, mes - 1, dia);
        p2.setFecha(fecha);
        Date fechaActual = new Date();
        int edadRandom = fechaActual.getYear() - fecha.getYear();
        
        
        
        
        boolean bandera = false;
        if (edadRandom < edad) {
            bandera = true;
        }
        
        return bandera;
    }

// Metodo mostrarPersona(): este método muestra la persona creada en el método
//anterior.    
    
    public void mostrarPersona(Persona p2){
        System.out.println("El nombre de la segunda persona ingresada es: " + p2.getNombre());
        System.out.println("La fecha de nacimiento es: " + p2.getFecha());
        
    }
    
    
}
