package lista.pkg3;

import java.util.Scanner;

public class ExercicioE3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        System.out.print("Digite um número: ");
        int num = scn.nextInt();
        System.out.print("TABELA");
        for (int mult = 10; mult > 0; mult--)
        {
            System.out.println(num + " x " + mult + " = " + (num*mult));
        }
    }
}
