/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aluno
 */
public class Main {

    static String[] vetorDePalavras = null;

    public static void main(String[] args) {
        try {

            vetorDePalavras = LeitorArquivo.leitorArquivo("english_usa.txt");
            String[] vetorDePalavras2 = vetorDePalavras.clone();
            String[] vetorDePalavras3 = vetorDePalavras.clone();
            String[] vetorDePalavras4 = vetorDePalavras.clone();

            mostraTexto("mergeSort");
//            mostraTexto("bubbleSort");
//            mostraTexto("insertionSort");
//            mostraTexto("selectionSort");

            System.out.println(Buscas.buscaBinaria(vetorDePalavras[22432] , vetorDePalavras));
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

//        try {
//            EscrevinhadorDeArguivoz.EscritorArquivo("saída.txt");
//        } catch (IOException ex) {
//            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//        }

    }

    public static void mostraTexto(String nomeAlgoritmo) {
        long tempoInicial = System.currentTimeMillis();

//        System.out.println("leu o arquivo");
//        System.out.println("começando a ordenar o vetor, usando " + nomeAlgoritmo + "...");
        switch (nomeAlgoritmo) {
            case "mergeSort" ->
                OrdenaVetor.mergeSort(vetorDePalavras.length, vetorDePalavras);
            case "selectionSort" ->
                OrdenaVetor.SelectionSort(vetorDePalavras);
            case "bubbleSort" ->
                OrdenaVetor.bubbleSort(vetorDePalavras);
            case "insertionSort" ->
                OrdenaVetor.insertionSort(vetorDePalavras);
            default -> {
            }
        }
//        System.out.println("terminou de ordenar o vetor ;)");

//        System.out.println("começando a mostrar o resultado na tela...");
//        for (int i = 0; i < vetorDePalavras.length; i++) {
//            System.out.println(vetorDePalavras[i]);
//        }
        System.out.println("tempo de execução do " + nomeAlgoritmo + ": " + (System.currentTimeMillis() - tempoInicial));
    }
}
