/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Melina Narambuena
 */
public class Cadena {
    private String cadena;
    private int caracteres;





    public Cadena() {
    }

    public Cadena(String cadena, int caracteres) {
        
        this.cadena = cadena;
        this.caracteres = caracteres;
    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        
        this.cadena = cadena;
        
    }
    
    public void setCaracteres(int caracteres, String cadena) {
        this.caracteres = caracteres;
    }

    public int getCaracteres(String cadena) {
        return  cadena.length();

    }

    

    
    
    
    
    
}
