import java.util.*;

public class MergeEncadeado {
    public static FilaEncadeada mergeFilas(FilaEncadeada a, FilaEncadeada b) {
        List<Integer> lista = new ArrayList<>();

        while (!a.isEmpty()) {
            lista.add(a.remove());
        }

        while (!b.isEmpty()) {
            lista.add(b.remove());
        }

        Collections.sort(lista); // Ordenação automática

        FilaEncadeada c = new FilaEncadeada();
        for (int val : lista) {
            c.insere(val);
        }

        return c;
    }
}
