/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejex2puntos;

import Entidad.Punto;
import Servicio.ServicioPuntos;

/**
 *
 * @author Melina Narambuena
 */
public class POOEJEX2Puntos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioPuntos ps = new ServicioPuntos();
        Punto p1 = ps.crearPuntos();
        System.out.println("La distancia entre los puntos es: " + ServicioPuntos.calcularDistancia(p1));
    }

}
