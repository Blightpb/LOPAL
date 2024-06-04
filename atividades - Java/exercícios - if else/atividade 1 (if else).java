import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
  
	Scanner leia = new Scanner(System.in); 
    
    int idade = 0;
    

    System.out.print("Digite sua idade: ");
    idade = leia.nextInt(); 
    
  if(idade >= 18 ){
    System.out.println("você já tem idade o suficiente");
    }
  else if(idade <= 18){
    System.out.println("você ainda não tem idade suficiente");
	}
 
    }
  }
