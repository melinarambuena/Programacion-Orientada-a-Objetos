/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejex3raices;

import Entidad.Raiz;
import Servicio.RaizServicio;

/**
 *
 * @author Melina Narambuena
 */
public class POOEJEX3Raices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RaizServicio rs = new RaizServicio();
        Raiz r1 = rs.crearRaiz();
        double discriminante = RaizServicio.getDiscriminante(r1);
        System.out.println("La ecuacion tiene dos soluciones: " + RaizServicio.tieneRaices(discriminante));
        System.out.println("La ecuación tiene una solución: " + RaizServicio.tieneRaiz(discriminante));
        rs.obtenerRaices(r1, discriminante);
        rs.calcular(r1, discriminante);
        
        
        
    }
    
}
