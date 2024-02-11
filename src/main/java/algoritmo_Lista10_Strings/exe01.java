package algoritmo_Lista10_Strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
1. Escreva uma classe em Java que solicite que o usuário digite o seu nome completo. A seguir, deve-se exibir:
a. A quantidade de caracteres informados, incluindo os espaços em branco.
b. O nome completo com todas as letras em maiúsculo.
c. A quantidade de vogais. 
*/

public class exe01 {
    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Digite o seu nome completo: ");
        String nomeCompl = entrada.readLine();
        int quantCaracteres = nomeCompl.length();
        System.out.println("Quantidade de caracteres: " + quantCaracteres);
        System.out.println("Nome completo com letras em maiúsculo: " + nomeCompl.toUpperCase());
        int contVogais = 0;
        for (int i = 0; i < nomeCompl.length(); i++) {
            String letra = String.valueOf(nomeCompl.charAt(i));
            if ((letra.equals("a")) || (letra.equals("A")) || (letra.equals("e")) || (letra.equals("E")) ||
                (letra.equals("i")) || (letra.equals("I")) || (letra.equals("o")) || (letra.equals("O")) ||  
                (letra.equals("u")) || (letra.equals("U"))){
                contVogais++;
            }
        }
        System.out.println("Quantidade de vogais: " + contVogais);
    }
}
