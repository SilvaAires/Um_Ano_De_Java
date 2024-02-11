package prog_String;

/*4. Escreva um programa que receba uma string e imprima
o número de ocorrências de cada caractere na string.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exe04 {
    public static void main(String []args) throws IOException{
        BufferedReader e = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Digite uma String: ");
        String n = e.readLine();
        String vetor [] = new String [n.length()];
        for (int i = 0; i<n.length();i++){
            String letra = String.valueOf(n.toLowerCase().charAt(i));
            vetor[i]=letra;
        }
        String alfa []= new String []{"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        for (int i = 0; i<n.length();i++){
            System.out.println(vetor[i]);
        }
    }
}