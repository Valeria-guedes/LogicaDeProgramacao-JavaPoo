package exerciciosjavamv;
import java.util.Scanner;
public class ExercicioSauldia10 {
    public static void main(String[] args) {
   /* int i=10;
    for(i=10;i<100;i++)
        if(i%2 ==0){
            System.out.println("os numeros impares sao " +i);*/
       /*int i=11;
       for(i=11;i<111;i+=10){
       
            System.out.println("A sequencia e " +i);*/
        float num,maior = 0,i=1;
        Scanner leia = new Scanner(System.in);
        for(i=1;i<10;i++){
        System.out.println("digite 10 numeros");
        num=leia.nextFloat();
        if(num > maior){
            maior=num;
            }
       }
           System.out.println("o maior e "+ maior );
    }
}
    

    

