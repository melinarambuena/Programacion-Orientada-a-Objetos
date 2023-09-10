/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoteles.entidades;

/**
 *
 * @author Melina Narambuena
 */
public class Hotel3 extends Hotel2{
    protected boolean aireAcondicionado = true;
    protected boolean bar = true;

    public Hotel3(Double precio, Double superficie, Integer cantidadHabitaciones) {
        super(precio, superficie, cantidadHabitaciones);
    }
    
    
    
}
