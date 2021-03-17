/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer14;

/**
 *
 * @author Samuel
 */
public class Microondas extends Electrodomestico implements MuestraInformacion, Comparable<Microondas>{

    private int vatios;

    public Microondas(int vatios, double consumo, String modelo) {
        super(consumo, modelo);
        this.vatios = vatios;
    }

    public int getVatios() {
        return vatios;
    }

    public void setVatios(int vatios) {
        this.vatios = vatios;
    }

    @Override
    public void muestra() {
        System.out.println("El microondas tiene " + this.vatios + " w de potencia máxima");
    }

    @Override
    public int compareTo(Microondas o) {
        return this.vatios-o.getVatios();
    }
}
