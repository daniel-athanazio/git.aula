package listadeexercicius2;

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

    }


