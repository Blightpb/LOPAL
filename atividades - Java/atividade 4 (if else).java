import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner leia = new Scanner(System.in);
        int n1 = 0;
        int n2 = 0;  
        int n3 = 0;
        int soma = 0;
        int media = 0;
        
        System.out.print("Insira a primeira nota: ");
       n1 = leia.nextInt();
      
        System.out.print("Insira a segunda nota: ");
       n2 = leia.nextInt();
       
        System.out.print("Insira a terceira nota: ");
       n3 = leia.nextInt();
       
       
        soma = n1 + n2 + n3;
        media = soma / 3; 
       
       if (media >= 7) {
       System.out.println("Aprovado!");
       }
       else if (media < 7 ) {
       System.out.println("Reprovado!"); 
       }
     }
   }
