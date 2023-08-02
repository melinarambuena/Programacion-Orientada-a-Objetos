/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej6nespresso;

import Entidad.Cafetera;
import Servicio.ServicioCafe;

/**
 *
 * @author Melina Narambuena
 */
public class POOEJ6Nespresso {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {

//        VendedorServicio vs = new VendedorServicio();
//        Vendedor v1 = vs.altaVendedor();10
        
        
        
        
        ServicioCafe cs = new ServicioCafe();
        Cafetera c1 = new Cafetera();

        cs.llenarCafetera(c1.getCapacidadMaxima(), c1.getCantidadActual());
        cs.servirTaza(c1.getCapacidadMaxima(), c1.getCantidadActual());
        cs.vaciarCafetera(c1.getCantidadActual());
        cs.agregarCafe(c1.getCantidadActual());
    }
    
}
