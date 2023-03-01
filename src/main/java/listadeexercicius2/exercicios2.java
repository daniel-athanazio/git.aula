package listadeexercicius2;

public class exercicios2 {
    public static void main(String[] args) {
        int[] V = {1, 2, 3, 4, 5};
        int[] V2 = new int[V.length];

        for (int i = 0; i < V.length; i++) {
            V2[i] = V[i] * 2;
        }

        for (int i = 0; i < V2.length; i++) {
            System.out.println("V2[" + i + "] = " + V2[i]);
        }
    }
}

