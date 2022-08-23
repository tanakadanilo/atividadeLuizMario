/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Aluno
 */
public class EscrevinhadorDeArguivoz {

    public static void EscritorArquivo(String caminhoDoArquivo) throws IOException {
        try ( BufferedWriter br = new BufferedWriter(new FileWriter(caminhoDoArquivo))) {
            String listaDePalavras = "a";

            for (int i = 0; i < Main.vetorDePalavras.length; i++) {
                listaDePalavras += Main.vetorDePalavras[i] + "\n";
            }
            
            br.write(listaDePalavras);
        }

    }
}
