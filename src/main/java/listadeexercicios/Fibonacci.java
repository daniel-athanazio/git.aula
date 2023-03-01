package listadeexercicios;

public class Fibonacci {
    public static void main(String[] args) {

        int primero = 0, segundo = 1;

        System.out.println(primero);

        for (int i = 0; i < 15; i++) {

            System.out.println(segundo);

            int avanço =  primero + segundo;

            primero = segundo;

            segundo = avanço;

        }
    }
}







