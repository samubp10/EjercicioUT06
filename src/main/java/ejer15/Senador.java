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
public class Senador extends Legislador{
    
    private double complemento;

    public Senador(double complemento, String provincia, String partidoPolitico) {
        super(provincia, partidoPolitico);
        this.complemento = complemento;
    }

    public double getComplemento() {
        return complemento;
    }

    public void setComplemento(double complemento) {
        this.complemento = complemento;
    }

    @Override
    public String toString() {
        return super.toString()+"Senador{" + "complemento=" + complemento + "\n======================================";
    }
    
    
}
