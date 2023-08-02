/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicioRectangulo;
import java.util.Scanner;
import Entidad.Rectangulo;


/**
 *
 * @author Melina Narambuena
 */
public class ServicioRectangulo {
    Scanner leer = new Scanner (System.in);
    public Rectangulo altaRectangulo(){
        Rectangulo r1 = new Rectangulo();
        System.out.println("Ingrese la base del rectangulo, por favor:");
        r1.setBase(leer.nextDouble());
        System.out.println("Ingrese la altura del rectángulo, por favor:");
        r1.setAltura(leer.nextDouble());
        
        return r1;
    }
    
    public static double superficie(double base, double altura){
        double superficie = base * altura;
        return superficie;
    }
    
    public static double perimetro(double base, double altura){
        double perimetro = (base + altura) * 2;
        return perimetro;
    }
    
     public void mostrarRectangulo(double base, double altura) {
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if(i==0 || i==altura-1 || j==0 || j==base-1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.print("\n");
        }
    }
    
}
