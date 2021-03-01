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
public abstract class Legislador {
     private String provincia;
     private String partidoPolitico;

    public Legislador(String provincia, String partidoPolitico) {
        this.provincia = provincia;
        this.partidoPolitico = partidoPolitico;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getPartidoPolitico() {
        return partidoPolitico;
    }

    public void setPartidoPolitico(String partidoPolitico) {
        this.partidoPolitico = partidoPolitico;
    }

    @Override
    public String toString() {
        return "Legislador{" + "provincia=" + provincia + ", partidoPolitico=" + partidoPolitico + '}';
    }
     
     
}
