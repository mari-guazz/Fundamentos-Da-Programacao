import java.util.Scanner;

public class trabalho05 {
    
    public static void main(String[] args) {
        /**
         * Utilize o menu visto em aula para solicitar ao user qual
        a opcao de operacao deseja fazer. Exemplo:
        1 - Adicao
        2 - Subtracao
        3 - Multiplicacao
        4 - Divisao
        5 - Modulo (imprime qual o resto da divisão)
        6 - Exponenciacao (primeiro num elevado ao segundo)
        9 - Sair

        Implemente cada uma das funções, e dentro delas solicite
        que o usuário digite 2 números inteiros para que a operação possa 
        ser realizada.
         */
        
        String opcao = "0";
        while (opcao != "9") {
            opcao = menu();
            
            if (opcao.equals("1")) {
                opcaoUm();
            } else if (opcao.equals("2")) {
                opcaoDois();
            } else if (opcao.equals("3")) {
                opcaoTres();
            } else if (opcao.equals("4")) {
                opcaoQuatro();
            } else if (opcao.equals("5")) {
                opcaoCinco();
            } else if (opcao.equals("6")) {
                opcaoSeis();
            } else if (opcao.equals("9")) {
                System.out.println("Saindo do programa...");
                break;
            } else {
                System.out.println("Opcao invalida.");
            }
        }
    }
    
    public static String menu() {
        System.out.println("Menu de operações matemáticas.\n");
        System.out.println("Escolha a operação desejada:\n ");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("5 - Resto");
        System.out.println("6 - Exponenciação");
        System.out.println("9 - Sair do menu");
        
        Scanner escolha = new Scanner(System.in);
        String item = escolha.nextLine();
        
        return item;
    }
    
    public static void opcaoUm() {
        System.out.println("Você optou pela soma!");
        Scanner soma = new Scanner(System.in);
        System.out.println("Digite o primeiro número inteiro:");
        int num1 = soma.nextInt();
        System.out.println("Digite o segundo número inteiro:");
        int num2 = soma.nextInt();
        
        System.out.println(String.format("A soma de %d + %d = %d", num1, num2,(num1 + num2)));
    }
    
    public static void opcaoDois() {
        System.out.println("Você optou pela subtração!");
        Scanner subtrai = new Scanner(System.in);
        System.out.println("Digite o primeiro número inteiro:");
        int num1 = subtrai.nextInt();
        System.out.println("Digite o segundo número inteiro:");
        int num2 = subtrai.nextInt();
        
        System.out.println(String.format("A subtração de %d - %d = %d", num1, num2, (num1 - num2)));
    }
    
    public static void opcaoTres() {
        System.out.println("Você optou pela multiplicação!");
        Scanner multi = new Scanner(System.in);
        System.out.println("Digite o primeiro número inteiro:");
        int num1 = multi.nextInt();
        System.out.println("Digite o segundo número inteiro:");
        int num2 = multi.nextInt();
        
        System.out.println(String.format("A multiplicação de %d * %d = %d", num1, num2, (num1 * num2)));
    }
    
    public static void opcaoQuatro() {
        System.out.println("Você optou pela divisão!");
        Scanner divi = new Scanner(System.in);
        System.out.println("Digite o primeiro número inteiro:");
        int num1 = divi.nextInt();
        System.out.println("Digite o segundo número inteiro:");
        int num2 = divi.nextInt();
        
        System.out.println(String.format("A divisão de %d / %d = %d", num1, num2, (num1 / num2)));
    }
    
     public static void opcaoCinco() {
        System.out.println("Você optou pelo resto!");
        Scanner resto = new Scanner(System.in);
        System.out.println("Digite o primeiro número inteiro:");
        int num1 = resto.nextInt();
        System.out.println("Digite o segundo número inteiro:");
        int num2 = resto.nextInt();
        
        System.out.println(String.format("O resto da divisão de %d / %d = %d", num1, num2, (num1 % num2)));   
    }
    
    public static void opcaoSeis() {
        System.out.println("Você optou pela exponenciação!");
        Scanner pot = new Scanner(System.in);
        System.out.println("Digite o primeiro número inteiro:");
        int num1 = pot.nextInt();
        System.out.println("Digite o segundo número inteiro:");
        int num2 = pot.nextInt();
        
        System.out.println(num1 + " elevado a " + num2 + ": " + Math.pow(num1, num2));
    }
    
}