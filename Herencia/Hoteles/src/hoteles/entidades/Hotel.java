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
public class Hotel {
    protected Integer cantidadHabitaciones;

    public Hotel(Integer cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    public Integer getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public void setCantidadHabitaciones(Integer cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }
    
    
}
