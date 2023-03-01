package listadeexercicios;

import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) { Scanner imput = new Scanner(System.in);

        int ValorInicial = 0, ValorMaior = Integer.MIN_VALUE, ValorMenor = Integer.MAX_VALUE, ValorAnterior;

        do {
            System.out.println("informe o valor: ");

            ValorInicial = imput.nextInt();

            if (ValorInicial > ValorMaior) {
                ValorMaior = ValorInicial;

            }
            if (ValorInicial < ValorMenor) {
                ValorMenor = ValorInicial;
            }

            System.out.println("Maior valor informado: " + ValorMaior + " Menor valor informado " + ValorMenor);

        } while (ValorInicial >= 0);
    }
}




