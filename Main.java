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
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy");

        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
        ArrayList<Livro> livros = new ArrayList<Livro>();
        ArrayList<Emprestimo> emprestimos = new ArrayList<Emprestimo>();

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

                                    System.out.println("\t" + (i + 1) + "- " + uTemp.getNome());
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

                                Date ano = null;
                                try {
                                    ano = sdf1.parse(anoStr);
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
                        System.out.println("\n[1] Realizar Empréstimo");
                        System.out.println("[2] Devolver Livro");
                        System.out.println("[3] Listar Livros Disponíveis");
                        System.out.println("[4] Listar Usuários com Livros Emprestados");
                        System.out.println("[5] Renovar Empréstimo");
                        System.out.println("[0] Voltar");

                        opcaoSubMenu = sc.nextInt();

                        switch (opcaoSubMenu) {
                            case 1:
                                System.out.println("========= Realizar Empréstimo =========");

                                System.out.println("Digite o ID do usuário: ");
                                int idUserEmprestimo = Integer.parseInt(sc1.nextLine());
                                Usuario usuarioEmprestimo = null;

                                for (Usuario uTemp : usuarios) {
                                    if (uTemp.getIdUsuario() == idUserEmprestimo) {
                                        usuarioEmprestimo = uTemp;
                                        break;
                                    }
                                }
                                if (usuarioEmprestimo == null) {
                                    System.out.println("Usuário não encontrado!!");
                                    break;
                                }

                                System.out.println("Digite o título do livro: ");
                                String tituloEmprestimo = sc1.nextLine();
                                Livro livroEmprestimo = null;

                                for (Livro lTemp : livros) {
                                    if (lTemp.getTitulo().equalsIgnoreCase(tituloEmprestimo) && lTemp.getSituacao().equalsIgnoreCase("disponivel")) {
                                        livroEmprestimo = lTemp;
                                        break;
                                    }
                                }
                                if (livroEmprestimo == null) {
                                    System.out.println("Livro não disponível ou não encontrado!!");
                                    break;
                                }

                                System.out.println("Digite a data de reserva (dd/MM/yyyy): ");
                                String dataReservaStr = sc1.nextLine();
                                System.out.println("Digite a data de devolução (dd/MM/yyyy): ");
                                String dataDevolucaoStr = sc1.nextLine();

                                Date dataReserva = null;
                                Date dataDevolucao = null;
                                try {
                                    dataReserva = sdf.parse(dataReservaStr);
                                    dataDevolucao = sdf.parse(dataDevolucaoStr);
                                } catch (ParseException e) {
                                    System.out.println("Formato de data inválido!");
                                    break;
                                }

                                int codReserva = emprestimos.size() + 1;
                                Emprestimo emprestimo = new Emprestimo(codReserva, livroEmprestimo, usuarioEmprestimo, dataReserva, dataDevolucao);
                                emprestimos.add(emprestimo);

                                livroEmprestimo.setSituacao("indisponivel");
                                System.out.println(codReserva);
                                System.out.println("Empréstimo realizado!!");
                                break;

                            case 2:
                                System.out.println("========= Devolver Livro =========");

                                System.out.println("Digite o código da reserva: ");
                                int codReservaDevolucao = Integer.parseInt(sc1.nextLine());

                                Emprestimo emprestimoDevolucao = null;
                                for (Emprestimo eTemp : emprestimos) {
                                    if (eTemp.getCodReserva() == codReservaDevolucao) {
                                        emprestimoDevolucao = eTemp;
                                        break;
                                    }
                                }
                                if (emprestimoDevolucao == null) {
                                    System.out.println("Empréstimo não encontrado!!");
                                    break;
                                }

                                Livro livroDevolvido = emprestimoDevolucao.getLivro();
                                livroDevolvido.setSituacao("disponivel");

                                emprestimos.remove(emprestimoDevolucao);

                                System.out.println("Livro devolvido com sucesso!");
                                break;

                            case 3:
                                System.out.println("========= Listar Livros Disponíveis =========");

                                for (Livro lTemp : livros) {
                                    if (lTemp.getSituacao().equalsIgnoreCase("disponivel")) {
                                        System.out.println("\nTítulo: " + lTemp.getTitulo());
                                        System.out.println("Autor: " + lTemp.getAutor());
                                    }
                                }
                                break;

                            case 4:
                                System.out.println("========= Listar Usuários com Livros Emprestados =========");

                                for (Emprestimo eTemp : emprestimos) {
                                    System.out.println("\nUsuário: " + eTemp.getUsuario().getNome() + " - Livro: " + eTemp.getLivro().getTitulo());
                                }
                                break;

                            case 5:
                                System.out.println("========= Renovar Empréstimo =========");

                                System.out.println("Digite o código da reserva: ");
                                int codReservaRenovacao = Integer.parseInt(sc1.nextLine());

                                Emprestimo emprestimoRenovacao = null;
                                for (Emprestimo eTemp : emprestimos) {
                                    if (eTemp.getCodReserva() == codReservaRenovacao) {
                                        emprestimoRenovacao = eTemp;
                                        break;
                                    }
                                }

                                if (emprestimoRenovacao == null) {
                                    System.out.println("Empréstimo não encontrado!!");
                                    break;
                                }

                                System.out.println("Digite a nova data de devolução (dd/MM/yyyy): ");
                                String novaDataDevolucaoStr = sc1.nextLine();

                                Date novaDataDevolucao = null;
                                try {
                                    novaDataDevolucao = sdf.parse(novaDataDevolucaoStr);
                                } catch (ParseException e) {
                                    System.out.println("Formato de data inválido!");
                                    break;
                                }

                                emprestimoRenovacao.setDataDevolucao(novaDataDevolucao);
                                System.out.println("Empréstimo renovado com sucesso!");
                                break;

                            case 0:
                                System.out.println("Voltando ao menu principal!");
                                break;
                            default:
                                System.out.println("Opção inválida!");
                                break;
                        }
                    }
                    break;
                case 0:
                    System.out.println("\nAté a próxima!! ");
                    break;
                default:
                    System.out.println("\nOpção inválida!");
                    break;
            }
        }
    }
}
