package exerciciosjavamv;

import java.util.Scanner;

public class DatadeNascimento {

    public static void main(String[] args) {
        int a, b, soma=0,i=1;
   
        Scanner leia = new Scanner(System.in);
       
        while(i==1){
        System.out.println("digite 1 numero");
        a = leia.nextInt();
        System.out.println("digite 1 numero");
        b = leia.nextInt();
        soma = a + b;
        System.out.println("a soma e : " + soma);
        System.out.println("DIGITE 1 PARA REPETIR A SOMA OU 2 PARA FINALIZAR");
        i=leia.nextInt();
    }
       
}
}