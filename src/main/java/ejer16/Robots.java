/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer16;

import java.util.Random;

/**
 *
 * @author Samuel
 */
public class Robots {
    
    private Integer numeroSerie;
    private Integer bateria;

    public Robots(Integer numeroSerie) {
        Random random = new Random();
        int enteroAleatorio = random.nextInt(101)+1;
        this.numeroSerie = numeroSerie;
        this.bateria = enteroAleatorio;
    }

    public Integer getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(Integer numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public Integer getBateria() {
        return bateria;
    }

    public void setBateria(Integer bateria) {
        this.bateria = bateria;
    }

    @Override
    public String toString() {
        return "Robots{" + "numeroSerie=" + numeroSerie + ", bateria=" + bateria + '}';
    }
    
    
    
}
