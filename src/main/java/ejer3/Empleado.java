/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer3;

/**
 *
 * @author Samuel
 */
//Empleado, especialización de persona.
//
//Atributos: salario
//Métodos: 
//- Getter y Setter.
//- Constructores (por defecto y parametrizado)
//- Método toString(), que sobrescribirá el método toString() de la clase padre,
//añadiendo además de los atributos de persona los propios de empleado.
//- Un método que permita aumentar el salario en una cantidad que sería pasada como parámetro.
public class Empleado extends Persona {

    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Empleado() {
    }

    public Empleado(double salario, String nombre, String nif, int edad) {
        super(nombre, nif, edad);
        this.salario = salario;
    }

    @Override
    public String toString() {
        return super.toString() + "\nEmpleado{" + "salario=" + salario + '}';
    }

    public double aumentarSalario(double cantidad) {

        return this.salario += cantidad;
    }
}
