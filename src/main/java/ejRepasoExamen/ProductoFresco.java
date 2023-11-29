/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejRepasoExamen;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author tomas
 */
public class ProductoFresco {

    private String id;
    private double precioSinIva;
    private String descripcion;
    private final LocalDate fechaCaducidad;
    private Iva iva;

    public static final int MAXIMO_DIAS_CADUCIDAD = 45;

    //Constructor.
    public ProductoFresco(double precioSinIva, String descripcion, LocalDate fechaCaducidad, Iva iva) {
        this.id = RandomStringUtils.randomAlphabetic(5);
        this.precioSinIva = precioSinIva;
        this.descripcion = descripcion;
//        if (fechaCaducidad.plusDays(45).isBefore(LocalDate.now())) {
//            this.fechaCaducidad = null;
//        } else {
//            this.fechaCaducidad = fechaCaducidad;
//        }

        long numeroDias = ChronoUnit.DAYS.between(LocalDate.now(), fechaCaducidad);

        this.fechaCaducidad = numeroDias <= MAXIMO_DIAS_CADUCIDAD ? fechaCaducidad : null;
        this.iva = iva;

    }

    //Getters y Setters.
    public Iva getIva() {
        return iva;
    }

    public void setIva(Iva iva) {
        this.iva = iva;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPrecioSinIva() {
        return precioSinIva;
    }

    public void setPrecioSinIva(double precioSinIva) {
        this.precioSinIva = precioSinIva;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    //toString
    @Override
    public String toString() {
        return "ProductoFresco{" + "id=" + id + ", precioSinIva=" + precioSinIva + ", descripcion=" + descripcion + ", fechaCaducidad=" + fechaCaducidad + ", iva=" + iva + '}';
    }

}
