import java.util.Scanner;
import java.util.Arrays;

public class Aula14 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Cria uma matriz 2x3 de inteiros
        int[][] matriz1 = new int[2][3];
        int linhas = matriz1.length;
        int colunas = matriz1[0].length;
        
        // Itera sobre a matriz (IMPORTANTE: GRAVEM ESSA INFORMAÇÃO NA MENTE)
        for (int i = 0; i < linhas; i++) { // Para cada 1 iteração de linha
            for (int j = 0; j < colunas; j++) { // Executamos TODAS iterações de coluna
                System.out.println("Digite um valor para matriz[" + i + "][" + j + "]:" );
                matriz1[i][j] = scan.nextInt();
            }
        }
        
        //visualizaMatriz(matriz1);
        
        // Cria uma matriz 3x3 de Strings já preenchida
        String[][] nomes = {{"Dio", "Goldoni", "Godofredo"}, 
                            {"Pietro", "Denian", "Marina"}, 
                            {"Tinki Winky", "Dipsy", "Lala"}};
                     
        // Imprime os nomes da diagonal principal
        System.out.println(nomes[0][0]);
        System.out.println(nomes[1][1]);
        System.out.println(nomes[2][2]);
        
        // Imprime os nomes da diagonal principal usando um for
        for (int i = 0; i < nomes.length; i++) {
            for (int j = 0; j < nomes[0].length; j++) {
                if (i == j) {
                    System.out.println(nomes[i][j]);
                } else {
                    continue;
                }
            }
        }
    }
    
    // Pretty print da matriz (auxilia a visualizar a matriz)
    public static void visualizaMatriz(int[][] m) {
        for (int[] linha : m) {
            System.out.println(Arrays.toString(linha));
        }
    }
}