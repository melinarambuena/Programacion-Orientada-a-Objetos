/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.mesSecreto;
import java.util.Scanner;

/**
 *
 * @author Melina Narambuena
 */
public class mesSecretoServicio {
//    mesSecreto = mes[9]

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public mesSecreto crearMesSecreto() {
        mesSecreto m1 = new mesSecreto();
        boolean bandera = false;

        String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        m1.setMeses(meses);

        String mesSecreto = m1.getMeses()[9];

        m1.setMesSecreto("agosto");

        System.out.println("mes secreto " + m1.getMesSecreto());

        
        
        
        do{
        System.out.println("Adivine el mes secreto, introduzca el nombre del mes en minúsculas: ");
        String buscar = leer.next();
        
        for (String mese : m1.getMeses()) {
            if (buscar.equals(m1.getMesSecreto())) {
                bandera = true;
            }
        }

        if (bandera == false) {
            System.out.println("Le erraste :(" );
           
            
        } else {
            System.out.println("¡Acertaste!" + m1.getMesSecreto() + " coincide con: " + buscar);

        }

        } while(bandera == false);
        
        
        
        return m1;

    }

}
