public class Main {
    public static void main(String[] args) {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();

        lista.adiciona(10);
        lista.adiciona(20);
        lista.adiciona(30);

        lista.imprime(); 
        // 10 -> 20 -> 30 -> null
    }
}
