/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejClase05;

import java.util.Random;

/**
 *
 * @author tomas
 */
public class cosas {
    
    public static void main(String[] args) {
        Random r1 = new Random();
        for (int i = 0; i < 20; i++) {
            System.out.println(r1.nextInt(10));
        }
    }
}
