import java.util.Scanner;

public class Aula06_Menu {
    
    public static void main(String[] args) {
        /**
         * MENU
         * Exibe uma lista de opções, normalmente numeradas.
         * Usa uma variável para armazenar a opção escolhida pelo usuário.
         * Possui um laço para permanecer no programa enquanto o user não optar por sair.
         * Usa uma estrutura de seleção p/ identificar a escolha informada pelo user.
         * Para cada escolha possível, invocamos uma função distinta.
         */
        String opcao = "0";
        while (opcao != "9") {
            // Mostra o menu, e espera o usuário digitar algo
            opcao = menu();
            
            // Itera sobre as opções possíveis
            if (opcao.equals("1")) {
                opcaoUm();
            } else if (opcao.equals("2")) {
                opcaoDois();
            } else if (opcao.equals("3")) {
                opcaoTres();
            } else if (opcao.equals("9")) {
                System.out.println("Saindo do programa...");
                break;
            } else {
                System.out.println("Opcao invalida.");
            }
        }
        
    }
    
    public static String menu() {        
        // Menu de opções
        System.out.println("Criando programas com menus!\n");
        System.out.println("1 - Para bla");
        System.out.println("2 - Para blabla");
        System.out.println("3 - Para blablabla");
        System.out.println("9 - SAIR\n");
        
        Scanner escolha = new Scanner(System.in);
        System.out.println("Digite a opção desejada > ");
        String item = escolha.nextLine();
        
        // Retorna a seleção do usuário para a função que invocou o menu()
        return item;
    }
    
    public static void opcaoUm() {
        System.out.println("Parabens, voce optou pela opcao 1!");
    }
    
    public static void opcaoDois() {
        System.out.println("A opcao 2 eh a melhor de todas :)");
    }
    
    public static void opcaoTres() {
        System.out.println("A opcao 3 ja nao eh tao legal :(");
    }
}