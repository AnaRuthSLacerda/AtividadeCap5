import java.util.Scanner;

public class Atividade08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

/*
*Faça um programa que receba a idade, o peso, a altura, a cor dos olhos (A — azul; P — preto; V — verde; e
C — castanho) e a cor dos cabelos (P — preto; C — castanho; L — louro; e R — ruivo) de seis pessoas, e que
calcule e mostre:
■■ a quantidade de pessoas com idade superior a 50 anos e peso inferior a 60 kg;
■■ a média das idades das pessoas com altura inferior a 1,50 m;
■■ a porcentagem de pessoas com olhos azuis entre todas as pessoas analisadas; e
■■ a quantidade de pessoas ruivas e que não possuem olhos azuis. */

        int idade = 0, qtdSup50eInf60 = 0, qtdInf150 = 0, qtdOlhosAzuis = 0, qtdRuivoSemOlhoAzul = 0;
        double peso, altura, mediaIdade = 0, somaInf150 = 0, perOlhos = 0;
        char olhos, cabelo;

        for (int i = 1; i <= 6; i++){
            System.out.println ("Informe a idade: ");
            idade = scanner.nextInt ();
            System.out.println ("Informe o peso: ");
            peso = scanner.nextDouble ();
            System.out.println ("Informe a altura: ");
            altura = scanner.nextDouble ();
            System.out.println ("Informe a cor dos olhos:\nA — azul;\nP — preto;\nV — verde;\nC — castanho): ");
            olhos = scanner.next ().toUpperCase ().charAt (0);
            System.out.println ("Informe a cor dos cabelos:\nP — preto;\nC — castanho;\nL — louro;\nR — ruivo)");
            cabelo = scanner.next ().toUpperCase ().charAt (0);
            System.out.println ();

            if (idade > 50 && peso <60){
                qtdSup50eInf60++;
            }
            if (altura < 1.50){
                qtdInf150++;
                somaInf150 += idade;
            }
            if (olhos == 'A'){
                qtdOlhosAzuis++;
            }
            if (cabelo == 'R' && olhos != 'A'){
                qtdRuivoSemOlhoAzul++;
            }
        }

        mediaIdade = somaInf150/qtdInf150;
        perOlhos = qtdOlhosAzuis / 6.0;

        System.out.println ("Quantidade de pessoas com idade superior a 50 anos e peso inferior a 60 kg: "+qtdSup50eInf60);
        System.out.println ("Média das idades das pessoas com altura inferior a 1,50m: "+mediaIdade);
        System.out.println ("Porcentagem de pessoas com olhos azuis entre todas as pessoas analisadas: "+perOlhos);
        System.out.println ("Quantidade de pessoas ruivas e que não possuem olhos azuis: "+qtdRuivoSemOlhoAzul);

        scanner.close ();
    }
}