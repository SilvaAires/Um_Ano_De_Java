package prog_Métodos;

import java.util.Scanner;

/*
1. Escreva um programa para ler dois números inteiros,
por linha de execução, e realizar as 4 operações
aritméticas (+,-,*,/) uma em cada método. Todos os
métodos deverão retornar o valor de sua operação para
o método principal imprimir o resultado na tela.
*/

public class exe01 {
    public static double soma (double a, double b){
        double s = a + b;
        return s;
    }
    public static double sub (double a, double b){
        double s = a - b;
        return s;
    }
    public static double div (double a, double b){
        double s = a / b;
        return s;
    }
    public static double mult (double a, double b){
        double s = a * b;
        return s;
    }
    public static void imprimir (String msg, double a){
        System.out.print(msg+" : " + a);
    }
    public static void main (String []args){
        Scanner e = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        double a = e.nextDouble();
        System.out.println("Digite o segundo numero: ");
        double b = e.nextDouble();
        double i = soma(a, b);
        imprimir ("Soma", i);
        double k = sub(a, b);
        imprimir ("Subtração", k);
        double h = div(a, b);
        imprimir ("Divisão", h);
        double j = mult(a, b);
        imprimir ("Multiplicação", j);
    }
}
