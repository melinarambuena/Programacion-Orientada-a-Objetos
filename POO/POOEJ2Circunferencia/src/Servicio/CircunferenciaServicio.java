package Servicio;

import Entidades.Circunferencia;
import java.util.Scanner;

public class CircunferenciaServicio {

    public Circunferencia altaCircunferencia() {
        Circunferencia c1 = new Circunferencia();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el radio de la circunferencia, por favor:");
        c1.setRadio(leer.nextDouble());
        return c1;
    }
    
public static double area(double radio){
    
    double area = Math.PI * Math.pow(radio, 2);
    
    return area;
}
  
public static double perimetro(double radio){
    
    double perimetro = 2 * Math.PI * radio ;
    return perimetro;
}
    

        public void mostrarInfo(Circunferencia c1, double perimetro, double area) {
            System.out.println("El area de la circunferencia es: " +area+ ", el perimetro de la circunferencia es;" +perimetro);
        }

    
}
