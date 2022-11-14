      /* Exercicio 01
        int idade=0;
        Scanner leia = new Scanner(System.in);
        System.out.println("digite sua idade");
        idade=leia.nextInt();
        if(idade >= 18){
            System.out.println("maior de idade");
        }else if(idade < 18){
        System.out.println("menor de idade")
    }*/
/*   Exercicio 02
    double valor;
    Scanner leia = new Scanner(System.in);
    System.out.println("digite um valor");
    valor=leia.nextInt();
    if(valor <= 10){
        System.out.println("COMPRE");
    }else if(valor >= 11 && valor <= 15){
        System.out.print("pesquise mais ");
    }else{
        System.out.println("não compre");
    }*/
package exerciciosjavamv;
/**@author valeria*/
import java.util.Scanner;
public class Exercicios3 {
    public static void main(String[] args) {
     int cont=1;
    int max=10;
     System.out.println("contando ate " + max);
      while(cont <= max){
         System.out.println("digite um numero  "+cont);  
       cont++; 
       }
         
   }
}
