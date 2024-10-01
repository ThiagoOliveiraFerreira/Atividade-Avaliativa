import java.util.Scanner;

public class ProgramaNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita que o usuário digite um número
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        // Verifica se o número é par ou ímpar
        String parOuImpar = (numero % 2 == 0) ? "par" : "ímpar";
        System.out.println("O número é: " + parOuImpar);

        // Verifica se o número é positivo ou negativo
        String positivoOuNegativo = (numero >= 0) ? "positivo" : "negativo";
        System.out.println("O número é: " + positivoOuNegativo);

        // Verifica se o número é primo
        boolean isPrimo = true;
        if (numero < 2)
            isPrimo = false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                isPrimo = false;
                break;
            }
        }
        System.out.println("O número é primo: " + (isPrimo ? "sim" : "não"));

        // Calcula a raiz quadrada
        double raizQuadrada = Math.sqrt(numero);
        System.out.println("A raiz quadrada do número: " + raizQuadrada);

        // Calcula o número elevado a 3
        int elevadoTres = (int) Math.pow(numero, 3);
        System.out.println("O número elevado a 3 é: " + elevadoTres);

        // Fecha o scanner
        scanner.close();
    }
}