import java.util.Scanner;

public class exercicio2 {   
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Insira um número inteiro:");
        int num1 = scan.nextInt();
        System.out.println("Agora insira outro número inteiro:");
        int num2 = scan.nextInt();
        
        boolean resultado = ehMultiplo(num1, num2);
        
        if (resultado) {
            System.out.println(num1 + " é múltiplo de " + num2 + ".");
        } else {
            System.out.println(num1 + " não é múltiplo de " + num2 + ".");
        }
        
    }
    
    public static boolean ehMultiplo(int a, int b) {
        return a % b == 0;
    }
       
}
    