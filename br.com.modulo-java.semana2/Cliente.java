/*
 * 5) Crie as classes Cliente e Endereco
 *
 * Objetivo
 * Aplicar o conhecimento do curso “Java OO:  aplicando a Orientação a Objetos” para criação de objetos com
 * objetivo de adotarmos um outro modo de criação de software que não seja procedural.
 *
 * Tarefa
 * Crie a classe Cliente com seus respectivos atributos:

 * Nome (Texto)

 * CPF (Texto)

 * E-mail (Texto)

 * Profissão (Texto).

 * Telefone (Texto)

 * Endereço (Endereco)
 * */

public class Cliente {

    private String nome;
    private String cpf;
    private String email;
    private String telefone;
    private Endereco endereco;

    Cliente() {

    }
    /*
     * 8) Forneça várias opções de criação da classe Cliente.
     * */

    public Cliente(String cpf) {
        this.cpf = cpf;
    }

    public Cliente(String cpf, String email) {
        this.cpf = cpf;
        this.email = email;
    }



    public Cliente(String nome, String cpf, String email, String telefone, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public void imprimeInformacoes() {
        System.out.println("=============================");
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Email: " + this.email);
        System.out.println("Telefone: " + this.telefone);
        this.endereco.imprimeInformacoes();
        System.out.println("=============================\n");
    }


}
