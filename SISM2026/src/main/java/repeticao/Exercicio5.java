package repeticao;

import java.util.Scanner;

public class Exercicio5 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero % 3 == 0) {
            System.out.println("O número " + numero + " é divisível por 3.");
        } else {
            System.out.println("O número " + numero + " NÃO é divisível por 3.");
        }

        if (numero % 2 != 0) { // Se for ímpar
            if (numero % 5 == 0) {
                System.out.println("Além disso, o número ímpar " + numero + " é divisível por 5.");
            } else {
                System.out.println("Além disso, o número ímpar " + numero + " NÃO é divisível por 5.");
            }
        }
    }
}
