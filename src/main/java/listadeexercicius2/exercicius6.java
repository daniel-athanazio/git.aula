package listadeexercicius2;

import java.util.Scanner;

public class exercicius6 {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);

        double[] temperaturas = {21, 22, 24, 25, 26, 27, 29};

        double MenorTemperatura = Integer.MIN_VALUE, Maiortemperatura = Integer.MAX_VALUE;

        double quantidadedia = 0;

        double soma = 0.0;

        double media =0;

        for (double temperatura : temperaturas) {

            if (MenorTemperatura < temperatura)
            {  MenorTemperatura = temperatura;}
            soma = soma + temperatura;
        }

        media = soma / temperaturas.length;

        for (double temperatura : temperaturas) {
            if (Maiortemperatura > temperatura)
            {Maiortemperatura = temperatura;}
        }

        for ( double temperatura : temperaturas)
        { if (temperatura > media) {
            quantidadedia = quantidadedia + 1;
        }

        }

        System.out.println("media: " + media);

        System.out.println("menor temperatura: " + MenorTemperatura);

        System.out.println("maior temperatura: " + Maiortemperatura);

        System.out.println("quantidade de dias que foi abaixo da media: " + quantidadedia);

        imput.close();
    }
}