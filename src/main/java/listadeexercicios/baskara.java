package listadeexercicios;

import java.util.Scanner;

public class baskara {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);

        System.out.println("informe o valor de c (coeficiente constante)");
        double c = imput.nextDouble();

        System.out.println("informe o valor de a (coeficiente quadratico)");
        double a = imput.nextDouble();

        System.out.println("informe o valor de c (coeficiente constante)");
        double b = imput.nextDouble();

        double x = (-b + Math.sqrt(b * b) - 4 * a * c) / 2 * a;
                System.out.println("delta  " + x );

                if (x <= 0) {
                    System.out.println("nao a valores rais");
                }

                    if  (x ==0){ System.out.println("“O valor de X é: " + x);}

                    if (x >=0) {
                        double x1 = (-b + Math.sqrt(x)) + 2 * a;
                        System.out.println("o valor de x1 e de: " + x1);

                        double x2 = (-b - Math.sqrt(x) ) + 2 * a;
                        System.out.println("o valor de x2 e de: " + x2);
                    }

        imput.close();
    }
}
