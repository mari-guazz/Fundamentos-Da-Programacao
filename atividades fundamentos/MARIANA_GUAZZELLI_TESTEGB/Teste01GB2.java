import java.util.Scanner;

public class Teste01GB2 {
    
    public static void main(String[] args) {
        
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {5, 6, 7, 8};
        
        int resultado = produtoEscalar(array1, array2);
        System.out.println("O produto escalar entre os dois vetores é " + resultado);
    }
    
    public static int produtoEscalar(int[] array1, int[] array2) {
        int soma = 0; 
        for (int i = 0; i < array1.length; i++) {
            soma += array1[i] * array2[i];
        }
        
        return soma;
    }
}