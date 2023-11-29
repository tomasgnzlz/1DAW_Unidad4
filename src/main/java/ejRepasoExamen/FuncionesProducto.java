/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejRepasoExamen;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author tomas
 */
public class FuncionesProducto {

    public static double precioConIva(ProductoFresco producto) {
        return Math.ceil((producto.getPrecioSinIva() * (1 + producto.getIva().getPorcentaje())));
    }

    public static long caducidad(ProductoFresco producto) {
        if (producto.getFechaCaducidad() != null) {
            return ChronoUnit.DAYS.between(LocalDate.now(), producto.getFechaCaducidad());
        }
        return Long.MAX_VALUE;

    }

    public static double[] arrayPrecios(ProductoFresco[] array) {
        double[] arrayPrecios = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayPrecios[i] = precioConIva(array[i]);
        }
        return arrayPrecios;
    }

}
