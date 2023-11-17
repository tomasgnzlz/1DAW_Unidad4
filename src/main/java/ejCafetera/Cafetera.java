/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejCafetera;

/**
 *
 * @author tomas
 */
public class Cafetera {

    private double capacidadMaxima; // ml
    private double cantidadActual;
    public static final double MAX =1000;
    public static final double MIN =1000;

    // Constructores
    public Cafetera() {
        this.capacidadMaxima = MAX;
        this.cantidadActual = MIN;
    }

    public Cafetera(double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = capacidadMaxima;
    }

    public Cafetera(double cantidadActual, double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        if (cantidadActual > this.capacidadMaxima) {
            this.cantidadActual = capacidadMaxima;
        }
    }

    // Métodos
    public void llenarCafetera() {
        this.cantidadActual = this.capacidadMaxima;
    }

    public void servirCafe(int cantidadAServir) {

        if (cantidadAServir > cantidadActual) {
            cantidadAServir = (int) this.cantidadActual;
            this.cantidadActual = 0;
        } else {
            this.cantidadActual -= cantidadAServir;

        }
    }

    public void vaciarCafetera() {
        this.cantidadActual = 0;
    }

    public void agregarCafe(int cantidadAPoner) {
        if (cantidadAPoner + this.cantidadActual > capacidadMaxima) {
            this.cantidadActual = capacidadMaxima;
        } else {
            this.cantidadActual += cantidadAPoner;
        }
    }

    // toString
    @Override
    public String toString() {
        return "Cafetera{" + "capacidadMaxima=" + capacidadMaxima + ", cantidadActual=" + cantidadActual + '}';
    }

}
