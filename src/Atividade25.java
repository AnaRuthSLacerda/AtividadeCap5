import java.util.Scanner;

public class Atividade25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int codigoCliente;
        double totalInvestido = 0;
        double totalJuros = 0;

        System.out.println("Digite o código do cliente, o tipo do investimento e o valor investido.");
        System.out.println("Para encerrar, digite um código de cliente menor ou igual a 0.");

        while (true) {
            System.out.print("Código do cliente: ");
            codigoCliente = scanner.nextInt();

            if (codigoCliente <= 0) {
                break;
            }

            System.out.print("Tipo do investimento (1 - Poupança, 2 - Poupança Plus, 3 - Fundos de Renda Fixa): ");
            int tipoInvestimento = scanner.nextInt();

            System.out.print("Valor investido: ");
            double valorInvestido = scanner.nextDouble();

            double rendimentoMensal = 0;

            switch (tipoInvestimento) {
                case 1:
                    rendimentoMensal = valorInvestido * 0.015;
                    break;
                case 2:
                    rendimentoMensal = valorInvestido * 0.02;
                    break;
                case 3:
                    rendimentoMensal = valorInvestido * 0.04;
                    break;
                default:
                    System.out.println("Tipo de investimento inválido. Ignorando investimento.");
                    continue;
            }

            totalInvestido += valorInvestido;
            totalJuros += rendimentoMensal;

            System.out.println("Rendimento mensal: " + rendimentoMensal);
        }

        System.out.println("Total investido pelos clientes: " + totalInvestido);
        System.out.println("Total de juros pagos aos clientes: " + totalJuros);
    }
}
