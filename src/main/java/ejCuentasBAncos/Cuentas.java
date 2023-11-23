/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejCuentasBAncos;

import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author tomas
 */
public class Cuentas {

    public static void main(String[] args) {
        CuentaBancaria c1 = new CuentaBancaria("tomas", "AAAAAA", 1450, 10);

        System.out.println(c1.getNumCuenta());
        System.out.println(c1);

        c1.ingresarSaldo(500);
        System.out.println(c1);

        c1.retirarSaldo(250);
        System.out.println(c1);

        c1.retirarSaldo(2000);
        System.out.println(c1);

        c1.abonarInteresSaldo();
        System.out.println(c1);

        c1.setSaldoCuenta(1000);
        System.out.println("SALdo 1 : " + c1.getSaldoCuenta());
        
        c1.abonarInteresSaldo();
        System.out.println("SALdo 2 : " + c1.getSaldoCuenta());
        
        // Constructor copia
        CuentaBancaria copiaC1 = new CuentaBancaria(c1);
        System.out.println(c1);
        System.out.println(copiaC1);
    }

}
