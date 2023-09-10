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
public abstract class Appliance {

    protected double price;
    protected String color;
    protected String energyConsumption;
    protected double weight;

    public Appliance() {
    }

    public Appliance(double price, String color, String energyConsumption, double weight) {
        this.price = price;
        this.color = color;
        this.energyConsumption = energyConsumption;
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEnergyConsumption() {
        return energyConsumption;
    }

    public void setEnergyConsumption(String energyConsumption) {
        this.energyConsumption = energyConsumption;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String checkEnergyConsumption(String letter) {
        boolean letterChecked = false;
        if (letter.equalsIgnoreCase("A") || letter.equalsIgnoreCase("B") || letter.equalsIgnoreCase("C") || letter.equalsIgnoreCase("D") || letter.equalsIgnoreCase("E") || letter.equalsIgnoreCase("F")) {
            letterChecked = true;
        } else {
            letter = "F";
        }
        return letter.toUpperCase();
    }

    public String checkColor(String color) {
        boolean colorChecked = false;
        if (color.equalsIgnoreCase("blanco") || color.equalsIgnoreCase("negro") || color.equalsIgnoreCase("rojo") || color.equalsIgnoreCase("azul") || color.equalsIgnoreCase("gris")) {
            colorChecked = true;

        } else {
            color = "blanco";
        }
        return color.toUpperCase();
    }

    public void createAppliance(String letter) {
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        System.out.println("Enter the color you'd like");
        color = read.next();
        this.color = checkColor(color);
        System.out.println("Type the letter for energy consumption you'd like: A, B, C, D, E, F");
        letter = read.next();
        this.energyConsumption = checkEnergyConsumption(letter);
        System.out.println("Enter the weight of the appliance, please");
        weight = read.nextDouble();
        this.weight = weight;
        this.price = 1000;
    }

    public void finalPrice() {
        switch (this.energyConsumption) {
            
            case "A":
                this.price += 1000;
                
            break;
            
            case "B":
                this.price += 800;
            break;
            
            case "C":
                this.price += 600;
            break;
            
            case "D":
                this.price += 500;
            break;
            
            case "E":
                this.price += 300;
            break;
            
            case "F":
                this.price += 100;
            break;
            
            default: 
                System.out.println("No pasa nada está todo ok");
        }
        
        if (this.weight > 1 && this.weight < 19) {
            this.price += 100;
        }else if(this.weight > 20 && this.weight < 49){
            this.price += 500;
        }else if(this.weight > 50 && this.weight < 79){
            this.price += 800;         
        }else if (this.weight > 80)
            this.price += 1000;
    }
    
    

    @Override
    public String toString() {
        return "Appliance{" + "price=" + price + ", color=" + color + ", energyConsumption=" + energyConsumption + ", weight=" + weight + '}';
    }

}
