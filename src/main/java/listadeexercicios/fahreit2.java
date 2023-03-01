package listadeexercicios;

import java.util.Scanner;

public class fahreit2 {
    public static void main(String[] args) {


        int celcios = 10;

        for (int contador = 1; contador < 9; contador++) {

            int f = (9 * celcios + 160) / 5;

            System.out.println(  celcios + " celcios "  +  "= Temperatura em Fahrenheit: " + f);

            celcios = celcios + 10;
        }
    }}