/*
 * Escribir un programa que soiicte al usuario un número entre 1 al 7 y muestre
 * el día de la semana, utilizando la sentencia "SWITCH"
 */

import java.util.Scanner;

public class DiaSemana {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int dia = 0;

        // Solicitamos el día
        System.out.print("\nIngresa un número entre 1 a 7: ");
        dia = entrada.nextInt();

        switch (dia) {
            case 1:
                System.out.println("\nLunes");
                break;
            case 2:
                System.out.println("\nMartes");
                break;
            case 3:
                System.out.println("\nMiércoles");
                break;
            case 4:
                System.out.println("\nJueves");
                break;
            case 5:
                System.out.println("\nViernes.");
                break;
            case 6:
                System.out.println("Sábado.");
                break;
            case 7:
                System.out.println("\nDomingo");
                break;
            default:
                System.out.println("\nNúmero inválido.");
                break;
        }

        System.out.println("Fin del programa.\n");

        entrada.close();
    }
}
