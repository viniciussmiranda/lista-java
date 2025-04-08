import java.util.Scanner;
// 9. Crie um programa que le 6 valores inteiros pares e, em seguida, mostre na tela os valores lidos na ordem inversa.
public class QuestaoNove {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] pares = new int[6];
        int count = 0;

        while (count < 6) {
            int valor = scanner.nextInt();
            if (valor % 2 == 0) {
                pares[count] = valor;
                count++;
            }
        }

        for (int i = 5; i >= 0; i--) {
            System.out.println(pares[i]);
        }

        scanner.close();
    }
}