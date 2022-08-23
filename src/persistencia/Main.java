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

    public static void main(String[] args) {
        try {
            String[] vetorDePalavras = null;
            long tempoInicial = System.currentTimeMillis();

            vetorDePalavras = LeitorArquivo.leitorArquivo("portugues_brazil.txt");
            System.out.println("leu o arquivo");

            System.out.println("começando a ordenar o vetor...");
            OrdenaVetor.mergeSort(vetorDePalavras.length, vetorDePalavras);
            System.out.println("terminou de ordenar o vetor ;)");

            System.out.println("começando a mostrar o resultado na tela...");
            for (int i = 0; i < vetorDePalavras.length; i++) {
                System.out.println(vetorDePalavras[i]);
            }
            System.out.println("tempo de execução: " + (System.currentTimeMillis() - tempoInicial));
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            EscrevinhadorDeArguivoz.EscritorArquivo("saída.txt");
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
        
