/*
 * 5) Crie as classes Cliente e Endereco
 *
 * Resultado esperado:
 * Crie uma classe de teste para efetuar a criação desse objetos e criar a associação entre eles.
 * */

public class TesteClienteEndereco {
    public static void main(String[] args) {
        Endereco enderecoPadrao = new Endereco(" Meu Bairro", "Minha cidade", "Meu Complemento", "Meu estado", "Minha rua", "Meu numero");
        Cliente clientePadrao = new Cliente("Meu nome", "Meu cpf", "Meu email", "Meu telefone", enderecoPadrao);

        clientePadrao.imprimeInformacoes();
    }
}
