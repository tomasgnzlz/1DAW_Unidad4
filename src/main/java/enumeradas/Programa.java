/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumeradas;

/**
 *
 * @author tomas
 */
public class Programa {

    public static void main(String[] args) {
        PartesDia dia;
        
        //dia = PartesDia.MADRUGADA;
        
        // El método values de los enum devuelve un array con todos los enum
        PartesDia[] todes = PartesDia.values();
        for (int i = 0; i < todes.length; i++) {
            System.out.println(todes[i]);
        }
        
        
        // 
        Comedor nuevo = new Comedor("IES", 4, PartesDia.MAÑANA);
        System.out.println("El Comedor " + nuevo.getNombre() + " comienza su servicio " + nuevo.getHorario().getHoraInicio() );

    }
}

