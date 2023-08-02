/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej8cadena;

import Entidad.Cadena;
import Servicio.ServicioCadena;

/**
 *
 * @author Melina Narambuena
 */
public class POOEJ8Cadena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ServicioCadena cs = new ServicioCadena();
        Cadena c1 = cs.crearCadena();
        String cadena = c1.getCadena();
        int longitud = c1.getCaracteres(c1.getCadena());
        int vocales = ServicioCadena.mostrarVocales(c1, cadena, longitud);
        cs.invertirFrase(longitud, cadena);
        cs.vecesRepetido(longitud, cadena);
        cs.compararLongitud(cadena);
        cs.unirFrases(cadena);
        cs.reemplazar( longitud, cadena);
        cs.contiene(cadena);
    }
    
}
