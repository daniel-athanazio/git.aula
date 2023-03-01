package listadeexercicius2;

import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int valores = imput.nextInt();


        char resultado = verificaNumero(valores);

        System.out.println("O número digitado é " + resultado);
    }

    public static char verificaNumero(int valores) {
        if (valores > 0) {
            return 'P';
        } else {
            return 'N';
        }
    }
}