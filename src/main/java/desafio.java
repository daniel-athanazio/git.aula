import java.util.Scanner;

public class desafio {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            String[] contatos = new String[20];
            String[] telefones = new String[20];
            int opcao;
            int posicao;
            String nome;
            String telefone;

            do {
                System.out.println("Menu Principal");
                System.out.println("1-Cadastrar Contato");
                System.out.println("2-Excluir Contato");
                System.out.println("3-Listar todos os Contatos");
                System.out.println("4-Limpar a lista de contatos");
                System.out.println("99-Sair");
                System.out.print("Escolha uma opção: ");
                opcao = input.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.print("Digite o nome do contato: ");
                        nome = input.next();
                        System.out.print("Digite o telefone do contato: ");
                        telefone = input.next();
                        posicao = proximaPosicao(contatos);
                        if (posicao == -1) {
                            System.out.println("A agenda está cheia.");
                        } else {
                            contatos[posicao] = nome;
                            telefones[posicao] = telefone;
                            System.out.println("Contato cadastrado com sucesso.");
                        }
                        break;
                    case 2:
                        System.out.print("Digite o nome do contato a ser excluído: ");
                        nome = input.next();
                        posicao = buscarContato(nome, contatos);
                        if (posicao == -1) {
                            System.out.println("Contato não encontrado.");
                        } else {
                            excluirContato(posicao, contatos, telefones);
                            System.out.println("Contato excluído com sucesso.");
                        }
                        break;
                    case 3:
                        if (contatos[0] == null) {
                            System.out.println("Nenhum contato cadastrado.");
                        } else {
                            System.out.println("Lista de Contatos:");
                            for (int i = 0; i < contatos.length; i++) {
                                if (contatos[i] != null) {
                                    System.out.println("Nome: " + contatos[i] + " - Telefone: " + telefones[i]);
                                }
                            }
                        }
                        break;
                    case 4:
                        contatos = new String[20];
                        telefones = new String[20];
                        System.out.println("Agenda limpa com sucesso.");
                        break;
                    case 99:
                        System.out.println("Encerrando agenda.");
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }

            } while (opcao != 99);

        }

        public static int proximaPosicao(String[] contatos) {
            for (int i = 0; i < contatos.length; i++) {
                if (contatos[i] == null) {
                    return i;
                }
            }
            return -1;
        }

        public static int buscarContato(String nome, String[] contatos) {
            for (int i = 0; i < contatos.length; i++) {
                if (contatos[i] != null && contatos[i].equals(nome)) {
                    return i;
                }
            }
            return -1;
        }

        public static void excluirContato(int posicao, String[] contatos, String[] telefones) {
            for (int i = posicao; i < contatos.length - 1; i++){contatos[i] = null;
                telefones[i] = null;
        }
    }
}
