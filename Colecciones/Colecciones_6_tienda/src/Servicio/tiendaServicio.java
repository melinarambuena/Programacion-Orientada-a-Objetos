/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.  
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.  
 * @author Melina Narambuena
 */

public class tiendaServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
        public HashMap<String, Integer> almacenarProducto(){
        HashMap<String, Integer> productos = new HashMap();
        String nombre;
        int precio;
        System.out.println("Ingrese un producto, por favor:");
        nombre = leer.next();
        System.out.println("Ingrese el precio, por favor:");
        precio = leer.nextInt();
        
        productos.put(nombre, precio);
        
        
        return productos;
        
    }
      
    public void menu(HashMap<String, Integer> productos){
        int respuesta;
        
        System.out.println("Menu:");
        System.out.println("1. Introducir elemento.");
        System.out.println("2. Modificar precio.");
        System.out.println("3. Eliminar producto.");
        System.out.println("4. Mostrar productos.");
        System.out.println("Ingrese la opción que desea realizar:");
        respuesta = leer.nextInt();
        switch(respuesta){
            case 1: 
                    agregarOtroProducto(productos);
                break;
            case 2:  
                    modificarPrecio(productos);
                break;
            case 3:  
                    eliminar(productos);
                break;
            case 4:
                    mostrar(productos);
                break;
        }
        
        System.out.println("");
    }
    
    public void agregarOtroProducto(HashMap<String, Integer> productos){
        String nombre;
        int precio;
        System.out.println("Ingrese un producto, por favor:");
        nombre = leer.next();
        System.out.println("Ingrese el precio, por favor:");
        precio = leer.nextInt();
        
        productos.put(nombre, precio);
    }
    
    public void modificarPrecio(HashMap<String, Integer> productos){
        String modificar;
        int nuevo;
        System.out.println("Ingrese el producto a modificar, por favor:");
        modificar = leer.next();
        System.out.println("Ingrese el precio nuevo, por favor:");
        nuevo = leer.nextInt();
        
        productos.replace(modificar, nuevo);

        
    }
    
    public void eliminar(HashMap<String, Integer> productos){
        String productoEliminar;
        System.out.println("Ingrese el producto que desea eliminar, por favor:");
        productoEliminar = leer.next();
        productos.remove(productoEliminar);
    }
    
    public void mostrar(HashMap<String, Integer> productos){
        for (Map.Entry<String, Integer> aux : productos.entrySet()) {
            String key = aux.getKey();
            Integer value = aux.getValue();
            
        System.out.println("key: " + key + "value: " + value);
            
        }
    }
}
