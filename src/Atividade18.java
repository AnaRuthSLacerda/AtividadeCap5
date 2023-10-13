import java.util.Scanner;

public class Atividade18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 0;
        double somaSalarios = 0;
        int maiorIdade = Integer.MIN_VALUE;
        int menorIdade = Integer.MAX_VALUE;
        int menorSalario = Integer.MAX_VALUE;
        int idadeMenorSalario = 0;
        char sexoMenorSalario = ' ';
        int mulheresSalarioMenor200 = 0;

        while (true) {
            System.out.print("Digite a idade (ou idade negativa para encerrar): ");
            int idade = scanner.nextInt();

            if (idade < 0) {
                break;
            }

            System.out.print("Digite o sexo (M/F): ");
            char sexo = scanner.next().charAt(0);

            System.out.print("Digite o salário: ");
            double salario = scanner.nextDouble();

            somaSalarios += salario;
            contador++;

            if (idade > maiorIdade) {
                maiorIdade = idade;
            }

            if (idade < menorIdade) {
                menorIdade = idade;
            }

            if (sexo == 'F' && salario <= 200.00) {
                mulheresSalarioMenor200++;
            }

            if (salario < menorSalario) {
                menorSalario = (int) salario;
                idadeMenorSalario = idade;
                sexoMenorSalario = sexo;
            }
        }

        if (contador > 0) {
            double mediaSalarios = somaSalarios / contador;

            System.out.println("Média dos salários do grupo: " + mediaSalarios);
            System.out.println("Maior idade do grupo: " + maiorIdade);
            System.out.println("Menor idade do grupo: " + menorIdade);
            System.out.println("Quantidade de mulheres com salário até R$ 200,00: " + mulheresSalarioMenor200);
            System.out.println("Idade e sexo da pessoa com o menor salário: " + idadeMenorSalario + " anos, " + sexoMenorSalario);
        } else {
            System.out.println("Nenhum dado foi inserido.");
        }
    }
}
