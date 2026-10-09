package algoritmos;

/**
 *
 * @author vinicius.alberto
 */
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
        for(int i = n/ 2 - 1; i >= 0; i--) {
            descer(vetor, n, i);
        }
        
        for(int fim = n - 1; fim >0; fim--) {
            trocar(vetor, 0, fim);
            descer(vetor, fim, 0);
        }
    }
    
    private void descer(int[] vetor, int tamanho, int raiz) {
        while (true) {
            int maior = raiz;
            int esquerda = 2 * raiz + 1;
            int direita = 2 * raiz + 2;
            
            if(esquerda < tamanho) { 
                comparacoes++;
                if(vetor[esquerda] > vetor[maior]) {
                    maior = esquerda;
                }
            }
            
            if (direita < tamanho) {
                comparacoes++;
                if (vetor[direita] > vetor[maior]){
                    maior = esquerda;
                }
            }
            if(maior == raiz) {
                break;
            }
            trocar(vetor, raiz, maior);
            raiz = maior;
        }
    }
    
}
