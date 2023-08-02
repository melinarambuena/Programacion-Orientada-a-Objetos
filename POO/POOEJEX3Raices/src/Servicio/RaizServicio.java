/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Raiz;
import java.util.Scanner;

/**
 *
 * @author Melina Narambuena
 */
public class RaizServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Raiz crearRaiz() {
        Raiz r1 = new Raiz();
        System.out.println("Ingrese el coeficiente a, por favor:");
        r1.setA(leer.nextDouble());
        System.out.println("Ingrese el coeficiente b, por favor:");
        r1.setB(leer.nextDouble());
        System.out.println("Ingrese el coeficiente c, por favor:");
        r1.setC(leer.nextDouble());

        return r1;
    }

    public static double getDiscriminante(Raiz r1) {
        double discriminante = (Math.pow(r1.getB(), 2) - 4 * r1.getA() * r1.getC());
        return discriminante;
    }

    public static boolean tieneRaices(double discriminante) {
        boolean tiene = false;
        if (discriminante >= 0) {
            tiene = true;

        }

        return tiene;
    }

    public static boolean tieneRaiz(double discriminante) {
        boolean tiene = false;
        if (discriminante == 0) {
            tiene = true;
        }
        return tiene;
    }

    public void obtenerRaices(Raiz r1, double discriminante) {
        boolean tieneRaices = tieneRaices(discriminante);

        if (tieneRaices) {
            System.out.println("La ecuación de segundo grado tiene dos soluciones.");
            double A = (-r1.getB() + Math.sqrt(Math.pow(r1.getB(), 2) - 4 * r1.getA() * r1.getC())) / (2 * r1.getA());
            System.out.println("La solución A es: " + A);
            double B = (-r1.getB() - Math.sqrt(Math.pow(r1.getB(), 2) - 4 * r1.getA() * r1.getC())) / (2 * r1.getA());
            System.out.println("La solución B es: " + B);
        }

    }

    public void obtenerRaiz(Raiz r1, double discriminante) {
        boolean tieneRaiz = tieneRaiz(discriminante);

        if (tieneRaiz) {
            double A = (-r1.getB() + Math.sqrt(Math.pow(r1.getB(), 2) - 4 * r1.getA() * r1.getC())) / (2 * r1.getA());
            System.out.println("La solución es: " + A);
        }

    }
//    Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
//pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
//obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
//de no existir solución, se mostrará un mensaje.  

    public void calcular(Raiz r1, double discriminante) {

        boolean tieneRaices = tieneRaices(discriminante);
        boolean tieneRaiz = tieneRaiz(discriminante);
        if (tieneRaices) {
            System.out.println("La ecuación de segundo grado tiene dos soluciones.");
            double A = (-r1.getB() + Math.sqrt(Math.pow(r1.getB(), 2) - 4 * r1.getA() * r1.getC())) / (2 * r1.getA());
            System.out.println("La solución A es: " + A);
            double B = (-r1.getB() - Math.sqrt(Math.pow(r1.getB(), 2) - 4 * r1.getA() * r1.getC())) / (2 * r1.getA());
            System.out.println("La solución B es: " + B);
        }else if(tieneRaiz){
            double A = (-r1.getB() + Math.sqrt(Math.pow(r1.getB(), 2) - 4 * r1.getA() * r1.getC())) / (2 * r1.getA());
            System.out.println("La solución es: " + A);
        }else{
            System.out.println("La ecuación no tiene solución.");
        }
        
        
        
        
    }

}
