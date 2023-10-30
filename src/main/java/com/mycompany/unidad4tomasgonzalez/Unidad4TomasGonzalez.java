/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.unidad4tomasgonzalez;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author tomas
 */
public class Unidad4TomasGonzalez {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
//        System.out.println("Introduce un primer número");
//        int numero1 = Utilidades.solicitarDatoInt();
//        System.out.println("Introduce un segundo número");
//        int numero2 = Utilidades.solicitarDatoInt();
//        int aleatorio = Utilidades.enteroAleatorio(numero1, numero2);
//        System.out.println("El número aleatorio es: " + aleatorio);

        // Crear un array de 100 elementos aleatorios de tipo int. 
        int[] arrayAleatorios = new int[10];
        int numeroMenor = 10;
        int numeroMayor = 2_000;

        for (int i = 0; i < arrayAleatorios.length; i++) {
            arrayAleatorios[i] = Utilidades.enteroAleatorio(numeroMenor, numeroMayor);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(arrayAleatorios[i] + " ");
        }

    }
}
