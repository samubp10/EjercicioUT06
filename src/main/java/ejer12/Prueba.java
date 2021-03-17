/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer12;

import java.sql.ClientInfoStatus;

/**
 *
 * @author Samuel
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona Fede = new Persona("Federico", "Valle", "0934212N");
        Persona Bill = new Persona("Bill", "Gate", "09123123J");
        CuentaCorriente cuentaCorriente1 = new CuentaCorriente(50, Fede);
        CuentaAhorro CuentaAhorro1 = new CuentaAhorro(5, 50, Bill);
        System.out.println(Fede);
        System.out.println(cuentaCorriente1);
        System.out.println(CuentaAhorro1);
    }

}
