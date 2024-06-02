import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        int opcaoMenu=99;
        int opcaoSubMenu=99;
        int opcaoSubMenu1=99;
        int opcaoSubMenu2=99;
        Scanner sc = new Scanner(System.in);

        System.out.println("\nSeja bem vindo à Biblioteca: ");

        while (opcaoMenu != 0) {

            System.out.println("\nEscolha uma das opções: ");

            System.out.println("1 - Usuário");
            System.out.println("2 - Livro");
            System.out.println("3 - Empréstimo");
            System.out.println("0 - Sair");

            opcaoMenu = sc.nextInt();

            switch (opcaoMenu){
                case 1:
                        System.out.println("\nOpção Usuário selecionada: ");

                        while (opcaoSubMenu != 0) {
                            System.out.println("1- Cadastrar Usuário");
                            System.out.println("2- Buscar Usuário");
                            System.out.println("3- Listar Usuário");
                            System.out.println("4- Deletar Usuário");
                            System.out.println("0- Voltar");

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

                case 2:
                    System.out.println("\nOpção Livro selecionada: ");

                    while (opcaoSubMenu1 != 0) {
                        System.out.println("1- Cadastrar Livro");
                        System.out.println("2- Buscar Livro");
                        System.out.println("3- Listar Livro");
                        System.out.println("4- Deletar Livro");
                        System.out.println("0- Voltar");

                        opcaoSubMenu1 = sc.nextInt();

                        switch (opcaoSubMenu1) {
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

                    while (opcaoSubMenu2 != 0) {
                        System.out.println("1- Realizar Empréstimo");
                        System.out.println("2- Devolver Livro");
                        System.out.println("3- Listar Livros Disponíveis");
                        System.out.println("4- Listar Usuários com Livros Emprestados");
                        System.out.println("0- Voltar");

                        opcaoSubMenu2 = sc.nextInt();

                        switch (opcaoSubMenu2) {
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