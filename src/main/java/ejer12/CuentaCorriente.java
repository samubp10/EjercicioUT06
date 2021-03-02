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

    public CuentaCorriente(double saldoMin, Persona cliente) {
        super(cliente);
        this.intereses = 1.5;
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
        return super.toString()+"CuentaCorriente{" + "intereses=" + intereses + ", saldoMin=" + saldoMin + '}';
    }

    @Override
    void retirar(double cifra) {
        double resultado;
        if(cifra<this.saldoMin){
        resultado = this.getSaldo() - cifra;
        this.setSaldo(resultado);
        }
        else{
            System.out.println("No se ha podido retirar dinero");
        }
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
