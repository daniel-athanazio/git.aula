import java.util.Scanner;

public class desafio {
    public static void main(String[] args) {

        //variaveis

        Scanner scanner = new Scanner(System.in);
        String[] contatos = new String[20];
        String[] telefones = new String[20];

        int opcao;

        //nomes no menu

        do {
            System.out.println("Menu");
            System.out.println("1-Cadastrar Contato");
            System.out.println("2-Excluir Contato");
            System.out.println("3-Listar todos os Contatos");
            System.out.println("4-Limpar a lista de contatos");
            System.out.println("99-Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();


            //switch do menu

            switch (opcao) {
                case 1:
                    cadastrarContato(contatos, telefones);
                    break;
                case 2:
                    excluirContato(contatos, telefones);
                    break;
                case 3:
                    listarContatos(contatos, telefones);
                    break;
                case 4:
                    limparAgenda(contatos, telefones);
                    break;

                default:
                    System.out.println("Opção inválida tente novamente.");
            }
        } while (opcao != 99);

        scanner.close();
    }

    // cadastrar seus contatos.
    public static void cadastrarContato(String[] contatos, String[] telefones) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do contato: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o numero do contato: ");
        String telefone = scanner.nextLine();

        int posicao = proximaPosicao(contatos);
        if (posicao == -1) {
            System.out.println("Numero maximo de contatos atigido.");
        } else {
            contatos[posicao] = nome;
            telefones[posicao] = telefone;
            System.out.println("Contato cadastrado com sucesso.");
        }

        scanner.close();
    }

    // excluir os contatos

    public static void excluirContato(String[] contatos, String[] telefones) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do contato a ser excluído: ");
        String nome = scanner.nextLine();

        int posicao = buscarContato(nome, contatos);
        if (posicao == -1) {
            System.out.println("Contato não encontrado.");
        } else {
            contatos[posicao] = null;
            telefones[posicao] = null;
            System.out.println("Contato excluído.");
        }

        scanner.close();
    }

    //listar contatos.

    public static int listarContatos(String[] contatos, String[] telefones) {
        for (int i = 0; i < contatos.length; i++) {
            if (contatos[i] != null && contatos[i].equals(contatos)) {
            }
            return i;
        }
        return 0;
    }

        // limpar a agenda

        public static void limparAgenda(String[] contatos, String[] telefones) {
            for (int i = 0; i < contatos.length; i++) {
                contatos[i] = null;
                telefones[i] = null;
            }
            //posiçao
    }
    public static int proximaPosicao(String[] contatos) {
        for (int i = 0; i < contatos.length; i++) {
            if (contatos[i] == null) {
                return i;
            }
        }
        return -1;
    }
// buscar contatos
    public static int buscarContato(String nome, String[] contatos) {
        for (int i = 0; i < contatos.length; i++) {
            if (contatos[i] != null && contatos[i].equals(nome)) {
                return i;
            }
        }
        return -1;
    }
    }