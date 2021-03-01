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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Trabajador> Equipo = new ArrayList<>();
        // Objeto de la superclase
        Trabajador Pepe = new Trabajador("Pepe", "Lopez", "52274988J");
        Trabajador Luis = new Trabajador("Luis", "García", "38311705F");
        Trabajador Peter = new Trabajador("Peter", "Blanco", "38311705F");
        Trabajador Stuart = new Trabajador("Stuart", "Aguirre", "81644435R");

        Equipo.add(Pepe);
        Equipo.add(Luis);
        Equipo.add(Peter);
        Equipo.add(Stuart);

        // Objeto de la subclase
        Camarero Juan = new Camarero("Jefe Sala", "Juan", "Gil", "46081109B");
        Camarero Alejandro = new Camarero("Jefe Sala", "Alejandro", "Aguilar", "21284708W");

        Metre Leonardo = new Metre("100€", "Leonardo", "Nadal", "40586019N");
        Metre Olivia = new Metre("500€", "Olivia", "Canovas", "87683826Y");

        Equipo.add(Juan);
        Equipo.add(Alejandro);
        Equipo.add(Leonardo);
        Equipo.add(Olivia);
        // Objeto superclase accediendo a sus métodos
        // Puede acceder a getters, setters, constructores y cotizar
        // No puede ver métodos del objeto subclase
        for (Trabajador t : Equipo) {
            t.cotizar();
        }

    }

}
