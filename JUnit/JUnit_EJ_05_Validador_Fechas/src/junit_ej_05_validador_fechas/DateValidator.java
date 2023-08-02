/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junit_ej_05_validador_fechas;

/**
 *
 * @author Melina Narambuena
 */
public class DateValidator {
    
    public void diaValido(int dia, boolean diaValido){
        if (dia < 31 && dia > 1){
            diaValido = true;
        }
    }
    
    public void mesValido(int mes, boolean mesValido){
        if (mes > 1 && mes < 12) {
            mesValido = true;
        }
    }
    
    public void anioBisiesto(int anio, boolean anioBisiesto ){
        
        if (anio % 4 == 0){
            anioBisiesto = true;
        }
        
        if (anio % 4 == 0 && anio % 100 != 0) {
            anioBisiesto = true;
        }
        
        if (anio % 100 == 0 && anio % 400 == 0) {
            anioBisiesto = true;
            
        }
		
        
    }
    
}
