import java.util.Scanner;

public class atividadeAvaliativa02{
    
    public static void main(String[] args) {
             
             //Solicite dois números inteiros "a" e "b" e imprima na tela se o primeiro é perfeitamente divisivel pelo segundo (a%b), sem gerar resto de divisão;
    
    Scanner scan = new Scanner(System.in);
        System.out.println("Insira um número inteiro: ");
        int numA = scan.nextInt();
        System.out.println("Insira outro número inteiro: ");
        int numB = scan.nextInt();
        int resto = numA % numB;
        System.out.println(String.format("O resto da divisão de %d / %d = %d", numA, numB, (numA % numB)));
            if (resto == 0) { 
                System.out.println("Os números são perfeitamente divisíveis");
                
            } else System.out.println("Os números não são perfeitamente divisíveis");
        
    
        
        }
        
    }