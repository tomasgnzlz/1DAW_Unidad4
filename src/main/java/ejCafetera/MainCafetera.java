/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejCafetera;

/**
 *
 * @author tomas
 */
public class MainCafetera {
        
    public static void main(String[] args) {
        Cafetera c1 = new Cafetera(1000);// 1000 y 1000
        System.out.println(c1);
        c1.vaciarCafetera();
        System.out.println(c1);
        c1.llenarCafetera();
        System.out.println(c1);
        c1.vaciarCafetera();
        c1.agregarCafe(350);
        System.out.println(c1);
        
        c1.servirCafe(500);
        System.out.println(c1);
        
    }
    
}
