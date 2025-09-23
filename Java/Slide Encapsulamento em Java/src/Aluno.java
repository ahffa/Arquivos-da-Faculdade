// Exemplo BOM (com encapsulamento)
public class Aluno {
// 1. Atributos privados, inacessíveis de fora da classe
private String nome;
private int idade;
// 2. Método Getter para ler o nome
public String getNome() {
return this.nome;
}
public void setNome(String nome) {
this.nome = nome;
}
// 4. Método Getter para ler a idade
public int getIdade() {
return this.idade;
}
// 5. Método Setter para modificar a idade, AGORA COM VALIDAÇÃO
public void setIdade(int idade) {
if (idade >= 0) { // Regra de negócio: a idade deve ser positiva
this.idade = idade;
} else {
System.out.println("Erro: idade inválida!");
}
}
}