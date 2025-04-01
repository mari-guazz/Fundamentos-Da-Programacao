import java.util.Scanner;

public class Aula04{
    
    public static void main(String[] args) {
    /*
     * OPERADORES DE COMPARAÇÃO
     * == --> Verifica se o valor da esquerda é igual ao da direita
     * != --> Verifica se o valor da esquerda é diferente do da direita
     * > --> Verifica se o valor da esquerda é maior que o da direita
     * < --> Verifica se o valor da esquerda é menor que o da direita
     * >= --> Verifica se o valor da esquerda é maior ou igual ao da direita
     * <= --> Verifica se o valor da esquerda é menor ou igual ao da direita
     */

    int x = 10;
    int y = 15;
    System.out.println("10 == 15: " + (x == y));
    System.out.println("10 != 15: " + (x != y));
    System.out.println("10 > 15: " + (x > y));
    System.out.println("10 < 15: " + (x < y));
    System.out.println("10 >= 15: " + (x >= y));
    System.out.println("10 <= 15: " + (x <= y));
    
    /*
     * OPERADORES LÓGICOS
     * && --> Equivale ao "e" lógico. Ambos os lados da equação são verdadeiros
     * || --> Equivale ao "ou" lógico. Ao menos um dos lados da equação precisa ser verdadeiro
     * ! --> Equivale ao "¬" ou "~ ". Nega o valor lógico atual
     */
    
    Scanner scan = new Scanner(System.in);
    
    // System.out.println("Digite sua primeira nota: ");
    // int nota1 = scan.nextInt();
    // System.out.println("Digite sua segunda nota: ");
    // int nota2 = scan.nextInt();
    
    // System.out.println("nota1 e nota2 >= 6: " + (nota1 >= 6 && nota2 >= 6));
    // System.out.println("nota1 ou nota2 == 10: " + (nota1 == 10 || nota2 == 10));
    // System.out.println("¬false " + !false);
    // System.out.println("¬true " + !true);
    
    /*
     * ESTRUTURAS DE SELEÇÃO - IF/ELSE
     * Se lê "Se alguma coisa é verdadeira, então falça algo
     * Senão, se outra coisa é verdadeira, faço outro algo
     * Senão, faço outra coisa
     * 
     * Os blocos else if() e else são opcionais
     * A sintaxe é:
     * if(equação booleana) {
     *  bloco de código
     * } else if (outra equação booleana) { //opcional
        bloco de código
     * } else { //opcional
     *     bloco de código
     * }
     * 
     */
    
    // int adivinhaNumero = 2;
    // System.out.println("Qual número eu estou pensando? ");
    
    // int tentativa = scan.nextInt();
    // if (tentativa == adivinhaNumero) {
        // System.out.println("Acertô mizeravi");
    // } else if (tentativa == 3 || tentativa == 1) {
        // System.out.println("Tá quente");
    // } else {
        // System.out.println("Errou!");
    // }
    
    // System.out.println("Digite sua idade: ");
    // int idade = scan.nextInt();
    // if (idade <= 0) {
        // System.out.println("Você não existe");
    // } else if (idade < 18) {
        // System.out.println("Você ainda não pode dirigir");
    // } else if (idade >= 18 && idade <= 64) {
        // System.out.println("Dirija com cuidado");
    // } else {
        // System.out.println("Cai fora da estrada, ancião!");
    // }
    
    /*
     * ESTRUTURAS DE SELEÇÃO - SWITCH
     * A partir do valor de uma variável ou equação, intera sobre inúmeras possibilidades
     * Sintaxe é:
     * switch (equação ou variável) {
     *     case valor:
     *          bloco de código
     *          break;
     *     case outro valor:
     *          bloco de código
     *          break;
     *     case algum outro valor:
     *          bloco de código
     *          break;
     *     default: // O default é igual ao else
     *          bloco de código
     * }
     */
    System.out.println("Digite um valor numérico de um dia da semana: ");
    int diaDaSemana = scan.nextInt();
    switch (diaDaSemana) { //Itere sobre as possibilidades abaixo com base no valor do dia da semana
        case 1:
            System.out.println("Domingo");
            break;
        case 2:
            System.out.println("Segunda");
            break;
        case 3:
            System.out.println("Terça");
            break;
        case 4:
            System.out.println("Quarta");
            break;
        case 5:
            System.out.println("Quinta");
            break;
        case 6:
            System.out.println("Sexta");
            break;
        case 7:
            System.out.println("Sábado, graças a deus");
            break;
        default: 
            System.out.println("Inválido");
            
    }

}

}