
package exerciciosjavamv;
import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {
      int num = 0,i=1,soma = 0;
      Scanner leia=new Scanner(System.in);
    
      while(i==1){
      System.out.println("digite um numero");
      num=leia.nextInt();

      soma=num+soma;
      
    
     System.out.println("desejar digitar outro numero digite 1 para sim e 2 para nao");
      i=leia.nextInt();
      }
       System.out.println("obrigado por participar "+soma);
 
    }
}
