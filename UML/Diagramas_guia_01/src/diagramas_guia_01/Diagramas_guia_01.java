/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagramas_guia_01;

import Entidad.DNI;
import Entidad.Persona;

/**
 *
 * @author Melina Narambuena
 */
public class Diagramas_guia_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DNI dni = new DNI();
        dni.setNumero(36789231);
        dni.setSerie('c');
        
        Persona p1 = new Persona();
        p1.setDni(dni);
        
        
    }
    
}
