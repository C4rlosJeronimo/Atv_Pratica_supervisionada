public class Fila {
    private No inicio;
    private No fim;

    public void insere(int valor) {
        No novo = new No(valor);
        if (fim == null) {
            inicio = fim = novo;
        } else {
            fim.prox = novo;
            fim = novo;
        }
        System.out.println("Elemento " + valor + " inserido na fila.");
    }

    public Integer remove() {
        if (inicio == null) return null;
        int valor = inicio.valor;
        inicio = inicio.prox;
        if (inicio == null) fim = null;
        System.out.println("Elemento removido da fila: " + valor);
        return valor;
    }

    public void imprime() {
        System.out.print("Fila: ← ");
        No atual = inicio;
        while (atual != null) {
            System.out.print(atual.valor + " ");
            atual = atual.prox;
        }
        System.out.println("←");
    }

    public java.util.List<Integer> toList() {
        java.util.List<Integer> lista = new java.util.ArrayList<>();
        No atual = inicio;
        while (atual != null) {
            lista.add(atual.valor);
            atual = atual.prox;
        }
        return lista;
    }

    public void fromList(java.util.List<Integer> lista) {
        this.inicio = this.fim = null;
        for (int val : lista) insere(val);
    }

    public boolean isEmpty() {
        return inicio == null;
    }
}
