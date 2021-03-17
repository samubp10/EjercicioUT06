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
public class Frigorifico extends Electrodomestico implements Comparable<Frigorifico>, MuestraInformacion {

    private double litros;

    public Frigorifico(double litros, double consumo, String modelo) {
        super(consumo, modelo);
        this.litros = litros;
    }

    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }

    @Override
    public String toString() {
        return "Frigorifico{" + "litros=" + litros + '}';
    }

    @Override
    public void muestra() {
        System.out.println("La capacidad del frigorífico es de: " + this.getLitros());
    }

    public int compareTo(Frigorifico f) {
        //2 formas de hacerlo
//        if (litros == f.getLitros()) {
//            return 0;
//        } else if (litros > f.getLitros()) {
//            return 1;
//        } else {
//            return -1;
//        }
        return (int) (this.litros - f.getLitros());
    }
}
