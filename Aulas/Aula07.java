import java.util.Scanner;

public class Aula07 {
    
    public static void main(String[] args) {
        /**
         * ARRAYS:
         * Um array nada mais � do que dar UM NOME S� para m�ltiplos endere�os de mem�ria
         * contendo dados do mesmo tipo.
         * 
         * Sintaxe:
         * tipo_de_dado[] nome_do_array = {valor1, valor2, valor3}; // Cria um array de 3 posi��es
         * 
         * Sintaxe para acesso �s informa��es via �ndice
         * IMPORTANTE: �ndices de arrays e matrizes sempre iniciam em 0 e v�o at� tamanho - 1
         * nome_do_array[�ndice];
        */
       
       // DECLARA��O E INSTANCIA��O DIRETA DE ARRAYS
       String[] alunosGA =    {"Deniam", "Michael", "Marina", "Pietro"}; // Array de strings de 4 posi��es
       double[] notasGA =   {10.0, 10.0, 0.0, 10.0}; // Array de doubles de 4 posi��es
       char[] conceitosGA = {'A', 'A', 'D', 'A'}; // Array de chars de 4 posi��es
       int[] faltasGA =     {0, 0, 5, 0}; // Array de ints de 4 posi��es
       
       // IMPRIMINDO INFORMA��ES CONTIDAS NOS ARRAYS UTILIZANDO SEUS �NDICES
       System.out.println("Aluno no �ndice 3: " + alunosGA[3]);
       System.out.println("Nota no �ndice 2: " + notasGA[2]);
       System.out.println("Conceito no �ndice 0: " + conceitosGA[0]);
       System.out.println("Falta no �ndice 3: " + faltasGA[3]);
       //System.out.println("Tenta buscar aluno no �ndice 6: " + alunos[6]); // Ir� dar erro, pois estou acessando a posi��o 7 de 3
       
       // DECLARA��O COM INSTANCIA��O SUBSEQUENTE
       String[] alunosGB = new String[4]; 
       double[] notasGB = new double[4]; // Cria um array de doubles de 4 posi��es sem valor atribu�do
       char[] conceitosGB = new char[4]; // Cria um array de chars de 4 posi��es sem valor atribu�do
       int[] faltasGB = new int[4]; // Cria um array de ints de 4 posi��es sem valor atribu�do
       System.out.println("O valor padr�o de um String �: " + alunosGB[0]);
       System.out.println("O valor padr�o de um double �: " + notasGB[0]);
       System.out.println("O valor padr�o de um char �: " + conceitosGB[0]);
       System.out.println("O valor padr�o de um int �: " + faltasGB[0]);
       
       // ITERA SOBRE TODO O ARRAY COM UM FOR
       for (int i = 0; i < alunosGA.length; i++) {
           System.out.println("Aluno[" + i + "] = " + alunosGA[i]);
       }
       
       // ITERA SOBRE TODO O ARRAY E DESCOBRE QUEM � O MAIS VELHO
       int[] idade = {34, 40, 26, 18, 17};
       int maisVelho = 0;
       int maisNovo = 999;
       for (int i = 0; i < idade.length; i++) {
           if (idade[i] > maisVelho)
               maisVelho = idade[i];
            
           if (idade[i] < maisNovo)
               maisNovo = idade[i];
       }
       System.out.println("A maior idade contida no array �: " + maisVelho);
       System.out.println("A menor idade contida no array �: " + maisNovo);
       
       // ATRIBU� NOVOS VALORES A UM ARRAY EXISTENTE
       Scanner scan = new Scanner(System.in);
       for (int i = 0; i < notasGB.length; i++) {
           System.out.println("Digite o nome do aluno no �ndice " + i);
           alunosGB[i] = scan.next();
           System.out.println("Digite a nota do aluno no �ndice " + i);
           notasGB[i] = scan.nextDouble();
       }
       
       // Imprime nome e nota dos alunos do GB
       for (int i = 0; i < notasGB.length; i++) {
           System.out.print("O aluno no �ndice " + i + " se chama " + alunosGB[i]);
           System.out.print(" e sua nota no GB foi " + notasGB[i]);
           System.out.println();
       }
       
       // Calcula a m�dia do GB dos alunos 
       double media = 0;
       double soma = 0;
       int qtAlunos = notasGB.length;
       for (int i = 0; i < notasGB.length; i++) {
           soma += notasGB[i];
       }
       
       media = soma / qtAlunos;
       System.out.println("A m�dia final do GB � de: " + media);
    }
}