/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Curso;
import java.util.Scanner;

/**
 *
 * @author Melina Narambuena
 */
public class CursoServicio {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

     public static String [] cargarAlumnos() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        Curso c1 = new Curso();
        String[] alumnos = new String[c1.getAlumnos().length];
        
        for (int i = 0; i < c1.getAlumnos().length; i++) {
            System.out.print("Ingrese el nombre para el alumno #" + (i + 1) + ": ");
            alumnos[i] = leer.next();
        }
//        c1.setAlumnos(alumnos);
        return alumnos;
    }
     
     public void crearCurso(Curso c1, String[] alumnos){
                 Scanner leer = new Scanner(System.in).useDelimiter("\n");

         System.out.println("Ingrese el nombre del curso, por favor: ");
         c1.setNombreCurso(leer.next());
         System.out.println("Ingrese la cantidad de horas por día del curso, por favor:");
         c1.setCantidadHorasPorDia(leer.nextDouble());
         System.out.println("Ingrese la cantidad de días por semana, por favor: ");
         c1.setCantidadDiasPorSemana(leer.nextInt());
         System.out.println("Ingrese el turno mañano o tarde, por favor: ");
         c1.setTurno(leer.next());
         System.out.println("Ingrece el precio por hora, por favor:");
         c1.setPrecioPorHora(leer.nextDouble());
         c1.setAlumnos(alumnos);
         }

    /* Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia
en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por
día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que
se repite el encuentro. */
     
     public static double calcularGananciaSemanal(Curso c1){
         
     return c1.getCantidadDiasPorSemana()* c1.getPrecioPorHora() * 5 * c1.getCantidadHorasPorDia();
     }
     
     
     
}
