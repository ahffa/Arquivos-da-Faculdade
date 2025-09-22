class Pessoa {
    private String nome;
    private int idade;

    // Setter para nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Setter para idade com verificação
    public void setIdade(int idade) {
        if (idade >= 0) { // idade não pode ser negativa
            this.idade = idade;
        } else {
            System.out.println("Idade inválida");
        }
    }

    // Getter para nome
    public String getNome() {
        return this.nome;
    }

    // Getter para idade
    public int getIdade() {
        return this.idade;
    }
}

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Julin");
        pessoa.setIdade(-5);
    }
}