/**
 *  Na função main, peça para o usuário digitar um número inteiro positivo qualquer (num) e passe esse
número como parâmetro para uma função, a qual deverá retornar a quantidade de dígitos nesse
número. Sua função main deverá imprimir: O número < > é composto por < > dígitos.
DICA 1: Idealmente, utilize o loop while.
DICA 2: Lembre-se que, no Java, um número como 84129 / 10 = 8412, o qual dividido por 10 é 841, o
qual dividido por 10 é 84, o qual divido por 10 é 8, o qual divido por 10 é 0...mais do que isso, eu estaria
dando a resposta.
 */


import java.util.Scanner;

public class TesteGA2{
    public static void main(String[] args){    
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número inteiro positivo:");
        int num = scan.nextInt();
        
        int quantidade = contarDigitos(num);
        
        System.out.println("O número " + num + " é composto por " + quantidade + " dígitos.");
    }
    
    public static int contarDigitos (int num){
    Scanner scan = new Scanner(System.in);
    
    int contador = 0;
     if (num == 0) {
         return 1;
     }
     while (num > 0) {
         num /= 10;
         contador++;
     }
        return contador;
            
        }
    }
