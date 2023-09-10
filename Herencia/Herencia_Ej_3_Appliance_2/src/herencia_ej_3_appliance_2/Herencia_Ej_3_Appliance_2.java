/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia_ej_3_appliance_2;

import Entities.Appliance;
import Entities.TV;
import Entities.WashingMachine;
import java.util.ArrayList;

/**
 *
 * @author Melina Narambuena
 */
public class Herencia_Ej_3_Appliance_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Appliance> appliances = new ArrayList();

        WashingMachine w1 = new WashingMachine(20, 1500, "blanco", "D",30);
        double price1 = w1.finalPrice();
        WashingMachine w2 = new WashingMachine(10, 1000, "rojo", "A", 30);
        double price2 = w1.finalPrice();
        
        TV t1 = new TV(42, true, 1000, "gris", "F", 40);
        double price3 = t1.finalPrice();
        TV t2 = new TV(50, false, 1000, "blanco", "B", 50);
        double price4 = t1.finalPrice();
        
        appliances.add(w1);
        appliances.add(w2);
        appliances.add(t1);
        appliances.add(t2);

        System.out.println("The price of the appliances is: "  + (price1 + price2 + price3 + price4));
        
        
        
    }
    
}
