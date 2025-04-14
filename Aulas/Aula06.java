import java.util.Scanner;
public class Aula06 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
         * FUNÇÕES SEM PARÂMETRO E SEM RETORNO
         * Uma função nada mais é do que um bloco de código, o qual damos um nome,
         * e que poderá ser invocado em diferentes partes do nosso código, evitando
         * que tenhamos que reescrever esse bloco de código toda vez que o usarmos.
         * A sintaxe de uma função sem parâmetro e sem retorno é:
         * tipo_de_acesso static void nome_da_funcao() {
         *     // Seu bloco de código
         * }
        */
        //cumprimentaUsuario();
        
        /*
         * FUNÇÕES COM PARÂMETRO E SEM RETORNO
         * Uma função pode receber dados por parâmetro. Esses parâmetros devem ser
         * passados para a função quando ela é invocada, adicionando eles dentro dos
         * parenteses. 
         * A sintaxe para invocar uma função com parâmetro e sem retorno é:
         * tipo_de_acesso static void nome_da_funcao(param1, param2) {
         * }
         * 
         * A sintaxe para criar uma função com parâmetro e sem retorno é:
         * tipo_de_acesso static void nome_da_funcao(tipo_dado param1, tipo_dado param2...){
         * }
        */
        //int n = 13;
        //verificaSeEhPar(n);
        //verificaSeEhPar(198);
        //verificaSeEhPar(315);
        //System.out.println("Digite um numero p/ eu verificar se eh par ou impar: ");
        //verificaSeEhPar(scan.nextInt());
        
        /*
         * FUNÇÕES COM PARÂMETRO E COM RETORNO
         * Caso queiramos que nossa função, após invocada e processada, nos retorne
         * algum valor processado, precisamos definar qual o tipo de retorno dessa
         * função, e também utilizar dentro da função a cláusula return
         * A sintaxe para criar uma função com parâmetro e com retorno é:
         * tipo_de_acesso static tipo_de_retorno nome_da_funcao(){
         * }
        */
        double valoresSomados = somaDoubles(1.18, 3.15, 9.161);
        System.out.println(valoresSomados);
        
        int valoresSubtraidos = subtraiInts(-98, 15);
        System.out.println(valoresSubtraidos);
    }
    
    public static void cumprimentaUsuario() {
        Scanner scanUsuario = new Scanner(System.in);
        System.out.println("Boa noite, qual seu nome?");
        String nomeUsuario = scanUsuario.nextLine();
        System.out.println("Prazer em conhece-lo, " + nomeUsuario);
    }
    
    public static void verificaSeEhPar(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " é par!");
        } else {
            System.out.println(num + " é ímpar...");
        }
    }
    
    public static double somaDoubles(double n1, double n2, double n3) {
        double soma = n1 + n2 + n3;
        return soma;
    }
    
    public static int subtraiInts(int n1, int n2) {
        return n1 - n2;
    }
}