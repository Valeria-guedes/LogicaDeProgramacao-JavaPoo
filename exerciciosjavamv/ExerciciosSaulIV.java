package exerciciosjavamv;

import java.util.Scanner;

public class ExerciciosSaulIV {

    public static void main(String[] args) {
        int a,soma=0;
        Scanner leia = new Scanner(System.in);
        for(int i=0;i<5;i++){
            
        System.out.println("digite um numero ");
        a=leia.nextInt();
        soma=soma+a;
        }
         System.out.println("A soma dos numeros e :"+soma);
         System.out.println("Codigo finalizado!! "+"\nBoa noite.");
    }
}
