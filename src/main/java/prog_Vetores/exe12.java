package prog_Vetores;

import java.util.Scanner;

/*
12. Faça um programa que leia um vetor de seis elementos
numéricos inteiros, calcule e mostre: a quantidade de
números pares; quais os números pares; a quantidade de
números ímpares; quais os números ímpares.
*/

public class exe12 {
    public static void main(String []args){
        Scanner e = new Scanner (System.in);
        int vetor[] = new int [6];
        int par = 0;
        int impar = 0;
        for(int i = 0; i < vetor.length; i ++){
            System.out.println("Digite seis numeros que queira armazenar no vetor: ");
            vetor[i] = e.nextInt();
            if ((vetor[i]%2)==0){
                par ++;
            }
            if ((vetor[i]%2)!=0){
                impar ++;
            }
        }
        for(int i = 0; i < vetor.length; i ++){
            if ((vetor[i]%2)==0){
                System.out.println(vetor[i]+" È par");
            }
        }
        System.out.println("A quantidade de numeros pares é " +par);
        for(int i = 0; i < vetor.length; i ++){
            if ((vetor[i]%2)!=0){
                System.out.println(vetor[i]+" È impar");
            }
        }
        System.out.println("A quantidade de numeros pares é " +impar);
    }
}

