package modelo;

import java.util.Scanner;

public class DecisaoModelo {
    public static void main(String[] args) {

        Scanner imput= new Scanner(System.in);

                double n1, n2, n3, n4;
                double nd;

         System.out.println("informe a primeira nota: ");
              n1= imput.nextDouble();

        System.out.println("informe a segunda nota: ");
        n2= imput.nextDouble();


        System.out.println("informe a terceira nota: ");
        n3= imput.nextDouble();

        System.out.println("informe a quarta nota: ");
        n4= imput.nextDouble();

        nd=(n1 + n2 + n3 + n4 ) / 410;

        if ( nd >=5 ) {
            System.out.println("aprovado");
        } else {
            System.out.println("reprovado");
        }
        System.out.println("media " + nd);

     imput.close();

    }
}
