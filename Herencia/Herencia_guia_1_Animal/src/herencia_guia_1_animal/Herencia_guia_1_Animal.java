/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia_guia_1_animal;

import Entity.Animal;
import Entity.Gato;
import Entity.Perro;
import java.util.ArrayList;

/**
 *
 * @author Melina Narambuena
 */
public class Herencia_guia_1_Animal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Animal> animales = new ArrayList();
        
        Animal a = new Animal();
        Animal b = new Perro();
        Animal c = new Gato();
        
        animales.add(a);
        animales.add(b);
        animales.add(c);
        
//        for (Animal mostrar : animales) {
//            System.out.println(mostrar);
//        }
        a.hacerRuido();
        b.hacerRuido();
        c.hacerRuido();
    }
    
}
