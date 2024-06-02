/*
 * Escribir un programa que solicite al usuario un número y calcule
 * la suma de los digitos utilizando la sentencia do/while
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class SumaDigitos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //Declaramos las variables
        double num;
        double suma = 0;

        //Solicitamos el número
        System.out.print("\nIngrese el número: ");
        num = entrada.nextDouble();

        do{
            suma += num % 10;
            num /= 10;
        }while(num > 0);

        System.out.println("\nLa suma de los dígitos es de: " + new DecimalFormat("#0.00").format(suma));
        System.out.println("Fin del programa.\n");

        entrada.close();
    }
}