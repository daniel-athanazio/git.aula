package arrays;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        Scanner imput = new Scanner(System.in);
        int[] a = new int [10];
        int[] b = new int[10];

              // carrega valores no arrays a
        for  (int i = 0; i < 10; i++) {
            System.out.println("informe o valor do elemento " + i);
            a[i] = imput.nextInt();

        }

        // carrega valores no  b (metade do a)
        for (int i = 0; i < 10; i++) {
            b[i] = a[i] / 2;
        }
        // exibe os resultados
        for (int i = 0; i < 10; i++) {
            System.out.println("valores do arrays A e B na posissao " + (i + 1));
            System.out.println(a[i] + "-" + b[i]);
             }

        imput.close();
    }
}
