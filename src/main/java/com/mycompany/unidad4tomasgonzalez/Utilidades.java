/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.unidad4tomasgonzalez;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author tomas
 */
public class Utilidades {
    // Método de clase público(visible por otras clases)
    // EStátic no necesita de la clase Utilidades
    // devuelve un dato tipo int.
    
    // El método no tiene parámetros. 
    public static int solicitarDatoInt(){
        Scanner teclado = new Scanner(System.in);
        boolean seguir = true;
        int dato =0;
        do {            
            System.out.println("Introduce un número");
            try {
                dato = teclado.nextInt();
                teclado.nextLine();
                seguir =false;
            } catch (InputMismatchException ime) {
                System.out.println("ERROR.No has introduciod un numero\n");
                teclado.nextLine();
            }
        } while (seguir);
        
        return dato;
    }
    public static int filtrarInt110(int menor,int mayor){
        int numero;
        do {            
            numero = solicitarDatoInt();
            if (numero>mayor || numero<menor) {
                System.out.println("El numero no está en el rango");
            }
        } while (!(numero>menor && numero<mayor));
        
        
        return numero;
    }
    
    public static int enteroAleatorio(int menor,int mayor){
        Random random = new Random();
        int numero=random.nextInt(menor, mayor);
        
        return numero;
        
    }
    
}
