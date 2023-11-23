/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejClase05;

/**
 *
 * @author tomas
 */
public class MetodosEstaticos {

    public static double calculo(Empleado e1, int horas) {
        return e1.getCantidadAbonarHoras() * horas;
    }

    // Creación del 2º método
    public static double calculo(Empleado e1) {
        double bonificacion = 0;
        if (e1.getCasado()) {
            bonificacion += 2;
        }
        double bonificacionPorHijos = e1.getNumHijos() * 0.5;
        if (bonificacionPorHijos > 2) {
            bonificacionPorHijos = 2;
        }
        double irpfFinal = e1.getIrpf().getTipoIRPF() - bonificacion - bonificacionPorHijos;
        return e1.getSueldoBase() * (irpfFinal / 100);
    }

    // Creación del metodo 3º y 4º
    public static double sueldoBruto(Empleado e1, int numeroHoras) {
        return e1.getSueldoBase() + calculo(e1, numeroHoras);
    }

    public static double sueldoNeto(Empleado e1, int numeroHoras) {
        return calculo(e1, numeroHoras) - calculo(e1);
    }

}
