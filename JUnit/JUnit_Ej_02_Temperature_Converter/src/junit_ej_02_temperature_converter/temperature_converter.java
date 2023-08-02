/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junit_ej_02_temperature_converter;

/**
 *
 * @author Melina Narambuena
 */
public class temperature_converter {
    
    public double CelsiusKelvin(double kelvin, double celsius){
//        0 °C + 273.15 = 273,15 K
        return kelvin = celsius + 273.15;     
    }
    
    public double KelvinCelsius(double kelvin, double celsius){
//        0 K − 273.15 = -273,1 °C
     return celsius = kelvin - 273.15;
    }
    
    public double FarenheitCelsius(double celsius, double farenheit){
//        Grados centígrados = (grados Fahrenheit − 32) × 5/9
        return celsius = (farenheit -32)* 5/9;
    }
    
    public double CelsiusFarenheit(double farenheit, double celsius){
//        Grados Fahrenheit = (grados centígrados × 9/5) +32
        return farenheit = (celsius * 9/5) + 32;
    }
}
