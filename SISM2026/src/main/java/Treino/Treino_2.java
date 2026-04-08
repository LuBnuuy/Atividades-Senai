package Treino;

import java.util.Scanner;

public class Treino_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num,num2,num3,soma;

        System.out.println("CALCULADORA INICIADA!\nSelecione uma opção:");
        System.out.println("1 - SOMA");
        System.out.println("2 - MULTIPLICAÇÃO");
        System.out.println("3 - DIVISÃO");
        System.out.println("4 - SUBTRAÇÃO");
        num = sc.nextInt();

        if (num == 1) {

            System.out.println("Digite os valores:");
            num2 = sc.nextInt();
            System.out.println("+");
            num3 = sc.nextInt();
            soma = num2 + num3;
            System.out.println(num2+" + "+num3+" = "+soma);
            sc.close();

        }



    }
}
