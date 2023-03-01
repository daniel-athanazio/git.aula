package listadeexercicius2;

import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {

        Scanner Imput = new Scanner(System.in);
        int numerosprimos;
        int divisores =0;

        System.out.println("Digite um numero: ");
        numerosprimos = Imput.nextInt();
        for (int i = 1; i <=numerosprimos ; i++) {
            if( numerosprimos % i ==0){
                divisores++;
            }
        }
        if (divisores ==2){
        System.out.println("O número digitado é primo.");
        }
        else {
            System.out.println("O número digitado não é primo.");
        }





    }
}
