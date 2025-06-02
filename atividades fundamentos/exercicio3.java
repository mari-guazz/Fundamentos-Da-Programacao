// // * 1) Crie um array de 7 posições chamado alturas e instancie seus valores a partir de leituras do teclado. 
 // Após, chame uma função chamada mediaAltura() que recebe esse array como parâmetro e retorna a média 
 // * das alturas contidas nesse array.

import java.util.Scanner;

public class exercicio3{
    
    public static void main(String[] args) {
    double[] alturas = new double[7];
    Scanner scan = new Scanner(System.in);
    for (int i = 0; i < alturas.length; i++) {
            System.out.println("Digite as alturas " + i);
             alturas[i] = scan.nextDouble();
    System.out.println("A média das alturas é: " + mediaAltura(alturas));
        
    }
}
    
    public static double mediaAltura(double[] alturas){
    double media = 0;
    double soma = 0;
    double qtdAlturas = alturas.length;
    for (int i = 0; i < alturas.length; i++) {
            soma += alturas[i];
        }
    media = soma / alturas.length;
    
    return media;
    }
}