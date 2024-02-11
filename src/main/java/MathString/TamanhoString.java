package MathString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TamanhoString {
    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.print("Nome completo: ");
        String nomeCompleto = entrada.readLine();
        int tamanho = nomeCompleto.length();
        System.out.println("Tamanho: " + tamanho);
    } 
}