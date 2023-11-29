/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

/**
 *
 * @author tomas
 */
public class PruebaUtilidades {

    public static void main(String[] args) {
        int numero=0;
        do {            
            numero = Utilidades.solicitarDatoInt();
        } while (numero>0 || numero <=10);
        
    }

}
