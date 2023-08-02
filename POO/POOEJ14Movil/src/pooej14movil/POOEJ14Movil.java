/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej14movil;

import Entidad.Movil;
import Servicio.MovilServicio;

/**
 *
 * @author Melina Narambuena
 */
public class POOEJ14Movil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

 MovilServicio ms = new MovilServicio();
        Movil m1 = ms.cargarCelular();
                ms.ingresarCodigo(m1);
    }
    
}
