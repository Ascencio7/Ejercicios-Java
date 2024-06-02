/*
 * Escribir un programa que solicite al usuario un número y muestre la tabla
 * de multiplicar correspondiente, utilizando do/while
 */

import java.util.Scanner;

public class TablaMulti {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Declarar las variables
        int num;
        int i = 1;

        // Solicitar el número
        System.out.print("\nIngrese el número de la tabla: ");
        num = entrada.nextInt();

        System.out.println("\nTabla de multiplicar del " + num + " :\n");
        do {
            System.out.println(num + " x " + i + " = " + (num * i));
            i++;
        } while (i <= 10);
        
        System.out.println("\n");
        entrada.close();
    }
}