package algoritmos;
// Ordena como cartas na mão: pega um elemento por vez e encaixa no lugar certo entre os que já estão ordenados.

public class InsertionSort extends AlgoritmoOrdenacao {

    @Override
    public String getNome() {
        return "InsertionSort";
    }

    @Override
    public String getComplexidade() {
        return "O(n²)";
    }

    @Override
    public void ordenar(int[] vetor) {
        // começa no 1 porque o primeiro sozinho já está "ordenado"
        for (int i = 1; i < vetor.length; i++) {
            int chave = vetor[i];
            int j = i - 1;

            // anda para a esquerda empurrando quem for maior que a chave
            while (j >= 0) {
                comparacoes++;

                if (vetor[j] <= chave) {
                    break; // achou o lugar
                }
                vetor[j + 1] = vetor[j]; // empurra para a direita
                trocas++;
                j--;
            }
            vetor[j + 1] = chave; // encaixa a chave
            trocas++;
        }
    }
}
