import java.util.Scanner;

public class Teste01GB3 {
    
    public static void main(String[] args) {    
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Quantas sentenças você deseja registrar?");
        int tamanho = scan.nextInt();
        scan.nextLine(); 
        
        String[] sentencas = new String[tamanho];
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Insira a sentença " + (i + 1) + ": ");
            sentencas[i] = scan.nextLine();            
        }
        
        verificaMaiorSentenca(sentencas);
        
    }
    
    public static void verificaMaiorSentenca(String[] sentencas) {
        String maiorSentenca = "";
        int maiorTamanho = 0;
        
        for(String sentenca : sentencas) {
            if (sentenca.length() > maiorTamanho) {
                maiorTamanho = sentenca.length();
                maiorSentenca = sentenca;
            }
        }
        
        System.out.println("A maior sentença é \"" + maiorSentenca + "\" e possui " + maiorTamanho + " caracteres.");
    }
}