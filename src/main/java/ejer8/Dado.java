/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer8;

import java.util.Random;

/**
 *
 * @author Samuel
 */
public class Dado {

    Random aleatorio = new Random();

    public int lanzar() {
        int resultado = aleatorio.nextInt();
        resultado = aleatorio.nextInt(5);
        switch (resultado) {
            case 0:
                return 1;

            case 1:
                return 2;

            case 2:
                return 3;

            case 3:
                return 4;

            case 4:
                return 5;

            case 5:
                return 6;

        }
        return 0;
    }
}
