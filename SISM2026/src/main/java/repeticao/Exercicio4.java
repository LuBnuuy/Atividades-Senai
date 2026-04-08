package repeticao;

import java.util.Scanner;

public class Exercicio4 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o sexo (F para feminino, M para masculino): ");
        char sexo = scanner.next().toUpperCase().charAt(0);

        System.out.print("Digite o estado civil (C para casado(a), S para solteiro(a)): ");
        char estadoCivil = scanner.next().toUpperCase().charAt(0);

        int tempoCasada = 0;
        if (sexo == 'F' && estadoCivil == 'C') {
            System.out.print("Informe há quantos anos é casada: ");
            tempoCasada = scanner.nextInt();
        }

        System.out.println("\n--- INFORMAÇÕES ---");
        System.out.println("Nome: " + nome);
        System.out.println("Sexo: " + (sexo == 'F' ? "Feminino" : "Masculino"));
        System.out.println("Estado civil: " + (estadoCivil == 'C' ? "Casado(a)" : "Solteiro(a)"));

        if (sexo == 'F' && estadoCivil == 'C') {
            System.out.println("Tempo de casada: " + tempoCasada + " ano(s)");
        }
    }
}