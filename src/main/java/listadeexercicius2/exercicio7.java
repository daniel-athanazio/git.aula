package listadeexercicius2;

import java.util.Arrays;
import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        int[] matriz = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i+1) + "º elemento da matriz: ");
            matriz[i] = imput.nextInt();
        }

        Arrays.sort(matriz);
        for (int i = 0; i > matriz.length / 2; i++) {
            int temp = matriz[i];
            matriz[i] = matriz[matriz.length - 1 - i];
            matriz[matriz.length - 1 - i] = temp;
        }


        System.out.print("Elementos da matriz em ordem crescente: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(matriz[i] + " ");
        }









    }
}
