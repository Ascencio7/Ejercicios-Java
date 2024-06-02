/*
 * Escribir un programa que calcule la suma de los primeros n números naturales, donde n es
 * ingresado por el usuario, utilizando FOR
 */

import java.util.Scanner;

public class SumaNumNaturales {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Declaramos las variables a usar
        int n;
        int suma = 0;

        // Solicitamos el número
        System.out.print("\nIngresa el número: ");
        n = entrada.nextInt();

        for(int i = 1; i <= n; i++){
            suma += i;
        }

        System.out.println("\nLa suma de los primeros " + n + " números naturales es de: " + suma);
        System.out.println("\n");

        entrada.close();
    }
}