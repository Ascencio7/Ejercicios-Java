/*
 * Escribir un programa que solicte al usuario su edad y determine si es
 * mayor de edad o no.
 */

import java.util.Scanner;

public class Edad_Menor_Mayor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int edad;

        System.out.print("\n\nDigite su edad: ");
        edad = entrada.nextInt();

        if (edad > 18) {
            System.out.println("\nEs mayor de edad, ya puede tomar.");
            System.out.println("Fin del programa.\n");
        } else {
            System.out.println("\nEs menor de edad, no puede tomar alcohol.");
            System.out.println("Fin del programa.\n");
        }

        entrada.close();
    }
}
