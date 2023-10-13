import java.util.Scanner;

public class Atividade17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalPessoasAssistindo = 0;
        int canal;
        int pessoasAssistindo;

        int audienciaCanal4 = 0;
        int audienciaCanal5 = 0;
        int audienciaCanal7 = 0;
        int audienciaCanal12 = 0;

        while (true) {
            System.out.print("Digite o número do canal (4, 5, 7, 12) ou ZERO para encerrar: ");
            canal = scanner.nextInt();

            if (canal == 0) {
                break;
            }

            if (canal < 4 || canal > 12 || canal % 1 != 0) {
                System.out.println("Canal inválido. Digite um canal válido (4, 5, 7, 12) ou ZERO para encerrar.");
                continue;
            }

            System.out.print("Digite o número de pessoas assistindo: ");
            pessoasAssistindo = scanner.nextInt();

            if (pessoasAssistindo < 0) {
                System.out.println("Número de pessoas assistindo não pode ser negativo.");
                continue;
            }

            totalPessoasAssistindo += pessoasAssistindo;

            if (canal == 4) {
                audienciaCanal4 += pessoasAssistindo;
            } else if (canal == 5) {
                audienciaCanal5 += pessoasAssistindo;
            } else if (canal == 7) {
                audienciaCanal7 += pessoasAssistindo;
            } else if (canal == 12) {
                audienciaCanal12 += pessoasAssistindo;
            }
        }

        System.out.println("Porcentagem de audiência por canal:");

        if (totalPessoasAssistindo == 0) {
            System.out.println("Nenhuma pessoa assistindo.");
        } else {
            double porcentagemCanal4 = (double) audienciaCanal4 / totalPessoasAssistindo * 100;
            double porcentagemCanal5 = (double) audienciaCanal5 / totalPessoasAssistindo * 100;
            double porcentagemCanal7 = (double) audienciaCanal7 / totalPessoasAssistindo * 100;
            double porcentagemCanal12 = (double) audienciaCanal12 / totalPessoasAssistindo * 100;

            System.out.println("Canal 4: " + porcentagemCanal4 + "%");
            System.out.println("Canal 5: " + porcentagemCanal5 + "%");
            System.out.println("Canal 7: " + porcentagemCanal7 + "%");
            System.out.println("Canal 12: " + porcentagemCanal12 + "%");
        }
    }
}
