import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner leia = new Scanner(System.in);
        int l1 = 0;
        int l2 = 0;  
        int l3 = 0;
        int soma = 0;
    
        
        System.out.print("Insira o comprimento do primeiro lado do triângulo: ");
       l1 = leia.nextInt();
      
        System.out.print("Insira o comprimento do segundo lado lado do triângulo: ");
       l2 = leia.nextInt();
       
        System.out.print("Insira o comprimento do terceiro lado lado do triângulo: ");
       l3 = leia.nextInt();
       
       soma = l1 + l2;
       
        if (l1 == l2 && l2 == l3){
        System.out.println("É um triângulo equilátero!");
        }
        else if (l1 == l2 && l2 != l3){
         System.out.println("É um triângulo isósceles!");
        }
        else if (l1 != l2 && l2 != l3){
         System.out.println("É um triângulo escaleno!");
        }
         else if (soma < l3){
         System.out.println("É um triângulo não válido!");
        }
        
        
    }
   }
