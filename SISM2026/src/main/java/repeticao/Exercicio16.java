package repeticao;

import java.util.Scanner;

public class Exercicio16 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        int totalPessoas = 20;
        int idadeMasculinaTotal = 0;
        int quantidadeHomens = 0;
        int idadeFemininaTotal = 0;
        int quantidadeMulheres = 0;

        System.out.println("Análise de População (Leitura de " + totalPessoas + " pessoas):");

        for (int i = 1; i <= totalPessoas; i++) {
            System.out.println("\nDados da pessoa " + i + ":");

            char sexo;
            do {
                System.out.print("Digite o sexo (m/f): ");
                sexo = scanner.next().toLowerCase().charAt(0);
                if (sexo != 'm' && sexo != 'f') {
                    System.out.println("Erro: Digite 'm' para masculino ou 'f' para feminino.");
                }
            } while (sexo != 'm' && sexo != 'f');

            System.out.print("Digite a idade: ");
            int idade = scanner.nextInt();

            if (sexo == 'm') {
                idadeMasculinaTotal += idade;
                quantidadeHomens++;
            } else {
                idadeFemininaTotal += idade;
                quantidadeMulheres++;
            }
        }

        System.out.println("\n--- Resultados ---");

        double mediaIdadeMasculina = 0;
        if (quantidadeHomens > 0) {
            mediaIdadeMasculina = (double) idadeMasculinaTotal / quantidadeHomens;
            System.out.printf("Média de idade da população masculina: %.2f anos\n", mediaIdadeMasculina);
        } else {
            System.out.println("Nenhum homem foi informado na população.");
        }

        double mediaIdadeFeminina = 0;
        if (quantidadeMulheres > 0) {
            mediaIdadeFeminina = (double) idadeFemininaTotal / quantidadeMulheres;
            System.out.printf("Média de idade da população feminina: %.2f anos\n", mediaIdadeFeminina);
        } else {
            System.out.println("Nenhuma mulher foi informada na população.");
        }

        double mediaEntreMedias = 0;
        int contMedias = 0;

        if (quantidadeHomens > 0) {
            mediaEntreMedias += mediaIdadeMasculina;
            contMedias++;
        }

        if (quantidadeMulheres > 0) {
            mediaEntreMedias += mediaIdadeFeminina;
            contMedias++;
        }

        if (contMedias > 0) {
            mediaEntreMedias /= contMedias;
            System.out.printf("Média entre a idade da população masculina e feminina: %.2f anos\n", mediaEntreMedias);
        } else {
            System.out.println("Não foi possível calcular a média entre as idades (nenhum sexo informado).");
        }

    }
}
