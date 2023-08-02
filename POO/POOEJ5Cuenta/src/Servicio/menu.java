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
public class menu {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
     ServicioCuenta cs = new ServicioCuenta();
//     Cuenta c1 = cs.crearCuenta();

    public void menu(Cuenta c1, double retiro, double saldoActual) {

        System.out.println("Ingrese la letra de la operación que desea realizar, por favor:");
        System.out.println("A. Ingresar dinero ");
        System.out.println("B. Retirar dinero");
        System.out.println("C. Extracción rápida");
        System.out.println("D. Consultar saldo");
        System.out.println("E. Consultar datos de la cuenta");
        System.out.println("F. Finalizar");
        String letra = leer.next();

//       do{
        switch (letra) {
            case "A":
                
                cs.ingresar(c1, c1.getIngreso(), c1.getSaldoActual());
                break;

            case "B":
                cs.retirar(c1, c1.getRetiro(), c1.getSaldoActual());
                break;

            case "C":
                cs.extraccionRapida(c1.getSaldoActual());
                break;

            case "D":
                cs.consultarSaldo(c1.getSaldoActual());
                break;

            case "E":
                cs.consultarDatos(c1);
                break;
            case "F":

                break;
        }
    }

}
