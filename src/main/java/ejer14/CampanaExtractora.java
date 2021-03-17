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
public class CampanaExtractora extends Electrodomestico implements Comparable<Microondas>{
    
    private int decibelios;

    public CampanaExtractora(int decibelios, double consumo, String modelo) {
        super(consumo, modelo);
        this.decibelios = decibelios;
    }

    public int getDecibelios() {
        return decibelios;
    }

    public void setDecibelios(int decibelios) {
        this.decibelios = decibelios;
    }

    @Override
    public String toString() {
        return "CampanaExtractora{" + "decibelios=" + decibelios + '}';
    }

    @Override
    public int compareTo(Microondas o) {
        return this.decibelios-o.getVatios();
    }
    
        
    
}
