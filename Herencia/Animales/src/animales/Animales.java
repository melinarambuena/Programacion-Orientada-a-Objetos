/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animales;

import Entities.Animal;
import Entities.Caballo;
import Entities.Gato;
import Entities.Perro;

/**
 *
 * @author Melina Narambuena
 */
public class Animales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal perro1 = new Perro("Stich", "Carnivoro", 15, "Doberman");
        perro1.alimentarse();
        Animal perro2 = new Perro("Teddy", "Croquetas", 10, "Chihuahua");
        perro2.alimentarse();
        Animal gato1 = new Gato("Pelusa", "Galletas", 15, "Siamés");
        gato1.alimentarse();
        Animal caballo1 = new Caballo("Spark", "Pasto", 25, "Fino");
        caballo1.alimentarse();
    }
    
}
