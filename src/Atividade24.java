import java.util.Scanner;

public class Atividade24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        int maior = Integer.MIN_VALUE; // Inicializa com o menor valor possível
        int menor = Integer.MAX_VALUE; // Inicializa com o maior valor possível

        System.out.println("Digite um conjunto de valores inteiros e positivos. Para encerrar, digite 0.");

        do {
            System.out.print("Digite um valor: ");
            numero = scanner.nextInt();

            if (numero > 0) {
                if (numero > maior) {
                    maior = numero;
                }
                if (numero < menor) {
                    menor = numero;
                }
            } else if (numero < 0) {
                System.out.println("Valor negativo. Digite apenas valores inteiros e positivos.");
            }
        } while (numero != 0);

        if (maior != Integer.MIN_VALUE && menor != Integer.MAX_VALUE) {
            System.out.println("Maior valor: " + maior);
            System.out.println("Menor valor: " + menor);
        } else {
            System.out.println("Nenhum valor válido foi inserido.");
        }
    }
}