package listadeexercicios;

import java.util.Scanner;

public class positivo {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);

        System.out.println("numero");
        double nn = imput.nextDouble();

        if (nn <= 0) {
            double N = (nn * -1);
            System.out.println("numero positivo" + N);
        }
        if (nn >= 0) {
        double N = (nn);


        System.out.println("numero positivo" + N);

            }

        imput.close();
    }
}
