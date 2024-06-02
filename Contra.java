/*
 * Escribir un programa que solicite al usuario una contraseña y la verifique, 
 * utilizando la sentencia de control do/while
 */

import java.util.Scanner;

public class Contra {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Declaramos la variable
        String password;

        do {
            // Solicitamos la contraseña
            System.out.print("\nIngrese la contraseña: ");
            password = entrada.nextLine();

        } while (!password.equals("wirtaryen17")); // Se rompe hasta que sea igual la contra

        // Fin del programa
        System.out.println("\nIngreso correcto.");
        System.out.println("Fin del programa.\n");

        entrada.close();
    }
}