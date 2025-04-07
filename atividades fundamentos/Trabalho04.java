import java.util.Scanner;

public class Trabalho04{
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Vamos usar a conjectura de Collatz! Digite qualquer número inteiro: ");
        System.out.println("\n\n");
        int i = scan.nextInt();
        System.out.println("\n");
        while (i != 1) {
            System.out.print(i + " -> ");
            if (i % 2 == 0) {
                i = i / 2;
            } else if (i % 2 != 0) {
                i = i * 3 + 1;
            }
        }
        
        System.out.println("1");
        
        
}

}