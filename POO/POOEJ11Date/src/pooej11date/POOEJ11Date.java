/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej11date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Melina Narambuena
 */
public class POOEJ11Date {

    /**
     * @param args the command line arguments 
     * Pongamos de lado un momento el
     * concepto de POO, ahora vamos a trabajar solo con la clase Date. En este
     * ejercicio deberemos instanciar en el main, una fecha usando la clase
     * Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que
     * se le pedirán al usuario para poner el constructor del objeto Date. Una
     * vez creada la fecha de tipo Date, deberemos mostrarla y mostrar cuantos
     * años hay entre esa fecha y la fecha actual, que se puede conseguir
     * instanciando un objeto Date con constructor vacío.
     * 
     * Ejemplo fecha: 
     * Date fecha = new Date(anio, mes, dia);
     * Ejemplo fecha actual: 
     * Date fechaActual* = new Date();
     *
     *
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el año, por favor: ");
        int anio = leer.nextInt();
        
        System.out.println("Ingrese el mes, por favor: ");
        int mes = leer.nextInt();
        
        System.out.println("Ingrese el día, por favor: ");
        int dia = leer.nextInt();
        
        Date fecha = new Date(anio-1900, mes-1, dia);
        
        System.out.println(fecha);
        Date fechaActual = new Date();
        System.out.println(fechaActual);
        
        int diferencia = fechaActual.getYear()- fecha.getYear();
        System.out.println("resultado " + diferencia);
    }
}
//            LocalDate fecha =  LocalDate.now();
//             Scanner scanner = new Scanner(System.in);
//        System.out.print("Ingrese una fecha en formato yyyy-mm-dd: ");
//        String fechaIngresadaStr = scanner.nextLine();
//        LocalDate fechaIngresada = LocalDate.parse(fechaIngresadaStr);
//            
//            
//            
//            long diasDiferencia = ChronoUnit.DAYS.between(fechaIngresada, fecha);
//
//        System.out.println("La diferencia en días es: " + diasDiferencia);
//    }
//}            
//            LocalDate
//            System.out.println("fecha actual " + fecha);
            


    
