import java.util.Scanner;

public class atividadeAvaliativa04{
    
    public static void main(String[] args) {
        
        /*
         * Solicite tres números, sendo que os dois últimos representam, respectivamente, o valor inicial e final de um intervalo. 
         * Mostre uma Mensagem informando se o número digitado (primeiro número digitado) está abaixo, dentro ou acima do intervalo.
        
         */ 
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira um número inteiro: ");
        int num1 = scan.nextInt();
        System.out.println("Insira outro número inteiro, esse será o início de um intervalo: ");
        int num2 = scan.nextInt();
        System.out.println("Insira um número inteiro maior que o último, esse será o final do intervalo: ");
        int num3 = scan.nextInt();
        
        if (num1 < num2) {
            System.out.println("O número está abaixo do intervalo!");
        } else if (num1 > num3) {
            System.out.println("O número está acima do intervalo!");
        } else {
            System.out.println("O número está dentro do intervalo!");
       
        }
        
    }
}