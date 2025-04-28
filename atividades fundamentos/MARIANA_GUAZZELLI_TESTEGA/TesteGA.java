/**
 * Na função main, peça para o usuário 2 números inteiros positivos (num1 e num2) e passe eles como
parâmetro para uma função, a qual deverá imprimir na tela todos os números primos existentes entre o
primeiro número digitado e o segundo (ambos números inclusos).
 */

import java.util.Scanner;

public class TesteGA{
    public static void main(String[] args){
    
        System.out.println("Digite dois números inteiros para descobrir os primos números entre eles");
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        int num1 = scan.nextInt();
        System.out.println("Digite o segundo número:");
        int num2 = scan.nextInt();
        
        imprimirPrimos(num1, num2);
    }
    
    public static void imprimirPrimos(int num1, int num2){
        int inicio = Math.min(num1, num2);
        int fim = Math.max(num1, num2);
        System.out.println("Os números  primos presentes entre " + inicio + "e " + fim + ":");
        
        for (int i = inicio; i <= fim; i++) {
            if (ehPrimo(i)) {
                System.out.print(i + ", ");
            }
        }
    
        }
        
    public static boolean ehPrimo(int n) {
            if (n < 2) return false;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) return false;
            }
            return true;
        }
    }
