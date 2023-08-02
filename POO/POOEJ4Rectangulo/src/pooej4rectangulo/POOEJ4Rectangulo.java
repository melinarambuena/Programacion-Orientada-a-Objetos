/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej4rectangulo;

import Entidad.Rectangulo;
import ServicioRectangulo.ServicioRectangulo;

/**
 *
 * @author Melina Narambuena
 */
public class POOEJ4Rectangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ServicioRectangulo rs = new ServicioRectangulo();        
        Rectangulo r1 = rs.altaRectangulo();
        double base = r1.getBase();
        double altura = r1.getAltura();
        rs.mostrarRectangulo(base, altura);
//        vs.SueldoMensual(v1);
//        vs.vacaciones(v1);
        
        
    }
    
}
