import java.util.Scanner;

public class Atividade21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalVotosCandidato1 = 0;
        int totalVotosCandidato2 = 0;
        int totalVotosCandidato3 = 0;
        int totalVotosCandidato4 = 0;
        int totalVotosNulos = 0;
        int totalVotosBranco = 0;
        int totalVotos = 0;

        int voto;

        while (true) {
            System.out.print("Digite o código do voto (1 a 4 para candidatos, 5 para voto nulo, 6 para voto em branco, 0 para encerrar): ");
            voto = scanner.nextInt();

            if (voto == 0) {
                break;
            } else if (voto == 1) {
                totalVotosCandidato1++;
                totalVotos++;
            } else if (voto == 2) {
                totalVotosCandidato2++;
                totalVotos++;
            } else if (voto == 3) {
                totalVotosCandidato3++;
                totalVotos++;
            } else if (voto == 4) {
                totalVotosCandidato4++;
                totalVotos++;
            } else if (voto == 5) {
                totalVotosNulos++;
                totalVotos++;
            } else if (voto == 6) {
                totalVotosBranco++;
                totalVotos++;
            } else {
                System.out.println("Código de voto inválido. Por favor, insira um código válido.");
            }
        }

        double porcentagemNulos = (double) totalVotosNulos / totalVotos * 100;
        double porcentagemBranco = (double) totalVotosBranco / totalVotos * 100;

        System.out.println("Total de votos para Candidato 1: " + totalVotosCandidato1);
        System.out.println("Total de votos para Candidato 2: " + totalVotosCandidato2);
        System.out.println("Total de votos para Candidato 3: " + totalVotosCandidato3);
        System.out.println("Total de votos para Candidato 4: " + totalVotosCandidato4);
        System.out.println("Total de votos nulos: " + totalVotosNulos);
        System.out.println("Total de votos em branco: " + totalVotosBranco);
        System.out.println("Porcentagem de votos nulos sobre o total de votos: " + porcentagemNulos + "%");
        System.out.println("Porcentagem de votos em branco sobre o total de votos: " + porcentagemBranco + "%");
    }
}