import java.util.Scanner;

public class Atividade19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double lucroTotal = 0;
        int acoesComLucroSuperior1000 = 0;
        int acoesComLucroInferior200 = 0;

        while (true) {
            System.out.print("Digite o tipo da ação ('F' para finalizar): ");
            char tipoAcao = scanner.next().charAt(0);

            if (tipoAcao == 'F') {
                break;
            }

            System.out.print("Digite o preço de compra da ação: ");
            double precoCompra = scanner.nextDouble();

            System.out.print("Digite o preço de venda da ação: ");
            double precoVenda = scanner.nextDouble();

            double lucro = precoVenda - precoCompra;
            lucroTotal += lucro;

            System.out.println("Lucro da ação: R$ " + lucro);

            if (lucro > 1000.00) {
                acoesComLucroSuperior1000++;
            }

            if (lucro < 200.00) {
                acoesComLucroInferior200++;
            }
        }

        System.out.println("Quantidade de ações com lucro superior a R$ 1.000,00: " + acoesComLucroSuperior1000);
        System.out.println("Quantidade de ações com lucro inferior a R$ 200,00: " + acoesComLucroInferior200);
        System.out.println("Lucro total da empresa: R$ " + lucroTotal);
    }
}
