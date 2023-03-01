package listadeexercicios;

import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {

        Scanner imput= new Scanner(System.in);

        System.out.println("Salario mensal");
        double sm = imput.nextDouble();

        System.out.println("reajuste");
        double pr = imput.nextDouble();


        double ns = ( sm - pr ) /100;
        System.out.println("novo salario" + sm);

        imput.close();

    }
}
