// Classe filha, que herda de Animal
class Passaro extends Animal {
   // Construtor da classe filha
   public Passaro(String nome, String raca) {
        // Chama o construtor da classe pai
        // Isso é necessário para inicializar os atributos herdados
        super(nome, raca);
    }

    // Métodos específico da classe Passaro
    public void voar() {
        System.out.println(nome + "está Voando!"); {
    }
}
    public void cantar() {
        System.out.println(nome + "está cantando: Fien Fien Fien!"); {

    }

}        
}