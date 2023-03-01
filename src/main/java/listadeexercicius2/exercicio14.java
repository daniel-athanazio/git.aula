package listadeexercicius2;

import java.util.Scanner;

public class exercicio14 {static double base = 1;

    Scanner imput = new Scanner(System.in);
    static double alt = 1;



    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        System.out.println("Digite a base do retangulo :");
        base = imput.nextDouble();

        System.out.println("Digite a altura do retangulo: ");
        alt = imput.nextDouble();

        retangulo();

    }

    public static void retangulo(){

        for (int i = 0; i < alt; i++) {
            for (int j = 0; j < base; j++) {
                System.out.print("V");
            }
            System.out.println();
        }

    }

}

