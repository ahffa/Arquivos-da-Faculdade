class Cachorro {
    //Atributos(características)
    String raça;
    String cor;
    String nome;
    int idade;
    int altura;
    int velocidade;
    int força;
    int fome;
    int sono;

    //Métodos(comportamentos)
    public void correr() {
        velocidade++;
        System.out.println("Correndo! Velocidade atual: " + velocidade);
}
    public void parar() {
        if (velocidade>0) {
            velocidade--;
        }
        System.out.println("Parando! Velocidade atual: " + velocidade);
}
    public void latir() {
        altura++;
        System.out.println("au au! altura atual: " + altura);
}
    public void morder() {
        força++;
        System.out.println("Crunch! Força atual: " + força);
}
    public void comer() {
        fome++;
        System.out.println("Nham Nham! Fome autal " + fome);
}
    public void dormir() {
        sono++;
        System.out.println("Z Z Z! Sono atual " + sono);
    }
} 
    //Agora, vamos criar objetos a partir dessa classe 
     public class ExemploCachorro {
        public static void main(String[]args) {
        //Criando o primeiro ojeto e um Cachorro Preto
        //O objeto "cachorro1" é uma instância da classe cachorro
        Cachorro cachorro1 = new Cachorro();
        cachorro1.raça = "Vira-lata";
        cachorro1.cor = "Preto";
        cachorro1.nome = "Nega";
        cachorro1.idade = 12;   
        
        //Criando o segundo obejeto, um Cachorro Marrom
        //O objeto "cachorro2" é uma nova e separada instância da Classe Cachorro
        Cachorro cachorro2 = new Cachorro();
        cachorro2.raça = "Pastor-Alemão";
        cachorro2.cor = "Marrom";
        cachorro2.nome = "Lesi";
        cachorro2.idade = 8;

        //Criando objeto tem seus próprios atributos e comportamentos 
        System.out.println("Cachorro1:" + cachorro1.nome + cachorro1.cor + cachorro1.raça + cachorro1.idade);
        System.out.println("Cachorro2:" + cachorro2.nome + "de cor" + cachorro2.cor + "de raça" + cachorro2.raça + "idade" + cachorro2.idade);
    }
}