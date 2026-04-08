package repeticao;

import java.util.Scanner;

public class Exercicio9 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de números ímpares desejada (n): ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Por favor, digite um número positivo.");
            scanner.close();
            return;
        }

        int maiorImpar = 2 * n - 1;

        System.out.println("Os " + n + " primeiros números ímpares em ordem decrescente são:");

        for (int i = maiorImpar; i >= 1; i -= 2) {
            System.out.println(i + " ");
        }

    }
}