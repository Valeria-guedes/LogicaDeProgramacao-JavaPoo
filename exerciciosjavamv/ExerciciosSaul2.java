package exerciciosjavamv;

import java.util.Scanner;

public class ExerciciosSaul2 {

    public static void main(String[] args) {
        /*int num=0,i=0,soma=0;
        Scanner leia = new Scanner(System.in);
       for(i=1;i<10;i++){
       System.out.println("digite 10 numeros ");
        num=leia.nextInt();
            if(num%5 == 0 ){
                soma=num+soma;
       }
    }
    System.out.println("a soma dos multiplos de 5 e  "+soma);
  }*/
        float altura = 0, mediah = 0, mediam = 0;
        int sexo, i = 0, contmulher = 0, contHomem = 0;
        Scanner leia = new Scanner(System.in);

        for (i = 0; i < 5; i++) {
            System.out.println("digite o sexo 1 para feminino e 2 para masculino ");
            sexo = leia.nextInt();
            System.out.println("digite sua altura");
            altura = leia.nextFloat();
            if (sexo == 1) {
                
                contmulher++;
                mediam= mediam + altura;
            } else {
                contHomem++;
                mediah += altura;  

            }
        }
        System.out.println("a media de altura das mulheres e : " + mediam / contmulher);
        System.out.println("a media de altura dos homens  e : " + mediah / contHomem);
        if (mediam > mediah) {
            System.out.println("a maior altura do grupo e das mulheres ");
        }else{
             System.out.println("a maior altura do grupo e dos homens  ");
        }
    }
}
