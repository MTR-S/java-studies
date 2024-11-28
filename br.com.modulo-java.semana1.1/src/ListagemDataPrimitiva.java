
/*
 * 6) Alterar a listagem dos clientes para utilizar o nome dos clientes em variáveis do tipo String
 *
 * Objetivo
 * Aplicar o conhecimento do curso “Java JRE e JDK: compile e execute o seu programa.
 * ” módulo “4.  Trabalhando com caracteres”.

* Tarefa
* Nosso desafio será alterar a listagem de clientes para utilizar as variáveis do tipo String
* para representar os nomes dos clientes.
 */

public class ListagemDataPrimitiva {

    public static void main(String[] args) {

        int dataDeNascimento1 = 1980;
        int dataDeNascimento2 = 2000;


        System.out.println(">>> Listagem dos Clientes");

        System.out.println("\n-----------------------------");

        System.out.println("Nome: Fulano");
        System.out.println("Data de Nacimento: " + dataDeNascimento1);

        System.out.println("\n-----------------------------");

        System.out.println("Nome: Sicrano");
        System.out.println("Data de Nacimento: " + dataDeNascimento2);
    }
}
