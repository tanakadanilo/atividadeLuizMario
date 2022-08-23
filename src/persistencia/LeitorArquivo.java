/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Aluno
 */
public class LeitorArquivo {
    public static String[] leitorArquivo(String caminhoDoArquivo) throws FileNotFoundException, IOException{
        try(BufferedReader br = new BufferedReader(new FileReader(caminhoDoArquivo))){
            int numeroDeLinhas = Integer.parseInt(br.readLine());
            String[] palavrasDic = new String[numeroDeLinhas];
            for (int i = 0; i < palavrasDic.length; i++) {
                palavrasDic[i] = br.readLine();
            }
            return palavrasDic;
}
    }
}
