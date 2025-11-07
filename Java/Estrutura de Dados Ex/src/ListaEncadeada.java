public class ListaEncadeada<T> {

    private No<T> inicio;

    public void adiciona(T elemento) {
        No<T> novo = new No<>(elemento);

        if (inicio == null) {
            inicio = novo;
            return;
        }

        No<T> atual = inicio;
        while (atual.getProximo() != null) {
            atual = atual.getProximo();
        }

        atual.setProximo(novo); // encadeia
    }

    public void imprime() {
        No<T> atual = inicio;
        while (atual != null) {
            System.out.print(atual.getElemento() + " -> ");
            atual = atual.getProximo();
        }
        System.out.println("null");
    }
}
