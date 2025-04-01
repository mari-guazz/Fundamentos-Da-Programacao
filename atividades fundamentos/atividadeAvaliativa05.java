import java.util.Scanner;

public class atividadeAvaliativa05{
    
    public static void main(String[] args) {
        
        /*
         * Solicite um número inteiro representando uma temperatura em graus Celsius. Imprima na tela se nessa temperatura a água se encontra em estado sólido, líquido ou gasoso (acima de 100);
         */ 
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira um para representar uma temperatura em Celsius: ");
        int temperatura = scan.nextInt();
        
        if (temperatura <= 0) {
            System.out.println("A água está em estado sólido");
        } else if (temperatura > 100) {
            System.out.println("A água está em estado gasoso");
        } else {
            System.out.println("A água está em estado líquido");
       
        }
        
    }
}