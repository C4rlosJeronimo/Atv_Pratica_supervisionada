import java.util.ArrayList;
import java.util.List;

public class FilaVetor {
    private List<Integer> dados = new ArrayList<>();

    public void insere(int valor) {
        dados.add(valor);
        System.out.println("Elemento " + valor + " inserido na fila.");
    }

    public Integer remove() {
        if (dados.isEmpty()) return null;
        int valor = dados.remove(0);
        System.out.println("Elemento removido da fila: " + valor);
        return valor;
    }

    public void imprime() {
        System.out.print("Fila: ← ");
        for (int val : dados) {
            System.out.print(val + " ");
        }
        System.out.println("←");
    }

    public List<Integer> getDados() {
        return dados;
    }

    public void setDados(List<Integer> dados) {
        this.dados = dados;
    }
}
