/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra5sociosobrasocial;
import java.util.Scanner;
/**
 *
 * @author Melina Narambuena
 */
public class EjercicioExtra5SociosObraSocial {

    /**
     * @param args the command line arguments
     * Ejercicio5_Una obra social tiene tres clases de socios:
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
todos los tipos de tratamientos.
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para
los mismos tratamientos que los socios del tipo A.
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
tratamientos.
o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
real que represente el costo del tratamiento (previo al descuento) y determine el
importe en efectivo a pagar por dicho socio.
     */
    
    
    
    
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        char tipoSocio;
        int costo;
        int descuentoA;
        int descuentoB;
        int totalA;
        int totalB;
        System.out.println("Ingrese la letra corrspondiente al tipo de socio (A, B o C) por favor:");
        tipoSocio = leer.next().charAt(0);
        System.out.println("Ingrese el costo del tratamiento, por favor:");
        costo = leer.nextInt();

//        if (tipoSocio == 'A' ) {
//            descuentoA = costo 
        switch (tipoSocio) {
            case 'A':
                descuentoA = costo * 50 / 100;
                totalA = costo - descuentoA;
                System.out.println("El monto a abonar es de " + totalA);
                break;
            case 'B':
                descuentoB = costo * 35 / 100;
                totalB = costo - descuentoB;
                System.out.println("El monto a abonar es de " + totalB);
                break;
            case 'C':
                System.out.println("El monto a abonar es de " + costo);
                break;
        }

    }

}
