// Classe pai
class Animal {

    // Atributo
    String nome;
    String raca;

    // Construtor
    public Animal(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;     
    }

    // Método Comer
    public void comer() {
        System.out.println(nome + " está comendo.");
    }
    // Método Andar    
    public void andar() {
        System.out.println(nome + " está andando.");    
        
    }
}