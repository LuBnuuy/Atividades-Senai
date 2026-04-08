package repeticao;

import java.util.Scanner;

public class Exercicio20 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite quantos números da sequência de Fibonacci você deseja imprimir: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Por favor, digite um número positivo.");
        } else if (n == 1) {
            System.out.println("Sequência de Fibonacci até o " + n + "º termo:");
            System.out.print("0");
        } else {
            System.out.println("Sequência de Fibonacci até o " + n + "º termo:");
            int primeiro = 0;
            int segundo = 1;
            System.out.print(primeiro + " " + segundo);

            for (int i = 3; i <= n; i++) {
                int proximo = primeiro + segundo;
                System.out.print(" " + proximo);
                primeiro = segundo;
                segundo = proximo;
            }
        }
        System.out.println();
    }
}