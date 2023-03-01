package listadeexercicius2;

import java.util.Scanner;

public class exercicios15 {
    public static void main(String[] args){
        Scanner imput = new Scanner(System.in);

        System.out.println(inverter(12345, 0));
    }

    private static int inverter(int numero, int total) {
        if (numero == 0)
            return total;
        else return inverter (numero/ 10, total * 10 + numero % 10);


    }


}
