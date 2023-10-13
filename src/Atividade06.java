import java.util.Scanner;

public class Atividade06 {
    /*Uma loja utiliza o código V para transação à vista e P para transação a prazo. Faça um programa que receba
o código e o valor de quinze transações, calcule e mostre:
■■ o valor total das compras à vista;
■■ o valor total das compras a prazo;
■■ o valor total das compras efetuadas; e
■■ o valor da primeira prestação das compras a prazo juntas, sabendo-se que serão pagas em três vezes.  */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalAVista = 0, totalAPrazo = 0, valorCompra, total;

    for (int i = 0; i < 15; i++) {
        System.out.print ("Insira o código (V = transação à vista e P = transação a prazo): ");
        char codigo = scanner.next ().toUpperCase ().charAt (0);

        System.out.print ("Informe o valor da compra: ");
        valorCompra = scanner.nextDouble ();

        if (codigo == 'V') {
            totalAVista = totalAVista + valorCompra;
        } else if (codigo == 'P') {
            totalAPrazo = totalAPrazo + valorCompra;
        } else {
            System.out.println ("vai se foder");
        }
    }

        total = totalAVista + totalAPrazo;

        System.out.println ("O valor total das compras à vista " + totalAVista);
        System.out.println ("O valor total das compras à prazo " + totalAPrazo);
        System.out.println ("O valor total das compras efetuadas " + total);
        System.out.println ("O valor total das compras" + total / 3);

        scanner.close ();
    }
}

