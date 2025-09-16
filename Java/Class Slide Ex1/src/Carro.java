// A classe Carro serve como o "molde".
// Ela define a estrutura, mas não é um objeto real.
public class Carro {
// Atributos (características)
String modelo;
String cor;
int ano;
int velocidade;
// Métodos (comportamentos)
public void acelerar() {
velocidade++;
System.out.println("Acelerando! Velocidade atual: " + velocidade);
}
public void frear() {
if (velocidade > 0) {
velocidade--;
}
System.out.println("Freando! Velocidade atual: " + velocidade);
}
}

// Agora, vamos criar objetos a partir dessa classe
class ExemploCarro {
public static void main(String[] args) {
// Criando o primeiro objeto, um carro vermelho.
// O objeto "carro1" é uma instância da classe Carro.
Carro carro1 = new Carro();
carro1.modelo = "Fusca";
carro1.cor = "Vermelho";
carro1.ano = 1970;
// Criando o segundo objeto, um carro azul.
// O objeto "carro2" é uma nova e separada instância da classe Carro.
Carro carro2 = new Carro();
carro2.modelo = "Ferrari";
carro2.cor = "Azul";
carro2.ano = 2023;
// Cada objeto tem seus próprios atributos e comportamentos.
System.out.println("Carro 1: " + carro1.modelo + " de cor " + carro1.cor);
System.out.println("Carro 2: " + carro2.modelo + " de cor " + carro2.cor);
}
}