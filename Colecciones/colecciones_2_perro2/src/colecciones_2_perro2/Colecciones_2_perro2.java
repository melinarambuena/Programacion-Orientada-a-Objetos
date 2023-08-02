/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones_2_perro2;

import Entidad.Perro;
import Servicio.PerroServicio;

/**
 *
 * @author Melina Narambuena
 */
public class Colecciones_2_perro2 {

    /**Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista.  Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PerroServicio ps = new PerroServicio();
        Perro p1 = ps.crearPerro();
        ps.buscarEliminar();
        
  }
    
}
