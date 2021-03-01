/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer8;

/**
 *
 * @author Samuel
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Moneda euro = new Moneda();
        Dado dado1 = new Dado();
        System.out.println("En la moneda ha salido " + euro.lanzar());
        System.out.println("En el dado ha salido " + dado1.lanzar());

    }

}
