import java.util.Scanner;

public class Aula02{
    //CRIANDO VARIÁVEIS
    /*
     * A função main abaixo é necessária em todo programa Java. É sua porta de entrada.
     * Apenas uma função main é permitida por projeto.
     */
    
    public static void main(String[] args) {
        //para criar variáveis usamos a seguinte sintaxe TIPO NOME_VAR = VALOR;
        int minhaIdade = 26;
        double valorPi = 3.14;
        char inicialDoMeuNome = 'M';
        boolean alunosLegais = true;
        String meuSobrenome = "Guazzelli";
        
        /* 
         * Para nomear variáveis, devemos iniciar com uma letra ou com _
         * Todo nome de variável deve fazer sentido em relação ao seu conteúdo.
         * Letras maiúscilas e minúsculas são caracteres diferentes, logo:"int meunome" e int meuNome" são variáveis diferentes.
         * Por boa prática, em Java usamos camelCase para escrever variáveis longas.
         */
        String _meuNome = "Mariana";
        
        
        /*
         * OUTPUT DE DADOS
         * Para imprimirmos algo em tela, usamos System.out.println("Algo");
         */
        System.out.println("Seja bem vindo," + _meuNome + "!");
        System.out.println("Ouvi falar que você tem " + minhaIdade + " anos de vida");
        
        /*
         * INPUT DE DADOS
         * Para habilitarmos o input de dados, precisamos:
         * 1: Importar o pacote Java responsável por isso
         *      import java.util.Scanner
         * 2: Criar uma variável do tipo Scanner
         *      Scanner nomeDoScanner = new Scanner (System.in);
         * 3: Imprimir em tela o que desejamos que o usuário digite
         *      System.out.println("Digite seu nome aqui: ");
         *      4: Usar o método de leitura apropriado
         *          nomeDoScanner.nextLine(); ---> para ler Strings
         *          nomeDoScanner.nextInt(); ---> para ler inteiros
         *          nomeDoScanner.nextDouble(); ---> para ler números racionais
         *          nomeDoScanner.nextBoolean(); ---> para ler um booleano
         */
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite aqui o nome do seu curso: ");
        String curso = scan.nextLine();
        System.out.println("Legal! Sempre quis fazer o curso de " + curso + "!");
        
        /*
         * FORMATANDO OUTPUT DE DADOS
         */
        System.out.println("Digite aqui sua altura: ");
        double altura = scan.nextDouble();
        
        System.out.println("Digite seu semestre na faculdade: ");
        int semestre = scan.nextInt();
        
        System.out.println("Você possui " + altura + " e está no " + semestre + " ° semestre do curso.");
        
        System.out.println("Digite um número de 4 casas decimais: ");
        double numeroLouco = scan.nextDouble();
        
        System.out.println("Número original: " + numeroLouco);
        System.out.println(String.format("Número com 2 casas decimais: %.2f", numeroLouco));
    }
    
    
}