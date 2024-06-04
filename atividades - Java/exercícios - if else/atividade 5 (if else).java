import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
  
	Scanner leia = new Scanner(System.in); 
    
    int numero = 0;
    
    System.out.print("Digite um número: ");
     numero = leia.nextInt(); 
    
    if (numero > 0 ){
    System.out.println("Esse número é positivo");
    }
    else if (numero < 0){
    System.out.println("Esse número é negativo");
    }
    else if (numero == 0) {
    System.out.println("Esse número é igual a zero");
    }
  }
}
