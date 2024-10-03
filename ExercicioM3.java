package lista.pkg3;

import java.util.Scanner;

public class ExercicioM3 {
    public static void main(String[] args) {
        float numero, soma, media, maior, menor;
        int contador = 1;
        
        Scanner scn = new Scanner (System.in);
        System.out.print("Digite um numero:");
        
        numero = scn.nextInt ();
        soma = 0;
        maior = numero;
        menor = numero;
                
        while (50 > contador){
            contador++;
            soma += numero;
            System.out.print("Digite outro numero:");
            numero = scn.nextInt();    
            maior = Math.max (numero, maior);
            menor = Math.min(numero, menor);
        }
        media = soma / contador;
        System.out.println("A média é:" + media + "\nO maior numero é" + maior + "\nO menor numero é" + menor);
    }
}

