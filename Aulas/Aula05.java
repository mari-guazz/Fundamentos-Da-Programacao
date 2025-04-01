import java.util.Scanner;

public class Aula05{
    
    public static void main(String[] args) {
        /*
         * ESTRUTURA DE REPETIÇÃO - FOR
         * Serve para repetirmos um bloco de código um número específico de vezes.
         * Normalmente, faz uso de uma variável contadora, que se encarrega de contar o
         * número de execuções do loop for. Essa variável contadora costuma se chamar i, 
         * e costuma ser incrementada a cada iteração.
         * A sintaxe de um loop for simples é:
         *      for (int i = 0; i < algumNumero; i++) {
         *          // seu bloco de código aqui
         *      }
         */
        
        Scanner scan = new Scanner(System.in);
        //IMPRIME DE 0 A 10
        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " ->");
        }
        System.out.println("/n");
        
        //Imprime de 0 a 100, em incrementos de 10
        
        for (int i = 0; i <= 100; i+= 10 ) {
            System.out.println(i + " ->");
        }
        
        //Imprime de 100 a 1, em idecrementos de 25
        
        for (int i = 100; i <= 100; i -= 25) {
            System.out.println(i);
            if (i >= 25) {
                System.out.print(" -->");
            }
        }
        
        // Solicita um número para o usuário e retorna a tabuada deste número
        // System.out.println("/nDigite um valor para calcular sua tabuada: ");
         // int tabuada = scan.nextInt();
         // for (int i = 1; i <= 10; i++) {
              // System.out.println(tabuada + " x " + i + " = " + (tabuada * i));
               // System.out.printf("%d x %d = %d", tabuada, i, (tabuada * i));
         // }
        
         // Imprime de 1 a 10, com exceção do valor 3, usando if
         System.out.println("/n");
         for (int i = 1; i <= 10; i++) {
             if (i != 3) {
             System.out.println(i + " -> ");
            }
         }
         
         //Execução encadeada de for (for dentro de for)
         // System.out.println("/n");
         // for (int i = 1; i <= 10; i++) {
             // System.out.println("Valor de i: " + i);
             // for (int j = 1; j <= 5; j++) {
                 // System.out.println("/tValor de j: " + j);
             // }
         // }
         
         /*
          * ESTRUTURA DE REPETIÇÃO - WHILE
          * Serve para repetirmos um bloco de código enquanto uma condição for
          * verdadeira (ou falsa, dependendo da implementação)
          * Também permitirá, assim como um FOR, a execução de um bloco de código
          * por um número específico de vezes, fazendo uso de uma variável contadora,
          * normalmente denotado por i.
          * Sua sintaxe é:
          *     while (algumaCondição) { 
          *         //bloco de código
          *     }
          */
         
         // Imprimir de 0 a 10 utiliuzando while
         System.out.println("/n");
         int i = 0;
         while (i <= 10) {
             System.out.print(i + " -> ");
             i++;
         }
         
         //Imprimir de 100 a 0 utilizando while, com exceção do 70
         System.out.println("/n");
         i = 100;
         while (i  >= 0) {
             if ( i != 70) {
             System.out.print(i + " -> ");
            }
            
             i -= 10;
         }
         
         //Imprimir de 100 a 0 utilizando while, com exceção do 70, e o break
         System.out.println("/n");
         i = 100;
         while (i  >= 0) {
             if ( i == 70) {
                 break;
            }
            System.out.print(i + " -> ");
             i -= 10;
         }
         
         //Jogo bobo de adivinha
         int numImaginado = 42;
         System.out.println("/nQual número estou pensando, entre 1 e 100? ");
         int tentativa = scan.nextInt();
         
         while (tentativa != numImaginado) {
             System.out.println("Errou otário. Tenta de novo: ");
             tentativa = scan.nextInt();
         }
         
         System.out.println("Acertô, mizerávi ");
}

}