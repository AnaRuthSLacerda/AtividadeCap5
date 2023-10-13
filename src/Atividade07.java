import java.util.Scanner;

public class Atividade07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    /*Faça um programa que receba a idade, a altura e o peso de cinco pessoas, calcule e mostre:
    ■■ a quantidade de pessoas com idade superior a 50 anos;
    ■■ a média das alturas das pessoas com idade entre 10 e 20 anos;
    ■■ a porcentagem de pessoas com peso inferior a 40 kg entre todas as pessoas analisadas.*/

        int idade, maior=0, qtdAltura10e20=0;
        double altura, peso, somaAlturas10e20=0, pesoMenor40=0, media = 0, percentual= 0, somaPeso = 0;

        for (int i = 1; i <= 5; i++){
            System.out.print ("Informe a idade: ");
            idade = scanner.nextInt ();
            System.out.print ("Informe a altura: ");
            altura = scanner.nextDouble ();
            System.out.print ("Informe o peso: ");
            peso = scanner.nextDouble ();
            System.out.println ();

            if (idade > 50 ){
                maior++;
            }
            if (idade >= 10 && idade <=20){
                qtdAltura10e20++;
                somaAlturas10e20 += altura;
            }
            if (peso < 40){
                pesoMenor40 += peso;
            }
            somaPeso += peso;
        }

        media = somaAlturas10e20 / qtdAltura10e20;
        percentual = pesoMenor40 / somaPeso * 100;

        System.out.println ("A quantidade de pessoas com idade superior a 50 anos: "+maior);
        System.out.println ("A média das alturas das pessoas com idade entre 10 e 20 anos: "+media);
        System.out.println ("A porcentagem de pessoas com peso inferior a 40kg: "+ percentual);

        scanner.close ();
    }
}
