import java.util.Scanner;

public class Atividade04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int n;

        System.out.print ("Informe o número que você deseja saber a tabuada: ");
        n = scanner.nextInt ();

        for (int i = 0; i<=10; i++){
            int mult = i * n;
            System.out.println (n + "x" + i + "=" + mult);
        }

        scanner.close ();
    }
}