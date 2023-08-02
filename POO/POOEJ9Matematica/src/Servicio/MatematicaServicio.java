/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Matematica;
import java.util.Scanner;

/**
 *
 * @author Melina Narambuena
 */
public class MatematicaServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Matematica crearMatematica() {
                Matematica m1 = new Matematica();

        
        m1.setNum1((Math.random() * 10));
        m1.setNum2((Math.random() * 10));
        System.out.println("num1: "+m1.getNum1());
        System.out.println("num2: "+m1.getNum2());
        return m1;
    }

    
    
    public static double devolverMayor(Matematica m1){
        double esMayor = 0;
//        if (m1.getNum1() != m1.getNum2()) {
//            long esMayor = (long) Math.max(m1.getNum1(), m1.getNum2());
//        }
        if (m1.getNum1() < m1.getNum2()) {
           esMayor = m1.getNum2(); 
        }else if(m1.getNum2() < m1.getNum1()){
            esMayor = m1.getNum1();
        }
        
        return esMayor;
    }
    
    
    public static double calcularPotencia(Matematica m1){
        
        double esMayor = 0;
        double esMenor = 0;
        
        if (m1.getNum1() == m1.getNum2()) {
            System.out.println("Los numeros son iguales.");
            

        }else{
            esMayor = Math.max(m1.getNum1(), m1.getNum2());
            esMenor = Math.min(m1.getNum1(), m1.getNum2());

        }
         double redondeoMayor = Math.round( esMayor );
         double redondeoMenor = Math.round( esMenor);
         
         double potencia = Math.pow(redondeoMayor, redondeoMenor);
         
         
         
         
        return potencia;
    }
    
  
    
    public static double calcularRaiz(Matematica m1){
        
        double esMayor = 0;
        double esMenor = 0;
        double raizCuadrada;
        
        if (m1.getNum1() == m1.getNum2()) {
            System.out.println("Los numeros son iguales.");
        }else{
            esMayor = Math.max(m1.getNum1(), m1.getNum2());
            esMenor = Math.min(m1.getNum1(), m1.getNum2());

        }
        double absolutoMenor = Math.abs(esMenor);
        
      return   raizCuadrada = Math.sqrt(absolutoMenor);
    }
   
    
    
}
