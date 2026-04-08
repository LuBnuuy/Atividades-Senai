package Atividades;

import java.util.Scanner;

public class atv_bomdia_tarde_noite {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int hora;

        System.out.println("Digite um horário válido:");
        hora = sc.nextInt();

        if (hora < 12) {
            System.out.println("Bom dia!");

        } else if (hora > 24) {
            System.out.println("Hora invalida!");

        } else if (hora < 18) {
            System.out.println("Boa tarde!");

        } else {
            System.out.println("Boa noite!");
        }
        sc.close();

    }
}
