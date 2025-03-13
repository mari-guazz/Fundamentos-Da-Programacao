import java.util.Scanner;

public class Trabalho02{
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu número decimal favorito ");
        double decimal = scan.nextDouble();
        
        System.out.println(String.format("Seu número inteiro é: %.0f", decimal));
    }
}