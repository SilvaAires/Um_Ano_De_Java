package exemploStrings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exemplo1 {
    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new 
            InputStreamReader(System.in));
        System.out.print("Texto: ");
        String texto = entrada.readLine();
        int tamanho = 0;
        for (int i = 0; i < texto.length(); i++) {
            String letra = String.valueOf(texto.charAt(i));
            if (!letra.equals(" ")){
                tamanho++;
            }
        }
        System.out.println("Tamanho: " + tamanho);
    }
}