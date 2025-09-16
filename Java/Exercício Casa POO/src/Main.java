// Classe principal
public class Main {
    public static void main(String[] args) {
        // Criando um objeto da classe filha Cachorro
        Cachorro meuCachorro = new Cachorro("Rex", "Labrador");

        // Usando o método herdado da classe pai (Animal)
        System.out.println("Nome do cachorro: " + meuCachorro.nome + " Raça: " +meuCachorro.raca);
        meuCachorro.comer();
        meuCachorro.andar();
        // Usando o método específico da classe filha (Cachorro)
        meuCachorro.latir();

        // Criando um objeto da classe filha Passaro
        Passaro meuPassaro = new Passaro("Julin", "Galpone");

        // Usando o método herdado da classe pai (Animal)
         System.out.println("Nome do Passaro: " + meuPassaro.nome + " Raça: " +meuPassaro.raca);
        meuPassaro.comer();
        meuPassaro.voar();
        // Usando o método específico da classe filha (Passaro)
        meuPassaro.cantar();
    }
}
