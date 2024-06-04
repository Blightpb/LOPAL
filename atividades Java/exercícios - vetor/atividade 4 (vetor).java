//atvd 4
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int[] numeros = new int[5];
        int i = 0;

        for (i = 0; i < numeros.length; i++) {
        System.out.println("Digite o " + (i + 1) + "º número: ");
            numeros[i] = leia.nextInt();
        }
        System.out.println("\nNúmeros primos no vetor: ");
        for (int num : numeros) {
            if (isPrimo(num)) {
                System.out.println(num);
            }
        }
    }
    public static boolean isPrimo(int numero) {
            if (numero <= 1) {
            return false; }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false; }
        }
        return true;
    }
}
