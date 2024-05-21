//atvd 3 
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
  
	Scanner leia = new Scanner(System.in); 
    
    int n1 = 0;
    int n2 = 0;
    int n3 = 0;
    int n4 = 0;
    int n5 = 0;
    
    System.out.print("Digite o 1º número: ");
    n1 = leia.nextInt(); 
    
    System.out.print("Digite o 2º número: ");
    n2 = leia.nextInt(); 
    
    System.out.print("Digite o 3º número: ");
    n3 = leia.nextInt(); 
    
    System.out.print("Digite o 4º número: ");
    n4 = leia.nextInt(); 
    
    System.out.print("Digite o 5º número: ");
    n5 = leia.nextInt(); 
    
    System.out.print("Os vetores invertidos: " + n5 + ", "+ n4 + ", "+ n3 + ", "+ n2 + ", " + n1);
  }
}
    