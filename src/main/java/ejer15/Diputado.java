/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer15;

/**
 *
 * @author Samuel
 */
public class Diputado extends Legislador{
    private int numeroAsiento;

    public Diputado(int numeroAsiento, String provincia, String partidoPolitico) {
        super(provincia, partidoPolitico);
        this.numeroAsiento = numeroAsiento;
    }

    public int getNumeroAsiento() {
        return numeroAsiento;
    }

    public void setNumeroAsiento(int numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    @Override
    public String toString() {
        return super.toString()+"Diputado" + "numeroAsiento=" + numeroAsiento + "\n======================================";
    }
    
    
}
