import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[][] clientes = new String[3][4]; // Agora temos 4 colunas para nome, endereço, CPF e telefone
        int i = 0;
    
        for (i = 0; i < 3; i++) {
            System.out.print("Digite o nome do cliente " + (i + 1) + ": ");
            clientes[i][0] = scanner.nextLine();

            System.out.print("Digite o endereço do cliente " + (i + 1) + ": ");
            clientes[i][1] = scanner.nextLine();

            System.out.print("Digite o CPF do cliente " + (i + 1) + ": ");
            clientes[i][2] = scanner.nextLine();

            System.out.print("Digite o telefone do cliente " + (i + 1) + ": ");
            clientes[i][3] = scanner.nextLine();
        }
        
        System.out.println("\nMatriz preenchida: ");
        for (i = 0; i < 3; i++) {
            System.out.println("Nome: " + clientes[i][0]);
            System.out.println("Endereço: " + clientes[i][1]);
            System.out.println("CPF: " + clientes[i][2]);
            System.out.println("Telefone: " + clientes[i][3]);
            System.out.println();
        }
    }
}
