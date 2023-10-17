package br.com.mbrito;

/**
 * @author mariobrito
 */

public class Main {
    public static void main(String[] args) {

        // Criando uma instância da classe Pessoa
        Pessoa pessoa1 = new Pessoa("Mario", "Brito", 27);

        // Acessando os atributos e métodos da instância
        pessoa1.exibirInformacoes();

        // Modificando a idade da pessoa
        pessoa1.setIdade(28);

        // Exibindo as informações atualizadas
        pessoa1.exibirInformacoes();
    }
}