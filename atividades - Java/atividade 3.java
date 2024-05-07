import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a nota do aluno: ");
        int nota = scanner.nextInt();
        
        if (nota >= 90 && nota <= 100) {
        System.out.println("A nota do aluno é A.");
        } 
        else if (nota >= 80 && nota < 89) {
        System.out.println("A nota do aluno é B.");
        } 
        else if (nota >= 70 && nota < 79) {
        System.out.println("A nota do aluno é C.");
        } 
        else if (nota >= 60 && nota < 69) {
        System.out.println("A nota do aluno é D.");
        } 
        else if (nota >= 0 && nota < 59) {
        System.out.println("A nota do aluno é F.");
        } 
        else {
        System.out.println("Nota inválida. Por favor, insira um valor entre 0 e 100.");
        }
    
    }
}
