package prog_String;

import java.util.Scanner;

/*
6. Escreva um programa que leia uma String e mostre a
quantidade de palavras na String.
*/

/*
7. Escreva um programa que leia uma String
correspondendo ao nome de uma pessoa e crie uma
nova String contendo apenas as iniciais do nome. (Ex:
"João da Silva“ => "JdS").
*/

public class exe06_07 {
    public static void main (String[]args){
        Scanner e = new Scanner (System.in);
        String frase = e.nextLine();
        System.out.println(frase.length());
        System.out.println(frase.split(" ").length);
        
        String vetor[] = frase.split(" ");
        for (String string:vetor){
            System.out.print(string.charAt(0));
        }
    }
}
