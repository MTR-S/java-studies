/*
 * 3) Compare dois produtos
 *
 * Objetivo
 * Aplicar o conhecimento do curso “Java OO:  aplicando a Orientação a Objetos”
 * para executar uma operação comum do dia a dia que é a comparação entre dois objetos em uma aplicação.
 *
 * Tarefa
 * Crie uma nova classe de teste para comparar dois produtos.
 * */

public class ComparaProduto {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Livro", "Conjunto de folhas impressas");
        Produto produto2 = new Produto("Outro Livro", "Conjunto de folhas impressas");

        System.out.println(produto1 == produto2);
        // Resultado = false, pois neste caso esses dois objetos apontam para dois locais diferentes dentro da memória.

        //-------------------------------------------------------------------------------------------------------------

        /*
         * 4) Crie um comportamento de impressão dos dados de um produto
         *
         * Objetivo
         * Aplicar o conhecimento do curso “Java OO:  aplicando a Orientação a Objetos”
         * para executar uma operação comum do dia a dia que é a comparação entre dois objetos em uma aplicação.
         *
         * Tarefa
         * Crie um comportamento para a classe Produto com o objetivo de imprimir no console conforme abaixo:
         *
         * >> Dados do produto
         * :: Nome: Livro
         * :: Descrição: Conjunto de folhas impressas.
         * */

        produto1.imprimeTextoEDescricao();
        produto2.imprimeTextoEDescricao();
    }
}
