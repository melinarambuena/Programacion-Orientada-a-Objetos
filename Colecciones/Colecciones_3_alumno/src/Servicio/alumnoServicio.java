/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 **Crear una clase llamada Alumno que mantenga información sobre las notas de
 * distintos alumnos. La clase Alumno tendrá como atributos, su nombre y una
 * lista de tipo Integer con sus 3 notas.
 *
 * En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno.
 * Se pide toda la información al usuario y ese Alumno se guarda en una lista de
 * tipo Alumno y se le pregunta al usuario si quiere crear otro Alumno o no.
 * Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
 * Método notaFinal(): El usuario ingresa el nombre del alumno que quiere
 * calcular su nota final y se lo busca en la lista de Alumnos. Si está en la
 * lista, se llama al método. Dentro del método se usará la lista notas para
 * calcular el promedio final de alumno. Siendo este promedio final, devuelto
 * por el método y mostrado en el main.
 *
 * @author Melina Narambuena
 */
public class alumnoServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    
    public  ArrayList<alumno> crearAlumno() {
        ArrayList<alumno> listaAlumnos = new ArrayList();

        String respuesta;
        
            do {
            
            System.out.println("¿Desea crear alumno, s/n?");
            respuesta = leer.next();

            if (respuesta.equalsIgnoreCase("s")) {
                alumno a1 = new alumno();

                System.out.println("Ingrese nombre del alumno, por favor:");
                String nombre = leer.next();
                a1.setNombre(nombre);
                
                a1.setNotas(new ArrayList<>()); //inicializamos su lista de notas
                System.out.println("Ingrese la nota 1°, por favor:");
                int nota1 = leer.nextInt();
                a1.getNotas().add(nota1);
                
                System.out.println("Ingrese la nota 2°, por favor:");
                int nota2 = leer.nextInt();
                a1.getNotas().add(nota2);
                
                System.out.println("Ingrese la nota 3°, por favor:");
                int nota3 = leer.nextInt();
                a1.getNotas().add(nota3);
                
//                for (Integer lista : a1.getNotas()){
//                    System.out.println("Las notas de la lista son:");
//                    System.out.println(lista);
//                }

                listaAlumnos.add(a1);
                
//                for (alumno numero : listaAlumnos){
//                    System.out.println(numero);
//                }
            }

        } while (respuesta.equalsIgnoreCase("s"));

            return listaAlumnos;
    }
    
    public void notaFinal(ArrayList<alumno> listaAlumnos){
        
        System.out.println("Ingrese el nombre del alumno que desea buscar, por favor:");
        String nombre = leer.next();

        
        for (int i = 0; i < listaAlumnos.size(); i++) {
               alumno a1 = listaAlumnos.get(i);
               
               if (a1.getNombre().equals(nombre)) {

                 System.out.println("La nota final es de " + (a1.getNotas().get(0) + a1.getNotas().get(1) + a1.getNotas().get(2)) / 3); 

               } else {
                System.out.println("No se encontró el alumno");
            }
               
        }
        
        
        
        

    }
    
    
}
