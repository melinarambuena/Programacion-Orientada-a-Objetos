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
public final class Hotel5 extends Hotel4{
    protected boolean casino = true;
    protected boolean restaurant = true;

    public Hotel5(Double precio, Double superficie, Integer cantidadHabitaciones) {
        super(precio, superficie, cantidadHabitaciones);
    }
    
    
}
