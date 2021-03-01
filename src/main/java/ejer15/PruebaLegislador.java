/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer15;

import java.util.ArrayList;

/**
 *
 * @author Samuel
 */
public class PruebaLegislador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Legislador> Legisladores = new ArrayList<>();

        Senador Rafael = new Senador(1000, "Málaga", "PACMA");
        Senador Federico = new Senador(2000, "Almería", "Teruel Existe");

        Diputado Alba = new Diputado(450, "Córdoba", "Partido Andalucista");
        Diputado Rebeca = new Diputado(168, "Huelva", "Unidad Andaluza");
        
        Legisladores.add(Rafael);
        Legisladores.add(Federico);
        Legisladores.add(Alba);
        Legisladores.add(Rebeca);
        
        for(Legislador l:Legisladores){
            System.out.println(l);
        }
    }

}
