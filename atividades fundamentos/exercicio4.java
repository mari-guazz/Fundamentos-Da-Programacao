// 2) Crie um array chamado numeros contendo 8 posições, com valores lidos pelo teclado. 
// Após, crie uma função chamada checaImpar() e passe esse array como parâmetro. Sua função checaImpar() 
// deverá imprimir a quantidade de números ímpares contidos neste array.
 // */
 
 import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[8];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número do índice" + (i) + ": ");
            numeros[i] = scanner.nextInt();
        }

        checaImpar(numeros);
    }

    public static void checaImpar(int[] numeros) {
        int contador = 0;
        for (int num : numeros) {
            if (num % 2 != 0) { 
                contador++;
            }
        }
        System.out.println("Quantidade de números ímpares: " + contador);
    }
}

