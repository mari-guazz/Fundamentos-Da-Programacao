public class exercicio5e6corrig {    
    
    public static void main(String[] args) {          
        int[][] m = { {1, 2, 3, 4, 5}, 
                      {1, 2, 3, 4, 10}, 
                      {1, 2, 3, 4, 20}, 
                      {1, 2, 3, 4, 30}, 
                      {1, 2, 3, 4, 40} };
        calculaMatriz(m);
        
        double[][] m2 = { {1, 2, 3, 4}, 
                          {1, 2, 3, 4}, 
                          {1, 2, 3, 4}, 
                          {1, 2, 3, 4} };
        
        
        double[] arrayDeRetorno = diagonalSecundaria(m2);
        for (int i = 0; i < arrayDeRetorno.length; i++)
            System.out.print(arrayDeRetorno[i] + " ");
        
        System.out.println();
    }
    
    public static void calculaMatriz(int[][] m) {
        int somaImpar = 0;
        int linhas = m.length;
        int colunas = m[0].length;
        
        // Itera sobre a matriz
        for (int i = 0; i < linhas; i++) {
            int somaLinha = 0;
            int somaColuna = 0;
            
            for (int j = 0; j < colunas; j++) {
                somaLinha += m[i][j];
                somaColuna += m[j][i];
                
                // Verifica se é ímpar, se for, soma
                if (m[i][j] % 2 != 0) {
                    somaImpar += m[i][j];
                }
            }
            
            System.out.println("Soma linha " + i + " = " + somaLinha);
            System.out.println("Soma coluna " + i + " = " + somaColuna + "\n");
        }
        
    }
    
    public static double[] diagonalSecundaria(double[][] m) {
        int diagonalSec = m[0].length - 1;
        double[] retorno = new double[4];
        
        for (int i = 0; i < m.length; i++) {
            retorno[i] = m[i][diagonalSec];
            diagonalSec--;
        }
        
        return retorno;
    }
    
}