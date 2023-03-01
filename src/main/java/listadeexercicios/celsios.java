package listadeexercicios;

import java.util.Scanner;

public class celsios {
    public static void main(String[] args) {

     Scanner imput = new Scanner(System.in);

             System.out.println("informe o valor em celcius");
             double C = imput.nextDouble();

            double F = ( 9 * C  + 160)  / 5;
            System.out.println("o valor em  Fahrenheit e de " + F );

        imput.close();

    }
}
