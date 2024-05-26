/*
 * Escribir un programa que solicite al usuario un número y determine
 * si es par o impar.
 */

import java.util.Scanner;

public class Numero_Par_Impar {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double num;

        System.out.print("\nDigite el número a verificar si es par o impar: ");
        num = entrada.nextDouble();

        if (num % 2 == 0) {
            System.out.println("\nEl número es par.\n");
        } else {
            System.out.println("\nEl número es impar.\n");
        }

        entrada.close();
    }
}