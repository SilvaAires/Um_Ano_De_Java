package prog_String;

/*
1. Faça um programa que, a partir de uma String digitada
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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exe01 {
    public static void main(String []args) throws IOException{
        BufferedReader e = new BufferedReader(new InputStreamReader(System.in));//*r.nextLine()
        System.out.print("Digite um nome: ");
        String nome = e.readLine();
        int quant = nome.length();
        System.out.println("Quantidade de caracteres: "+quant);
        System.out.println("Tudo maiúsculo: "+nome.toUpperCase());
        int contVogais = 0;
        for (int i = 0; i < nome.length(); i++) {
            String letra = String.valueOf(nome.charAt(i));
            if ((letra.equals("a")) || (letra.equals("A")) || (letra.equals("e")) || (letra.equals("E")) ||
                (letra.equals("i")) || (letra.equals("I")) || (letra.equals("o")) || (letra.equals("O")) ||  
                (letra.equals("u")) || (letra.equals("U"))){
                contVogais++;
            }
        }
        System.out.println("Quantidade de vogais: " + contVogais);
        System.out.println("Se a string digitada começa com “INS”; "+nome.toUpperCase().startsWith("INS"));
        System.out.println("Se a string digitada começa com “INS”; "+nome.toUpperCase().endsWith("TO"));
        String reversa = "";
        for(int i = (nome.length()-1); i>= 0; i--){
            reversa += nome.charAt(i);
        }
        if(reversa.toLowerCase().equals(nome.toLowerCase())){
            System.out.println("É palindromo");
        }else{
            System.out.println("Não é um palindromo");
        }
        int num = 0;
        for (int i = 0; i < nome.length(); i++) {
            String letra = String.valueOf(nome.charAt(i));
            if ((letra.equals("0")) || (letra.equals("1")) || (letra.equals("2")) || (letra.equals("6")) ||
                (letra.equals("3")) || (letra.equals("4")) || (letra.equals("5")) || (letra.equals("7")) ||  
                (letra.equals("8")) || (letra.equals("9"))){
                num++;
            }
        }
        System.out.println("Quantidade de numero: " + num);
    }
}