package Atividades;

import java.util.Scanner;

public class atv_problema_operadora {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int minuto;
        double money;

        System.out.println("Digite os minutos usados.\n(A cada minuto acima de 100, R$2,00 de taxa): ");
        minuto = sc.nextInt();

        if (minuto <= 100) {

            money = 50;

        } else {

            money = 50 + 2 * (minuto - 100);

        }
        System.out.printf("Valor a pagar: R$%.2f%n", money);
        sc.close();
    }
}
