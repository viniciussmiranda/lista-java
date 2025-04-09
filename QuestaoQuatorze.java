import java.util.HashSet;
import java.util.Scanner;

// 14. Faça um programa que leia um vetor de 10 posic¸oes e verifique se existem valores iguais e os escreva na tela

public class QuestaoQuatorze {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];
        HashSet<Integer> valoresIguais = new HashSet<>();
        HashSet<Integer> jaVistos = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            vetor[i] = scanner.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (jaVistos.contains(vetor[i])) {
                valoresIguais.add(vetor[i]);
            } else {
                jaVistos.add(vetor[i]);
            }
        }

        for (int valor : valoresIguais) {
            System.out.println(valor);
        }

        scanner.close();
    }
}
