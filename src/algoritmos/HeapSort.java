package algoritmos;

// Usa um heap máximo (o maior fica na raiz) montado dentro do próprio vetor.
public class HeapSort extends AlgoritmoOrdenacao {

    @Override
    public String getNome() {
        return "HeapSort";
    }

    @Override
    public String getComplexidade() {
        return "O(n log n)";
    }

    @Override
    public void ordenar(int[] vetor) {
        int n = vetor.length;
        // 1° part: monta o heap, do último pai até a raiz
        for (int i = n / 2 - 1; i >= 0; i--) {
            descer(vetor, n, i);
        }
        // 2° prte: manda o maior (raiz) para o fim e conserta o heap
        for (int fim = n - 1; fim > 0; fim--) {
            trocar(vetor, 0, fim);
            descer(vetor, fim, 0);
        }
    }

    // Desce o elemento até ele ficar maior que os dois filhos
    private void descer(int[] vetor, int tamanho, int raiz) {
        while (true) {
            int maior = raiz;
            int esquerda = 2 * raiz + 1;
            int direita = 2 * raiz + 2;

            // compara com o filho da esquerda, se ele existir
            if (esquerda < tamanho) {
                comparacoes++;
                if (vetor[esquerda] > vetor[maior]) {
                    maior = esquerda;
                }
            }
            // compara com o filho da direita, se ele existir
            if (direita < tamanho) {
                comparacoes++;
                if (vetor[direita] > vetor[maior]) {
                    maior = esquerda;
                }
            }
            if (maior == raiz) {
                break; // está no lugar certo
            }
            trocar(vetor, raiz, maior); // troca com o maior filho
            raiz = maior;
        }
    }

}
