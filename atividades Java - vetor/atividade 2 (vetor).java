//atvd 2
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner leia = new Scanner(System.in);
   
        int[] vetor = new int[10];
        int i = 0;
        int soma = 0;
        
        for (i = 0; i < vetor.length; i++ ) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            vetor [i] = leia.nextInt();
            soma += vetor[i]; //+= serve p somar o vetor armazenado + o proximo 
        } 
         
         System.out.println("A soma de todos os valores é igual a: " + soma);
    }
}
