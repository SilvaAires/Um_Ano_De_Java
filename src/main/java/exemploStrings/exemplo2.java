package exemploStrings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exemplo2 {
    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new 
            InputStreamReader(System.in));
        System.out.print("Texto: ");
        String texto = entrada.readLine();
        String iniciais = "";
        for (int i = 0; i < texto.length(); i++) {
            String letra = String.valueOf(texto.charAt(i));
            if (i == 0){
                iniciais = iniciais + letra;
            }
            else{
                if (letra.equals(" ")){
                    iniciais = iniciais + 
                            String.valueOf(texto.charAt(i + 1));
                }
            }
        }
        System.out.println("Iniciais : " + iniciais);
    }
}