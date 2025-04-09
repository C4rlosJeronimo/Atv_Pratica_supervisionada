import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Fila filaA = new Fila();
        Fila filaB = new Fila();

        System.out.println("--- Inserção na Fila A (Lista Encadeada) ---");
        System.out.print("Quantos elementos deseja inserir na Fila A? ");
        int nA = sc.nextInt();
        for (int i = 0; i < nA; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            filaA.insere(sc.nextInt());
        }

        System.out.println("--- Inserção na Fila B (Lista Encadeada) ---");
        System.out.print("Quantos elementos deseja inserir na Fila B? ");
        int nB = sc.nextInt();
        for (int i = 0; i < nB; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            filaB.insere(sc.nextInt());
        }

        System.out.println("Fila A:");
        filaA.imprime();
        System.out.println("Fila B:");
        filaB.imprime();

        Fila filaC = MergeEncadeado.mergeFilas(filaA, filaB);

        System.out.println("Fila C (Resultado do Merge):");
        filaC.imprime();

        // Pilha
        Pilha pilha = new Pilha();
        System.out.println("\n--- Inserção de elementos em uma Pilha ---");
        System.out.print("Quantos elementos deseja inserir na Pilha? ");
        int nP = sc.nextInt();
        for (int i = 0; i < nP; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            pilha.insere(sc.nextInt());
        }
        pilha.imprime();

        System.out.print("Remover elemento da pilha? (s/n): \n");
        if (sc.next().equalsIgnoreCase("s")) {
            pilha.remove();
        }

        // Fila com vetores
        System.out.println("\n--- Merge com Vetores ---");
        FilaVetor filaVA = new FilaVetor();
        FilaVetor filaVB = new FilaVetor();

        System.out.print("Quantos elementos deseja inserir na FilaVetor A? ");
        int nvA = sc.nextInt();
        for (int i = 0; i < nvA; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            filaVA.insere(sc.nextInt());
        }

        System.out.print("Quantos elementos deseja inserir na FilaVetor B? ");
        int nvB = sc.nextInt();
        for (int i = 0; i < nvB; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            filaVB.insere(sc.nextInt());
        }

        System.out.println("FilaVetor A:");
        filaVA.imprime();
        System.out.println("FilaVetor B:");
        filaVB.imprime();

        FilaVetor filaVC = MergeVetor.mergeVetores(filaVA, filaVB);

        System.out.println("FilaVetor C (Resultado do Merge):");
        filaVC.imprime();

        sc.close();
    }
}
