/*
 * Escribir un programa que solicite al usuario un número y muestre la tabla
 * de multiplicar correspondiente.
 */

import java.util.Scanner;

public class Tabla_Multiplicar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num;
        int i = 1;

        System.out.print("\nDigite el número de la tabla: ");
        num = entrada.nextInt();

        System.out.println("\nTabla de multiplicar del " + num + ":\n");

        while (i <= 10) {
            System.out.println(num + " x " + i + " = " + (num * i));
            i++;
        }

        System.out.println("\n");

        entrada.close();
    }
}