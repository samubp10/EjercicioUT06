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
public class CuentaAhorro extends Cuenta {

    private int interes;
    private int comisionAnual;

    public CuentaAhorro(int interes, int comisionAnual, Persona cliente) {
        super(cliente);
        this.interes = interes;
        this.comisionAnual = comisionAnual;
    }

    public int getInteres() {
        return interes;
    }

    public void setInteres(int interes) {
        this.interes = interes;
    }

    public int getComisionAnual() {
        return comisionAnual;
    }

    public void setComisionAnual(int comisionAnual) {
        this.comisionAnual = comisionAnual;
    }

    @Override
    void retirar(double cifra) {
        double resultado;
        if (this.getSaldo() > 0) {
            resultado = this.getSaldo() - cifra;
            this.setSaldo(resultado);
        } else {
            System.out.println("No se ha podido retirar dinero");
        }
    }

    @Override
    void actualizarSaldo() {
        double resultado;

        resultado = this.getSaldo() + (this.getSaldo() * this.interes) - this.comisionAnual;
        this.setSaldo(resultado);

    }

    @Override
    public String toString() {
        return super.toString()+"CuentaAhorro{" + "interes=" + interes + ", comisionAnual=" + comisionAnual + '}';
    }

}
