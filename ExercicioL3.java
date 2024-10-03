package lista.pkg3;

import java.util.Scanner;

public class ExercicioL3 {
      public static void main(String[] args) {
        int num;
        Scanner scn = new Scanner (System.in);
        System.out.print("Digite o numero: ");
        num = scn.nextInt();
        System.out.println("A SOMA DE TODOS OS VALORES ATÈ ZERO:");
        long resultado = 0;
        for (int soma = 0; soma <= num; soma++)
            resultado += soma;
        {
            System.out.println(num + " = " + resultado);
        }
            
    }
}

