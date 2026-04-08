package repeticao;

import java.util.Scanner;

public class Exercicio17 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu peso em quilogramas (kg): ");
        double peso = scanner.nextDouble();

        System.out.print("Digite a sua altura em metros (m): ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        System.out.printf("\nSeu IMC é: %.2f\n", imc);

        System.out.println("Classificação do IMC:");
        if (imc < 18.5) {
            System.out.println("Abaixo do peso.");
            System.out.println("Recomenda-se procurar um médico ou nutricionista para avaliação.");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Peso normal.");
            System.out.println("Seu peso está saudável.");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Sobrepeso.");
            System.out.println("Recomenda-se adotar hábitos de vida mais saudáveis.");
        } else if (imc >= 30 && imc < 35) {
            System.out.println("Obesidade grau I.");
            System.out.println("É importante procurar orientação médica e nutricional.");
        } else if (imc >= 35 && imc < 40) {
            System.out.println("Obesidade grau II.");
            System.out.println("Recomenda-se buscar acompanhamento médico especializado.");
        } else {
            System.out.println("Obesidade grau III (mórbida).");
            System.out.println("É fundamental procurar ajuda médica com urgência.");
        }

    }
}
