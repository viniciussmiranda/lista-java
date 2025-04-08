
import java.util.Scanner;

// 17. Leia um vetor de 10 posic¸oes e atribua valor 0 para todos os elementos que possuírem
// valores negativos.


public class questaoDezessete {
    public static void main(String[] args) {
     
        int[] vetor = new int[10];
        Scanner scanner = new Scanner(System.in);
        
   
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o valor da posição " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

     
        for (int i = 0; i < 10; i++) {
            if (vetor[i] < 0) {
                vetor[i] = 0; 
            }
        }

        System.out.println("Vetor após substituir valores negativos por 0:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Posição " + (i + 1) + ": " + vetor[i]);
        }

        scanner.close();
    }
}
