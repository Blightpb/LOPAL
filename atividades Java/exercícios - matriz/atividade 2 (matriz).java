import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[][] clientes = new String[3][2];
        int i = 0;
    
        
        for (i = 0; i < 3; i++) {
            System.out.print("Digite o nome do cliente " + (i + 1) + ": ");
            clientes[i][0] = scanner.nextLine();

            System.out.print("Digite o endereço do cliente " + (i + 1) + ": ");
            clientes[i][1] = scanner.nextLine();
        }
        System.out.println("\nMatriz preenchida: ");
        for (i = 0; i < 3; i++) {
            System.out.println("Nome: " + clientes[i][0]);
            System.out.println("Endereço: " + clientes[i][1]);
            System.out.println();
        }
    }
}
