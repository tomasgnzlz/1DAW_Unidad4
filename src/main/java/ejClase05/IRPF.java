/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package ejClase05;

/**
 *
 * @author tomas
 */
public enum IRPF {
    OCHO(0.8), QUINCE(0.15), VENTIUNO(0.21);
    
    double tipoIRPF;

    private IRPF(double tipoIRPF) {
        this.tipoIRPF = tipoIRPF;
    }

    public double getTipoIRPF() {
        return tipoIRPF;
    } 
}
