package algoritmo_Lista08_laço_for;

import java.util.Scanner;

/*
1. Escreva uma classe em Java para ler um valor inteiro e armazená-lo em uma variável
chamada “num”. O algoritmo deve exibir a soma de todos os números entre 1 e num. 

*/

public class exe01 {
    public static void main(String []args){
        Scanner e = new Scanner(System.in);
        System.out.println("Digite um numero:");
        int n = e.nextInt();
        int s = 0;
        for (int i = 0; i < n; i++){
            s += i; 
        }
        System.out.println("Soma de todos os numeros: " +s);
    }
}
