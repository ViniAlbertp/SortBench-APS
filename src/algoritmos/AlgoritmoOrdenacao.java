/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritmos;
//classe mae de todos algoritimos

public abstract class AlgoritmoOrdenacao {
    protected long comparacoes;
    protected long trocas;
    public abstract void ordenar(int[] vetor);
    public abstract String getNome();
    public abstract String getComplexidade();
    public long getComparacoes(){
        return comparacoes;
    }
    public long getTrocas(){
        return trocas;
    }
    public void zerarContadores() {
        comparacoes = 0;
        trocas = 0;
    }
    protected void trocar(int[] vetor, int i, int j) {
        if(i == j) {
            return;
        }
        int temp = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = temp;
        trocas++;
    }
}
