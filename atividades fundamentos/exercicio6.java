import java.util.Scanner;
public class exercicio6 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[][] matriz = {{1.5, 2.3, 3.6, 4.4},
                             {6.3, 7.6, 8.0, 9.0},
                             {11.7, 12.6, 13.4, 14.0},
                             {16.0, 17.5, 18.0, 19.3},};
                           
        double[] diagonalSecundaria = retornaDiagonalSecundaria(matriz);

        // Exibindo os valores da diagonal secundária
        System.out.println("Diagonal Secundária:");
        for (double valor : diagonalSecundaria) {
            System.out.println(valor);
        }
    }
    
    public static double[] retornaDiagonalSecundaria(double[][] matriz) {
        double[] diagonal = new double[4];

        // Extraindo os elementos da diagonal secundária
        for (int i = 0; i < matriz.length; i++) {
            diagonal[i] = matriz[i][matriz.length - 1 - i];
        }

        return diagonal;
    }
}