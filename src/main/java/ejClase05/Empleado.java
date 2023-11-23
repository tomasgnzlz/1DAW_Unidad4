/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejClase05;

import java.util.Random;

/**
 *
 * @author tomas
 */
public class Empleado {

    // Atributos encapsulados
    private String nombre;
    private String nif;
    private double sueldoBase;
    private double cantidadAbonarHoras;
    private IRPF irpf;
    private boolean casado;
    private int numHijos;

    //CONSTRUCTOR PARA CREAR RANDOM
    public Empleado(String[] arraynombres, String[] arrayNif) {
        Random r1 = new Random();
        int numRandom = r1.nextInt(11);

        this.nombre = arraynombres[numRandom];
        this.nif = arrayNif[numRandom];
        this.sueldoBase = r1.nextDouble(1000, 1501);
        this.cantidadAbonarHoras = r1.nextDouble(30, 51);
        numRandom = r1.nextInt(1, 4);
        if (numRandom == 1) {
            this.irpf = IRPF.OCHO;
        } else if (numRandom == 2) {
            this.irpf = IRPF.QUINCE;
        } else {
            this.irpf = IRPF.VENTIUNO;
        }
        this.casado = r1.nextBoolean();
        this.numHijos = r1.nextInt(5);
    }

    // CONSTRUCTOR COPIA
    public Empleado(Empleado origen) {
        this.nombre = origen.nombre;
        this.nif = origen.nif;
        this.sueldoBase = origen.sueldoBase;
        this.cantidadAbonarHoras = origen.cantidadAbonarHoras;
        this.irpf = origen.irpf;
        this.casado = origen.casado;
        this.numHijos = origen.numHijos;
    }

    // Constructor
    public Empleado(String nombre, String nif, double sueldoBase, double cantidadAbonarHoras, IRPF irpf, boolean casado, int numHijos) {
        this.nombre = nombre;
        this.nif = nif;
        this.sueldoBase = sueldoBase;
        this.cantidadAbonarHoras = cantidadAbonarHoras;
        this.irpf = irpf;
        this.casado = casado;
        this.numHijos = numHijos;
    }

    // Métodos
    public double calculo(int horas) {
        return this.cantidadAbonarHoras * horas;
    }

    // Creación del 2º método
    public double calculo() {
        double bonificacion = 0;
        if (this.casado) {
            bonificacion += 2;
        }
        double bonificacionPorHijos = this.numHijos * 0.5;
        if (bonificacionPorHijos > 2) {
            bonificacionPorHijos = 2;
        }
        double irpfFinal = this.irpf.getTipoIRPF() - bonificacion - bonificacionPorHijos;
        return this.sueldoBase * (irpfFinal / 100);
    }

    public double sueldoBruto(int numeroHoras) {
        return this.sueldoBase + this.calculo(numeroHoras);
    }

    public double sueldoNeto(int numeroHoras) {
        return this.calculo(numeroHoras) - this.calculo();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public double getCantidadAbonarHoras() {
        return cantidadAbonarHoras;
    }

    public void setCantidadAbonarHoras(double cantidadAbonarHoras) {
        this.cantidadAbonarHoras = cantidadAbonarHoras;
    }

    public IRPF getIrpf() {
        return irpf;
    }

    public boolean getCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public int getNumHijos() {
        return numHijos;
    }

    public void setNumHijos(int numHijos) {
        this.numHijos = numHijos;
    }

    // toString
    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", nif=" + nif + ", sueldoBase=" + sueldoBase + ", cantidadAbonarHoras=" + cantidadAbonarHoras + ", irpf=" + irpf + ", casado=" + casado + ", numHijos=" + numHijos + '}';
    }

}
