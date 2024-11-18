import java.util.Scanner;
/*
* 8) Crie um cabeçalho dinâmico utilizando fluxo com laços
*
* Objetivo
* Aplicar o conhecimento do curso “Java JRE e JDK: compile e execute o seu programa.”
* módulo “7. Controlando fluxo com laços”.
*
* Tarefa
* Nosso desafio será implementar um cabeçalho dinâmico utilizando laços.
*  O sistema deve apresentar as linhas conforme o valor da variável.
* */
public class CabecalhoDinamico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantidadeDeAsteriscos = 20;

        String asteriscos = "";

        for(int i = 0; i < quantidadeDeAsteriscos; i++) {
            asteriscos = asteriscos + "*";
        }

        System.out.println(asteriscos);
        System.out.println("Bem Vindo ao Comex");
        System.out.println(asteriscos);

    }
}
