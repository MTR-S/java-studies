public class Livro {
    String titulo;
    String autor;
    String ano;
    String categoria;

    public Livro(String titulo, String autor, String ano, String categoria) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.categoria = categoria;
    }

    public void exibeDadosDosLivros() {
        System.out.println("=====================================");
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Ano: " + this.ano);
        System.out.println("Categoria: " + this.categoria);
        System.out.println("=====================================");
    }
}
