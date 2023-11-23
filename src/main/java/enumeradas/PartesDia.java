 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package enumeradas;

/**
 *
 * @author tomas
 */
public enum PartesDia {

    //Instanciacion de objetos.
    MAÑANA("Mañana", 7, 12),
    TARDE("Tarde", 12, 20),
    NOCHE("Noche", 20, 24),
    MADRUGADA("Madrugada", 24, 7);

    // Definicion de atributos.
    private final String nombre;
    private final int horaInicio;
    private final int horaFin;

    // Métodos
    private PartesDia(String nombre, int horaInicio, int horaFin) {
        this.nombre = nombre;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }

    public static PartesDia getMAÑANA() {
        return MAÑANA;
    }

    public static PartesDia getTARDE() {
        return TARDE;
    }

    public static PartesDia getNOCHE() {
        return NOCHE;
    }

    public static PartesDia getMADRUGADA() {
        return MADRUGADA;
    }

    public String getNombre() {
        return nombre;
    }

    public int getHoraInicio() {
        return horaInicio;
    }

    public int getHoraFin() {
        return horaFin;
    }

    @Override
    public String toString() {
        return "PartesDia{" + "nombre=" + nombre + ", horaInicio=" + horaInicio + ", horaFin=" + horaFin + '}';
    }
    
    

}
