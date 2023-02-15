package modelo;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {

        Scanner imput = new Scanner(System.in);
                System.out.println("informe a altura");
              double altura = imput.nextDouble();
                      System.out.println("informe a base");
                      int base = imput.nextInt();

                      double area = altura * base;

                              System.out.println(area);

                              imput.close();


    }
}
