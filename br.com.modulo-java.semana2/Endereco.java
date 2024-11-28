/*
 * 5) Crie as classes Cliente e Endereco
 *
 * Objetivo
 * Aplicar o conhecimento do curso “Java OO:  aplicando a Orientação a Objetos” para criação de objetos com
 * objetivo de adotarmos um outro modo de criação de software que não seja procedural.
 *
 * Tarefa
 * Crie a classe Endereco com seus respectivos atributos:

 * Bairro (Texto)

 * Cidade (Texto)

 * Complemento (Texto)

 * Estado (Texto).

 * Rua (Texto)

 * Número (número)
 * */

public class Endereco {
    private String bairro;
    private String cidade;
    private String complemento;
    private  String estado;
    private String rua;
    private String numero;

    public Endereco(String bairro, String cidade, String complemento, String estado, String rua, String numero) {
        this.bairro = bairro;
        this.cidade = cidade;
        this.complemento = complemento;
        this.estado = estado;
        this.rua = rua;
        this.numero = numero;
    }

    public void imprimeInformacoes() {
        System.out.println("Bairro: " + this.bairro);
        System.out.println("Cidade: " + this.cidade);
        System.out.println("Complemento: " + this.complemento);
        System.out.println("Estado: " + this.estado);
        System.out.println("Rua: " + this.rua);
        System.out.println("Numero: " + this.numero);
    }
}
