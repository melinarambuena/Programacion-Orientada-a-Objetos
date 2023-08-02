/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author Melina Narambuena
 */
public class AhorcadoServicio {
   /* Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima.
Con la palabra del usuario, pone la longitud de la palabra, como la longitud del
vector. Después ingresa la palabra en el vector, letra por letra, quedando cada letra
de la palabra en un índice del vector. Y también, guarda en cantidad de jugadas
máximas, el valor que ingresó el usuario y encontradas en 0. */
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
   public Ahorcado crearJuego(){
        Ahorcado a1 = new Ahorcado();
        System.out.println("Ingrese la palabra, por favor:");
        String palabra = leer.next();
        System.out.println("Ingrese la cantidad de jugadas máximas, por favor:");
        a1.setJugadasMaximas(leer.nextInt());
        int longitudPalabra = palabra.length();
        String [] palabraaBuscar = new  String [longitudPalabra];        
//      m1.setMeses(meses);
        a1.setPalabraaBuscar(palabraaBuscar);
        a1.setLetrasEncontradas(0);
        for (int i = 0; i < a1.getPalabraaBuscar().length; i++) {
            System.out.print("Ingrese letra por letra #" + (i + 1) + ": ");
            palabraaBuscar[i] = leer.next();
        }
        
        return a1;
    }
    
   

   public void longitud(Ahorcado a1){
       
       System.out.println("La longitud de la palabra a buscar, es:" + a1.getPalabraaBuscar().length);
   }
    
 
   
   public  String buscar(Ahorcado a1){
       boolean bandera = false;
       System.out.println("Ingrese una letra a buscar, por favor:");
       String letra = leer.next();
       
       for (int i = 0; i < a1.getPalabraaBuscar().length ; i++) {
           
           if (letra.equals(a1.getPalabraaBuscar()[i])) {
               bandera= true;
               int encontradas = a1.getLetrasEncontradas() + 1;
               a1.setLetrasEncontradas(encontradas);
           }else{
               System.out.println("get jugadas maximas:" + a1.getJugadasMaximas());
               
               
           }
       }
       
       
       
       if (bandera) {
           System.out.println("La letra se encontraba en la palabra a encontrar :)");
           
       }else{
           System.out.println("La letra no se encontraba en la palabra a encontrar :(");
           int vidas= a1.getJugadasMaximas()-1;
               a1.setJugadasMaximas(vidas);
           
       }
       return letra;
   }
   
//   Método encontradas(letra):  que reciba una letra ingresada por el usuario y muestre
//cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
//devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
//busque una letra que no esté, se le restará uno a sus oportunidades. 
//   Número de letras (encontradas, faltantes): (3,4) 
//Número de oportunidades restantes: 4 
   
   
   public void encontradas(Ahorcado a1, String letra){
       boolean bandera = false;
       int faltantes = a1.getPalabraaBuscar().length - a1.getLetrasEncontradas();
       
       System.out.println("Numero de letras (encontradas, faltantes) ("+ a1.getLetrasEncontradas()+"," + faltantes+")");
      
       
       
       for (int i = 0; i < a1.getPalabraaBuscar().length ; i++) {
           
           if (letra.equals(a1.getPalabraaBuscar()[i])) {
               bandera= true;
//               int encontradas = a1.getLetrasEncontradas() + 1;
//               a1.setLetrasEncontradas(encontradas);
           }
       }
       
       System.out.println(bandera);
//       System.out.println("Quedan: " + a1.getJugadasMaximas()+" vidas.");
   }
   
   
   public void intentos(Ahorcado a1){
       System.out.println("Al jugador le quedan: "+ a1.getJugadasMaximas()+ " oportunidades.");
       
   }
   
//   Método juego(): el método juego se encargará de llamar todos los métodos
//previamente mencionados e informará cuando el usuario descubra toda la palabra o
//se quede sin intentos. Este método se llamará en el main. 
   
   
   public void juego(Ahorcado a1){
//       crearJuego();

do{
    

       longitud(a1);
       String letra = buscar( a1);
       encontradas( a1, letra);
       intentos(a1);
   }while(a1.getJugadasMaximas()!= 0);
   }
   
}
