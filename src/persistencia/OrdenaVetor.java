/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

/**
 *
 * @author Aluno
 */
public class OrdenaVetor {

    public void SelectionSort(String[] vet) {
        for (int i = 0; i < vet.length - 1; i++) {//    * i é a posição do ultimo valor já ordenado do vetor
            int index = i;//    * indice do menor valor de todo ovetor não ordenado
            for (int j = i + 1; j < vet.length; j++) {//    * j é a posição atual que está sendo usada na comparação
                if (vet[j].length() < vet[index].length()) {
                    index = j;//    * achou um q é menor do que o menor valor
                }
            }
            String smallerNumber = vet[index];//    * trocando valores
            vet[index] = vet[i];
            vet[i] = smallerNumber;
        }
//  * terminou a ordenação e como é por referencia não precisa retornar nada
    }

    public void bubleSort(String[] vet) {
        for (int i = 0; i < vet.length - 1; i++) {//    * i guarda a quantidade de vezes que irá passar pelo vetor
            for (int j = 0; j < vet.length - 1 - i; j++) {//    * j guarda a posição do primeiro valor do vetor já ordenado
                if (vet[j].length() > vet[j + 1].length()) {//  * achou um valor fora de ordem, em relação com o valor subsequente
                    String aux = vet[j];//  * trocando valores
                    vet[j] = vet[j + 1];
                    vet[j + 1] = aux;
                }
            }
        }
    }

    public void insertionSort(String[] vet) {
        for (int j = 1; j < vet.length; j++) {//    * j guarda a ultima posição do vetor já ordenado
            String key = vet[j];//  * palavra atual, a que está tentando ordenar
            int i = j - 1;//    * a posição anterior, a que será usada para comparar com a key
            while ((i > -1) && (vet[i].length() > key.length())) {//    * só entra se estiver desordenado
                vet[i + 1] = vet[i];//  * colocando na posição anterior
                i--;
            }
            vet[i + 1] = key;// * colocando a palavra atual na posição correta dentro do vetor ordenado
        }
    }

}
