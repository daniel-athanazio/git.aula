package modelo;

import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {

        Scanner imput = new Scanner(System.in);

        double age, data;
        double idade;

        System.out.println("infrome o ano de nascimento");
        age = imput.nextDouble();

        System.out.println("informe o ano");
        data = imput.nextDouble();

        idade = data - age;

        if (idade >= 18) {
            System.out.println("maior de idade");

        } else {
            System.out.println("menor de idade");
        }
        System.out.println("sua idade é de " + idade);

        imput.close();
    }
}
















