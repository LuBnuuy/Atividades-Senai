package repeticao;

import java.util.Scanner;

public class Exercicio10 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        int contadorNegativos = 0;

        System.out.println("Digite 5 valores, um de cada vez:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            double valor = scanner.nextDouble();

            if (valor < 0) {
                contadorNegativos++;
            }
        }

        System.out.println("\nForam digitados " + contadorNegativos + " valores negativos.");
    }
}
