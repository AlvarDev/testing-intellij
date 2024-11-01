package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Os 5 primeiros números da sequência de Fibonacci são:");
        mostrarFibonacci(5);

        // Gera um objeto da Class Persona com atributos random e mostra o resultado
        Persona persona = new Persona("João", "Rua A, 123", 25, "123456789");
        persona.exibirInformacoes();

    }

    public static void mostrarFibonacci(int quantidade) {
        int num1 = 0, num2 = 1;

        for (int i = 1; i <= quantidade; ++i) {
            System.out.print(num1 + " ");

            // Proximo numero da sequencia
            int proximo = num1 + num2;
            num1 = num2;
            num2 = proximo;
        }
    }
}

// Gera uma class chamada Persona com os atributos: nome, endereço, idade
// e telefone.
// Crie um construtor para a classe Persona.
// Crie um método chamado exibirInformacoes() que imprime as informações da
// pessoa.
// Crie um método chamado getIdade() que retorna a idade da pessoa.
// Crie um método chamado setNome() que define o nome da pessoa.
// Crie um método chamado setEndereco() que define o endereço da pessoa.
// Crie um método chamado setIdade() que define a idade da pessoa.
// Crie um método chamado setTelefone() que define o telefone da pessoa.
// Crie um método chamado getEndereco() que retorna o endereço da pessoa.
// Crie um método chamado getTelefone() que retorna o telefone da pessoa.
// Crie um método chamado getNome() que retorna o nome da pessoa.

class Persona {
    private String nome;
    private String endereco;
    private int idade;
    private String telefone;

    public Persona(String nome, String endereco, int idade, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.idade = idade;
        this.telefone = telefone;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Idade: " + idade);
        System.out.println("Telefone: " + telefone);
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getNome() {
        return nome;
    }
}
// Fim da classe Persona