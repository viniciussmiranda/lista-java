import java.util.Scanner;

// 7. Escreva um programa que leia 10 numeros inteiros e os armazene em um vetor. Imprima o vetor, o maior elemento e a posição que ele se encontra. 

public class QuestaoSete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];
        int maior = Integer.MIN_VALUE;
        int posicao = -1;

        for (int i = 0; i < 10; i++) {
            vetor[i] = scanner.nextInt();
            if (vetor[i] > maior) {
                maior = vetor[i];
                posicao = i;
            }
        }

        for (int num : vetor) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Maior elemento: " + maior);
        System.out.println("Posição: " + posicao);

        scanner.close();
    }
}