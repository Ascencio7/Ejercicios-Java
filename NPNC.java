/*
 * Escribir un programa que solicite un número y determine si es
 * positivo, negativo o 0.
 */

import java.util.Scanner;

public class NPNC {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double num;

        System.out.print("\nDigite el número: ");
        num = entrada.nextDouble();

        if (num > 0) {
            System.out.println("\nEl número es positivo");
            System.out.println("Fin del programa.\n");
        } else if (num < 0) {
            System.out.println("\nEl número es negativo.");
            System.out.println("Fin del programa.\n");
        } else {
            System.out.println("\nEl número es 0.");
            System.out.println("Fin del programa.\n");
        }

        entrada.close();
    }
}