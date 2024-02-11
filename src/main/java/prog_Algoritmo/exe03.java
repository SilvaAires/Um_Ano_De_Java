package prog_Algoritmo;

import java.util.Scanner;

/*
3. Escreva um algoritmo que leia um número inteiro N, e em
seguida leia outro número inteiro M. Mostre na tela quantos
números de 0 até M são divisíveis por N.
*/

public class exe03 {
    public static void main(String []args){
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite um numero");
        int m = entrada.nextInt();
        System.out.println("Digite um numero");
        int n = entrada.nextInt();
        int div = 0;
        for ( int i = 1 ; i <= m ; i++){
            int resto = i % n;
            if ( resto == 0){
                div ++;
            }
        }
        System.out.println("quantos divisores: " + div);
    }
}
