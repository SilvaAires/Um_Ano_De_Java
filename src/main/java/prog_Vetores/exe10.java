package prog_Vetores;

import java.util.Scanner;

/*
10. Faca um algoritmo q leia e armazene 5 valores inteiros
em um vetor Vet1. Leia outros 5 valores inteiros e
armazene num vetor Vet2. A partir destes valores lidos,
mostre na tela: a soma dos elementos de cada vetor, nas
respectivas posições; a diferença dos elementos de cada
vetor, nas respectivas posições; o produto dos elementos
de cada vetor, nas respectivas posições; a divisão entre os
elementos de cada vetor, nas respectivas posições.
*/

public class exe10 {
    public static void main (String []args){
        Scanner e = new Scanner (System.in);
        int Vet1[] = new int[3];
        int Vet2[] = new int[3];
        for (int i = 0; i < Vet1.length; i++){
            System.out.println("Digite os numeros para armazenar no 1 vetor de posição "+i+" : ");
            Vet1[i] = e.nextInt();
            System.out.println("Digite os numeros para armazenar no 2 vetor de posição "+i+" : ");
            Vet2[i] = e.nextInt();
        }
        for (int i = 0; i < Vet1.length; i++){
            int soma = Vet1[i]+Vet2[i];
            int dif = Vet1[i]-Vet2[i];
            int prod = Vet1[i]*Vet2[i];
            double div = (double)Vet1[i]/Vet2[i];
            System.out.println("Resultados "+i+" : \n soma = " +soma+ "\n diferença = "
            + dif+ "\n produto = " +prod+ "\n divisão = " +div);
        }
    } 
}
