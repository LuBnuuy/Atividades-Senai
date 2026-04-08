package repeticao;

import java.util.Scanner;

public class Exercicio14 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a altura desejada para a figura (até 20 linhas): ");
        int altura = scanner.nextInt();

        if (altura <= 0 || altura > 20) {
            System.out.println("Por favor, digite uma altura entre 1 e 20.");
            scanner.close();
            return;
        }

        for (int linha = 1; linha <= altura; linha++) {
            for (int asterisco = 1; asterisco <= 2 * linha - 1; asterisco++) {
                System.out.print("*");
            }

            for (int espaco = 1; espaco <= (2 * altura - 1) - (2 * linha - 1); espaco++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}
