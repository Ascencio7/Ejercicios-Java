/*
 * Escribir un programa que solicite al usuario una cadena y cuente la cantidad de vocales 
 * que contiene.
 */

import java.util.Scanner;

public class ContarVocales {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //Declaramos las variables a usar
        String cadena;
        int i = 0;
        int vocales = 0;

        System.out.print("\nIngrese la cadena a verificar: ");
        cadena = entrada.nextLine();

        while (i < cadena.length()) {
            char c = cadena.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vocales++;
            }
            i++;
        }

        System.out.println("\nLa cadena contiene " + vocales + " vocales.");
        System.out.println("Fin del programa.\n");

        entrada.close();
    }
 }