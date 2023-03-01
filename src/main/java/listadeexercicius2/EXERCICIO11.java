package listadeexercicius2;

import java.util.Scanner;

public class EXERCICIO11 {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);

        String palavra = "ote";
        String reverso = "";


        for (int i = (palavra.length() - 1); i >= 0; i--) {
            reverso += palavra.charAt(i);


        }

        if (reverso.equals(palavra)) {
            System.out.println("É uma palíndromo");
        } else {
            System.out.println("Não é um palíndromo");


        }
    }
}