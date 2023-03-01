package listadeexercicius2;

import java.util.Scanner;

public class exercicio10 {
    public static int exercicio13(String frase, char letra) {
        int jose = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == letra) {
                jose++;
            }
        }
        return jose;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();
        System.out.print("Digite uma letra: ");
        char letra = scanner.next().charAt(0);
        int count = exercicio13(frase, letra);
        System.out.println("A letra '" + letra + "' aparece " + count + " vezes na frase.");
    }
}

    





