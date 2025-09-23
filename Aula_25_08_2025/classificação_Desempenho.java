import java.util.Scanner;

public class classificação_Desempenho {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Informe a nota do aluno (ou digite 'exit' para sair): ");
            String entrada = scanner.next();

            if (entrada.equalsIgnoreCase("exit")) {
                System.out.println("Programa encerrado.");
                break;
            }

            try {
                double nota = Double.parseDouble(entrada);

                if (nota >= 0 && nota <= 39) {
                    System.out.println("Desempenho: Reprovado");
                } else if (nota >= 40 && nota <= 59) {
                    System.out.println("Desempenho: Insuficiente");
                } else if (nota >= 60 && nota <= 69) {
                    System.out.println("Desempenho: Regular");
                } else if (nota >= 70 && nota <= 89) {
                    System.out.println("Desempenho: Bom");
                } else if (nota >= 90 && nota <= 100) {
                    System.out.println("Desempenho: Ótimo");
                } else {
                    System.out.println("Nota inválida. Por favor, insira um valor entre 0 e 100.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, insira um número ou digite 'exit'.");
            }
        }

        scanner.close();
    }
}