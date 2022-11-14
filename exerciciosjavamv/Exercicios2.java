package exerciciosjavamv;

import java.util.Scanner;

public class Exercicios2 {

    public static void main(String[] args) {
        int dia;
        double i = 1;
        Scanner leia = new Scanner(System.in);
        while (i == 1) {
            System.out.println("digite um numero de 1 a 7 corresponte aos dias da semana");
            dia = leia.nextInt();

            if (dia == 1) {
                System.out.println("segunda");
            } else if (dia == 2) {
                System.out.println("terça");
            } else if (dia == 3) {
                System.out.println("quarta");
            } else if (dia == 4) {
                System.out.println("quinta");
            } else if (dia == 5) {
                System.out.println("sexta");
            } else if (dia == 6) {
                System.out.println("sabado");
            } else if (dia == 7) {
                System.out.println("dominga");
            } else {
                System.out.println("não e um dia valido");
            }
            System.out.println("voce que continuar digite 1 para sim 2 para não ?");
            i = leia.nextInt();
        }
        System.out.println("Fim ");
    }
}
