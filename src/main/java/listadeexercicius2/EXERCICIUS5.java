package listadeexercicius2;

import java.util.Scanner;

public class EXERCICIUS5 {


        public static void main(String[] args) {
            Scanner IMPUT = new Scanner(System.in);

            int[] Q = new int[10];
            int maior = 0;
            int posicao = 0;

            for (int i = 0; i < 10; i++) {
                System.out.print("Digite um número par para a posição " + i + ": ");
                int num = IMPUT.nextInt();
                if (num % 2 == 0) {
                    Q[i] = num;
                } else {
                    System.out.println("Número inválido X Digite um número par.");
                }
            }

            for (int i = 0; i < 10; i++) {
                if (Q[i] > maior) {
                    maior = Q[i];
                    posicao = i;
                }
            }

            System.out.println("O maior elemento de Q é " + maior + ", que está na posição " + posicao);
        }
    }

