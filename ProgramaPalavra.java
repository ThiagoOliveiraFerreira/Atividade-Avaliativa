import java.util.Scanner;

public class ProgramaPalavra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita que o usuário digite uma palavra
        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        // Apresenta os resultados
        System.out.println("A palavra digitada foi: " + palavra);
        System.out.println("A palavra tem " + palavra.length() + " dígitos.");

        // Verifica a primeira letra
        char primeiraLetra = palavra.charAt(0);
        System.out.println("A primeira letra é: " + primeiraLetra);

        // Verifica a letra central
        int tamanho = palavra.length();
        char letraCentral = palavra.charAt(tamanho / 2);
        System.out.println("A letra central da palavra é: " + letraCentral);

        // Verifica a última letra
        char ultimaLetra = palavra.charAt(tamanho - 1);
        System.out.println("A última letra é: " + ultimaLetra);

        // Palavra ao contrário
        String palavraReversa = new StringBuilder(palavra).reverse().toString();
        System.out.println("A palavra escrita ao contrário é: " + palavraReversa);

        // Palavra em maiúsculo
        String palavraMaiusculo = palavra.toUpperCase();
        System.out.println("A palavra toda em maiúsculo: " + palavraMaiusculo);

        // Palavra em minúsculo
        String palavraMinusculo = palavra.toLowerCase();
        System.out.println("A palavra toda em minúsculo: " + palavraMinusculo);

        // Fecha o scanner
        scanner.close();
    }
}