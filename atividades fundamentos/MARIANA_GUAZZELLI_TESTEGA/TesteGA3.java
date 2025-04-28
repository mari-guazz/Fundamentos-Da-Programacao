/**
 * ) Vamos calcular a soma de uma série de números compostos pelo número 3. Para isso, no seu bloco
main, peça para o usuário digitar um número inteiro positivo qualquer (n) e passe esse número como
parâmetro para uma função, a qual deverá imprimir da seguinte maneira:

Exemplo 1 de output:
Digite um número: 2
>> A soma da sequência de números compostos por 3, indo até 2 dígitos é: 36
Obs.: Essa soma é o resultado de 3 + 33 
 */

import java.util.Scanner;

public class TesteGA3{
    public static void main(String[] args){
    
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número inteiro número positivo:");
        int n = scan.nextInt();
        
        calcularSoma(n);
    }
    
    public static void calcularSoma(int n){
        int numeroDigitado = 0;
        int soma = 0;
        
        for (int i = 1; i<= n; i++) {
            numeroDigitado = numeroDigitado * 10 + 3;
            soma += numeroDigitado;
        }
        System.out.println("A soma de números compostos por 3, indo até " + n + " é: " + soma);
    
    }
        
        
}