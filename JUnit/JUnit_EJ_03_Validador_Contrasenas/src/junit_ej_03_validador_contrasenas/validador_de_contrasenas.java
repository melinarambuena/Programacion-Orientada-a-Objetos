/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junit_ej_03_validador_contrasenas;

import sun.awt.image.ByteBandedRaster;

/**
 *
 * @author Melina Narambuena
 */
public class validador_de_contrasenas {
//    3. Validador de Contraseñas:
//Crea una clase PasswordValidator que verifique la fortaleza de una contraseña según ciertas
//reglas (por ejemplo, longitud mínima, presencia de caracteres especiales, letras mayúsculas, etc.).
//Escribe pruebas unitarias para asegurarte de que el validador de contraseñas funcione
//correctamente para diferentes escenarios, incluyendo contraseñas válidas e inválidas.
    
public boolean PasswordValidator(char j,String contrasena, String letra, boolean bandera, boolean especialC, boolean especialMin){
    int min = contrasena.length();
    
    for (int i = 0; i < contrasena.length(); i++) {
        letra = contrasena.substring(i);

        if (letra.equals("#")|| letra.equals("$")|| letra.equals("%")|| letra.equals("&")||letra.equals("!")) {
            especialC = true;
        }
        
       
        if (min>7) {
            especialMin = true;

        }
        
    }
    if (especialMin == true && especialC == true) {
        bandera = true;
    }
    
        return bandera;
    }

}     
    
    
    

