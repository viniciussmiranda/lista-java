import java.util.Scanner;
// 8. Crie um programa que le 6 valores inteiros e, em seguida, mostre na tela os valores lidos na ordem inversa.

public class QuestaoOito {
    public static void main(String[] args) {
    
        int[] valores = new int[6];
        Scanner scanner = new Scanner(System.in);
     
        for (int i = 0; i < 6; i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            valores[i] = scanner.nextInt();
        }

        
        System.out.println("Valores na ordem inversa:");
        for (int i = 5; i >= 0; i--) {
            System.out.println(valores[i]);
        }

        scanner.close();
    }
}
