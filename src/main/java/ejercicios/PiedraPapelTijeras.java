/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * @author tomas ARITMETIC NUMBERFORMAT INPUTMISMATCH
 */
/*
En la opción 1,  juego de dos jugadores, se debe preguntar el nombre a cada uno. 



Aleatoriamente comenzará uno de los jugadores indicando si saca piedra, papel o tijera. 
Estos datos se piden usando Scanner y no se permite otro dato que no sea uno de
esos tres, ignorando mayúsculas y minúsculas (pidra, papel, tijera). 


Supuestamente el otro jugador no "sabe" lo que ha elegido. 
Seguidamente el otro jugador elige entre una de las tres opciones y una vez los dos jugadores tienen su elección, 
entonces el juego informa por consola de la elección de cada uno y también debe indicar quien gana la ronda. 
La partida la gana el mejor de 5 rondas. El programa informará con el nombre del ganador de la partida. 
Ten en cuenta que el número de rondas puede ser susceptible de cambiar.*/
public class PiedraPapelTijeras {

    public static int askMenu(String opcionesDeJuego) {
        int opcionModoJuego = 0;
        boolean repetir = true;

        do {
            try {
                opcionModoJuego = Integer.parseInt(JOptionPane.showInputDialog(opcionesDeJuego));
                repetir = false;
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "ERROR");
            }
        } while (repetir || (opcionModoJuego < 1 || opcionModoJuego > 4));
        return opcionModoJuego;
    }

    public static String preguntarJugadores(String jugador, String sacaJugador) {
        Scanner teclado = new Scanner(System.in);
        boolean repetir = true;
        do {
            System.out.println("¿" + jugador + ", Que vas a sacar piedra ,papel o,tijera?");
            try {
                sacaJugador = teclado.nextLine();
                repetir = false;
            } catch (InputMismatchException ime) {
                System.out.println("ERROR");
            }

        } while (repetir || !(sacaJugador.equalsIgnoreCase("Piedra")
                || sacaJugador.equalsIgnoreCase("Papel")
                || sacaJugador.equalsIgnoreCase("tijeras")));
        return sacaJugador;
    }

    public static void decirGanador(int contador1, int contador2, String jugador1, String jugador2) {

        if (contador1 == contador2) {
            JOptionPane.showMessageDialog(null, "EMPATE, no Gana ningun jugador");

        } else if (contador1 > contador2) {
            JOptionPane.showMessageDialog(null, "Gana el jugador 1:" + jugador1);
        } else {
            JOptionPane.showMessageDialog(null, "Gana el jugador 2:" + jugador2);
        }
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Random random = new Random();
        int opcionModoJuego = 0;
        int dado = 0;

        String opcionesDeJuego = """
                               1.- Juego de dos jugadores
                               2.- Juego de un jugador contra la máquina
                               3.- Salir
                               """;
        boolean repetir = true;

        // Filtro y controlo la excepción de la opción de juego.
        do {
            opcionModoJuego = askMenu(opcionesDeJuego);

            switch (opcionModoJuego) {
                case 1 -> {
                    System.out.println(" ");
                    System.out.println("JUEGO DE DOS JUGADORES");
                    String jugador1 = JOptionPane.showInputDialog("¿Nombre jugador 1?");
                    String jugador2 = JOptionPane.showInputDialog("¿Nombre jugador 2?");

                    //El dado decide quien empieza
                    dado = random.nextInt(3);

                    String sacaJugador1 = "", sacaJugador2 = "";
                    repetir = true; // Actualizo la variable
                    // Contadores para ver quien de los jugadores gana primero. 
                    int contador1 = 0, contador2 = 0;
                    if (dado == 1) {
                        System.out.println("Empieza el jugador1: " + jugador1);
                        // Bucle para jugar 5Rondas
                        for (int i = 0; i < 5; i++) {
                            System.out.println((i + 1) + "/5");

                            System.out.println("Jugador1");
                            sacaJugador1 = preguntarJugadores(jugador1, sacaJugador1);
                            System.out.println("Jugador2");
                            sacaJugador2 = preguntarJugadores(jugador2, sacaJugador2);

                            //
                            // Muestro las tiradas de ambos jugadores
                            System.out.println("\n" + jugador1 + ":" + sacaJugador1 + " y " + jugador2 + ":" + sacaJugador2);

                            //
                            // Dependiendo de lo que saque el uno o el otro, gana la ronda uno de los dos. 
                            // O se empata la ronda y ninguno de los dos suma puntos. 
                            if (sacaJugador1.equalsIgnoreCase("papel") && sacaJugador2.equalsIgnoreCase("papel")
                                    || sacaJugador1.equalsIgnoreCase("tijeras") && sacaJugador2.equalsIgnoreCase("tijeras")
                                    || sacaJugador1.equalsIgnoreCase("piedra") && sacaJugador2.equalsIgnoreCase("piedra")) {
                                System.out.println("EMPATE. No gana la ronda ninguno");

                            } else if (sacaJugador1.equalsIgnoreCase("papel") && sacaJugador2.equalsIgnoreCase("piedra")
                                    || sacaJugador1.equalsIgnoreCase("tijeras") && sacaJugador2.equalsIgnoreCase("papel")
                                    || sacaJugador1.equalsIgnoreCase("piedra") && sacaJugador2.equalsIgnoreCase("tijeras")) {
                                System.out.println("Gana la ronda Nº" + (i + 1) + ":" + jugador1);
                                contador1++;
                            } else {
                                System.out.println("Gana la ronda Nº" + (i + 1) + ":" + jugador2);
                                contador2++;
                            }

                            System.out.println("""
                                           ***************************************
                                                    El %s lleva %d puntos
                                                    El %s lleva %d puntos
                                           ***************************************
                                           """.formatted(jugador1, contador1, jugador2, contador2));

                            if (contador1 == 3 && contador1 > contador2) {
                                System.out.println("Gana directamente: " + jugador1);
                                break;
                            } else if (contador2 == 3 && contador2 > contador1) {
                                System.out.println("Gana directamente: " + jugador2);
                                break;
                            }

                            // En la última ronda se decide  quien ha ganado o quien ha perdido, SIN TENER EN CUENTA QUIEN HAYAGANADO 3 RONDAS PRIMERO
                            if ((i + 1) == 5) {
//
//                                if (contador1 == contador2) {
//                                    JOptionPane.showMessageDialog(null, "EMPATE, no Gana ningun jugador");
//
//                                } else if (contador1 > contador2) {
//                                    JOptionPane.showMessageDialog(null, "Gana el jugador 1:" + jugador1);
//                                } else {
//                                    JOptionPane.showMessageDialog(null, "Gana el jugador 2:" + jugador2);
//                                }

                                decirGanador(contador1, contador2, jugador1, jugador2);

                            }

                        }

                    } else {
                        System.out.println("Empieza el jugador2: " + jugador2);
                        // Bucle para jugar 5Rondas
                        for (int i = 0; i < 5; i++) {
                            System.out.println((i + 1) + "/5");

                            do {
                                System.out.println("¿" + jugador2 + ", Que vas a sacar piedra/papel/tijera?");
                                try {
                                    sacaJugador2 = teclado.nextLine();
                                    repetir = false;
                                } catch (InputMismatchException ime) {
                                    System.out.println("ERROR");
                                }
                            } while (repetir || !(sacaJugador2.equalsIgnoreCase("Piedra") || sacaJugador2.equalsIgnoreCase("Papel") || sacaJugador2.equalsIgnoreCase("Tijeras")));
                            //

                            do {
                                System.out.println("¿" + jugador1 + ", Que vas a sacar piedra/papel/tijera?");
                                try {
                                    sacaJugador1 = teclado.nextLine();
                                    repetir = false;
                                } catch (InputMismatchException ime) {
                                    System.out.println("ERROR");
                                }
                            } while (repetir || !(sacaJugador1.equalsIgnoreCase("Piedra") || sacaJugador1.equalsIgnoreCase("Papel") || sacaJugador1.equalsIgnoreCase("tijeras")));

                            // Muestro las tiradas de ambos jugadores
                            System.out.println("\n" + jugador2 + ":" + sacaJugador2 + " y " + jugador1 + ":" + sacaJugador1);

                            //
                            // Dependiendo de lo que saque el uno o el otro, gana la ronda uno de los dos. 
                            // O se empata la ronda y ninguno de los dos suma puntos. 
                            if (sacaJugador1.equalsIgnoreCase("papel") && sacaJugador2.equalsIgnoreCase("papel")
                                    || sacaJugador1.equalsIgnoreCase("tijeras") && sacaJugador2.equalsIgnoreCase("tijeras")
                                    || sacaJugador1.equalsIgnoreCase("piedra") && sacaJugador2.equalsIgnoreCase("piedra")) {
                                System.out.println("EMPATE. No gana la ronda ninguno");

                            } else if (sacaJugador1.equalsIgnoreCase("papel") && sacaJugador2.equalsIgnoreCase("piedra")
                                    || sacaJugador1.equalsIgnoreCase("tijeras") && sacaJugador2.equalsIgnoreCase("papel")
                                    || sacaJugador1.equalsIgnoreCase("piedra") && sacaJugador2.equalsIgnoreCase("tijeras")) {
                                System.out.println("Gana la ronda Nº" + (i + 1) + ":" + jugador1);
                                contador1++;

                            } else {
                                System.out.println("Gana la ronda Nº" + (i + 1) + ":" + jugador2);
                                contador2++;
                            }

                            System.out.println("""
                                           ***************************************
                                                    El %s lleva %d puntos
                                                    El %s lleva %d puntos
                                           ***************************************
                                           """.formatted(jugador1, contador1, jugador2, contador2));

                            if (contador1 == 3 && contador1 > contador2) {
                                System.out.println("Gana directamente: " + jugador1);
                                break;
                            } else if (contador2 == 3 && contador2 > contador1) {
                                System.out.println("Gana directamente: " + jugador2);
                                break;
                            }

                            // En la última ronda se decide  quien ha ganado o quien ha perdido, SIN TENER EN CUENTA QUIEN HAYAGANADO 3 RONDAS PRIMERO
                            if ((i + 1) == 5) {
                                if (contador1 > contador2) {
                                    JOptionPane.showMessageDialog(null, "Gana el jugador 1:" + jugador1);
                                } else {
                                    JOptionPane.showMessageDialog(null, "Gana el jugador 2:" + jugador2);
                                }
                            }

                        }
                    }

                }

                case 2 -> {
                    System.out.println(" ");
                    System.out.println("JUEGO DE 1 JUGADOR(VS MÁQUINA)");
                    String jugador1 = JOptionPane.showInputDialog("¿Nombre jugador 1?");
                    String jugador2 = "Máquina";
                    //El dado decide quien empieza
                    dado = random.nextInt(3);
                    dado = 1;

                    String sacaJugador1 = "", sacaJugador2 = "";
                    repetir = true; // Actualizo la variable
                    // Contadores para ver quien de los jugadores gana primero. 
                    int contador1 = 0, contador2 = 0;
                    if (dado == 1) {
                        System.out.println("Empieza el jugador1: " + jugador1);
                        // Bucle para jugar 5Rondas
                        for (int i = 0; i < 5; i++) {
                            System.out.println((i + 1) + "/5");
                            // Lo que introduce el jugador 1
                            do {
                                System.out.println("¿" + jugador1 + ", Que vas a sacar piedra ,papel o,tijera?");
                                try {
                                    sacaJugador1 = teclado.nextLine();
                                    repetir = false;
                                } catch (InputMismatchException ime) {
                                    System.out.println("ERROR");
                                }

                            } while (repetir || !(sacaJugador1.equalsIgnoreCase("Piedra") || sacaJugador1.equalsIgnoreCase("Papel") || sacaJugador1.equalsIgnoreCase("tijeras")));
                            // LO QUE INTRODUCE LA MÁQUINA
                            //
                            int randomMaquina = random.nextInt(4);
                            if (randomMaquina == 1) {
                                sacaJugador2 = "Piedra";
                                System.out.println("Máquina ya ha sacado");
                            } else if (randomMaquina == 2) {
                                sacaJugador2 = "Papel";
                                System.out.println("Máquina ya ha sacado");
                            } else {
                                sacaJugador2 = "tijeras";
                                System.out.println("Máquina ya ha sacado");
                            }

                            //
                            // Muestro las tiradas de ambos jugadores
                            System.out.println("\n" + jugador1 + ":" + sacaJugador1 + " y " + jugador2 + ":" + sacaJugador2);

                            //
                            // Dependiendo de lo que saque el uno o el otro, gana la ronda uno de los dos. 
                            // O se empata la ronda y ninguno de los dos suma puntos. 
                            if (sacaJugador1.equalsIgnoreCase("papel") && sacaJugador2.equalsIgnoreCase("papel")
                                    || sacaJugador1.equalsIgnoreCase("tijeras") && sacaJugador2.equalsIgnoreCase("tijeras")
                                    || sacaJugador1.equalsIgnoreCase("piedra") && sacaJugador2.equalsIgnoreCase("piedra")) {
                                System.out.println("EMPATE. No gana la ronda ninguno");

                            } else if (sacaJugador1.equalsIgnoreCase("papel") && sacaJugador2.equalsIgnoreCase("piedra")
                                    || sacaJugador1.equalsIgnoreCase("tijeras") && sacaJugador2.equalsIgnoreCase("papel")
                                    || sacaJugador1.equalsIgnoreCase("piedra") && sacaJugador2.equalsIgnoreCase("tijeras")) {
                                System.out.println("Gana la ronda Nº" + (i + 1) + ":" + jugador1);
                                contador1++;

                            } else {
                                System.out.println("Gana la ronda Nº" + (i + 1) + ":" + jugador2);
                                contador2++;
                            }

                            System.out.println("""
                                           ***************************************
                                                    El %s lleva %d puntos
                                                    El %s lleva %d puntos
                                           ***************************************
                                           """.formatted(jugador1, contador1, jugador2, contador2));

                            if (contador1 == 3 && contador1 > contador2) {
                                System.out.println("Gana directamente: " + jugador1);
                                break;
                            } else if (contador2 == 3 && contador2 > contador1) {
                                System.out.println("Gana directamente: " + jugador2);
                                break;
                            }

                            // En la última ronda se decide  quien ha ganado o quien ha perdido, SIN TENER EN CUENTA QUIEN HAYAGANADO 3 RONDAS PRIMERO
                            if ((i + 1) == 5) {
                                if (contador1 > contador2) {
                                    JOptionPane.showMessageDialog(null, "Gana el jugador 1:" + jugador1);
                                } else {
                                    JOptionPane.showMessageDialog(null, "Gana el jugador 2:" + jugador2);
                                }
                            }

                        }

                    } else {
                        System.out.println("Empieza el jugador2: " + jugador2);
                        // Bucle para jugar 5Rondas
                        for (int i = 0; i < 5; i++) {
                            System.out.println((i + 1) + "/5");
                            System.out.println("¿" + jugador2 + ", Que vas a sacar piedra/papel/tijera?");
                            int randomMaquina = random.nextInt(4);
                            if (randomMaquina == 1) {
                                sacaJugador2 = "Piedra";
                                System.out.println("Máquina ya ha sacado");
                            } else if (randomMaquina == 2) {
                                sacaJugador2 = "Papel";
                                System.out.println("Máquina ya ha sacado");
                            } else {
                                sacaJugador2 = "tijeras";
                                System.out.println("Máquina ya ha sacado");
                            }

                            do {
                                System.out.println("¿" + jugador1 + ", Que vas a sacar piedra/papel/tijera?");
                                try {
                                    sacaJugador1 = teclado.nextLine();
                                    repetir = false;
                                } catch (InputMismatchException ime) {
                                    System.out.println("ERROR");
                                }
                            } while (repetir || !(sacaJugador1.equalsIgnoreCase("Piedra") || sacaJugador1.equalsIgnoreCase("Papel") || sacaJugador1.equalsIgnoreCase("tijeras")));

                            // Muestro las tiradas de ambos jugadores
                            System.out.println("\n" + jugador2 + ":" + sacaJugador2 + " y " + jugador1 + ":" + sacaJugador1);

                            //
                            // Dependiendo de lo que saque el uno o el otro, gana la ronda uno de los dos. 
                            // O se empata la ronda y ninguno de los dos suma puntos. 
                            if (sacaJugador1.equalsIgnoreCase("papel") && sacaJugador2.equalsIgnoreCase("papel")
                                    || sacaJugador1.equalsIgnoreCase("tijeras") && sacaJugador2.equalsIgnoreCase("tijeras")
                                    || sacaJugador1.equalsIgnoreCase("piedra") && sacaJugador2.equalsIgnoreCase("piedra")) {
                                System.out.println("EMPATE. No gana la ronda ninguno");

                            } else if (sacaJugador1.equalsIgnoreCase("papel") && sacaJugador2.equalsIgnoreCase("piedra")
                                    || sacaJugador1.equalsIgnoreCase("tijeras") && sacaJugador2.equalsIgnoreCase("papel")
                                    || sacaJugador1.equalsIgnoreCase("piedra") && sacaJugador2.equalsIgnoreCase("tijeras")) {
                                System.out.println("Gana la ronda Nº" + (i + 1) + ":" + jugador1);
                                contador1++;

                            } else {
                                System.out.println("Gana la ronda Nº" + (i + 1) + ":" + jugador2);
                                contador2++;
                            }

                            System.out.println("""
                                           ***************************************
                                                    El %s lleva %d puntos
                                                    El %s lleva %d puntos
                                           ***************************************
                                           """.formatted(jugador1, contador1, jugador2, contador2));

                            if (contador1 == 3 && contador1 > contador2) {
                                System.out.println("Gana directamente: " + jugador1);
                                break;
                            } else if (contador2 == 3 && contador2 > contador1) {
                                System.out.println("Gana directamente: " + jugador2);
                                break;
                            }

                            // En la última ronda se decide  quien ha ganado o quien ha perdido, SIN TENER EN CUENTA QUIEN HAYAGANADO 3 RONDAS PRIMERO
                            if ((i + 1) == 5) {
                                if (contador1 > contador2) {
                                    JOptionPane.showMessageDialog(null, "Gana el jugador 1:" + jugador1);
                                } else {
                                    JOptionPane.showMessageDialog(null, "Gana el jugador 2:" + jugador2);
                                }
                            }

                        }
                    }
                }
            }

        } while (opcionesDeJuego.equalsIgnoreCase("1") || opcionesDeJuego.equalsIgnoreCase("2"));
        JOptionPane.showMessageDialog(null, "Salir del Juego");

    }
}
