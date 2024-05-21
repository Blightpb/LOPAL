//atvd 5
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];
        int par = 1;
        int impar = 0;
        int i = 0;

        for (i = 0; i < vetor.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            vetor[i] = scanner.nextInt();

        if (vetor[i] % 2 == 0) {
                par *= vetor[i]; } 
        else { 
                impar += vetor[i]; }
        
        }

        System.out.println("\nO resultado da multiplicação dos números pares é : " + par);
        System.out.println("O resultado da soma dos números ímpares é: " + impar);
    }
}