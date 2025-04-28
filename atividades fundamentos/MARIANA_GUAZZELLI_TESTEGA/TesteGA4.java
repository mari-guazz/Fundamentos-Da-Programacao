/**
 * Na função main, peça para o usuário digitar um número inteiro positivo qualquer (n) e passe esse
número como parâmetro para uma função denominada somar_inversa(n), a qual retorna o resultado
da seguinte soma: 1/1 + 1/2 + 1/3 + ... + 1/n. Imprima o resultado no bloco main.
Exemplo 1 de Output:
Digite um número: 5
>> O resultado da soma de 1/1 + 1/2 + 1/3 + 1/4 + 1/5 é: 2.283333333
 */

import java.util.Scanner;

public class TesteGA4{
    public static void main(String[] args){
    
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número inteiro número positivo:");
        int n = scan.nextInt();
        
        double resultado = somar_inversa(n);
        
        System.out.println("O resultado da soma é: " + resultado);
        
    }
    
    public static double somar_inversa(int n) {
    double soma = 0.0;
    int i = 1;
    
    while( i <= n) {
        soma += 1.0 / i;
        i++;
    }
    
    return soma;
    }   
}