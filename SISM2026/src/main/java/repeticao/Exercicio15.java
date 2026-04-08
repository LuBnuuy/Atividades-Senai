package repeticao;

import java.util.Scanner;

public class Exercicio15 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        int altura;
        char continuar = 's';

        while (continuar == 's' || continuar == 'S') {
            System.out.print("Digite a altura desejada para a figura (1 a 20): ");
            altura = scanner.nextInt();

            if (altura < 1 || altura > 20) {
                System.out.println("Erro: A altura deve ser um valor entre 1 e 20.");
                System.out.print("Deseja tentar novamente? (s/n): ");
                continuar = scanner.next().charAt(0);
            } else {
                for (int linha = 1; linha <= altura; linha++) {
                    // Imprimir os asteriscos
                    for (int asterisco = 1; asterisco <= 2 * linha - 1; asterisco++) {
                        System.out.print("*");
                    }

                    // Imprimir espaços em branco à direita
                    for (int espaco = 1; espaco <= (2 * altura - 1) - (2 * linha - 1); espaco++) {
                        System.out.print(" ");
                    }

                    // Mover para a próxima linha
                    System.out.println();
                }
                continuar = 'n'; // Se a altura for válida, não precisa continuar o loop
            }
        }

        System.out.println();
    }
}