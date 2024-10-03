package lista3;
import java.util.Scanner;

public class ExerB3 {
    public static void main(String[] args) {
        float numero, soma, media;
        int contador = 0;
        
        Scanner scn = new Scanner (System.in);
        System.out.print("Digite o numero:");
        
        numero = scn.nextInt ();
        soma = 0;
        
        while (0 < numero){
            contador++;
            soma += numero;
            System.out.print("Digite outro numero:");
            numero = scn.nextInt();           
        }
        media = soma / contador;
        System.out.println("A média é:" +media);
    }
}