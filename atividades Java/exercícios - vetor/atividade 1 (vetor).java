import java.util.Scanner;

public class Main {

    public static void main(String[] args) 
    {
        Scanner leia = new Scanner(System.in);
        
        int[] n = new int[8];
        int i = 0;
          
        for (i = 0; i < n.length; i++) {
        System.out.println("Digite o " + (i + 1) + "º número: ");
        n[i] = leia.nextInt();
        }

        int a = n[0];
        int b = 0;

        for (i = 1; i < n.length; i++) {
            if (n[i] > a ) {
            a = n[i];
            b = i;
            }
        }
        System.out.println("\nO maior elemento é: " + a);
        System.out.println("Sua posição no vetor é: " + b);
    }
}