package algoritmos;

/**
 *
 * @author vinicius.alberto
 */
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
        for (int i = 1; i < vetor.length; i++) {
            int chave = vetor[i];
            int j = i - 1;
            
            while (j >= 0) {
                comparacoes++;
                
                if (vetor[j] <= chave) {
                    break;
                }
                vetor[j + 1] = vetor[j];
                trocas++;
                j--;
            }
            
            vetor[j + 1] = chave;
            trocas++;
        }
    }
}
