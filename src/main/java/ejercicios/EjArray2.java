/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author tomas
 */
/*Pedir al usuario un número de animales que van a ser evaluados en el veterinario. 
De cada animal vamos a guardar su peso, que vamos a pedir por teclado. 
Una vez sepamos los pesos de todos los animales, queremos saber la media de todos los pesos, 
cuantos animales hay por debajo de la media y cuantos por encima
Si el usuario pone un peso negativo, se considerará positivo. */
public class EjArray2 {

    public static void main(String[] args) {
        int numAnimales = solicitarDatoInt();
        String[] arrayNombreAnimales = new String[numAnimales];
        double[] arrayPesoAnimales = new double[numAnimales];
        arrayNombreAnimales = rellenarArrayNombres(arrayNombreAnimales);
        arrayPesoAnimales = rellenarArrayPesos(arrayPesoAnimales, arrayNombreAnimales);
        mostrarArrayNombre(arrayNombreAnimales);
        mostrarArrayPeso(arrayPesoAnimales);
        System.out.println("********************DATOS********************");
        mostrarDatosPesos(arrayPesoAnimales);
    }

    // Solicitar Nº animales.
    public static int solicitarDatoInt() {
        Scanner teclado = new Scanner(System.in);
        boolean seguir = true;
        int dato = 0;
        do {
            System.out.println("Introduce el número de animales a evaluar");
            try {
                dato = teclado.nextInt();
                teclado.nextLine();
                seguir = false;
            } catch (InputMismatchException ime) {
                System.out.println("ERROR.No has introduciod un numero\n");
                teclado.nextLine();
            }
        } while (seguir);

        return dato;
    }

    // Solicitar peso de cada animal.
    public static double solicitarDatoDouble() {

        Scanner teclado = new Scanner(System.in);
        boolean seguir = true;
        double dato = 0;
        do {
//            System.out.println("Introduce el peso: (5,5)");
            try {
                dato = teclado.nextDouble();
                teclado.nextLine();
                if (dato < 0) {
                    dato = Math.abs(dato);
                }
                seguir = false;
            } catch (InputMismatchException ime) {
                System.out.println("ERROR. Dato no válido\n");
                teclado.nextLine();
            }
        } while (seguir);
        return dato;
    }

    // Rellenar array con peso de animales.
    public static double[] rellenarArrayPesos(double[] array, String[] nombres) {
        Scanner teclado = new Scanner(System.in);
        double peso;

        for (int i = 0; i < array.length; i++) {
            System.out.println("Animal " + (i + 1) + "/" + array.length);
            System.out.println("Introduce el peso de: " + nombres[i]);
            peso = solicitarDatoDouble();
            array[i] = peso;
            System.out.println("\n");

        }
        return array;
    }

    public static String[] rellenarArrayNombres(String[] array) {

        Scanner teclado = new Scanner(System.in);
        String nombre = "";
        for (int i = 0; i < array.length; i++) {
            System.out.println("Animal " + (i + 1) + "/" + array.length);
            System.out.println("Introduce el nombre:");
            nombre = teclado.nextLine();
            array[i] = nombre;
        }
        return array;
    }

    //Mostar array rellenado.
    public static void mostrarArrayPeso(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void mostrarArrayNombre(String[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    //Calcular peso Animales
    public static void mostrarDatosPesos(double[] array) {

        int numAnimalesTotales = array.length;
        double pesoTotal = 0;
        int numAnimalesAbajo = 0;
        int numAnimalesArriba = 0;
        for (int i = 0; i < array.length; i++) {
            double peso = array[i];
            pesoTotal += peso;
        }

        
        double media = pesoTotal / numAnimalesTotales;

        for (int i = 0; i < array.length; i++) {
            double peso = array[i];
            if (peso > media) {
                numAnimalesArriba++;
            } else if (peso < media) {
                numAnimalesAbajo++;
            }
        }

        System.out.println("Media: " + media + "Kg");
        System.out.println("Nº Animales abajo: " + numAnimalesAbajo);
        System.out.println("Nº Animales arriba: " + numAnimalesArriba);
    }

}
