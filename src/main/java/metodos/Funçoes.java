package metodos;

import java.util.Scanner;

public class Funçoes {
    public static final double PI = 3.1416;
    public static void main(String[] args) {
        Scanner imput= new Scanner(System.in);
        System.out.println("informe o valor do raio");
        double raio = imput.nextDouble();


         //double AreaDoCirculo = PI * (raio * raio);
        double AreaDocirculo = CalculaAreaDoCircul(raio);
        System.out.println("valor da area do circulo ");

        double NovaArea = CalculaAreaDoCircul(raio);
        System.out.println("nova area: " + NovaArea);



                imput.close();
    }

    private static double CalculaAreaDoCircul(double raio) {
       if (raio <= 1) {
           return 0;
       }
        return PI * (raio * raio);

    }
}
