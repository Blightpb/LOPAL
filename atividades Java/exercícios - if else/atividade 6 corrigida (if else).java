import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner leia = new Scanner(System.in);
        int l1 = 0;
        int l2 = 0;  
        int l3 = 0;
        
        System.out.print("Insira o comprimento do primeiro lado do triângulo: ");
       l1 = leia.nextInt();
      
        System.out.print("Insira o comprimento do segundo lado lado do triângulo: ");
       l2 = leia.nextInt();
       
        System.out.print("Insira o comprimento do terceiro lado lado do triângulo: ");
       l3 = leia.nextInt();
       
        if (l1 == l2 && l2 == l3){
        System.out.println("É um triângulo equilátero!");
        }
        else if (l1 == l2 && l2 != l3){
         System.out.println("É um triângulo isósceles!");
        }
        else if (l1 != l2 && l2 != l3){
         System.out.println("É um triângulo escaleno!");
        }
         else if (l1 <= 0 || l2 <= 0 || l3 <= 0 || l1 + l2 <= l3 || l1 + l3 <= l2 || l2 + l3 <= l1){
         System.out.println("É um triângulo não válido!");
        }
         else if (Math.pow(l1, 2) + Math.pow(l2, 2) == Math.pow(l3, 2) ||
                Math.pow(l1, 2) + Math.pow(l3, 2) == Math.pow(l2, 2) ||
                Math.pow(l2, 2) + Math.pow(l3, 2) == Math.pow(l1, 2)) {
                System.out.println("É um triângulo retângulo!"); }
        
        
    }
   }
