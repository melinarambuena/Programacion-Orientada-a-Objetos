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
public class TV extends Appliance {

    protected int resolution;
    protected boolean tunerTDT;

    public TV() {
    }

    public TV(int resolution, boolean tunerTDT) {
        this.resolution = resolution;
        this.tunerTDT = tunerTDT;
    }

    public TV(int resolution, boolean tunerTDT, double price, String color, String energyConsumption, double weight) {
        super(price, color, energyConsumption, weight);
        this.resolution = resolution;
        this.tunerTDT = tunerTDT;
    }

    public int getResolution() {
        return resolution;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }

    public boolean isTunerTDT() {
        return tunerTDT;
    }

    public void setTunerTDT(boolean tunerTDT) {
        this.tunerTDT = tunerTDT;
    }

    public void createTV() {
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        super.createAppliance(energyConsumption);
        System.out.println("Enter TV resolution, please:");
        this.resolution = read.nextInt();
        System.out.println("Enter true or false if the tv has a tuner TDT, please: ");
        this.tunerTDT = read.nextBoolean();

        
    }

    @Override
    public double finalPrice() {
        super.finalPrice();
        if (this.resolution > 40) {
            double percentage = this.price * 30 / 100;
            this.price = this.price + percentage;
        }

        if (tunerTDT) {
            this.price += 500;
        }
        System.out.println("The final price is: " + this.price);
        return this.price;
    }

}
