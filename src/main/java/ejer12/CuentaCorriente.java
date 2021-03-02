/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer12;

/**
 *
 * @author samuel
 */
public class CuentaCorriente extends Cuenta {

    private double intereses;
    private double saldoMin;

    public CuentaCorriente(double intereses, double saldoMin, Persona cliente) {
        super(cliente);
        this.intereses = intereses;
        this.saldoMin = saldoMin;
    }

    public double getIntereses() {
        return intereses;
    }

    public void setIntereses(double intereses) {
        this.intereses = intereses;
    }

    public double getSaldoMin() {
        return saldoMin;
    }

    public void setSaldoMin(double saldoMin) {
        this.saldoMin = saldoMin;
    }

    @Override
    public String toString() {
        return "CuentaCorriente{" + "intereses=" + intereses + ", saldoMin=" + saldoMin + '}';
    }

    @Override
    void retirar(double cifra) {
        double resultado;
        resultado = this.getSaldo() - cifra;
        this.setSaldo(resultado);
    }

    @Override
    void actualizarSaldo() {
        double resultado;
        if (this.getSaldo() > 1000) {
            resultado = this.getSaldo() + (this.saldoMin * this.intereses);
            this.setSaldo(resultado);
        } else {
            resultado = this.getSaldo() + (this.getSaldo() + this.intereses);
            this.setSaldo(resultado);
        }

    }

}
