package repeticao;

import java.util.Scanner;

public class Exercicio19 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro não negativo para calcular o fatorial: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("Erro: Não é possível calcular o fatorial de um número negativo.");
        } else {
            long fatorial = calcularFatorial(numero);
            System.out.println("O fatorial de " + numero + " é: " + fatorial);
        }

    }

    // Função para calcular o fatorial de um número
    public static long calcularFatorial(int n) {
        if (n == 0) {
            return 1; // Fatorial de 0 é 1
        } else {
            long resultado = 1;
            for (int i = 1; i <= n; i++) {
                resultado *= i;
            }
            return resultado;
        }
    }
}