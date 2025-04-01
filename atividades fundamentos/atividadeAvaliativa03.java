import java.util.Scanner;

public class atividadeAvaliativa03{
    
    public static void main(String[] args) {
        
        // Solicite dois números inteiros "a" e "b" e imprima na tela se o resultado da subtração entre eles (a - b) resulta em um número positivo ou negativo. Considere o zero como positivo.
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira um número inteiro: ");
        int numA = scan.nextInt();
        System.out.println("Insira outro número inteiro: ");
        int numB = scan.nextInt();
        int subtracao = numA - numB;
        if (subtracao >= 0) {
            System.out.println("O resultado da subtração deses números é positivo!");
        } else {
            System.out.println("O resultado da subtração deses números é negativo!");
        }
       
        }
        
    }