package prog_Vetores;

import java.util.Scanner;

/*
11. Desenvolva um programa que leia 10 salários, armazene
num vetor (double) e depois percorra esse vetor
identificando qual o índice do maior salário
*/

public class exe11 {
    public static void main(String []args){
        Scanner e = new Scanner (System.in);
        double salario[] = new double[3];
        for (int i = 0; i < salario.length; i ++){
            System.out.println("Digite os salarios: ");
            salario[i] = e.nextDouble();
        }
        double maior = 0;
        for (int i = 0; i < salario.length; i ++){
            System.out.println("Êlemento "+i+", salario: " +salario[i]);
            if (salario[i] > maior){
                maior = salario[i];
            }
        }
        System.out.println("O salario maior é " + maior);
    }
}
