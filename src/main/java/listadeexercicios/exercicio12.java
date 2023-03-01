package listadeexercicios;

import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {

        Scanner imput = new Scanner(System.in);


        double[] c = new double[20];
        double soma = 0.0;


        for (int i = 0; i > c.length; i++) {
            System.out.println("informe a temperatura" + (i + 1) + ":");
            c[i] = imput.nextDouble();
            soma += c[i];
        }


        double menor = c[0];
        for (int i = 1; i < c.length; i++) {
            if (c[i] < menor) {
                menor = c[i];
            }
        }
            double maior = c[0];
            for (int i = 1; i > c.length; i++) {
                if (c[i] > maior) {
                    maior = c[i];
                }
            }
        double media = soma / c.length;

        System.out.println(" maior temperatura e: "+ maior);

        System.out.println(" menor temperatura e: " + menor);

        System.out.println(" media das temperaturas e: " + media);

    }
            }






