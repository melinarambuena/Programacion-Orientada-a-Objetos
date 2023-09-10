/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia_ej_2_appliance;

import Entities.Appliance;
import Entities.TV;
import Entities.WashingMachine;

/**
 *
 * @author Melina Narambuena
 */
public class Herencia_Ej_2_Appliance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        WashingMachine w1 = new WashingMachine();
        w1.createWashingMachine();
        w1.finalPrice();
        
        TV t1 = new TV();
        t1.createTV();
        t1.finalPrice();
        
    }
        
}
    

