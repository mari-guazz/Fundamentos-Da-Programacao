import java.util.Scanner;

public class ProvaGA {   
    
static int qtdJr = 0, qtdPl = 0, qtdSr = 0, qtdEsp = 0;

  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;
        do {
            opcao = menu(sc);
            
            switch (opcao) {
                case 1, 2, 3, 4 -> insereDev(opcao, sc);
                case 5 -> calculaOrcamento();
                case 9 -> System.out.println("A FakeIT agradece a sua visita!");
                default -> System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 9);
    }
    
    
    public static int menu(Scanner sc) {        
        System.out.println("Selecione um cargo de desenvolvedor\n");
        System.out.println("1 – Adicionar dev. Jr. – Valor hora: R$ 30");
        System.out.println("2 – Adicionar dev. Pl. – Valor hora: R$ 50");
        System.out.println("3 – Adicionar dev. Sr. – Valor hora: R$ 70");
        System.out.println("4 – Adicionar dev. Esp. – Valor hora: R$ 100");
        System.out.println("5 – Fazer orçamento");
        System.out.println("9 – Sair");

        
          
        Scanner escolha = new Scanner(System.in);
        System.out.println("Digite a opção desejada > ");
        String item = escolha.nextLine();
        
        return item;
    }
    
    public static void insereDev(int opcao, Scanner sc) {
        System.out.println("Quantos devs neste cargo você quer adicionar?\n");
        int qtd = sc.nextInt();
        switch (opcao) {
            case 1 -> qtdJr += qtd;
            case 2 -> qtdPl += qtd;
            case 3 -> qtdSr += qtd;
            case 4 -> qtdEsp += qtd;
        }
       
    }
    
    public static void calculaOrcamento() {
        if (qtdJr + qtdPl + qtdSr + qtdEsp == 0) {
            System.out.println("Não é possível fazer um orçamento sem antes adicionar ao menos um desenvolvedor.\n");
            return;    
    }
    
        final int horas = 160;
        // Custos reais
        double custoJr = qtdJr * 30 * horas;
        double custoPl = qtdPl * 50 * horas;
        double custoSr = qtdSr * 70 * horas;
        double custoEsp = qtdEsp * 100 * horas;
        
        // venda com margem ed lucro
        double vendaJr = qtdJr * 45 * horas;
        
        double vendaPl = qtdPl * 75 * horas;
        
        double vendaSr = qtdSr * 140 * horas;
        double vendaEsp = qtdEsp * 250 * horas;
        
        double totalCusto = custoJr + custoPl + custoSr + custoEsp;
        double totalVenda = vendaJr + vendaPl + vendaSr +vendaEsp;
        double lucro = totalVenda - totalCusto;
        
        System.out.printf("Valor total do projeto (com margem de lucro): R$ %.2f%n", totalVenda);
        System.out.printf("Lucro da empresa: R$ %.2f%n%n", totalVenda);
             

}  
}






        