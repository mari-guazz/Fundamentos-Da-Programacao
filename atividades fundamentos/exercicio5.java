import java.util.Scanner;
public class exercicio5 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] matriz1 = {{1, 2, 3, 4, 5},
                           {6, 7, 8, 9, 10},
                           {11, 12, 13, 14, 15},
                           {16, 17, 18, 19, 20},
                           {21, 22, 23, 24, 25}};
                           
        calculaMatriz(matriz1);                   
               
    }
    
    public static void calculaMatriz(int[][] matriz1){
        int somaImpares = 0;
        int[] somaLinhas = new int[5];
        int[] somaColunas = new int[5];
        
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                int valor = matriz1[i][j];

           if (valor % 2 != 0) {
                    somaImpares += valor;
                }
                
                somaLinhas[i] += valor;
                somaColunas[j] += valor;
            }
        }
        System.out.println("Soma dos números ímpares: " + somaImpares);
        
        System.out.println("\nSoma de cada coluna:");
        for (int i = 0; i < somaColunas.length; i++) {
            System.out.println("Coluna " + (i + 1) + ": " + somaColunas[i]);
        }
        
        System.out.println("\nSoma de cada linha:");
        for (int i = 0; i < somaLinhas.length; i++) {
            System.out.println("Linha " + (i + 1) + ": " + somaLinhas[i]);
        }
    }
}