package listadeexercicios;

import java.util.Scanner;

public class NumerosImpar {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);

        System.out.println("numeros impares ");

        for (int impar = 0; impar < 20;impar++){
        if ((impar % 2 ) != 0){
            System.out.println(impar);
        }
        }
    }}