/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Movil;
import java.util.Scanner;

/**
 *
 * @author Melina Narambuena
 */
public class MovilServicio {
            Scanner leer = new Scanner(System.in).useDelimiter("\n");

   public Movil cargarCelular() {

        Movil m1 = new Movil();
        
        System.out.println("Ingrese la marca , por favor:");
        m1.setMarca(leer.next());
        System.out.println("Ingrese el precio, por favor");
        m1.setPrecio(leer.nextDouble());
        System.out.println("Ingrese el tamaño de la memoria Ram, por favor: ");
        m1.setMemoriaRam(leer.nextInt());
        System.out.println("Ingrese la capacidad de almacenamiento, por favor: ");
        m1.setAlmacenamiento(leer.nextInt());
        
        
       return m1;
    }
    
    
    public int [] ingresarCodigo(Movil m1){
        
        int[] codigo = new int[m1.getCodigo().length];

        for (int i = 0; i < m1.getCodigo().length; i++) {
            System.out.println("Ingrese el código, por favor " + (i + 1) +  ": ");
            codigo[i] = leer.nextInt();
        }        
        m1.setCodigo(codigo);
        
       return codigo;
    }
    
}
