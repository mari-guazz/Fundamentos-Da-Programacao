import java.util.Scanner;

public class Aula07 {
    
    public static void main(String[] args) {
        /**
         * ARRAYS:
         * Um array nada mais é do que dar UM NOME SÓ para múltiplos endereços de memória
         * contendo dados do mesmo tipo.
         * 
         * Sintaxe:
         * tipo_de_dado[] nome_do_array = {valor1, valor2, valor3}; // Cria um array de 3 posições
         * 
         * Sintaxe para acesso às informações via índice
         * IMPORTANTE: Índices de arrays e matrizes sempre iniciam em 0 e vão até tamanho - 1
         * nome_do_array[índice];
        */
       
       // DECLARAÇÃO E INSTANCIAÇÃO DIRETA DE ARRAYS
       String[] alunosGA =    {"Deniam", "Michael", "Marina", "Pietro"}; // Array de strings de 4 posições
       double[] notasGA =   {10.0, 10.0, 0.0, 10.0}; // Array de doubles de 4 posições
       char[] conceitosGA = {'A', 'A', 'D', 'A'}; // Array de chars de 4 posições
       int[] faltasGA =     {0, 0, 5, 0}; // Array de ints de 4 posições
       
       // IMPRIMINDO INFORMAÇÕES CONTIDAS NOS ARRAYS UTILIZANDO SEUS ÍNDICES
       System.out.println("Aluno no índice 3: " + alunosGA[3]);
       System.out.println("Nota no índice 2: " + notasGA[2]);
       System.out.println("Conceito no índice 0: " + conceitosGA[0]);
       System.out.println("Falta no índice 3: " + faltasGA[3]);
       //System.out.println("Tenta buscar aluno no índice 6: " + alunos[6]); // Irá dar erro, pois estou acessando a posição 7 de 3
       
       // DECLARAÇÃO COM INSTANCIAÇÃO SUBSEQUENTE
       String[] alunosGB = new String[4]; 
       double[] notasGB = new double[4]; // Cria um array de doubles de 4 posições sem valor atribuído
       char[] conceitosGB = new char[4]; // Cria um array de chars de 4 posições sem valor atribuído
       int[] faltasGB = new int[4]; // Cria um array de ints de 4 posições sem valor atribuído
       System.out.println("O valor padrão de um String é: " + alunosGB[0]);
       System.out.println("O valor padrão de um double é: " + notasGB[0]);
       System.out.println("O valor padrão de um char é: " + conceitosGB[0]);
       System.out.println("O valor padrão de um int é: " + faltasGB[0]);
       
       // ITERA SOBRE TODO O ARRAY COM UM FOR
       for (int i = 0; i < alunosGA.length; i++) {
           System.out.println("Aluno[" + i + "] = " + alunosGA[i]);
       }
       
       // ITERA SOBRE TODO O ARRAY E DESCOBRE QUEM É O MAIS VELHO
       int[] idade = {34, 40, 26, 18, 17};
       int maisVelho = 0;
       int maisNovo = 999;
       for (int i = 0; i < idade.length; i++) {
           if (idade[i] > maisVelho)
               maisVelho = idade[i];
            
           if (idade[i] < maisNovo)
               maisNovo = idade[i];
       }
       System.out.println("A maior idade contida no array é: " + maisVelho);
       System.out.println("A menor idade contida no array é: " + maisNovo);
       
       // ATRIBUÍ NOVOS VALORES A UM ARRAY EXISTENTE
       Scanner scan = new Scanner(System.in);
       for (int i = 0; i < notasGB.length; i++) {
           System.out.println("Digite o nome do aluno no índice " + i);
           alunosGB[i] = scan.next();
           System.out.println("Digite a nota do aluno no índice " + i);
           notasGB[i] = scan.nextDouble();
       }
       
       // Imprime nome e nota dos alunos do GB
       for (int i = 0; i < notasGB.length; i++) {
           System.out.print("O aluno no índice " + i + " se chama " + alunosGB[i]);
           System.out.print(" e sua nota no GB foi " + notasGB[i]);
           System.out.println();
       }
       
       // Calcula a média do GB dos alunos 
       double media = 0;
       double soma = 0;
       int qtAlunos = notasGB.length;
       for (int i = 0; i < notasGB.length; i++) {
           soma += notasGB[i];
       }
       
       media = soma / qtAlunos;
       System.out.println("A média final do GB é de: " + media);
    }
}