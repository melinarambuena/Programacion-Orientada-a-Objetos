/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejex4digitoverificador;

import Entidad.nif;
import Servicio.NifServicio;

/**
 *
 * @author Melina Narambuena
 */
public class POOEJEX4DigitoVerificador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NifServicio ns = new NifServicio();
        nif n1 = ns.crearNif();
        ns.mostrar(n1);
    }

}
