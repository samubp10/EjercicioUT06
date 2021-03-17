/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Samuel
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Crear una lista con 20 robots, creados aleatoriamente.
        ArrayList<Robots> listaRobots = new ArrayList<>();
        for (int i = 0; i <= 20; i++) {

            listaRobots.add(new Robots(i));

        }
        //Imprimir la lista de robot ordenada, de menor a mayor porcentaje de vida. 
        Collections.sort(listaRobots, (r1, r2) -> r1.getBateria().compareTo(r2.getBateria()));
        for (Robots r : listaRobots) {
            System.out.println(r);
        }
        Comparator<Robots> criterioBateria = (v1, v2) -> v1.getBateria().compareTo(v2.getBateria());
        Comparator<Robots> criterioNumeroID = (v1, v2) -> v1.getNumeroSerie().compareTo(v2.getNumeroSerie());
        System.out.println("------------------------------------------------------------------");
        //Imprimir la lista de robot ordenada, mayor a menor porcentaje de vida. 
        Collections.sort(listaRobots, criterioBateria.reversed());
        for (Robots r : listaRobots) {
            System.out.println(r);
        }
        System.out.println("------------------------------------------------------------------");
        ArrayList<Robots> listaRobotsMenos50Vida = new ArrayList<>();
        for (Robots r : listaRobots) {
            if (r.getBateria() < 50) {
                listaRobotsMenos50Vida.add(r);
                System.out.println(r);
            }

        }

        Collections.sort(listaRobots, criterioNumeroID);
        for (Robots r : listaRobots) {
            System.out.println(r);
        }
        System.out.println("¿Que robot quiere buscar?");
        Scanner escaner = new Scanner(System.in);
        Integer ID = escaner.nextInt();
        Collections.binarySearch(listaRobots, ID, criterioBateria);
        

    }

}
