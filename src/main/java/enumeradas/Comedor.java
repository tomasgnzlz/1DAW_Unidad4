/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumeradas;

/**
 *
 * @author tomas
 */
public class Comedor {
    private String nombre;
    private double precioMenu;
    private PartesDia horario;

    public Comedor(String nombre, double precioMenu, PartesDia horario) {
        this.nombre = nombre;
        this.precioMenu = precioMenu;
        this.horario = horario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioMenu() {
        return precioMenu;
    }

    public void setPrecioMenu(double precioMenu) {
        this.precioMenu = precioMenu;
    }

    public PartesDia getHorario() {
        return horario;
    }

    public void setHorario(PartesDia horario) {
        this.horario = horario;
    }

    @Override
    public String toString() {
        return "Comedor{" + "nombre=" + nombre + ", precioMenu=" + precioMenu + ", horario=" + horario + '}';
    }
    
    
    
    
}
