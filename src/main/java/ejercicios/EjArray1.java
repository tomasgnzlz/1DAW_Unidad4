/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.Random;

/**
 *
 * @author tomas
 */
public class EjArray1 {

    public static void main(String[] args) {
        boolean[] array = arrayBooleanos(10);
        rellenarArray(array);
        mostrarArray(array);
        contarCaras(array);

    }

    // ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    public static boolean[] arrayBooleanos(int tamanio) {
        boolean[] array = new boolean[tamanio];
        return array;
    }

    public static void rellenarArray(boolean[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextBoolean();
        }
    }

    public static void mostrarArray(boolean[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void contarCaras(boolean[] array) {
        int contador = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]) {
                contador++;
            }
        }
        System.out.println("El número de caras es: " + contador);
    }

}
