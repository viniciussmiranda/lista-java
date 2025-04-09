import java.util.Scanner;

// 2. Crie um programa que lê 6 valores inteiros e, em seguida, mostre na tela os valores lidos. 

public class QuestaoDois {
    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);

      
        int[] valores = new int[6];

        System.out.println("Por favor, insira 6 valores inteiros:");

    
        for (int i = 0; i < 6; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            valores[i] = scanner.nextInt();
        }

        System.out.println("\nValores lidos:");
        for (int i = 0; i < 6; i++) {
            System.out.println(valores[i]);
        }

        scanner.close();
    }
}
