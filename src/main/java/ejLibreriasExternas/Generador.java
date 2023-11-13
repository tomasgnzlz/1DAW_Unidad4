/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejLibreriasExternas;

import java.util.Random;
import java.util.Scanner;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author tomas
 */
public class Generador {

    public static String pinSIM() {
        return RandomStringUtils.randomNumeric(4);
    }

    public static String passwordSO() {
        return RandomStringUtils.randomAlphanumeric(8).toUpperCase();
    }

    public static String password(int lenght, String chars) {
        return RandomStringUtils.random(lenght, chars).toUpperCase();
    }
}
