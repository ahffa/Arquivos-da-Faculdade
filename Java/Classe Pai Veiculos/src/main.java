class Veiculo {
    String marca;
    String modelo;
    String cor;
    int ano;
    int velocidade;

    public Veiculo(String marca, String modelo, String cor, int ano, int velocidade) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.velocidade = velocidade;
    }

    public void acelerar() {
        this.velocidade += 10;
    }

    public void frear() {
        this.velocidade -= 10;
    }

    public void mostrarVelocidade() {
        System.out.println("Velocidade atual: " + this.velocidade + " km/h");
    }
}

class Carro extends Veiculo {

    public Carro(String marca, String modelo, String cor, int ano, int velocidade) {
        super(marca, modelo, cor, ano, velocidade);
    }
}

class Portas extends Veiculo {
    String janela;
    int quantidadePortas;

    public Portas(String marca, String modelo, String cor, int ano, int velocidade) {
        super(marca, modelo, cor, ano, velocidade);
    }

    public void abrirPorta() {
        System.out.println("Porta aberta");
    }

    public void fecharPorta() {
        System.out.println("Porta fechada");
    }
}

class Banco extends Veiculo {
    String tipoBanco;
    String corBanco;

    public Banco(String marca, String modelo, String cor, int ano, int velocidade) {
        super(marca, modelo, cor, ano, velocidade);
    }

    public void ajustarBanco() {
        System.out.println("Banco ajustado");
    }

    public void aquecerBanco() {
        System.out.println("Banco aquecido");
    }
}

class Rodas extends Veiculo {
    String tipoRoda;
    int tamanhoRoda;

    public Rodas(String marca, String modelo, String cor, int ano, int velocidade) {
        super(marca, modelo, cor, ano, velocidade);
    }

    public void trocarRoda() {
        System.out.println("Roda trocada");
    }

    public void calibrarRoda() {
        System.out.println("Roda calibrada");
    }
}

public class main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Toyota", "Corolla", "Prata", 2020, 0);

        meuCarro.acelerar();
        meuCarro.mostrarVelocidade();

        meuCarro.frear();
        meuCarro.mostrarVelocidade();

        // Exemplo com portas
        Portas portas = new Portas("Toyota", "Corolla", "Prata", 2020, 0);
        portas.abrirPorta();
        portas.fecharPorta();
    }
}
