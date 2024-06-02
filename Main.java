import java.text.ParseException;
import java.text.SimpleDateFormat;
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
        ArrayList<Livro> livros = new ArrayList<Livro>();

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
                                System.out.println("Digite a data de nascimento (dd/MM/yyyy): ");
                                String dataNascStr = sc1.nextLine();
                                System.out.println("Digite o CPF: ");
                                String cpf = sc1.nextLine();
                                System.out.println("Digite o RG: ");
                                String rg = sc1.nextLine();
                                System.out.println("Digite o telefone: ");
                                String telefone = sc1.nextLine();
                                System.out.println("Digite o Email: ");
                                String email = sc1.nextLine();
                                System.out.println("Digite o CEP: ");
                                String cep = sc1.nextLine();
                                System.out.println("Digite a cidade: ");
                                String cidade = sc1.nextLine();
                                System.out.println("Digite o bairro: ");
                                String bairro = sc1.nextLine();
                                System.out.println("Digite o nome da rua: ");
                                String logradouro = sc1.nextLine();
                                System.out.println("Digite o ID do usuário: ");
                                int idUsuario = Integer.parseInt(sc1.nextLine());
                                System.out.println("Digite a data de cadastro (dd/MM/yyyy): ");
                                String dataCadStr = sc1.nextLine();

                                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                                Date dataNasc = null;
                                Date dataCad = null;
                                try {
                                    dataNasc = sdf.parse(dataNascStr);
                                    dataCad = sdf.parse(dataCadStr);
                                } catch (ParseException e) {
                                    System.out.println("Formato de data inválido!");
                                    break;
                                }

                                Usuario u = new Usuario(nome, dataNasc, cpf, rg, telefone, email, cep, cidade, bairro, logradouro, idUsuario, dataCad);

                                usuarios.add(u);
                                break;

                            case 2:
                                System.out.println("===== Buscar Usuário =====");
                                System.out.println("Digite o nome do usuário: ");
                                String nomeB = sc1.nextLine();
                                boolean encontrado = false;

                                for (int i = 0; i < usuarios.size(); i++) {

                                    Usuario uTemp = usuarios.get(i);

                                    if (nomeB.equalsIgnoreCase(usuarios.get(i).getNome())) {
                                        System.out.println("Usuário encontrado: ");
                                        System.out.println("\tNome: " + uTemp.getNome());
                                        System.out.println("\tID: " + uTemp.getIdUsuario());
                                        System.out.println("\tCPF: " + uTemp.getCpf());
                                        System.out.println("\tEmail: " + uTemp.getEmail());
                                        System.out.println("\tTelefone: " + uTemp.getTelefone());
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

                                    System.out.println("Usuário " + (i + 1) + ": ");
                                    System.out.println("\tNome: " + uTemp.getNome());
                                }
                                break;

                            case 4:
                                System.out.println("===== Deletar Usuário =====");

                                for (int i = 0; i < usuarios.size(); i++) {
                                    Usuario uTemp = usuarios.get(i);

                                    System.out.println("[" + (i) + "]" + uTemp.getNome());
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
                        System.out.println("\n[1] Cadastrar Livro");
                        System.out.println("[2] Buscar Livro");
                        System.out.println("[3] Listar Livro");
                        System.out.println("[4] Deletar Livro");
                        System.out.println("[0] Voltar");

                        opcaoSubMenu = sc.nextInt();

                        switch (opcaoSubMenu) {
                            case 1:
                                System.out.println("===== Cadastrar Livro =====");
                                System.out.println("Digite o título: ");
                                String titulo = sc1.nextLine();
                                System.out.println("Digite o autor: ");
                                String autor = sc1.nextLine();
                                System.out.println("Digite a categoria do livro: ");
                                String categoria = sc1.nextLine();
                                System.out.println("Digite o ano (yyyy): ");
                                String anoStr = sc1.nextLine();
                                System.out.println("Digite a situação (disponível/indisponível): ");
                                String situacao = sc1.nextLine();
                                System.out.println("Digite o tombo: ");
                                int tombo = Integer.parseInt(sc1.nextLine());

                                SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
                                Date ano = null;
                                try {
                                    ano = sdf.parse(anoStr);
                                } catch (ParseException e) {
                                    System.out.println("Formato de data inválido!");
                                    break;
                                }

                                Livro l = new Livro(titulo, autor, categoria, ano, situacao, tombo);

                                livros.add(l);
                                break;
                            case 2:
                                System.out.println("===== Buscar Livro =====");
                                System.out.println("Digite o título do livro: ");
                                String titulol = sc1.nextLine();
                                boolean encontrado = false;

                                for (int i = 0; i < livros.size(); i++) {

                                    Livro lTemp = livros.get(i);

                                    if (titulol.equals(livros.get(i).getTitulo())) {
                                        System.out.println("Livro encontrado: ");
                                        System.out.println("\tTitulo: " + lTemp.getTitulo());
                                        System.out.println("\tAutor: " + lTemp.getAutor());
                                        System.out.println("\tCategoria: " + lTemp.getCategoria());
                                        System.out.println("\tAno: " + lTemp.getAno());
                                        System.out.println("\tSituação: " + lTemp.getSituacao());
                                        encontrado = true;
                                        break;
                                    }
                                }

                                if (encontrado == false) {
                                    System.out.println("Livro não encontrado!!");
                                }
                                break;
                            case 3:
                                System.out.println("===== Lista de Livros =====");

                                for (int i = 0; i < livros.size(); i++) {
                                    Livro lTemp = livros.get(i);

                                    System.out.println("\t" + (i + 1) + ". " + lTemp.getTitulo());
                                }
                                break;
                            case 4:
                                System.out.println("===== Deletar Livro =====");

                                for (int i = 0; i < livros.size(); i++) {
                                    Livro lTemp = livros.get(i);

                                    System.out.println("[" + (i) + "] " + lTemp.getTitulo());
                                }
                                System.out.println("Digite o valor de referência: ");
                                int ref = Integer.parseInt(sc1.nextLine());

                                livros.remove(ref);
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
                                System.out.println("Opção 'Realizar Empréstimo' selecionada");
                                break;
                            case 2:
                                System.out.println("Opção 'Devolver Livro' selecionada");
                                break;
                            case 3:
                                System.out.println("Opção 'Listar Dispiníveis' selecionada");
                                break;
                            case 4:
                                System.out.println("Opção 'Listar Usuários com Livros Emprestados' selecionada");
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