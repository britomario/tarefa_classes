package br.com.mbrito;
public class Pessoa {

    // Atributos da classe
    private String nome;
    private String sobrenome;
    private int idade;

    // Construtor da classe
    public Pessoa(String nome, String sobrenome, int idade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
    }

    // Métodos da classe para acessar e modificar os atributos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Método para exibit informações sobre a pessoa
    public void exibirInformacoes () {
        System.out.println("Olá meu nome é " + nome + " " + sobrenome + " e tenho " + idade + " anos.");
    }
}