/*
 * Escribir un programa que solicite al usuario una cadena y muestre cada letra
 * en una linea seperada, utilizando la sentencia de control FOR.
 */


import java.util.Scanner;

public class SeperarLetrasFOR {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Declaramos la variable
        String cadena;

        // Solicitamos la cadena
        System.out.print("\nIngresa la cadena: ");
        cadena = entrada.nextLine();

        System.out.println("\n");
        for(int i = 0; i < cadena.length(); i++){
            System.out.println(cadena.charAt(i));
        }

        System.out.println("\n");
        entrada.close();
    }
}