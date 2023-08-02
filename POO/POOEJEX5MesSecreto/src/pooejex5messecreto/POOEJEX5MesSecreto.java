/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejex5messecreto;

import Entidad.mesSecreto;
import Servicio.mesSecretoServicio;

/**
 *
 * @author Melina Narambuena
 */
public class POOEJEX5MesSecreto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        mesSecretoServicio ms = new mesSecretoServicio();
        mesSecreto m1 =ms.crearMesSecreto();
    }
    
}
