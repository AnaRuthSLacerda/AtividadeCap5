import java.util.Scanner;

public class Atividade20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao;
        double nota1, nota2, nota3, peso1, peso2, peso3, media;

        do {
            System.out.println("Menu de opções:");
            System.out.println("1. Média aritmética");
            System.out.println("2. Média ponderada");
            System.out.println("3. Sair");
            System.out.print("Digite a opção desejada: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite a primeira nota: ");
                    nota1 = scanner.nextDouble();
                    System.out.print("Digite a segunda nota: ");
                    nota2 = scanner.nextDouble();
                    media = (nota1 + nota2) / 2;
                    System.out.println("Média aritmética: " + media);
                    break;
                case 2:
                    System.out.print("Digite a primeira nota: ");
                    nota1 = scanner.nextDouble();
                    System.out.print("Digite o peso da primeira nota: ");
                    peso1 = scanner.nextDouble();
                    System.out.print("Digite a segunda nota: ");
                    nota2 = scanner.nextDouble();
                    System.out.print("Digite o peso da segunda nota: ");
                    peso2 = scanner.nextDouble();
                    System.out.print("Digite a terceira nota: ");
                    nota3 = scanner.nextDouble();
                    System.out.print("Digite o peso da terceira nota: ");
                    peso3 = scanner.nextDouble();
                    media = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);
                    System.out.println("Média ponderada: " + media);
                    break;
                case 3:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida. Digite uma opção válida (1, 2, 3).");
                    break;
            }
        } while (opcao != 3);
    }
}
