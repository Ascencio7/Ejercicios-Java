/*
 * Escribir un programa que solicite al usuario un número y muestre la tabla
 * de multiplicar correspondiente utilizando FOR
 */

import java.util.Scanner;

public class TablaMultiFor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //Declaramos las variables
        int num;

        //Solicitamos el número
        System.out.print("\nIngresa el número de la tabla: ");
        num = entrada.nextInt();

        System.out.println("\nTabla de multiplicar del " + num + ":\n");

        for(int i = 1; i <= 10; i++){
            System.out.println(num + " x " + i + " = " + (num * i ));
        }

        System.out.println("\n");
        
        entrada.close();
    }
}