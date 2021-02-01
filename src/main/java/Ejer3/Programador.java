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
//
// Programador, especialización de Empleado. 
//
//Atributos: categoría (que puede ser “Analista”, “Senior” y “Junior”). Implementar usando Enum.
//Métodos: 
//- Getter y Setter.
//- Constructores (por defecto y parametrizado)
//- Método toString(), que sobrescribirá el método toString() de la clase padre, 
//añadiendo además de los atributos de empleado los propios de programador.
public class Programador extends Empleado {

    private Categoria categoria;

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Programador() {

    }

    public Programador(Categoria categoria, double salario, String nombre, String nif, int edad) {
        super(salario, nombre, nif, edad);
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return super.toString() + "\nProgramador{" + "Categoria=" + categoria + "}\n------------------------------------";
    }

}
