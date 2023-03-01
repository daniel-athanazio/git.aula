package listadeexercicios;

import java.util.Scanner;

public class diferença {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);


        System.out.println("primeiro valor");
        double A = imput.nextDouble();


        System.out.println("segundo valor");
        double B = imput.nextDouble();

        double diferença = (A - B);
        System.out.println("a diferença e de " + diferença);

                imput.close();
    }
}
