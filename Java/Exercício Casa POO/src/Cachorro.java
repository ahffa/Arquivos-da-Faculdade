// Classe filha, que herda de Animal
class Cachorro extends Animal {
    // Construtor da classe filha
    public Cachorro(String nome, String raca) {
        // Chama o construtor da classe pai
        // Isso é necessário para inicializar os atributos herdados
        super(nome, raca);
        
    }

    // Método específico da classe Cachorro
    public void latir() {
        System.out.println(nome + " está latindo: Au au!");
    }
}