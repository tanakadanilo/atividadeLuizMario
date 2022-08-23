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
        String[] vetorDePalavras = null;
        
        try {
            vetorDePalavras = LeitorArquivo.leitorArquivo("portugues_brazil.txt");
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        OrdenaVetor.SelectionSort(vetorDePalavras);
        
        
        for (int i = 0; i < vetorDePalavras.length; i++) {
            System.out.println(vetorDePalavras[i]);
        }
    }
}
