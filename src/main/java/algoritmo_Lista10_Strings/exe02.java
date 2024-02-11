package algoritmo_Lista10_Strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
2. Escreva uma classe em Java que solicite que o usuário digite um texto. A classe deve contar e exibir número
total de caracteres (incluindo os espaços em branco) e a quantidade total de palavras (palavra é definida por
qualquer sequência de caracteres delimitada por espaços em branco). 
*/

public class exe02 {
    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Digite um texto: ");
        String texto = entrada.readLine();
        int tamanho = texto.length();
        System.out.println("Quantidade de caracteres: " + tamanho);
        int contPalavras = 0;
        for (int i = 0; i < tamanho; i++) {
            String letra = String.valueOf(texto.charAt(i));
            if ((letra.equals(" ")) || (i == 0)){
                contPalavras++;
            }            
        }
        System.out.println("Quantidade de palavras: " + contPalavras);
    }
}
