package lista.pkg3;
import java.util.Scanner;


public class ExercicioK3 {
    public static void main(String[] args) {
        float maior, menor, numero, dia = 1;
        
        Scanner scn = new Scanner (System.in);
        System.out.print("Qual o Saldo? ");
        
        numero = scn.nextFloat ();
        maior = numero;
        menor = numero;
        
        while (dia <= 29){
            dia++;
            System.out.print("Qual o Saldo? ");
            numero = scn.nextFloat ();
            maior = Math.max (numero, maior);
            menor = Math.min(numero, menor);
        }
        System.out.println("O Menor saldo foi: " + menor);
        System.out.println("O Maior saldo foi: " + maior);
    }
    
}
