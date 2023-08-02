/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej7persona;

import Entidad.Persona;
import Servicio.PersonaServicio;

/**
 *
 * @author Melina Narambuena
 */
public class POOEJ7Persona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int c = 0;
        int c2 = 0;
        int c3 = 0;
        int mayor = 0;
        int menor = 0;
        boolean[] mayorarray = new boolean[4];
        double[] IMCarray = new double[4];

        PersonaServicio ps = new PersonaServicio();

        Persona p1 = ps.crearPersona();
        double imc1 = PersonaServicio.calcularIMC(p1);
        boolean mayorMenor1 = PersonaServicio.esMayordeEdad(p1);

        Persona p2 = ps.crearPersona();
        double imc2 = PersonaServicio.calcularIMC(p2);
        boolean mayorMenor2 = PersonaServicio.esMayordeEdad(p2);

        Persona p3 = ps.crearPersona();
        double imc3 = PersonaServicio.calcularIMC(p3);
        boolean mayorMenor3 = PersonaServicio.esMayordeEdad(p3);

        Persona p4 = ps.crearPersona();
        double imc4 = PersonaServicio.calcularIMC(p4);
        boolean mayorMenor4 = PersonaServicio.esMayordeEdad(p4);

        IMCarray[0] = imc1;
        IMCarray[1] = imc2;
        IMCarray[2] = imc3;
        IMCarray[3] = imc4;

        mayorarray[0] = mayorMenor1;
        mayorarray[1] = mayorMenor2;
        mayorarray[2] = mayorMenor3;
        mayorarray[3] = mayorMenor4;

        for (int i = 0; i < 4; i++) {
            System.out.println("El arreglo mayor menor" + mayorarray[i]);

        }

        for (int i = 0; i < 4; i++) {

            if (IMCarray[i] < 20) {

                c++;

            } else if (IMCarray[i] >= 20 && IMCarray[i] <= 25) {

                c2++;
            } else if (IMCarray[i] > 25) {

                c3++;

            }

        }

        for (int i = 0; i < 4; i++) {

            if (mayorarray[i] == true) {

                mayor++;

            } else if (mayorarray[i] == false) {
                menor++;
            }

        }

        System.out.println("La cantidad de personas que están por debajo de su peso ideal son: " + (c++ * 100 / 4) + "% .La cantidad de personas que están en su peso ideal es: " + (c2++ * 100 / 4) + "%. La cantidad de personas que tienen sobrepeso es : " + (c3++ * 100 / 4) + "%");
        System.out.println("El porcentaje de personas mayores a 18 años es: " + mayor++ * 100 / 4 + "%, el porcentaje de personas menores de 10 años es: " + menor++ * 100 / 4 + "%.");

    }

}
