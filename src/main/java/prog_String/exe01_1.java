package prog_String;

/*Faça um programa que, a partir de uma String digitada
pelo usuário, imprima:
◦ O número de caracteres da string.
◦ A string com todas suas letras em maiúsculo.
◦ O número de vogais da string.
◦ Se a string digitada começa com “INS” (ignorando
maiúsculas/minúsculas).
◦ Se a string digitada termina com “TO” (ignorando
maiúsculas/minúsculas).
◦ O número de dígitos (0 a 9) da string.
◦ Se a string é um palíndromo ou não.
*/

import java.util.Scanner;

public class exe01_1{
    public static void main(String args[]) {
        Scanner e = new Scanner(System.in);
        System.out.print("Digite uma String: ");
        String s = new String(e.nextLine());
        System.out.print(s);
        System.out.println("\nO número de caracteres da string é: " + s.length());
        System.out.println("\nTudo em MAIÚSCULO: " + s.toUpperCase());
        int contvogais = 0;
        char vogais[] = {'a', 'e', 'i', 'o', 'u'};
        String frasem = s.toLowerCase();
        char vetfrasem[] = frasem.toCharArray(); //cria um vetor tipo char
        for (int i = 0; i < vetfrasem.length; i++) {//percorre o vetor
            for (int j = 0; j < vogais.length; j++) {//

                if (vetfrasem[i] == vogais[j]) {
                    contvogais++;
                }
            }
        }
        int contDigitos = 0;
        char digitos[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        for (int i = 0; i < vetfrasem.length; i++) {
            for (int j = 0; j < digitos.length; j++) {

                if (vetfrasem[i] == digitos[j]) {
                    contDigitos++;
                }
            }
        }
        String invertida = "";
        for (int i = vetfrasem.length - 1; i >= 0; i--) {//criando o vetor invertido
            invertida += vetfrasem[i];

        }
        if (frasem.equals(invertida)) {
            System.out.println("É palíndromo");

        } else {
            System.out.println("Não é palíndromo");
            System.out.println("Quantidade de digitos: " + contDigitos);
            System.out.println("Quantidade de vogais: " + contvogais);
            System.out.println("\nSe a string começa com INS: " + s.toUpperCase().startsWith("INS"));
            System.out.println("\nSe a string termina com TO: " + s.toUpperCase().endsWith("TO"));

        }
    }
}