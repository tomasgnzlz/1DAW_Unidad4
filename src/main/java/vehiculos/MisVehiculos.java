/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

/**
 *
 * @author tomas
 */
public class MisVehiculos {
    public static void main(String[] args) {
        // Creo el objeto
        Vehiculo miCacharro = new Vehiculo("AAAA", "Seat", "LEon", "Negro", 100.0, true);
        
        // Muestro sus valores uno a uno
        System.out.println(miCacharro.matricula);
        System.out.println(miCacharro.marca);
        System.out.println(miCacharro.modelo);
        System.out.println(miCacharro.color);
        System.out.println(miCacharro.tarifa);
        System.out.println(miCacharro.disponible);
        System.out.println("------------------------------------");
        miCacharro.setMatricula("BBBB");
        System.out.println(miCacharro.matricula);
        
        
        //
        
    }
    
    
    
}
