/*
 * Escribir un programa que soiicte al usuario un número entre 1 al 7 y muestre
 * el día de la semana, utilizando la sentencia "SWITCH"
 */

import java.util.Scanner;

public class DiasSemana {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num = 0;
        String dia;

        // Solicitamos el día
        System.out.print("\nIngresa un número entre 1 a 7: ");
        num = entrada.nextInt();

        switch (num) {
            case 1:
                dia = "Lunes";
                break;
            case 2:
                dia  = "Martes";
                break;
            case 3:
                dia = "Miércoles";
                break;
            case 4:
                dia = "Jueves";
                break;
            case 5:
                dia = "Vierner";
                break;
            case 6:
                dia = "Sábado";
                break;
            case 7:
                dia = "Domingo";
                break;
            default:
                dia = "Eror: Número inválido.";
                break;
        }

        System.out.println("\nEl día correspondiente de " + num + " es: " + dia);
        System.out.println("Fin del programa.\n");

        entrada.close();
    }
}
