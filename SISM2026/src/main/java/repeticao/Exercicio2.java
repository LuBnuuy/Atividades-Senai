package repeticao;

import java.util.Scanner;

public class Exercicio2 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int a = scanner.nextInt();

        System.out.print("Digite o valor de B: ");
        int b = scanner.nextInt();

        System.out.print("Digite o valor de C: ");
        int c = scanner.nextInt();

        int soma = a + b;

        if (soma < c) {
            System.out.println("A soma de A + B é menor que C.");
        } else {
            System.out.println("A soma de A + B é maior ou igual a C.");
        }
    }
}