import java.util.Scanner;
import java.util.HashSet;

// 15. Leia um vetor com 20 numeros inteiros. Escreva os elementos do vetor eliminando elementos repetidos

public class questaoQuinze {
    public static void main(String[] args) {
        int[] vetor = new int[20];
        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < 20; i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        System.out.println("Elementos sem repetição:");
        for (int i = 0; i < 20; i++) {
            set.add(vetor[i]);
        }

        for (int num : set) {
            System.out.println(num);
        }

        scanner.close();
    }
}
