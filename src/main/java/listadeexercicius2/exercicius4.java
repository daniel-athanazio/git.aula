package listadeexercicius2;

import java.util.Scanner;

public class exercicius4 {
    public static void main(String[] args) {

        Scanner imput = new Scanner(System.in);
        String[] nomes = new String[5];
        String pesquisa;

        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Informe os nomes " + (i + 1) + ":");
            nomes[i] = imput.nextLine();
        }

        System.out.println("Digite o nome a ser pesquisado ");
        pesquisa = imput.nextLine();


        boolean encontrei = false;

        for (String nome:nomes) {
            if (pesquisa.equals(nome)){
                encontrei = true;
            }
        }

        if (encontrei == true ){
            System.out.println("Achei. ");

        }
        else{
            System.out.println("Não achei. ");
        }


        imput.close();












    }
}
