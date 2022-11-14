package exerciciosjavamv;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        int a, b, c, d, e, cont = 0, rep = 0;
        Scanner leia = new Scanner(System.in);
       
        System.out.println("digite 1 numero:");
        a = leia.nextInt();
        System.out.println("digite 1 numero:");
        b = leia.nextInt();
        System.out.println("digite 1 numero:");
        c = leia.nextInt();
        System.out.println("digite 1 numero:");
        d = leia.nextInt();
        System.out.println("digite 1 numero:");
        e = leia.nextInt();
        System.out.println("valor da variavel A : " + a + " ,valor da variavel b "
             + ": " + b + ", valor da variavel c : " + c + 
             " valor da variavel d : " + d +" valor da variavel e :" + e + ".\n");
    if (a == b || a == c || a == d || a == e) {
            rep = a;
            cont++;
        }
     if (b == a || b == c || b == d || b == e) {
            rep = b;
            cont++;
        }
     if (c == b || c == a || c == d || c == e) {
            rep = c;
            cont++;
        }
     if (d == b || d == c || d == a || d == e) {
            rep = d;
            cont++;
        }
     if(e == b || e == c || e == d || e == a){
            rep = e;
            cont++;
        }
        
       if (rep !=0){ 
         
        System.out.println("o numero repetido foi :" + rep);
        
        System.out.println("o numero foi repetido: " + cont);

        System.out.println("Finalizado");
     }
    }
}
   
