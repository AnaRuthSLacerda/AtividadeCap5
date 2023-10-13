import java.util.Scanner;

public class Atividade23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Menu de opções:");
            System.out.println("1. Novo salário");
            System.out.println("2. Férias");
            System.out.println("3. Décimo terceiro");
            System.out.println("4. Sair");
            System.out.print("Digite a opção desejada: ");
            opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.print("Digite o salário do funcionário: ");
                double salario = scanner.nextDouble();
                double novoSalario;

                if (salario <= 210.00) {
                    novoSalario = salario * 1.15;
                } else if (salario <= 600.00) {
                    novoSalario = salario * 1.10;
                } else {
                    novoSalario = salario * 1.05;
                }

                System.out.println("Novo salário: " + novoSalario);
            } else if (opcao == 2) {
                System.out.print("Digite o salário do funcionário: ");
                double salario = scanner.nextDouble();
                double valorFerias = salario + (salario / 3);
                System.out.println("Valor das férias: " + valorFerias);
            } else if (opcao == 3) {
                System.out.print("Digite o salário do funcionário: ");
                double salario = scanner.nextDouble();
                System.out.print("Digite o número de meses de trabalho (até 12): ");
                int mesesTrabalhados = scanner.nextInt();
                if (mesesTrabalhados < 1) {
                    mesesTrabalhados = 1;
                } else if (mesesTrabalhados > 12) {
                    mesesTrabalhados = 12;
                }
                double decimoTerceiro = (salario * mesesTrabalhados) / 12;
                System.out.println("Valor do décimo terceiro: " + decimoTerceiro);
            } else if (opcao == 4) {
                System.out.println("Programa encerrado.");
            } else {
                System.out.println("Opção inválida. Digite uma opção válida (1, 2, 3, 4).");
            }
        } while (opcao != 4);
    }
}
