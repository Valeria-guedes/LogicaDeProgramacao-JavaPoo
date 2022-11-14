
package exerciciosjavamv;
import java.util.Scanner;
public class Exercicios6 {
    public static void main(String[]args){
       int media=0,qtfun,salario,i=0;
       int  cont = 1;
       while(cont==1){ //for(i=1;i<2;i++)
            Scanner leia= new Scanner(System.in);
            System.out.println("digite salario");
            salario = leia.nextInt();
            System.out.println("digite quantidade de funcionarios");
            qtfun = leia.nextInt();
            media=(salario+salario)/qtfun;
         
            System.out.println("tem mais funcionarios digite 1 para sim e 2 para não"); 
            cont=leia.nextInt();
            
            
       }
         
         System.out.println("a media salarial e "+media); 
    }
}
       /* double n1, n2, n3, n4, media;

        n1 = 3453.21;
        n2 = 3498.43;
        n3 = 7902.09;
        n4 = 12932.00;

        media = (n1 + n2 + n3 + n4) / 4;
        System.out.println("A média salarial da empresa é de R$ " + media);*/
    
