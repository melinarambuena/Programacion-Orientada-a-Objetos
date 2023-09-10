/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import Interfaces.shapeCalculations;

/**
 *
 * @author Melina Narambuena
 */
public class Rectangle implements shapeCalculations{
    
     @Override
    public double perimeterCalculation(double PI, double circleDiameter, double base, double height) {
        double perimeter = (base + height)*2; 
        return perimeter;
    }

    @Override
    public double areaCalculation(double PI, double radius, double base, double height) {
        double area = base * height;
        return area;
    }
}
