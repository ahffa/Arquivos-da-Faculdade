// Exemplo de uso da classe Aluno com encapsulamento
public class Main{
    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        aluno.setNome("Maria");
        aluno.setIdade(-5); // Inválido, não altera

        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Idade: " + aluno.getIdade()); // Continua 0
    }
}
