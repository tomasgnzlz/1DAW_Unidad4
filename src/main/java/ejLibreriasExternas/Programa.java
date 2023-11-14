/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejLibreriasExternas;

import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.lang.IllegalArgumentException;

/**
 *
 * @author tomas
 *
 */
public class Programa {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String opcionesMenu = """
                        1. PIN SIM
                        2. PIN SO
                        3. PIN
                        4. Salir
                        """;
        int opcionMenu = 0;

        do {
            do {
                try {
                    opcionMenu = Integer.parseInt(JOptionPane.showInputDialog(opcionesMenu));
                    
                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(null, "ERROR");
                }
            } while (!(opcionMenu == 1 || opcionMenu == 2 || opcionMenu == 3 || opcionMenu == 4));

            switch (opcionMenu) {
                case 1 -> {
                    String pinSim = Generador.pinSIM();
                    JOptionPane.showMessageDialog(null, "Pin: " + pinSim);
                }

                case 2 -> {
                    String password = Generador.passwordSO();
                    JOptionPane.showMessageDialog(null, "Password: " + password);
                }

                case 3 -> {
                    System.out.println("Introduce la logintud de tu contraseña");
                    int lenght = solicitarDatoInt();
                    System.out.println("Introduce los caracteres de tu contraseña");
                    String chars = solicitarCaracteres();
                    // Teniendo los datos, se genera la contraseña personalizada. 
                    String password = Generador.password(lenght, chars);
                    JOptionPane.showMessageDialog(null, "Password: " + password);
                }
            }

        } while (!(opcionMenu == 4));
    }

    // Métodos para controlar las posibles excepciones. 
    public static int solicitarDatoInt() {
        Scanner teclado = new Scanner(System.in);
        boolean seguir = true;
        int dato = 0;
        do {
            try {
                dato = teclado.nextInt();
                teclado.nextLine();
                seguir = false;
            } catch (InputMismatchException ime) {
                System.out.println("ERROR. Introduce un entero\n");
                teclado.nextLine();
            }
        } while (seguir);

        return dato;
    }

    public static String solicitarCaracteres() {
        Scanner teclado = new Scanner(System.in);
        boolean seguir = true;
        String chars = "";
        do {
            try {
                chars = teclado.nextLine();
                //Si el String está vacío lanza excepción y vuelve a soliciarla
                if (chars.isEmpty()) {
                    throw new IllegalArgumentException();
                }
                seguir = false;
            } catch (IllegalArgumentException iae) {
                System.out.println("ERROR. Introduce caracteres \n");
                seguir = true;
            }
        } while (seguir);
        return chars;
    }
}
