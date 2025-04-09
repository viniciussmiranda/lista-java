import java.util.Scanner;

// 5. Leia um vetor de 10 posições. Contar e escrever quantos valores pares ele possui.

public class QuestaoCinco {
    public static void main(String[] args) {
   
        int[] vetor = new int[10];
        int contadorPares = 0;
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o valor da posição " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

      
        for (int i = 0; i < 10; i++) {
            if (vetor[i] % 2 == 0) {
                contadorPares++;
            }
        }

    
        System.out.println("O vetor possui " + contadorPares + " valores pares.");
        
        scanner.close();
    }
}
