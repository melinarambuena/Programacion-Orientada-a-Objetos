/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej9matematica;

import Entidad.Matematica;
import Servicio.MatematicaServicio;

/**
 *
 * @author Melina Narambuena
 */
public class POOEJ9Matematica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MatematicaServicio ms = new MatematicaServicio();
        Matematica m1 = ms.crearMatematica();
        System.out.println("El numero mayor es: " + MatematicaServicio.devolverMayor(m1));
        System.out.println("La potencia del mayor valor, elevado por el valor menor es: " + MatematicaServicio.calcularPotencia(m1));
        System.out.println("La raíz cuadrada del menor valor es: " + MatematicaServicio.calcularRaiz(m1));
    }
    


    
    
    
    
}
