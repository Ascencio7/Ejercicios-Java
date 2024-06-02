/*
 * Escribir un programa que solicite al usuario un número y determine si es primo o no.
 */

 import java.util.Scanner;

 public class NumsPrimos {
     public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
 
 
         //Declaramos las variables
         int num;
         int i = 2;
         boolean primo = true;
 
         //Solicitamos el número
         System.out.print("\nDigite el número a verificar: ");
         num = entrada.nextInt();
 
         while (i <= num / 2) {
             if(num % i == 0){
                 primo = false;
                 break;
             }
 
             i++;
         }
 
         if (primo) {
             System.out.println("\nEl número " + num + " es un número primo.");
             System.out.println("Fin del programa.\n");
         }else{
             System.out.println("\nEl número " + num + " no es un número primo.");
             System.out.println("Fin del programa.\n");
         }
 
         entrada.close();
     }
 }