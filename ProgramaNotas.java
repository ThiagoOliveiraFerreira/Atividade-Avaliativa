import java.util.Scanner;

public class ProgramaNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[5];

        // Coleta as notas dos alunos
        for (int i = 0; i < 5; i++) {
            System.out.print("Informe a nota do aluno " + (i + 1) + " (0 a 10): ");
            notas[i] = scanner.nextDouble();

            // Valida a nota
            while (notas[i] < 0 || notas[i] > 10) {
                System.out.print("Nota inválida! Informe a nota do aluno " + (i + 1) + " (0 a 10): ");
                notas[i] = scanner.nextDouble();
            }
        }

        // Inicializa variáveis para cálculo
        double maiorNota = notas[0];
        double menorNota = notas[0];
        double somaNotas = 0;

        // Processa as notas
        for (double nota : notas) {
            if (nota > maiorNota)
                maiorNota = nota;
            if (nota < menorNota)
                menorNota = nota;
            somaNotas += nota;
        }

        // Calcula a média
        double media = somaNotas / notas.length;

        // Apresenta os resultados
        System.out.println("A maior nota é: " + maiorNota);
        System.out.println("A menor nota é: " + menorNota);
        System.out.println("A média da turma é: " + media);

        // Fecha o scanner
        scanner.close();
    }
}