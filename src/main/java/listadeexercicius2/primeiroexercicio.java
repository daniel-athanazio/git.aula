package listadeexercicius2;

public class primeiroexercicio {
    public static void main(String[] args) {
        int[] vetor = new int[8];

        for (int i = 0; i < 8; i++) {
            vetor[i] = i * i * i;
        }

        for (int i = 0; i < 8; i++) {
            System.out.println("Posição " + i + ": " + vetor[i]);
        }
    }
}
