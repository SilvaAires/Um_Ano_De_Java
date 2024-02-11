package prog_String;

/*
2. Escreva um programa que leia uma string, conte
quantos caracteres desta string são iguais a 'a' e
substitua os que forem iguais a 'a' por 'b'. O programa
deve imprimir o número de caracteres modificados e a
string modificada.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exe02 {
    public static void main(String []args) throws IOException{
        BufferedReader e = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Digite um a String: ");
        String nome = e.readLine();
        String nome1 = "";
        int quantA = 0;
        for (int i = 0; i < nome.length(); i++){
            String letra = String.valueOf(nome.charAt(i));
            if (letra.equals("a")){
                nome1 = nome.replace("a", "b");
                quantA ++;
            }else{
                if (letra.equals("A")){
                    nome1 = nome.replace("A", "B");
                    quantA ++;
                }
            }
        }
        System.out.print("Foi troca a letra 'a': "+ quantA +"\n String normal: " +nome+"\n String modificada: "+ nome1);
    }
}