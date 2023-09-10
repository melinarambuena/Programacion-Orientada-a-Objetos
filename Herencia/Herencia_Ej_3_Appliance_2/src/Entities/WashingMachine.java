/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.util.Scanner;

/**
 *
 * @author Melina Narambuena
 */
public class WashingMachine extends Appliance {

    protected double charge;

    public WashingMachine() {
    }

    public WashingMachine(double charge) {
        this.charge = charge;
    }

    public WashingMachine(double charge, double price, String color, String energyConsumption, double weight) {
        super(price, color, energyConsumption, weight);
        this.charge = charge;
    }

    public double getCharge() {
        return charge;
    }

    public void setCharge(double charge) {
        this.charge = charge;
    }

    public void createWashingMachine() {
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        super.createAppliance(energyConsumption);
        System.out.println("Enter the charge, please: ");
        this.charge = read.nextDouble();
       

    }
    
    @Override
        public double finalPrice() {
             super.finalPrice();
        
        if (charge > 30) {
            this.price += 500;
        }else if(charge < 30 || charge == 30){
            
        }
        System.out.println("The final price is: " + this.price);
        
        return this.price;
        }
        
        
        
}
