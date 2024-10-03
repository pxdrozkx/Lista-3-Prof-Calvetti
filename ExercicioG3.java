package lista.pkg3;

import java.util.Scanner;

public class ExercicioG3 {
    public static void main(String[] args) {
        int num;
        Scanner scn = new Scanner (System.in);
        System.out.print("Digite o numero a ser fatorado: ");
        num = scn.nextInt();
        System.out.println("TABELA FATORIAL");
        long fatorial = 1;
        for (int mult = 1; mult <= num; mult++)
            fatorial *= mult;
        {
            System.out.println(num + "!" + " = " + fatorial);
        }
            
    }
}
