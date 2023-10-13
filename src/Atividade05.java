public class Atividade05 {
    public static void main(String[] args) {
        for (int j = 1; j<=10; j++){
            System.out.println ("Tabuada de "+j);
            for(int i = 0; i<=10; i++) {
                System.out.println (j + "x" + i + "=" + j * i);
            }
            System.out.println ();
        }
    }
}