/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class Buscas {

    public static boolean buscaSequencial(String palavraBusca, String[] listaPalavras) {
        for (String listaPalavra : listaPalavras) {
            if (listaPalavra.equals(palavraBusca)) {
                //    * achou
                return true;
            }
        }
        return false;
    }

    private static boolean binarySearch(String[] vet, String palavraBuscada, int low, int high) {
        if (low > high) {
            return false;
        }

        int mid = (low + high) / 2;

        if (vet[mid].compareTo(palavraBuscada) < 0) {
            return binarySearch(vet, palavraBuscada, mid + 1, high);
        } else if (vet[mid].compareTo(palavraBuscada) > 0) {
            return binarySearch(vet, palavraBuscada, low, mid - 1);
        } else {
            return true;
        }
    }

    public static boolean buscaBinaria(String palavraBusca, String[] listaPalavras, boolean jaOrdenado) {
        if (jaOrdenado) {
            return binarySearch(listaPalavras, palavraBusca, 0, listaPalavras.length);
        } else {//  * lista não ordenada
            List<String> lista = new ArrayList<>();
            lista.addAll(Arrays.asList(listaPalavras));
            lista = lista.stream().filter(x -> x.length() == palavraBusca.length()).sorted((o1, o2) -> o1.compareTo(o2)).toList();
            listaPalavras = lista.toArray(listaPalavras);
            return buscaBinaria(palavraBusca, listaPalavras, true);
        }
    }

}
