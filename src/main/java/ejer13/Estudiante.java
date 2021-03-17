/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer13;

/**
 *
 * @author samuel
 */
public class Estudiante extends Persona {

    private String ID;

    public Estudiante(String ID, String nombre, String apellidos, String NIF, Direccion direccion) {
        super(nombre, apellidos, NIF, direccion);
        this.ID = ID;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "ID=" + ID + '}';
    }

    @Override
    public void identificate() {
        System.out.println("Hola, soy "+this.getNombre());
    }
    
    
}
