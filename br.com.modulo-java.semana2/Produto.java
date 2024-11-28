
/*
 * 2) Crie a classe Produto
 *
 * Objetivo
 * Aplicar o conhecimento do curso “Java OO:  aplicando a Orientação a Objetos” para criação de objetos com
 * objetivo de adotarmos um outro modo de criação de software que não seja procedural.
 *
 * Tarefa
 * Cria a classe Produto com seus respectivos atributos:

 * Nome (Texto)

 * Descrição (Texto)

 * Preço Unitário (ponto flutuante)

 * Quantidade (numero).
 * */
public class Produto {
    public String texto;
    public String descricao;
    public double precoUnitario;
    int quantidade;

    /* 4) Crie um comportamento de impressão dos dados de um produto */

    Produto() {

    }

    /*
     * 7) Crie uma instância de Produto obrigando o usuário a fornecer um nome
     * */

    Produto(String texto) {
        this.texto = texto;
    }

    Produto(String texto, String descricao) {
        this.texto = texto;
        this.descricao = descricao;
    }

    public void imprimeTextoEDescricao() {
        System.out.println("=============================");
        System.out.println("Nome: " + this.texto);
        System.out.println("Descrição: " + this.descricao);
        System.out.println("=============================\n");

    }
}
