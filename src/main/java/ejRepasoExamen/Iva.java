/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package ejRepasoExamen;

/**
 *
 * @author tomas
 */
public enum Iva {
    SEIS(0.06), DIECISEIS(0.16), VEINTIUNO(0.21);

    private final double porcentaje;

    Iva(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public double getPorcentaje() {
        return porcentaje;
    }
}
