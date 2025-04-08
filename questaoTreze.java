import java.util.Scanner;

// 13. Fazer um programa para ler 5 valores e, em seguida, mostrar a posição onde se encontram o maior e o menor valor.

public class questaoTreze {
    public static void main(String[] args) {
        int[] valores = new int[5];
        Scanner scanner = new Scanner(System.in);
        int maior, menor;
        int posMaior = 0, posMenor = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            valores[i] = scanner.nextInt();
        }

        maior = valores[0];
        menor = valores[0];

        for (int i = 1; i < 5; i++) {
            if (valores[i] > maior) {
                maior = valores[i];
                posMaior = i;
            }
            if (valores[i] < menor) {
                menor = valores[i];
                posMenor = i;
            }
        }

        System.out.println("Maior valor: " + maior + " na posição " + (posMaior + 1));
        System.out.println("Menor valor: " + menor + " na posição " + (posMenor + 1));

        scanner.close();
    }
}
