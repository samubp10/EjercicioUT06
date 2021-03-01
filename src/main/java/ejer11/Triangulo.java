/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer11;

/**
 *
 * @author Samuel
 */
public class Triangulo extends Figura {

    public Triangulo(int base, int altura) {
        super(base, altura);
    }

    @Override
    public int calcularArea() {
        
        return (this.getBase()*getAltura())/2;
    }
    
    
    
}
