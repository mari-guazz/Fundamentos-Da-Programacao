import java.util.Scanner;

public class Trabalho03{
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // System.out.println("Bem Vindo!");
        
        // System.out.println("\nVamos para o primeiro exercício:");
        
        // System.out.println("Digite o primeiro número inteiro que vier à cabeça:");
        // int num1 = scan.nextInt();
        // System.out.println("Agora digite outro número");
        // int num2 = scan.nextInt();
        
        // System.out.println(String.format("A soma de %d + %d = %d", num1, num2,(num1 + num2)));
        // System.out.println(String.format("A subtração de %d - %d = %d", num1, num2, (num1 - num2)));
        // System.out.println(String.format("A multiplicação de %d * %d = %d", num1, num2, (num1 * num2)));
        // System.out.println(String.format("A divisão de %d / %d = %.2f", num1, num2, ((double)num1 / num2)));
        // System.out.println(String.format("A divisão inteira de %d / %d = %d", num1, num2, (num1 / num2)));
        // System.out.println(String.format("O resto da divisão de %d / %d = %d", num1, num2, (num1 % num2)));
        // System.out.println(num1 + " elevado a " + num2 + ": " + Math.pow(num1, num2));
        // System.out.println("O maior número é: " + Math.max(num1, num2));
        // System.out.println("O menor número é: " + Math.min(num1, num2));
        
        // System.out.println("\nPróximo exercício: ");
        
        // System.out.println("Digite a temperatura da sua cidade em Celsius que vou te dizer ela em Fahrenheint: ");
        // double numCelsius = scan.nextDouble();
        // double numFahrenheint = numCelsius * 1.8 + 32;
        // System.out.println(String.format("A temperatura convertida é de  = %.2f", numFahrenheint));
        
        // System.out.println("\nPróximo exercício: ");
        
        // System.out.println("Digite a temperatura da sua cidade em Fahrenheint que vou te dizer ela em Celsius: ");
        // numFahrenheint = scan.nextDouble();
        // numCelsius = (numFahrenheint - 32) / 1.8;
        // System.out.println(String.format("A temperatura convertida é de  = %.2f", numCelsius));
        
        // System.out.println("\nPróximo exercício: ");
        
        // System.out.println("Digite uma velocidade em Km/h: ");
        // double velocidade = scan.nextDouble();
        // velocidade = velocidade * 1000 / 3600;
        // System.out.println(String.format("A velocidade em m/s é de: %.2f", velocidade));
        
        // System.out.println("\nPróximo exercício: ");
        
        // System.out.println("Digite um preço que você considera muito caro para um sapato: ");
        // double preço = scan.nextDouble();
        // System.out.println("Agora digite um percentual de desconto: ");
        // int desconto;
        // do{
            // desconto = scan.nextInt();
            // if(!(desconto >=0 && desconto <100))            
                // System.out.println("O percentual de desconto deve ser um número entre 0 e 100");
        // }while(!(desconto >=0 && desconto <100));
        // double preçoDesconto = preço * ((double)desconto / 100);
        // double preçoFinal = preço - preçoDesconto;
        // System.out.println(String.format("O preço original é de: R$%.2f\nO percentual de desconto é de: %d%%\nO valor desse desconto é: R$%.2f\nTotalizando num preço final de: R$%.2f", preço, desconto, preçoDesconto, preçoFinal));
        
        System.out.println("\nPróximo exercício: ");
        
        System.out.println("Digite um valor de altura: ");
        double altura = scan.nextDouble();
        System.out.println("Digite um valor de comprimento: ");
        double comprimento = scan.nextDouble();
        System.out.println(String.format("O valor do perímetro é: %.2f", (altura + comprimento) * 2));
        
        
        
    }
}