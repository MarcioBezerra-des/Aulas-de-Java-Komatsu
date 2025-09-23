import java.util.Scanner;

public class classificação_Desempenho01 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("Informe a nota do aluno (ou digite 'exit' para sair): ");
                String entrada = scanner.next();
                
                if (entrada.equalsIgnoreCase("exit")) {
                    System.out.println("Programa encerrado.");
                    break;
                }
                
                try {
                    double nota = Double.parseDouble(entrada);
                    
                    if (nota < 0 || nota > 100) {
                        System.out.println("Nota inválida. Por favor, insira um valor entre 0 e 100.");
                        continue; // Pula para a próxima iteração do loop
                    }
                    
                    // Converte a nota para um inteiro de 0 a 10 para usar no switch
                    int categoria = (int) nota / 10;
                    
                    System.out.print("Desempenho: ");
                    
                    switch (categoria) {
                        case 0, 1, 2, 3 -> System.out.println("Reprovado");
                        case 4, 5 -> System.out.println("Insuficiente");
                        case 6 -> System.out.println("Regular");
                        case 7, 8 -> System.out.println("Bom");
                        case 9, 10 -> // O caso 10 é para a nota 100
                            System.out.println("Ótimo");
                    }
                    
                } catch (NumberFormatException e) {
                    System.out.println("Entrada inválida. Por favor, insira um número ou digite 'exit'.");
                }
            }
        }
    }
}