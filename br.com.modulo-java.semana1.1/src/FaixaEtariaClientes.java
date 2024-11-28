import java.sql.SQLOutput;

/*
 * 4) Crie uma listagem de clientes utilizando variáveis primitivas
 *
* Objetivo
* Aplicar o conhecimento do curso “Java JRE e JDK: compile e execute o seu programa.
* ” módulo “4. Tipos e variáveis”.

* Tarefa
* Nosso desafio será criar uma listagem de clientes utilizando o console do Intellij
* utilizando variáveis primitivas para representar o ano de nascimento dos clientes;
 * */

public class FaixaEtariaClientes {

    static final int anoAtual = 2024;

    public static void exibeClientes(String NomeCliente, int anoDeNascimento) {
        System.out.println("\n-----------------------------");

        System.out.println("Nome: " + NomeCliente);
        System.out.println("Data de Nacimento: " + anoDeNascimento);

        int idade = anoAtual - anoDeNascimento;
        String faixaEtaria = "";

        System.out.println("Idade: " + idade);


        if(idade <= 17) {
            faixaEtaria = "ADOLESCENTE";
        } else if(idade >= 18 && idade <= 29) {
            faixaEtaria = "JOVEM";
        } else if(idade >= 30 && idade <= 59) {
            faixaEtaria = "ADULTO";
        } else {
            faixaEtaria = "IDOSO";
        }

        System.out.println("Característica Etária: " + faixaEtaria);
    }

    public static void main(String[] args) {
        System.out.println(">>> Listagem dos Clientes");
        System.out.println(">>> Ano atual: " + anoAtual);

        exibeClientes("Fulano", 1980);
        exibeClientes("Beltrano", 2000);
    }
}
