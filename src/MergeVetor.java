import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeVetor {
    public static FilaVetor mergeVetores(FilaVetor a, FilaVetor b) {
        List<Integer> lista = new ArrayList<>();

        while (!a.getDados().isEmpty()) {
            lista.add(a.remove());
        }

        while (!b.getDados().isEmpty()) {
            lista.add(b.remove());
        }

        Collections.sort(lista);

        FilaVetor c = new FilaVetor();
        for (int val : lista) {
            c.insere(val);
        }

        return c;
    }
}
