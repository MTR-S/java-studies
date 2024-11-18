
/*
 * 5) Crie uma listagem de produtos utilizando variáves primitivas
 *
 * Objetivo
 * Aplicar o conhecimento do curso “Java JRE e JDK: compile e execute o seu programa.
 * ” módulo “4. Tipos e variáveis”.

* Tarefa
* Nosso desafio será criar uma listagem de produtos utilizando o console do Intellij
* ou Eclipse utilizando variáveis primitivas para representar o preço dos produtos.
*/

public class ListagemClientesString {
    public static void exibeClientes(String NomeCliente, int anoDeNascimento) {
        System.out.println("\n-----------------------------");

        System.out.println("Nome: " + NomeCliente);
        System.out.println("Data de Nacimento: " + anoDeNascimento);
    }
    public static void main(String[] args) {
        System.out.println(">>> Listagem dos Clientes");

        exibeClientes("Fulano", 1980);
        exibeClientes("Beltrano", 2000);
    }
}
