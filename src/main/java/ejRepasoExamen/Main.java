/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejRepasoExamen;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author tomas
 */
public class Main {

    public static void main(String[] args) {

        ProductoFresco p1 = new ProductoFresco(10, "Producto1", LocalDate.of(2023, 11, 27), Iva.SEIS);
        ProductoFresco p2 = new ProductoFresco(15, "Producto2", LocalDate.now().plusMonths(3), Iva.VEINTIUNO);
        System.out.println(p1.toString());
        System.out.println(p2.toString());

        // Precios con IVA-
        System.out.println("El precio con IVA del producto 1: " + FuncionesProducto.precioConIva(p1));
        System.out.println("El precio con IVA del producto 2: " + FuncionesProducto.precioConIva(p2));

        // Fechas de caducidad
        System.out.println("Para la caducidad del producto 1: " + FuncionesProducto.caducidad(p1) + " días");
        System.out.println("Para la caducidad del producto 2: " + FuncionesProducto.caducidad(p2) + " días");

        // Array de productos. 
        ProductoFresco[] array = new ProductoFresco[2];
        array[0] = p1;
        array[1] = p2;

        // Array con precios de productos.
        double[] arrayConPreciosIVA = FuncionesProducto.arrayPrecios(array);

        for (int i = 0; i < arrayConPreciosIVA.length; i++) {
            System.out.println(arrayConPreciosIVA[i]);
        }

    }

}
