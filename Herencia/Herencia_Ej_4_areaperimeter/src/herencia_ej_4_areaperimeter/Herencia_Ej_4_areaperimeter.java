/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia_ej_4_areaperimeter;

import Entities.Circle;
import Entities.Rectangle;

/**
 *
 * @author Melina Narambuena
 */
public class Herencia_Ej_4_areaperimeter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final double PI = 3.14159d;

        Circle c1 = new Circle();
        double radius = 4;
        double base = 7;
        double height = 2;
        double perimeter = c1.perimeterCalculation(PI, height, base, height);
        double area = c1.areaCalculation(PI, radius, base, height);
        System.out.println("The area of the circle is: " + area);
        System.out.println("The perimeter of the circle is: "+ perimeter);
        Rectangle r1 = new Rectangle();
        double area2 = r1.areaCalculation(PI, radius, base, height);
        double perimeter2 = r1.perimeterCalculation(PI, perimeter, base, height);
        System.out.println("The area of the rectangle is: " + area2);
        System.out.println("The perimeter of the rectangle is: "+ perimeter2);

    }

}
