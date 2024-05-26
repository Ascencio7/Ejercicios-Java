import java.util.Scanner;

public class Aprobado_Reprobado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double nota;

        System.out.print("\nDigite la nota del estudiante: ");
        nota = entrada.nextDouble();

        if (nota > 7 && nota < 10) {
            System.out.println("\nEl estudiante ha aprobado la materia.");
            System.out.println("Fin del programa.\n");
        } else if (nota < 7) {
            System.out.println("\nEl estudiante ha reprobado la materia.");
            System.out.println("Fin del programa.\n");
        } else {
            System.out.println("\nError");
        }
        entrada.close();
    }
}
