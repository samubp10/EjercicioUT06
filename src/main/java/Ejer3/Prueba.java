/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejer3;

/**
 *
 * @author Samuel
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    //Realiza una clase Prueba, para probar las clases anteriores. 
    //Usa los constructores para crear un par de objetos de cada clase y 
    //comprueba como un objeto de una clase hija puede llamar a métodos de la clase padre,
    // pero no al contrario. Ejecuta los métodos toString() de cada uno de los objetos y comprueba el resultado.
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado(1200, "Juan", "019239018 N", 40);
        Empleado empleado2 = new Empleado();
        Persona persona1 = new Persona();
        Persona persona2 = new Persona("Pepe", "234124 N", 20);
        Programador programador1 = new Programador();
        Programador programador2 = new Programador(Categoria.Analista, 10000, "Alejandro", "02420934 N", 19);
        Programador programador3 = new Programador(Categoria.Junior, 11300, "Alberto", "02420934 F", 56);
        Programador programador4 = new Programador(Categoria.Senior, 13500, "Daniela", "02420934 R", 60);

        System.out.println("Persona 1\n" + persona1.toString() + "\n------------------------------------");
        System.out.println("Persona 2\n" + persona2.toString() + "\n------------------------------------");
        System.out.println("Empleado1\n" + empleado1.toString() + "\n------------------------------------");
        System.out.println("Empleado2\n" + empleado2.toString() + "\n------------------------------------");
        System.out.println("Programador 1\n" + programador1.toString());
        System.out.println("Programador 2\n" + programador2.toString());
        System.out.println("Programador 3\n" + programador3.toString());
        System.out.println("Programador 4\n" + programador4.toString());

        programador2.setEdad(50);
        empleado2.aumentarSalario(30.5);
        // persona1.aumentarSalario(30.5);
        programador1.aumentarSalario(46.3);
    }

}
