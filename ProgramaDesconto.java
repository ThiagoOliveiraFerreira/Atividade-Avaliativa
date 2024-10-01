import java.util.Scanner;

public class ProgramaDesconto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o valor cheio da compra
        System.out.print("Informe o valor cheio da compra: ");
        double valorCheio = scanner.nextDouble();

        // Solicita o valor do desconto
        System.out.print("Informe o valor do desconto: ");
        double valorDesconto = scanner.nextDouble();

        // Calcula o novo valor
        double novoValor = valorCheio - valorDesconto;

        // Apresenta os resultados
        System.out.println("O valor cheio é: " + valorCheio);
        System.out.println("O valor do desconto é: " + valorDesconto);
        System.out.println("O novo valor é: " + novoValor);

        // Fecha o scanner
        scanner.close();
    }
}