/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer12;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author samuel
 */
public abstract class Cuenta {

    private String numeroCuenta;
    private double saldo;
    private Persona cliente;

    public Cuenta(Persona cliente) {
        Random aleatorio = new Random();
        ArrayList<String> numeroCuenta = new ArrayList<String>();
        String numeroString = "";
        for (int i = 0; i < 20; i++) {
            int enteroAleatorio = aleatorio.nextInt(9);
            numeroString = String.valueOf(enteroAleatorio);
            numeroCuenta.add(numeroString);
        }
        this.saldo = 0;
        this.cliente = cliente;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Persona getCliente() {
        return cliente;
    }

    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }

    abstract void retirar(double cifra);
    
    abstract void actualizarSaldo();
}
