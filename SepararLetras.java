/*
 * Escribir un programa que solicite al usuario una cadena y muestre cada letra
 * en una linea separada, utilizando la sentencia do/while
 */

import java.util.Scanner;

public class SepararLetras {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //Declaramos las varibles
        String cadena;
        int i = 0;

        System.out.print("\nIngrese la cadena: ");
        cadena = entrada.nextLine();

        do{

            System.out.println(cadena.charAt(i));
            i++;

        }while(i < cadena.length());
        
        System.out.println("\n");

        entrada.close();
    }
}