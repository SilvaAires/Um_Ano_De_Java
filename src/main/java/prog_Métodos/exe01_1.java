package prog_Métodos;

import java.util.Scanner;

/**
1. Escreva um programa para ler dois números inteiros,
por linha de execução, e realizar as 4 operações
aritméticas (+,-,*,/) uma em cada método. Todos os
métodos deverão retornar o valor de sua operação para
o método principal imprimir o resultado na tela.
 */

public class exe01_1 {
    static void soma(int a, int b){
        int s = a + b;
        System.out.println("Soma: " + s);
    }
    static void sub(int a, int b){
        int s = a - b;
        System.out.println("Subitração: " + s);
    }
    static void mult(int a, int b){
        int s = a * b;
        System.out.println("Subitração: " + s);
    }
    static void div(int a, int b){
        int s = a / b;
        System.out.println("Subitração: " + s);
    }
    public static void main(String []args){
        Scanner e = new Scanner (System.in);
        System.out.println("Digite um numero:");
        int x = e.nextInt();
        System.out.println("Digite o segundo numero:");
        int y = e.nextInt();
        soma(x, y);
        sub(x, y);
        mult(x, y);
        div(x, y);
    }
}