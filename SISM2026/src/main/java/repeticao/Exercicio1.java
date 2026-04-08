package repeticao;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- MENU DE EXERCÍCIOS ---");
            System.out.println("1. Exercício 1 - Menu");
            System.out.println("2. Exercício 2");
            System.out.println("3. Exercício 3");
            System.out.println("4. Exercício 4");
            System.out.println("5. Exercício 5");
            System.out.println("6. Exercício 6");
            System.out.println("7. Exercício 7");
            System.out.println("8. Exercício 8");
            System.out.println("9. Exercício 9");
            System.out.println("10. Exercício 10");
            System.out.println("11. Exercício 11");
            System.out.println("12. Exercício 12");
            System.out.println("13. Exercício 13");
            System.out.println("14. Exercício 14");
            System.out.println("15. Exercício 15");
            System.out.println("16. Exercício 16");
            System.out.println("17. Exercício 17");
            System.out.println("18. Exercício 18");
            System.out.println("19. Exercício 19");
            System.out.println("20. Exercício 20");
            System.out.println("21. Exercício 21");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Você escolheu o Exercício 1.");
                    break;
                case 2:
                    System.out.println("Você escolheu o Exercício 2.");
                    Exercicio2.executar();
                    break;
                case 3:
                    System.out.println("Você escolheu o Exercício 3.");
                    Exercicio3.executar();
                    break;
                case 4:
                    System.out.println("Você escolheu o Exercício 4.");
                    Exercicio4.executar();
                    break;
                case 5:
                    System.out.println("Você escolheu o Exercício 5.");
                    Exercicio5.executar();
                    break;
                case 6:
                    System.out.println("Você escolheu o Exercício 6.");
                    Exercicio6.executar();
                    break;
                case 7:
                    System.out.println("Você escolheu o Exercício 7.");
                    Exercicio7.executar();
                    break;
                case 8:
                    System.out.println("Você escolheu o Exercício 8.");
                    Exercicio8.executar();
                    break;
                case 9:
                    System.out.println("Você escolheu o Exercício 9.");
                    Exercicio9.executar();
                    break;
                case 10:
                    System.out.println("Você escolheu o Exercício 10.");
                    Exercicio10.executar();
                    break;
                case 11:
                    System.out.println("Você escolheu o Exercício 11.");
                    Exercicio11.executar();
                    break;
                case 12:
                    System.out.println("Você escolheu o Exercício 12.");
                    Exercicio12.executar();
                    break;
                case 13:
                    System.out.println("Você escolheu o Exercício 13.");
                    Exercicio13.executar();
                    break;
                case 14:
                    System.out.println("Você escolheu o Exercício 14.");
                    Exercicio14.executar();
                    break;
                case 15:
                    System.out.println("Você escolheu o Exercício 15.");
                    Exercicio15.executar();
                    break;
                case 16:
                    System.out.println("Você escolheu o Exercício 16.");
                    Exercicio16.executar();
                    break;
                case 17:
                    System.out.println("Você escolheu o Exercício 17.");
                    Exercicio17.executar();
                    break;
                case 18:
                    System.out.println("Você escolheu o Exercício 18.");
                    Exercicio18.executar();
                    break;
                case 19:
                    System.out.println("Você escolheu o Exercício 19.");
                    Exercicio19.executar();
                    break;
                case 20:
                    System.out.println("Você escolheu o Exercício 20.");
                    Exercicio20.executar();
                    break;
                case 21:
                    System.out.println("Você escolheu o Exercício 21.");
                    Exercicio21.executar();
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}