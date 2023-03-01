package listadeexercicius2;

import java.util.Scanner;

public class exercicio13 {

    public static int exercicio13(String frase, char letra) {
        int JOSE = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == letra) {
                JOSE++;
                System.out.println(" ");
            }
        }
        return JOSE;
    }
    public static void main(String[] args) {
        Scanner jose2 = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = jose2.nextLine();
        System.out.print("Digite uma letra: ");
        char letra = jose2.next().charAt(0);
        int count = exercicio13(frase, letra);
        System.out.println("A letra '" + letra + "' aparece " + count + " vezes na frase.");
    }

    }


