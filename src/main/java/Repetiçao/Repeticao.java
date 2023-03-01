package Repetiçao;

import java.util.Scanner;

public class Repeticao {
    public static void main(String[] args) {

        Scanner imput=   new Scanner(System.in);
        System.out.println("informe o numero da tabuada");
        int numeroDaTabuada = imput.nextInt();

        for (int contador=1; contador <= 10; contador ++){
            int valorDoResultado = numeroDaTabuada * contador;
            System.out.println(numeroDaTabuada + "x" + contador + "=" + valorDoResultado);
        }


        imput.close();
    }
}
