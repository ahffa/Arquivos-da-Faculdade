// Classe pai
public class Animal {
    // Atributos
    protected String nome;
    protected String raca; // Implementando a raça

    // Construtor
    public Animal(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }

    // Método comum
    public void comer() {
        System.out.println(nome + " está comendo.");
    }

    // Método comum a todos os animais
    public void andar() {
        System.out.println(nome + " está andando.");
    }
}

// Interface para voar (nem todo animal voa)
interface Voador {
    void voar();
}

// Classe filha Cachorro
class Cachorro extends Animal {
    // Construtor
    public Cachorro(String nome, String raca) {
        super(nome, raca); // chama o construtor da classe Animal
    }

    // Método específico da classe Cachorro
    public void latir() {
        System.out.println(nome + " está latindo: Au au!");
    }
}

// Classe filha Pássaro que implementa a interface Voador
class Passaro extends Animal implements Voador {
    public Passaro(String nome, String raca) {
        super(nome, raca);
    }
    public void comer() {
        System.out.println(nome + " está comendo.");


    }

    @Override
    public void voar() {
        System.out.println(nome + " está voando!");
    }

    // Pássaro também pode cantar
    public void cantar() {
        System.out.println(nome + " está cantando: Piu piu!");
    }
}

// Classe principal
class Main {
    public static void main(String[] args) {
        // Criando um cachorro
        Cachorro meuCachorro = new Cachorro("Rex", "Labrador");
        System.out.println("Nome: " + meuCachorro.nome + " | Raça: " + meuCachorro.raca);
        meuCachorro.comer(); // herdado de Animal
        meuCachorro.andar(); // herdado de Animal
        meuCachorro.latir(); // método específico de Cachorro

        System.out.println("-------------------");

        // Criando um pássaro
        Passaro meuPassaro = new Passaro("Piu", "Calopsita");
        System.out.println("Nome: " + meuPassaro.nome + " | Raça: " + meuPassaro.raca);
        meuPassaro.comer();
        meuPassaro.andar();
        meuPassaro.voar();
        meuPassaro.cantar();
    }
}