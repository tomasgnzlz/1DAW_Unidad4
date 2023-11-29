/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilidadesFecha;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

/**
 *
 * @author tomas
 */
public class Prueba {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String menu = """
        ****************************************************************
                        1. Año Bisiesto
                        2. Fecha Válida
                        3. fechaCopia
                        4. Días de ese mes
                        5. Días de esa semana
                        6. Fecha formato largo
                        7. Fecha + Dias
                        8. Diferencia entre 2 fechas
                        9. Siguiente día
                        10. Anterior día
                        11. Minutos entre dos momentos
                        12. Fecha mas segundos
                        13. Salir
        ****************************************************************
                  """;
        int opcionMenu = 0;
        String opcionSalir ="";
        String fechaDada = "";
        int año, mes, dia;
        do {
            System.out.println(menu);
            System.out.println("Introduce una opcion del menu(1-13)");
            opcionMenu = teclado.nextInt();
            teclado.nextLine();

            switch (opcionMenu) {
                case 1 -> {
                    System.out.println("***OPCION-1***");
                    System.out.println("Introduce una fecha(DIA/MES/AÑO)");
                    fechaDada = teclado.nextLine();
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
                    LocalDate fecha = LocalDate.parse(fechaDada, formatter);
                    System.out.println("El año: " + fechaDada + " es bisiesto ? " + UtilidadesFecha.bisiesto(fecha));
                }

                case 2 -> {
                    System.out.println("***OPCION-2***");
                    System.out.println("Introduce un año");
                    año = teclado.nextInt();
                    System.out.println("Introduce un mes");
                    mes = teclado.nextInt();
                    System.out.println("Introduce un dia");
                    dia = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("¿ Es valida ?" + UtilidadesFecha.fechaValida(dia, mes, año));
                }

                case 3 -> {
                    System.out.println("***OPCION-3***");
                    System.out.println("Introduce una fecha(DIA/MES/AÑO)");
                    fechaDada = teclado.nextLine();
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
                    LocalDate fecha = LocalDate.parse(fechaDada, formatter);
                    LocalDate fechaCopia = UtilidadesFecha.copia(fecha);

                    System.out.println(fechaDada + " es igual a la nueva fecha: " + fechaCopia);

                }

                case 4 -> {
                    System.out.println("***OPCION-4***");
                    System.out.println("Introduce una fecha(DIA/MES/AÑO)");
                    fechaDada = teclado.nextLine();
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
                    LocalDate fecha = LocalDate.parse(fechaDada, formatter);
                    System.out.println(UtilidadesFecha.diaMes(fecha));
                }

                case 5 -> {
                    System.out.println("***OPCION-5***");
                    System.out.println("Introduce una fecha(DIA/MES/AÑO)");
                    fechaDada = teclado.nextLine();
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
                    LocalDate fecha = LocalDate.parse(fechaDada, formatter);
                    System.out.println(UtilidadesFecha.diaSemana(fecha));
                }

                case 6 -> {
                    System.out.println("***OPCION-6***");
                    System.out.println("Introduce una fecha(DIA/MES/AÑO)");
                    fechaDada = teclado.nextLine();
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
                    LocalDate fecha = LocalDate.parse(fechaDada, formatter);
                    System.out.println(UtilidadesFecha.mostrarFechaLarga(fecha));
                }

                case 7 -> {
                    System.out.println("***OPCION-7***");
                    System.out.println("Introduce una fecha(DIA/MES/AÑO)");
                    fechaDada = teclado.nextLine();
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
                    LocalDate fecha = LocalDate.parse(fechaDada, formatter);
                    System.out.println("Introduce la cantidad de días que quieres sumarle");
                    Long dias = teclado.nextLong();
                    System.out.println("La fecha resultado: " + UtilidadesFecha.sumarDias(dias, fecha));
                }

                case 8 -> {
                    System.out.println("***OPCION-8***");
                    System.out.println("Introduce una fecha(DIA/MES/AÑO)");
                    fechaDada = teclado.nextLine();

                    System.out.println("Introduce otra fecha(DIA/MES/AÑO)");
                    String fechaDada2 = teclado.nextLine();

                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
                    LocalDate fecha = LocalDate.parse(fechaDada, formatter);
                    LocalDate fecha2 = LocalDate.parse(fechaDada2, formatter);

                    System.out.println("La diferencia entre " + fecha + " y " + fecha2 + " es: "
                            + UtilidadesFecha.diasTranscurridos(fecha, fecha2));
                }

                case 9 -> {
                    System.out.println("***OPCION-9***");
                    System.out.println("Introduce una fecha(DIA/MES/AÑO)");
                    fechaDada = teclado.nextLine();
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
                    LocalDate fecha = LocalDate.parse(fechaDada, formatter);
                    System.out.println("El día siguiente es: " + UtilidadesFecha.siguienteDia(fecha));
                }

                case 10 -> {
                    System.out.println("***OPCION-10***");
                    System.out.println("Introduce una fecha(DIA/MES/AÑO)");
                    fechaDada = teclado.nextLine();
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
                    LocalDate fecha = LocalDate.parse(fechaDada, formatter);
                    System.out.println("El día anterior es: " + UtilidadesFecha.anteriorDia(fecha));
                }

                case 11 -> {
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
                    System.out.println("***OPCION-11*");
                    System.out.println("Introduce una fecha(DIA/MES/AÑO)");
                    fechaDada = teclado.nextLine();
                    System.out.println("Ahora la hora");
                    int hora = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Ahora los minutos de esa hora");
                    int minutos = teclado.nextInt();
                    teclado.nextLine();

                    LocalDate fecha = LocalDate.parse(fechaDada, formatter);
                    LocalDateTime hora1 = LocalDateTime.of(fecha.getYear(), fecha.getMonthValue(), fecha.getDayOfMonth(), hora, minutos);

                    System.out.println("Introduce otra fecha(DIA/MES/AÑO)");
                    String fechaDada2 = teclado.nextLine();
                    System.out.println("Ahora la hora");
                    hora = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Ahora los minutos de esa hora");
                    minutos = teclado.nextInt();
                    teclado.nextLine();

                    LocalDate fecha2 = LocalDate.parse(fechaDada2, formatter);
                    LocalDateTime hora2 = LocalDateTime.of(fecha2.getYear(), fecha2.getMonthValue(), fecha2.getDayOfMonth(), hora, minutos);

                    System.out.println("La diferencia en minutos es: " + UtilidadesFecha.minutosEntre(hora1, hora2));
                }

                case 12 -> {
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
                    System.out.println("***OPCION-12***");
                    System.out.println("Introduce una fecha(DIA/MES/AÑO)");
                    fechaDada = teclado.nextLine();
                    System.out.println("Ahora la hora");
                    int hora = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Ahora los minutos de esa hora");
                    int minutos = teclado.nextInt();
                    teclado.nextLine();

                    LocalDate fecha = LocalDate.parse(fechaDada, formatter);
                    LocalDateTime hora1 = LocalDateTime.of(fecha.getYear(), fecha.getMonthValue(), fecha.getDayOfMonth(), hora, minutos);
                    System.out.println("Cuantos segundos le quieres sumar? ");
                    long segundosSumar = teclado.nextLong();

                    System.out.println(UtilidadesFecha.sumarSegundos(segundosSumar, hora1));

                }
            }
            
            System.out.println("¿Quieres salir?");
            opcionSalir = teclado.nextLine();

        } while (opcionMenu != 13 && opcionSalir.equalsIgnoreCase("no"));
    }
}
