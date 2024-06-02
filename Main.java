import java.util.Date;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        int opcaoMenu = 99;
        int opcaoSubMenu;

        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);

        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();

        System.out.println("\nSeja bem vindo à Biblioteca: ");

        while (opcaoMenu != 0) {

            System.out.println("\nEscolha uma das opções: ");

            System.out.println("[1] Usuário");
            System.out.println("[2] Livro");
            System.out.println("[3] Empréstimo");
            System.out.println("[0] Sair");

            opcaoMenu = sc.nextInt();

            switch (opcaoMenu) {
                case 1:
                    System.out.println("\nOpção Usuário selecionada: ");
                    opcaoSubMenu = 99;

                    while (opcaoSubMenu != 0) {
                        System.out.println("\n[1] Cadastrar Usuário");
                        System.out.println("[2] Buscar Usuário");
                        System.out.println("[3] Listar Usuário");
                        System.out.println("[4] Deletar Usuário");
                        System.out.println("[0] Voltar");

                        opcaoSubMenu = sc.nextInt();

                        switch (opcaoSubMenu) {
                            case 1:
                                System.out.println("===== Cadastrar Usuário =====");

                                System.out.println("Digite o nome: ");
                                String nome = sc1.nextLine();
                                System.out.println("Digite o CPF: ");
                                String cpf = sc1.nextLine();
                                System.out.println("Digite o RG: ");
                                String rg = sc1.nextLine();
                                System.out.println("Digite a cidade: ");
                                String cidade = sc1.nextLine();
                                System.out.println("Digite o bairro: ");
                                String bairro = sc1.nextLine();
                                System.out.println("Digite o nome da rua: ");
                                String logradouro = sc1.nextLine();
                                System.out.println("Digite o CEP: ");
                                String cep = sc1.nextLine();
                                System.out.println("Digite o ID do usuário: ");
                                int idUsuario = Integer.parseInt(sc1.nextLine());

                                Usuario u = new Usuario();
                                u.setNome(nome);
                                u.setCpf(cpf);
                                u.setRg(rg);
                                u.setCep(cep);
                                u.setLogradouro(logradouro);
                                u.setBairro(bairro);
                                u.setCidade(cidade);
                                u.setIdUsuario(idUsuario);

                                usuarios.add(u);
                                break;

                            case 2:
                                System.out.println("===== Buscar Usuário =====");
                                System.out.println("Digite o id do usuário: ");
                                int id = Integer.parseInt(sc1.nextLine());

                                boolean encontrado = false;
                                for (int i = 0; i < usuarios.size(); i++) {

                                    Usuario uTemp = usuarios.get(i);

                                    if (id == (usuarios.get(i).getIdUsuario())) {
                                        System.out.println("Usuário encontrado: ");
                                        System.out.println("\tID: " + uTemp.getIdUsuario());
                                        System.out.println("\tNome: " + uTemp.getNome());
                                        System.out.println("\tCPF: " + uTemp.getCpf());
                                        System.out.println("\tCEP: " + uTemp.getCep());
                                        encontrado = true;
                                        break;
                                    }
                                }

                                if (encontrado == false) {
                                    System.out.println("Usuário não encontrado!!");
                                }

                                break;
                            case 3:
                                System.out.println("===== Lista de Usuários =====");

                                for (int i = 0; i < usuarios.size(); i++) {
                                    Usuario uTemp = usuarios.get(i);

                                    System.out.println("Usuário " + (i+1) + ": ");
                                    System.out.println("\tNome: " + uTemp.getNome());
                                    System.out.println("\tCPF: " + uTemp.getCpf());
                                    System.out.println("\tID: " + uTemp.getIdUsuario());
                                    System.out.println("\tCEP: " + uTemp.getCep());
                                }
                                break;
                            case 4:
                                System.out.println("===== Deletar Usuário =====");

                                for (int i = 0; i < usuarios.size(); i++) {
                                    Usuario uTemp = usuarios.get(i);

                                    System.out.println("["+(i)+"]" + uTemp.getNome());
                                }
                                System.out.println("Digite o valor de referência: ");
                                int ref = Integer.parseInt(sc1.nextLine());

                                usuarios.remove(ref);

                                break;
                            case 0:
                                System.out.println("Voltando ao menu principal");
                                break;
                            default:
                                System.out.println("Opção inválida");
                                break;
                        }
                    }
                    break;

                case 2:
                    System.out.println("\nOpção Livro selecionada: ");
                    opcaoSubMenu = 99;

                    while (opcaoSubMenu != 0) {
                        System.out.println("[1] Cadastrar Livro");
                        System.out.println("[2] Buscar Livro");
                        System.out.println("[3] Listar Livro");
                        System.out.println("[4] Deletar Livro");
                        System.out.println("[0] Voltar");

                        opcaoSubMenu = sc.nextInt();

                        switch (opcaoSubMenu) {
                            case 1:
                                System.out.println("Opção 'Cadastrar Livro' selecionada");
                                break;
                            case 2:
                                System.out.println("Opção 'Buscar Livro' selecionada");
                                break;
                            case 3:
                                System.out.println("Opção 'Listar Livro' selecionada");
                                break;
                            case 4:
                                System.out.println("Opção 'Deletar Livro' selecionada");
                                break;
                            case 0:
                                System.out.println("Voltando ao menu principal");
                                break;
                            default:
                                System.out.println("Opção inválida");
                                break;
                        }
                    }
                    break;

                case 3:
                    System.out.println("\nOpção Empréstimo selecionada: ");
                    opcaoSubMenu = 99;

                    while (opcaoSubMenu != 0) {
                        System.out.println("[1] Realizar Empréstimo");
                        System.out.println("[2] Devolver Livro");
                        System.out.println("[3] Listar Livros Disponíveis");
                        System.out.println("[4] Listar Usuários com Livros Emprestados");
                        System.out.println("[0] Voltar");

                        opcaoSubMenu = sc.nextInt();

                        switch (opcaoSubMenu) {
                            case 1:
                                System.out.println("Opção 'Cadastrar Usuário' selecionada");
                                break;
                            case 2:
                                System.out.println("Opção 'Buscar Usuário' selecionada");
                                break;
                            case 3:
                                System.out.println("Opção 'Listar Usuário' selecionada");
                                break;
                            case 4:
                                System.out.println("Opção 'Deletar Usuário' selecionada");
                                break;
                            case 0:
                                System.out.println("Voltando ao menu principal");
                                break;
                            default:
                                System.out.println("Opção inválida");
                                break;
                        }
                    }
                    break;

                case 0:
                    System.out.println("\nAté a próxima!! ");
                    break;

                default:
                    System.out.println("\nOpção inválida");
                    break;
            }
        }

    }

}