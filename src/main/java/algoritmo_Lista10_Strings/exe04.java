package algoritmo_Lista10_Strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
4. Escreva uma classe em Java que solicite que o usuário digite o seu CPF e armazene em uma String. A seguir, a
classe deve informar cada um dos dígitos que compõe o CPF por extenso.
Exemplo:
CPF: 12345678900
Resultado: um, dois, três, quatro, cinco, seis, sete, oito, nove, zero, zero 
*/

public class exe04 {
    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Digite o seu CPF: ");
        String cpf = entrada.readLine();
        if (cpf.length() == 11){
            for (int i = 0; i <= 10; i++) {
                String digito = String.valueOf(cpf.charAt(i));
                switch(digito){
                    case "0": System.out.println("ZERO ");break;
                    case "1": System.out.println("UM ");break;
                    case "2": System.out.println("DOIS ");break;
                    case "3": System.out.println("TRES ");break;
                    case "4": System.out.println("QUATRO ");break;
                    case "5": System.out.println("CINCO ");break;
                    case "6": System.out.println("SEIS ");break;
                    case "7": System.out.println("SETE ");break;
                    case "8": System.out.println("OITO ");break;
                    case "9": System.out.println("NOVE ");break;
                    default: System.out.println("Dígito na posição " + i + " é inválido");
                }
            }
        }
        else{
            System.out.println("CPF inválido!");
        }
    }
}