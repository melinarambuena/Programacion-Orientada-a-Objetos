/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotapp;

import java.util.Scanner;
import mascotapp.entidades.Mascota;
import mascotapp.servicios.ServicioMascota;


/**
 *
 * @author Melina Narambuena
 */
public class MascotAPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Scanner leer = new Scanner(System.in);
//ServicioMascota sm = new ServicioMascota();
//        Mascota m1 = sm.crearMascota();
//        m1 = null;
//Mascota m1 = new Mascota("Fernando Chiquito", leer.next(), "Perro");
//
//m1.setNombre("Pepe Chiquito");
//
//m1.pasear(100);
//        System.out.println(m1.toString());

//Pasaje por valor/referencia
int a = 10;
Mascota mm = new Mascota();
modificador(a,mm);
        System.out.println("a "+a);
        System.out.println("Mascota "+mm);
    }
    
    public static void modificador(int num, Mascota m){
        num = 100;
        m.setApodo("Mascota Referencia");
    }

}
