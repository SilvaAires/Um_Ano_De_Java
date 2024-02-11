package algoritmo_Lista10_Strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
3. Escreva uma classe em Java que solicite que o usuário digite um texto. A classe deve:
a. Substituir todas as incidências da letra “a” ou “A” por “@”.
b. Substituir todas as incidências da letra “e” ou “E” por “&”
c. Substituir todas as incidências da letra “i” ou “I” por “!”
d. Substituir todas as incidências da letra “o” ou “O” por “*”
e. Substituir todas as incidências da letra “u” ou “U” por “#”
f. Retirar todos os espaços em branco 
*/

public class exe03 {
    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Digite um texto: ");
        String texto = entrada.readLine();
        texto = texto.replace("a", "@");
        texto = texto.replace("A", "@");
        texto = texto.replace("e", "&");
        texto = texto.replace("E", "&");
        texto = texto.replace("i", "!");
        texto = texto.replace("I", "!");
        texto = texto.replace("o", "*");
        texto = texto.replace("O", "*");
        texto = texto.replace("u", "#");
        texto = texto.replace("U", "#");
        texto = texto.replace(" ", "");
        System.out.println("Texto: " + texto);
    }
}
