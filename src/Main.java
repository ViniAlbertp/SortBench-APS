
public class Main {

    public static void main(String[] args) {
        int[] vetor = {5, 2, 4, 1, 9, 3};

        algoritmos.InsertionSort insertion = new algoritmos.InsertionSort();
        insertion.ordenar(vetor);

        System.out.println(java.util.Arrays.toString(vetor));
        System.out.println("Comparações: " + insertion.getComparacoes()
                + " | Trocas: " + insertion.getTrocas());

        int[] vetor2 = {5, 2, 4, 1, 9, 3};
        algoritmos.HeapSort heap = new algoritmos.HeapSort();
        heap.ordenar(vetor2);
        System.out.println(java.util.Arrays.toString(vetor2));
        System.out.println("Comparações: " + heap.getComparacoes() + " | Trocas: " + heap.getTrocas());
    }
}
