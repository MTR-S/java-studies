import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static String bibliotecario = "Matheus";
    static int livrosDisponiveis = 150;
    static int livrosEmprestados = 0;
    static double multaPorDia = 2.50;

    static ArrayList<Livro> livrosCadastrados = new ArrayList<>();

    public static void main(String[] args) {

        Livro livro1 = new Livro("Harry Potter e a Pedra Filosofal", "J.K. Rowling", "HP001", 45.90, 2.00, 3);
        Livro livro2 = new Livro("Percy Jackson e o Ladrão de Raios", "Rick Riordan", "PJ001", 39.90,  2.00, 2);
        Livro livro3 = new Livro("O Hobbit", "J.R.R. Tolkien", "HB001", 55.90, 2.00, 2);

        Livro[] acervoDeLivros = new Livro[3];
        acervoDeLivros[0] = livro1;
        acervoDeLivros[1] = livro2;
        acervoDeLivros[2] = livro3;

        livrosDisponiveis = acervoDeLivros.length;
        System.out.println(livrosDisponiveis);

        Scanner scanner = new Scanner(System.in);
        String opcao;

        do {
            exibeMenu();
            opcao = scanner.next();

            switch (opcao) {
                case "1":
                    System.out.println("🔍 Consultando o acervo...");
                    consultaAcervo(acervoDeLivros);
                    break;
                case "2":
                    System.out.println("📕 Emprestando um livro...");
                    break;
                case "3":
                    System.out.println("📗 Devolvendo um livro...");
                    devolverLivro();
                    break;
                case "4":
                    System.out.println("💰 Calculando a multa...");
                    multa();
                    break;
                case "5":
                    System.out.println("📚 Vamos cadastrar um livro...");
                    cadastraLivrosNoSistema();
                    break;
                case "6":
                    System.out.println("📚 Vamos buscar seu livro");
                    buscaPorLivros();
                    break;
                case "7":
                    System.out.println("👋 Saindo do sistema. Até mais!" + bibliotecario);
                    break;
                default:
                    System.out.println("❌ Opção inválida. Tente novamente!");
                    break;
            }
            System.out.println();
        } while (!opcao.equals("7"));

        scanner.close();


    }

    public static void exibeMenu() {
        System.out.println("=====================================");
        System.out.println("📚 Bem-vindo ao Sistema da Biblioteca 📚");
        System.out.println("=====================================");
        System.out.println("1  Consultar acervo");
        System.out.println("2  Emprestar livro");
        System.out.println("3  Devolver livro");
        System.out.println("4  Calcular multa");
        System.out.println("5  Cadastrar Livro");
        System.out.println("6  Sistema de Busca de Livros");
        System.out.println("7  Sair");
        System.out.println("=====================================");
        System.out.print("➡️ Escolha uma opção: ");
    }

    public static void consultaAcervo(Livro[] acervoDeLivros) {
        System.out.println("\n=====================================");
        System.out.println("📚 Acervo de livros 📚");
        System.out.println("=====================================\n");

        for(int i = 0; i < acervoDeLivros.length; i++) {
            System.out.println("=====================================");
            System.out.printf("Livro (%d) Cadastrado\n", i);
            System.out.println("Título: " + acervoDeLivros[i].titulo);
            System.out.println("Código: " + acervoDeLivros[i].codigo);
            System.out.println("Autor: " + acervoDeLivros[i].autor);
            System.out.println("Preço: " + acervoDeLivros[i].preco);
            System.out.println("Quantidade disponível: " + acervoDeLivros[i].quantidadeDeExemplares);
            System.out.println("=====================================");
        }

        System.out.println("\n==> Total de livros DISPONÍVEIS no acervo: " + acervoDeLivros.length);

    }

    public static void emprestarLivro(Livro[] acervoDeLivros) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o código do livro desejado:");
        String codigoDoLivro = sc.nextLine();

        int estadoDoLivro = procuraLivroPorCodigo(codigoDoLivro, acervoDeLivros);

        if(estadoDoLivro < 0) {

        }

        if(livrosDisponiveis > 0) {
            livrosDisponiveis --;
            livrosEmprestados ++;

            System.out.println("Pronto, livro emprestado, aproveite sua escolha! \uD83E\uDD13");

            return;
        }

        System.out.println("Desculpe, infelizmente não temos livros disponíveis no momento! \uD83D\uDE15");
    }

    public static int procuraLivroPorCodigo(String codigoDoLivro, Livro[] acervoDeLivros) {
        for(int i = 0; i < acervoDeLivros.length; i++) {
            if(codigoDoLivro.equals(acervoDeLivros[i].codigo) && acervoDeLivros[i].quantidadeDeExemplares > 0) {
                return 0;
            }
        }
        return -1;
    }

    public static void devolverLivro() {
        if(livrosDisponiveis < 150) {
            livrosDisponiveis ++;
            livrosEmprestados --;

            System.out.println("Pronto, livro devolvido, até mais! \uD83E\uDD13");

            return;
        }

        System.out.println("Acho que você se enganou, nosso acervo se encontra cheio! \uD83E\uDD14");
    }

    public static void multa() {
        double diasDeAtraso;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dias de atraso: ");
        diasDeAtraso = scanner.nextInt();

        double multa = diasDeAtraso * multaPorDia;

        System.out.printf("Você tem %.2f dias de atraso, logo sua multa ficará = %.2f\n", diasDeAtraso, multa);
    }

    public static void cadastraLivrosNoSistema() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=====================================");
        System.out.println("📚 Cadastro de Livro 📚");
        System.out.println("=====================================");

        System.out.println("1) Título: ");
        String titulo = scanner.nextLine();

        System.out.println("2) Autor: ");
        String autor = scanner.nextLine();

        System.out.println("3) Ano: ");
        String ano = scanner.nextLine();

        System.out.println("4) Categoria: ");
        String categoria = scanner.nextLine();

        livrosCadastrados.add(new Livro(titulo, autor, ano, categoria));
    }

    public static void buscaPorLivros() {
        Scanner scanner = new Scanner(System.in);
        String opcaoDeBusca;
        String referenciaAoLivro;

        System.out.println("Digite como você quer procurar o livro: ");


        System.out.println("=====================================");
        System.out.println("1 Título");
        System.out.println("2 Categoria");
        System.out.println("3 Autor");
        System.out.println("=====================================");


        opcaoDeBusca = scanner.next();

        System.out.println("Digite a sua referência ao livro: ");
        referenciaAoLivro = scanner.next();

        switch(opcaoDeBusca) {
            case "1":
                for (int i = 0; i < livrosCadastrados.size(); i++) {
                    if(livrosCadastrados.get(i).titulo.equals(referenciaAoLivro)){
                        System.out.printf("Título (%d) encontrado!\n", i + 1);
                        livrosCadastrados.get(i).exibeDadosDosLivros();
                    }
                }
                break;
            case "2":
                for (int i = 0; i < livrosCadastrados.size(); i++) {
                    if(livrosCadastrados.get(i).categoria.equals(referenciaAoLivro)){
                        System.out.printf("Categoria (%d) encontrado!\n", i + 1);
                        livrosCadastrados.get(i).exibeDadosDosLivros();
                    }
                }
                break;
            case "3":
                for (int i = 0; i < livrosCadastrados.size(); i++) {
                    if(livrosCadastrados.get(i).autor.equals(referenciaAoLivro)){
                        System.out.printf("Autor (%d) encontrado!\n", i + 1);
                        livrosCadastrados.get(i).exibeDadosDosLivros();
                    }
                }
                break;
            default:
                System.out.println("❌ Opção inválida. Tente novamente!");
                break;
        }



    }



}