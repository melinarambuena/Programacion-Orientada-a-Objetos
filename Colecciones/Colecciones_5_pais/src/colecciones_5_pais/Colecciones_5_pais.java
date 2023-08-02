/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones_5_pais;

import Entidad.Pais;
import Servicio.paisServicio;
import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author Melina Narambuena
 */
public class Colecciones_5_pais {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        paisServicio ps = new paisServicio();
        HashSet<Pais> paises = ps.crearPais();
        ps.ordenAlfabetico(paises);
        ps.recorrer(paises);
    }
    
}
