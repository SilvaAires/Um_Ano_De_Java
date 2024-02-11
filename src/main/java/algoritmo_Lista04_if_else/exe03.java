
package algoritmo_Lista04_if_else;

import java.util.Scanner;

/*
3. Escreva um programa que solicite que o usuário digite um valor inteiro positivo. O programa deve
verificar se o número é PAR ou ÍMPAR. 
*/

public class exe03 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = e.nextInt();
        if (numero > 0) {
            int resto = numero % 2;
            if (resto == 0) {
                System.out.println("PAR");
            } else {
                System.out.println("IMPAR");
            }
        } 
        else {
            System.out.println("O número deve ser maior que zero");
        }
    }
}

