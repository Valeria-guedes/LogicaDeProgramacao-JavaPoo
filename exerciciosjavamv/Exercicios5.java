
package exerciciosjavamv;
/* @author valeria*/
import java.util.Scanner;
public class Exercicios5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int i=1;
    int num=0;
    Scanner leia= new Scanner(System.in);
    System.out.println("digite um numero");
    num=leia.nextInt();
    for(i=1;i<=10;i++){
      System.out.println(num + "x" + i + " = "+ (num*i));  
    }
    }
    
    
}
