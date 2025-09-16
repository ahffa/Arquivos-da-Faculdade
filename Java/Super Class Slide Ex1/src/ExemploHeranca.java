// Superclasse (Classe Mãe)
class Veiculo {
protected String marca;
protected String modelo;
public void mover() {
System.out.println("O veículo está se movendo.");
}
}
// Subclasse (Classe Filha)
class Carro extends Veiculo {
private int numeroPortas;
public Carro(String marca, String modelo, int numeroPortas) {
// O 'super' chama o construtor da classe mãe
this.marca = marca;
this.modelo = modelo;
this.numeroPortas = numeroPortas;
}
public void exibirDetalhes() {
System.out.println("Marca: " + marca);
System.out.println("Modelo: " + modelo);
System.out.println("Número de Portas: " + numeroPortas);
}
}
class ExemploHeranca {
public static void main(String[] args) {
Carro meuCarro = new Carro("Toyota", "Corolla", 4);
meuCarro.mover(); // Método herdado da classe Veiculo
meuCarro.exibirDetalhes(); // Método próprio da classe Carro
}
}