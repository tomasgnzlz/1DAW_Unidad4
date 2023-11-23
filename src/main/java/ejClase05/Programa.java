/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejClase05;

/**
 *
 * @author tomas
 */
public class Programa {

    public static void main(String[] args) {

        // Creamos el objeto Empleado
        Empleado e1 = null;
        try {
            e1 = new Empleado("Pepe", "24314315G", 1000,
                    35.5, IRPF.QUINCE, true, 2);
        } catch (IllegalArgumentException iae) {
            System.out.println("El IRPF no es válido, el objeto no se crea");
        }

        System.out.println(e1);
        
        System.out.println("Cálculo horas extra: " + e1.calculo(10));
        System.out.println("Cálculo IRPF " + e1.calculo());
        System.out.println("Bruto de e1 " + e1.sueldoBruto(10));
        System.out.println("Neto de e1 " + e1.sueldoNeto(10));
        Empleado e2 = new Empleado("Pepa", "281478935S", 2500,
                14, IRPF.OCHO, true, 1);

        System.out.println("Cálculo horas extra: "
                + MetodosEstaticos.calculo(e2, 5));
        System.out.println("Cálculo IRPF "
                + MetodosEstaticos.calculo(e2));
        System.out.println("Bruto de e1 "
                + MetodosEstaticos.sueldoBruto(e2, 5));
        System.out.println("Neto de e1 "
                + MetodosEstaticos.sueldoNeto(e2, 5));

    }
}
