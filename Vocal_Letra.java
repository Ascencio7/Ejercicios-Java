import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Vocal_Letra {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String letra;

        System.out.print("\nDigite la letra: ");
        letra = entrada.nextLine();

        System.out.println(esVocal(letra));

        entrada.close();
    }

    public static String esVocal(String x) {
        List<String> vocales = Arrays.asList("a", "e", "i", "o", "u");
        if (vocales.contains(x.toLowerCase())) {
            return "\nEs una vocal.\n";
        } else {
            return "\nNo es una vocal.\n";
        }
    }
}