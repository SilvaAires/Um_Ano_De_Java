package prog_Vetores;

import java.util.Scanner;

/*
5. Escreva um algoritmo que leia valores para dois vetores de 20
elementos e então realize a soma dos elementos da mesma posição,
armazenando o resultado em um outro vetor
*/

public class exe05 {
    public static void main(String []args){
        double vetor_A[] = new double[2];
        double vetor_B[] = new double[2];
        double vetor_C[] = new double[vetor_A.length];
        for (int i = 0; i < vetor_A.length; i ++){
            Scanner e = new Scanner (System.in);
            System.out.println("Digite os valores que queira armanezar no 1 vetor : ");
            vetor_A[i] = e.nextDouble();
            System.out.println("Digite os valores que queira armanezar no 2 vetor : ");
            vetor_B[i] = e.nextDouble();
        }
        for (int i = 0; i < vetor_A.length; i ++){
            System.out.println("Elemento "+i+" do 1 vetor : " + vetor_A[i]);
            System.out.println("Elemento "+i+" do 2 vetor : " + vetor_B[i]);
            vetor_C[i] = vetor_A[i] + vetor_B[i];
        }
        for (int i = 0; i < vetor_A.length; i ++){
            System.out.println("Elemento "+i+" do 3 vetor : " + vetor_C[i]);
        }
    }
}
