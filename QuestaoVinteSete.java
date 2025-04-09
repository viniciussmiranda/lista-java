import java.util.Scanner;

// 27. Leia 10 numeros inteiros e armazene em um vetor. Em seguida escreva os elementos que sao primos e suas respectivas posições no vetor.

public class QuestaoVinteSete {
  public static void main(String[] args) {
        int[] vetor = new int[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        System.out.println("Números primos e suas posições:");
        for (int i = 0; i < 10; i++) {
            if (isPrimo(vetor[i])) {
                System.out.println("Valor primo: " + vetor[i] + " na posição " + (i + 1));
            }
        }

        scanner.close();
    }

    public static boolean isPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}