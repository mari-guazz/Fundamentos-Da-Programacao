import java.util.Scanner;

public class atividadeAvaliativa{
    
    public static void main(String[] args) {
        
        // Solicite um numero inteiro "n" e imprima na tela se ele é par ou ímpar. Dica: use o operador aritimético módulo.
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira um número inteiro e te direi se ele é par ou ímpar");
        int num = scan.nextInt();
        int resto = num % 2;
        if (resto == 0) {
            System.out.println("O número é par");
        } else {
            System.out.println("O número é ímpar");
        }
            
    
        
        }
        
    }