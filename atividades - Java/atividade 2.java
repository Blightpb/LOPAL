import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int  numero1 = 0;
        int  numero2 = 0;
  
      System.out.print("Insira o primeiro número: ");
       numero1 = scanner.nextInt();
      
      System.out.print("Insira o segundo número: ");
       numero2 = scanner.nextInt();
      
      if (numero1 > numero2){
      System.out.println("o maior número é: " + numero1 + " e o menor é: " + numero2 );
      } 
      else if (numero2 > numero1){
      System.out.println("o maior número é " + numero2 + " e o menor é " + numero1);
      }
      else if (numero1 == numero2){
      System.out.println("Ambos os números são iguais.");
      }
      
    }
}
