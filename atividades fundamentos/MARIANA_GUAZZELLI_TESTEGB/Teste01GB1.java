/*
 * Na sua função main, crie dois arrays de inteiros de 7 posições, chamados array1 e array2. Ambos
devem ter todos seus elementos lidos do teclado. Após isso, crie uma função chamada verificaIgualdade
que recebe ambos os arrays como parâmetro e retorne true caso ambos sejam iguais, ou false caso
sejam diferentes.
 */ 

import java.util.Scanner;

public class Teste01GB1 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int[] array1 = new int[7];
        int[] array2 = new int[7];
        
        System.out.println("Digite os elementos para o primeiro array");
        for (int i = 0; i < 7; i++) {
            array1[i] = scan.nextInt();           
        }
        
        System.out.println("Agora insira os elementos para o segundo array");
        for (int i = 0; i < 7; i++) {
            array2[i] = scan.nextInt();
        }
        
        boolean igual = verificaIgualdade(array1, array2);
        System.out.println("Os arrays são iguais?" + igual);
        
    }
    
    public static boolean verificaIgualdade(int[] array1, int[] array2) {
        if (array1.length != array2.length){
            return false;
        }
        
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        
        return true;
    }
}