/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilidadesFecha;

import java.time.DateTimeException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

/**
 *
 * @author tomas
 */
public class UtilidadesFecha {

    public static boolean bisiesto(LocalDate fecha) {
        return fecha.isLeapYear();
    }

    public static boolean fechaValida(int day, int month, int year) {
        try {
            LocalDate fecha = LocalDate.of(year, month, day);
            return true;
        } catch (DateTimeException dte) {
            return false;
        }
    }

    public static LocalDate copia(LocalDate fecha) {
        LocalDate copia = LocalDate.of(fecha.getYear(), fecha.getMonthValue(), fecha.getDayOfMonth());
        return copia;
    }

    public static int diaMes(LocalDate fecha) {
        return fecha.lengthOfMonth();
    }

    public static int diaSemana(LocalDate fecha) {
        DayOfWeek diaSemana = fecha.getDayOfWeek();
        int numero = diaSemana.getValue();

        if (diaSemana == DayOfWeek.SUNDAY) {
            numero = 0;
        }
        return numero;
    }

    public static String mostrarFechaLarga(LocalDate fecha) {

//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE d 'de' MMMM 'de' yyyy");
//        String fechaTexto = fecha.format(formatter);
//        System.out.println(fechaTexto);
        int diaMes = fecha.getMonthValue();
        String mes = fecha.getMonth().getDisplayName(TextStyle.FULL, Locale.getDefault());
        int año = fecha.getYear();

        String resultado = (diaMes + " de " + mes + " de " + año);
        return resultado;
    }

    public static LocalDate sumarDias(Long numeroDias, LocalDate fecha) {
        LocalDate f1 = fecha.plusDays(numeroDias);
        return f1;
    }

    public static int diasTranscurridos(LocalDate fechaInicial, LocalDate fechaFinal) {
        int numeroDias = (int) ChronoUnit.DAYS.between(fechaInicial, fechaFinal);
        return numeroDias;
    }

    public static LocalDate siguienteDia(LocalDate fecha) {
        return fecha.plusDays(1);
    }

    public static LocalDate anteriorDia(LocalDate fecha) {
        return fecha.plusDays(-1);
    }

    public static int minutosEntre(LocalDateTime fecha1, LocalDateTime fecha2) {
        int minutos = (int) ChronoUnit.MINUTES.between(fecha1, fecha2);
        return minutos;
    }

    public static LocalDateTime sumarSegundos(long numeroSegundos, LocalDateTime fecha) {
        LocalDateTime fechaNueva = fecha.plusSeconds(numeroSegundos);
        return fechaNueva;
    }

}
