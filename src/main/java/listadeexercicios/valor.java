package listadeexercicios;

import java.util.Scanner;

public class valor {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);


                System.out.println("escolha o numero");
                double n = imput.nextDouble();

                double ns = (n + 1);
                System.out.println("sucessor" + ns );

                double na = (n-1);
                System.out.println("antecessor" + na );



                imput.close();
    }
}
