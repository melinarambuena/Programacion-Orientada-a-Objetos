/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author Melina Narambuena
 */
public class PersonaServicio {

    public Persona crearPersona() {
        Scanner leer = new Scanner(System.in);

        Persona p1 = new Persona();
        System.out.println("Ingrese el nombre; por favor:");
        p1.setNombre(leer.next());
        System.out.println("Ingrese la edad, por favor:");
        p1.setEdad(leer.nextInt());
        System.out.println("Ingrese el sexo, por favor:");
        p1.setSexo(leer.next());
        if (p1.getSexo().equals("H") || p1.getSexo().equals("M") || p1.getSexo().equals("O")) {
            System.out.println("La opcion ingresada es válida.");
        }else{
            System.out.println("La opción ingresada es inválida.");
        }
        System.out.println("Ingrese el peso en kg , por favor:");
        p1.setPeso(leer.nextDouble());
        System.out.println("Ingrese la altura en metros, por favor:");
        p1.setAltura(leer.nextDouble());

        return p1;
    }

        public static double calcularIMC(Persona p1) {
            double IMC = p1.getPeso() / Math.pow(p1.getAltura(), 2);
            
            if (IMC < 20) {
                System.out.println("La persona está por debajo de su peso ideal");
                System.out.println("-1");
            }else if(IMC>= 20 && IMC <= 25){
                System.out.println("La persona está en su peso ideal");
                System.out.println("0");
            }else if(IMC>25){
                System.out.println("La persona tiene sobrepeso.");
                System.out.println("1");
            }
            
             return IMC;
             
        }
        
        public static boolean esMayordeEdad(Persona p1){
            boolean mayor = false;
            
            if (p1.getEdad()> 18) {
                mayor = true;
                System.out.println(mayor);
            }else if(p1.getEdad()< 18){
                mayor = false;
            }

          return mayor;  
        }
        
        
        

}
