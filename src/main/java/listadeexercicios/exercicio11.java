package listadeexercicios;

public class exercicio11 {
    public static void main(String[] args) {

            int[] a = new int[15];

            int [] b = new int[15];

            int  [] c = new int[30];

            for (int i = 1; i < a.length; i++) {
                    a[i]=i;
                    System.out.println("informe a matriz A " + i + ": " + a [i]);
            }

            System.out.println("       ");

            for (int i = 1; i < b.length; i++) {
                    b[i]=i;
                    System.out.println("informe a matriz B " + i + ": " + b [i]);
            }

            for (int i = 0; i < 15; i++) {
                    c[i] = a[i];
                    c[i + 15] = b[i];
            }
            System.out.println("       ");

            for (int i =0; i < 30; i++){

                    System.out.println("valores: " + c[i]);

            }
    }
    }

