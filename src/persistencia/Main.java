/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import visao.MenuInicial;

/**
 *
 * @author Aluno
 */
public class Main {
    
    public static void main(String[] args) throws IOException {
        
        System.out.println(contaTempo("Português (BR).txt"));
    }
    
    
    public static Double contaTempo(String dic) throws IOException{
            double tempoDeExecucao = 0;
            for (int i = 0; i <= 1; i++) {
                int posicao = new Random().nextInt(dic.length());
                String [] dicionario = LeitorArquivo.leitorArquivo(dic);
                String palavra = dicionario[posicao];
                long tempoInicial = System.currentTimeMillis();
                OrdenaVetor.bubbleSort(dicionario);
                Buscas.buscaBinaria(palavra, dicionario);
                long tempoFinal = System.currentTimeMillis() - tempoInicial;
                tempoDeExecucao += tempoFinal;
            }
        return tempoDeExecucao;
        }
    /*static String[] vetorDePalavras = null;
    
    public static void main(String[] args) {
    try {
    
    vetorDePalavras = LeitorArquivo.leitorArquivo("English (USA).txt");
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
    System.out.println("tempo de execução do " + nomeAlgoritmo + ": " + (System.currentTimeMillis() - tempoInicial)); */
    //}
    
    
    
}
