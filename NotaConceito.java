import java.util.Scanner;

public class NotaConceito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita a nota ao usuário
        System.out.print("Digite a nota (0 a 100): ");
        double nota = scanner.nextDouble();

        // Verifica se a nota está dentro do intervalo válido
        if (nota < 0 || nota > 100) {
            System.out.println("Nota inválida. Por favor, insira uma nota entre 0 e 100.");
        } else {
            // Determina o conceito com base na nota
            char conceito;
            if (nota > 90) {
                conceito = 'A';
            } else if (nota > 80) {
                conceito = 'B';
            } else if (nota > 70) {
                conceito = 'C';
            } else if (nota > 60) {
                conceito = 'D';
            } else {
                conceito = 'E';
            }

            // Exibe o resultado
            System.out.println("A nota é: " + nota);
            System.out.println("O conceito é: " + conceito);
        }

        // Fecha o scanner
        scanner.close();
    }
}