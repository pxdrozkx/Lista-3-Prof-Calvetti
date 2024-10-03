package lista.pkg3;
import java.util.Scanner;

public class ExercicioO3 {
    public static void main(String[] args) {
        int maior, numero;
        
        Scanner scn = new Scanner (System.in);
        System.out.print("Digite um numero:");
        
        numero = scn.nextInt ();
        maior = numero;
        
        while (numero > 0){
            System.out.print("Digite outro numero:");
            numero = scn.nextInt ();
            maior = Math.max (numero, maior);
        }
        System.out.println("O Numero maior é: " + maior);
    }
    
}
