import java.util.Scanner;

public class Atividade22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade;
        double altura;
        int contPessoas = 0;
        double somaAlturas = 0;

        while (true) {
            System.out.print("Digite a idade (ou idade <= 0 para encerrar): ");
            idade = scanner.nextInt();

            if (idade <= 0) {
                break;
            }

            System.out.print("Digite a altura: ");
            altura = scanner.nextDouble();

            if (idade > 50) {
                somaAlturas += altura;
                contPessoas++;
            }
        }

        if (contPessoas > 0) {
            double mediaAlturas = somaAlturas / contPessoas;
            System.out.println("Média das alturas das pessoas com mais de 50 anos: " + mediaAlturas);
        } else {
            System.out.println("Nenhuma pessoa com mais de 50 anos foi considerada para calcular a média.");
        }
    }
}
