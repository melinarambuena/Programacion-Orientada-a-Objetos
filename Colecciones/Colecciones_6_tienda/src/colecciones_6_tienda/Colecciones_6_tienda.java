/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones_6_tienda;

import Servicio.tiendaServicio;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Melina Narambuena
 */
public class Colecciones_6_tienda {

    /** introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in).useDelimiter("\n");
        tiendaServicio ts = new tiendaServicio();
        HashMap<String, Integer> productos = ts.almacenarProducto();
        String respuesta;
        do{
        System.out.println("Desea realizar otra operación: s/n");
        respuesta = leer.next();
            if (respuesta.equalsIgnoreCase("s")) {
                        ts.menu(productos);

            }
        }while(respuesta.equalsIgnoreCase("s"));
    }
    
}
