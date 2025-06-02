import java.util.Scanner;

public class exercicio1 {   
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Insira um valor para a altura de um retângulo:");
        double altura = scan.nextDouble();
        System.out.println("Agora insira um valor para a sua largura:");
        double largura = scan.nextDouble();
        
        System.out.println("A área deste retângulo é de: " + calculaArea(altura, largura) + " metros quadrados.");
    }
    
    public static double calculaArea(double altura, double largura){
        
        double area = altura * largura;
        
        return area;
        
    }
}