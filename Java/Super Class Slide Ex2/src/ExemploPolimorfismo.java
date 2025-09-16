class Animal {
    public void fazerSom() {
        System.out.println("O animal faz um som.");
    }
}
class Cachorro extends Animal {
    @Override
    public void fazerSom() {
        System.out.println("O cachorro late.");
    }
}
class Gato extends Animal {
    @Override
    public void fazerSom() {
        System.out.println("O gato mia.");
    }
}
public class ExemploPolimorfismo {
    public static void main(String[] args) {
        // A variável 'animal' pode referenciar diferentes objetos
        Animal meuAnimal = new Cachorro();
        meuAnimal.fazerSom(); // Saída: "O cachorro late."

        meuAnimal = new Gato();
        meuAnimal.fazerSom(); // Saída: "O gato mia."
    }
}
