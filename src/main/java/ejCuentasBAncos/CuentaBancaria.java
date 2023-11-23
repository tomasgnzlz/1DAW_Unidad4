/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejCuentasBAncos;

import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author tomas
 */
public class CuentaBancaria {

    private String numCuenta;
    private String nombre;
    private String NIF;
    private double saldoCuenta;
    private double interesMensual;
    public static final int DIGITOS_CUENTA = 20;
    
    public CuentaBancaria(CuentaBancaria origen){
        this.numCuenta = origen.numCuenta;
        this.nombre = origen.nombre;
        this.NIF =origen.NIF;
        this.saldoCuenta = origen.saldoCuenta;
        this.interesMensual = origen.interesMensual;
    }

    // Constructores
    public CuentaBancaria() {
        this.numCuenta = generarNumCuenta();
    }

    public CuentaBancaria(String nombre, String NIF, double saldoCuenta, double interesMensual) {
        this.numCuenta = generarNumCuenta();
        this.nombre = nombre;
        this.NIF = NIF;
        this.saldoCuenta = saldoCuenta;
        this.interesMensual = interesMensual;
    }

    // Getters y Setters.
    public String getNumCuenta() {
        return numCuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public double getSaldoCuenta() {
        return saldoCuenta;
    }

    public void setSaldoCuenta(double saldoCuenta) {
        this.saldoCuenta = saldoCuenta;
    }

    public double getInteresMensual() {
        return interesMensual;
    }

    public void setInteresMensual(double interesMensual) {
        this.interesMensual = interesMensual;
    }

    // Métodos
    public static String generarNumCuenta() {
        return RandomStringUtils.randomNumeric(DIGITOS_CUENTA);
    }

    public void ingresarSaldo(double cantidad) {
        this.saldoCuenta += cantidad;
    }

    public void retirarSaldo(double cantidad) {
        if (cantidad < this.saldoCuenta) {
            this.saldoCuenta -= cantidad;
        }
    }

    public void abonarInteresSaldo() {
        this.saldoCuenta += this.saldoCuenta*this.interesMensual;
    }

    //toString
    @Override
    public String toString() {
        return "CuentaBancaria{" + "numCuenta=" + numCuenta + ", nombre=" + nombre + ", NIF=" + NIF + ", saldoCuenta=" + saldoCuenta + ", interesMensual=" + interesMensual + '}';
    }

}
