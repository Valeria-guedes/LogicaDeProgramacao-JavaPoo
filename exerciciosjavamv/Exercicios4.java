
package exerciciosjavamv;
import java.util.Scanner;

public class Exercicios4 {
   
    public static void main(String[]args){
          int sexo,qtmulheres=0,soma=0,qthomens = 0,i=0;
          float alt,maior=0,menor=10,althomens;
          
          Scanner leia = new Scanner(System.in);
          
                for(i=0;i<5;i++){
                System.out.println("digite seu sexo 1 para feminino e 2 para masculino");
                sexo =leia.nextInt();
                System.out.println("digite sua altura");
                alt=leia.nextInt();
            if(sexo == 1){
                 qtmulheres++;
            }else if(sexo== 2){
                 qthomens++;
                 
                 soma = soma + qthomens;
            }else{
            System.out.println("opção invalida");
            
            }if(alt > maior){
                  maior = alt;
            }else if (menor < alt){
                   menor = alt;
       
       }
          
         althomens = soma/qthomens;
         System.out.println("maior altura do grupo " + maior);
         System.out.println("menor altura do grupo " + menor);
         System.out.println("altura dos homens " + althomens);
         System.out.println("quantidade de mulheres " + qtmulheres);
       
     }
    
    }
    
}
 
