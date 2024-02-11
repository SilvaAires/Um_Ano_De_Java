package MathString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaiusculoMinusculo {
    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.print("Nome completo: ");
        String nomeCompleto = entrada.readLine();
        String maiusculo = nomeCompleto.toUpperCase();
        System.out.println("Maiúsculo: " + maiusculo);
        String minusculo = nomeCompleto.toLowerCase();
        System.out.println("Minúsculo: " + minusculo);        
    }
}
