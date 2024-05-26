/*
 * Es escribir un programa que solicite al usuario un número y muestre la suma
 * de los números
 * pares del 1 al número ingresado.
 */

import java.util.Scanner;

public class SumaPares {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num;
        int i = 1;
        int suma = 0;

        System.out.print("\nDigite el número par: ");
        num = entrada.nextInt();

        while (i <= num) {
            if (i % 2 == 0) {
                suma += i;
            }
            i++;
        }

        System.out.println("\nLa suma desde 1 al " + num + " es de: " + suma + "\n");

        entrada.close();
    }
}