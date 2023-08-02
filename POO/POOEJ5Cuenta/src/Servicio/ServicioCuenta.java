/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cuenta;
import java.util.Scanner;

/**
 *
 * @author Melina Narambuena
 */
public class ServicioCuenta {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cuenta crearCuenta() {
        Cuenta c1 = new Cuenta();
        System.out.println("Ingrese el número de la cuenta, por favor:");
        c1.setNumeroCuenta(leer.nextInt());
        System.out.println("Ingrese el dni del ususario, por favor:");
        c1.setDni(leer.nextInt());
        System.out.println("Ingrese el saldo actual, por favor:");
        c1.setSaldoActual(leer.nextInt());
        return c1;
        
    
    }
    
  
     
    public void ingresar(Cuenta c1, double ingreso, double saldoActual){
        System.out.println("Ingrese la cantidad a sumar");
        c1.setIngreso(leer.nextDouble());

                saldoActual += ingreso;
    }
    
    
       
    public void retirar(Cuenta c1, double retiro, double saldoActual){
        System.out.println("Ingrese la cantidad a reitrar");
        c1.setRetiro(leer.nextDouble());
        
        saldoActual -= retiro;
        
        if (retiro>saldoActual) {
            saldoActual = 0;
            System.out.println("Su saldo actual es " + saldoActual);
        }else{
            System.out.println("Su saldo actual es: " + saldoActual);
        }
    }
    
    public void extraccionRapida(double saldoActual){
    double veinte = (saldoActual * 20) / 100;
        System.out.println("Ingrese el valor, no mayor al 20%, para la extracción rápida, por favor:");
        double extraccionRapida = leer.nextDouble();
        if (veinte>extraccionRapida) {
            saldoActual-= extraccionRapida;
            System.out.println("Su retiro es: "+extraccionRapida+ " y su saldo actual: " + saldoActual);
           
            
        }else{
            System.out.println("El monto a retirar supera el 20% de su saldo actual.");
        }
    }
    
    
    public void consultarSaldo(double saldoActual){
        System.out.println("Su saldo actual es: "+ saldoActual);
        
    }
    
    public void consultarDatos(Cuenta c1){
        System.out.println("El número de su cuenta es: " + c1.getNumeroCuenta());
        System.out.println("El DNI asociado a la cuenta es :" + c1.getDni());
        System.out.println("Su saldo actual es: " + c1.getSaldoActual());
    }
    
    
      
    

    
}

    
    
    
    
    
    
    
    
