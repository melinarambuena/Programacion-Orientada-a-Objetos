/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.RevolverdeAgua;

/**
 *
 * @author Melina Narambuena
 */
public class RevolverServicio {
    
    public RevolverdeAgua llenarRevolver(){
       RevolverdeAgua r1 = new RevolverdeAgua();
       
       int actual = (int)(Math.random()*6+1);
       r1.setPosicionActual(actual);

       int agua = (int)(Math.random()*6+1);
       r1.setPosicionAgua(agua);
//        System.out.println("random posicion " + r1.getPosicionActual());
       return r1;
    }
    
    
    public boolean mojar(RevolverdeAgua r1){
        boolean mojar = false;
        
        if (r1.getPosicionActual()== r1.getPosicionAgua()) {
            mojar = true;
        }
        
        return mojar;
    }
    
    public void siguienteChorro(RevolverdeAgua r1){
       int posicion = r1.getPosicionActual() + 1;
        if (posicion > 6) {
            posicion = 1;
        }
       r1.setPosicionActual(posicion);
       
    }
    
 
    
    
    
    
    
    
    
}
