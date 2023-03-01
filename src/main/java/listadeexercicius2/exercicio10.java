package listadeexercicius2;

import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        int numeros;
        int digitos =0;
        System.out.println("Digite um numero: ");
        numeros = imput.nextInt();
        while (numeros >= 10) {
            numeros /= 10;
            digitos++;
        }
        System.out.println("A  quantidade de digitos foi de: " + digitos);
        }
    }

    





