/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej13curso;

import Entidad.Curso;
import Servicio.CursoServicio;

/**
 *
 * @author Melina Narambuena
 */
public class POOEJ13Curso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    CursoServicio cs = new CursoServicio();
               Curso c1 = new Curso();
        String[] arregloA = CursoServicio.cargarAlumnos();
        cs.crearCurso(c1, arregloA);
        System.out.println("La ganancia semanala del curso es: " + CursoServicio.calcularGananciaSemanal(c1));
    }
    
}
