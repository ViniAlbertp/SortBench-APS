package algoritmos;
//classe mae de todos algoritimos

public abstract class AlgoritmoOrdenacao {

    // long porque os números podem passar de 2 bilhões (InsertionSort com N grande)
    protected long comparacoes;
    protected long trocas;

    // Métodos que todo algoritmo filho é obrigado a ter
    public abstract void ordenar(int[] vetor);

    public abstract String getNome();

    public abstract String getComplexidade();

    public long getComparacoes() {
        return comparacoes;
    }

    public long getTrocas() {
        return trocas;
    }

    // Zera antes de cada teste, para um não somar no outro
    public void zerarContadores() {
        comparacoes = 0;
        trocas = 0;
    }

    // Troca dois elementos de lugar usando uma variável temporária
    protected void trocar(int[] vetor, int i, int j) {
        if (i == j) {
            return;
        }
        int temp = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = temp;
        trocas++;
    }
}
