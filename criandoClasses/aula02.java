package criandoClasses;
public class aula02 {
    public static void main(String[]args){
        Caneta c1= new Caneta();
        c1.cor="azul";
        c1.modelo="grafite";
        c1.ponta= 5;
        c1.tampada=false;
        c1.status();
        
        c1.rabiscar();
    }
    
}
