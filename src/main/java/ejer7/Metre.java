/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer7;

import java.util.ArrayList;

/**
 *
 * @author Samuel
 */
public class Metre extends Trabajador {
//Atributos
    private String plusPorRango;
    private ArrayList<Trabajador> Equipo;
//Constructor
    public Metre(String plusPorRango, String nombre, String apellido1, String NIF) {
        super(nombre, apellido1, NIF);
        this.plusPorRango = plusPorRango;
        Equipo = new ArrayList<Trabajador>();
    }
//Getters y Setters
    public String getPlusPorRango() {
        return plusPorRango;
    }

    public void setPlusPorRango(String plusPorRango) {
        this.plusPorRango = plusPorRango;
    }
//Método sobre escrito
    @Override
    // Método sobrescrito
    public void cotizar() {
        System.out.println("Cotizando como Metre");
    }
//Método que mete a trabajadores en un arrayList
    public void añadirPersonal(Trabajador t, Metre m) {

        Equipo.add(t);
        System.out.println("El trabajador " + t + " a sido añadido al equipo de " + m);
    }
//Getter y Setter
    public ArrayList<Trabajador> getEquipo() {
        return Equipo;
    }

    public void setEquipo(ArrayList<Trabajador> Equipo) {
        this.Equipo = Equipo;
    }

}
