package lista.pkg3;

import java.util.Scanner;

public class ExercicioS3 {
    public static void main(String[] args) {
        float numero, soma, media;
        int contador = 1;
        
        Scanner scn = new Scanner (System.in);
        System.out.print("Digite a nota:");
        
        numero = scn.nextInt ();
        soma = 0;
        
        while (80 > contador){
            contador++;
            soma += numero;
            System.out.print("Digite outra nota:");
            numero = scn.nextInt();           
        }
        media = soma / contador;
        System.out.println("A média é:" +media);
    }
}

