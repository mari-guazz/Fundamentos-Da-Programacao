import java.util.Scanner;

public class Trabalho01{
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu dia de nascimento: ");
        int dia = scan.nextInt();
        
        System.out.println("Agora digite o mês que você nasceu: ");
        int mes = scan.nextInt();
        
        System.out.println("Quase lá. Agora nos diga em que ano você nasceu: ");
        int ano = scan.nextInt();
        
        System.out.println("Que legal! Você nasceu na data de " + dia + "/" + mes + "/" + ano + "!");
    }
}