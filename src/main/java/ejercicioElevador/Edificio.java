/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioElevador;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author tomas
 */
public class Edificio {

    public static void main(String[] args) {
        Elevador e1 = new Elevador(5, 500, "HONDA");
        System.out.println(e1.toString());

        // Prueba metodo mover.
        boolean mover;
//        mover = e1.mover(3, 190, Plantas.PLANTA_CERO);
//        System.out.println("Mover el ascensor a la planta cero: " + mover);
//        System.out.println("Estoy: " + e1.getEstadoAscensor());
//        System.out.println("Estoy en la planta : " + e1.getPlantas());
//        System.out.println("\n");
//        
//        mover = e1.mover(3, 190, Plantas.PLANTA_BAJA);
//        System.out.println("Mover el ascensor a la planta baja: " + mover);
//        System.out.println("Estoy: " + e1.getEstadoAscensor());
//        System.out.println("Estoy en la planta : " + e1.getPlantas());
//        System.out.println("\n");
//        
//        mover = e1.mover(3, 190, Plantas.PLANTA_OCHO);
//        System.out.println("Mover el ascensor a la planta ocho: " + mover);
//        System.out.println("Estoy: " + e1.getEstadoAscensor());
//        System.out.println("Estoy en la planta : " + e1.getPlantas());
//        System.out.println("\n");


        mover = e1.mover(3, 190, Plantas.PLANTA_CERO);
        System.out.println("Mover el ascensor a la planta cero: " + mover);
        System.out.println("Estoy: " + e1.getEstadoAscensor());
        System.out.println("Estoy en la planta : " + e1.getPlantas());
        System.out.println("\n");

        mover = e1.mover(8, 1190, Plantas.PLANTA_OCHO);
        System.out.println("Mover el ascensor a la planta ocho: " + mover);
        // Aunque salga estado subiendo, es que guarda el estado de la anterior iteracion
        
        System.out.println(mover);
        System.out.println("Estoy: " + e1.getEstadoAscensor());
        System.out.println("Estoy en la planta : " + e1.getPlantas());
        System.out.println("\n");
        // Prueba del Método.
        // modifico la fecha de la ultima revisión para probar que funciona correctamente el metodo. 
        //e1.setFechaUltimaRevision(LocalDate.of(2023, Month.of(1), 1));
        LocalDate fechaProximaRevision = proximaRevision(e1);
        if (fechaProximaRevision == null) {
            System.out.println("Deben de pasar 6 meses desde la ultima fecha de revision");
        } else {
            System.out.println("La fecha de la proxima revisión es: " + fechaProximaRevision);
        }

    }

    // Método proxima revision.
    public static LocalDate proximaRevision(Elevador e) {
        int numero = (int) ChronoUnit.MONTHS.between(e.getFechaUltimaRevision(), LocalDate.now());
        final int NUMERO_MESES = 6, UN_AÑO = 1;
        LocalDate fechaProximaRevision = LocalDate.MIN;
        if (numero > NUMERO_MESES) {
            fechaProximaRevision = e.getFechaUltimaRevision().plusYears(UN_AÑO);
        } else {
            fechaProximaRevision = null;
        }
        return fechaProximaRevision;
    }

}
