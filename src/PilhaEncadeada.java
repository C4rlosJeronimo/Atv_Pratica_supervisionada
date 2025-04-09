import java.util.Stack;

public class PilhaEncadeada {
    private Stack<Integer> pilha = new Stack<>();

    public void insere(int valor) {
        pilha.push(valor);
        System.out.println("Elemento " + valor + " inserido na pilha.");
    }

    public Integer remove() {
        if (pilha.isEmpty()) return null;
        int valor = pilha.pop();
        System.out.println("Elemento removido da pilha: " + valor);
        return valor;
    }

    public void imprime() {
        System.out.println("Pilha (do topo para a base):");
        for (int i = pilha.size() - 1; i >= 0; i--) {
            System.out.println(pilha.get(i));
        }
    }
}
