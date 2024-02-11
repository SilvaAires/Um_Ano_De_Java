package exemploStrings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Criptografia {
    public static void main(String[] args) throws IOException {
        String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String cripto =   "DEFGHIJKLMNOPQRSTUVWXYZABC";
        BufferedReader entrada = new BufferedReader(new 
            InputStreamReader(System.in));
        System.out.print("Texto: ");
        String textoOriginal = entrada.readLine();
        textoOriginal = textoOriginal.replace(" ", "");
        textoOriginal = textoOriginal.toUpperCase();
        System.out.println("Texto Original: " + textoOriginal);
        String msgCripto = "";
        for (int i = 0; i < textoOriginal.length(); i++) {
            String letra = String.valueOf(textoOriginal.charAt(i));
            for (int j = 0; j < alfabeto.length(); j++) {
                if (letra.equals(String.valueOf(alfabeto.charAt(j)))){
                    msgCripto = msgCripto + String.valueOf(cripto.charAt(j));
                    break;
                }
                
            }
        }
        System.out.println("Texto criptografado: " + msgCripto);
    }
}