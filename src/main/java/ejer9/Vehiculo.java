/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer9;

/**
 *
 * @author Samuel
 */
public abstract class Vehiculo {

    private int bastidor;

    public final void setBastidor(int bastidor) {
        this.bastidor = bastidor;
    }

    public abstract int getVelocidad();
}
// //¿Puede tener descendencia esta clase?
//Sí, dado que no es una clase final y es abstracta
// //¿Se pueden sobrescribir todos sus métodos? 
//No, el único que se puede sobreescribir es el métodos de getVelocidad, dado que el setBastidor es final