package prog_Vetores;

import java.util.Scanner;

/*
6. Escreva um algoritmo que leia os valores para um vetor de 20
elementos e então mostre na tela o índice da posição dos valores
correspondentes a números primos.
*/

public class exe06 {
    public static void main(String []args){
        int vetor[] = new int [2];
        Scanner e = new Scanner (System.in);
        for (int i = 0; i < vetor.length; i ++){
            System.out.println("Digite os numeros que queira armazenar no vetor : ");
            vetor[i] = e.nextInt();
        }
        for (int i = 0; i < vetor.length; i ++){
            int quant = 0;
            int ve = vetor[i];
            for (int k = 1; k <= ve; k ++){     //* erro de antes '' for (int k = 0; k < ve; k++) e int resto = ve % i ''
                int resto = ve % k;
                if (resto == 0){
                    quant++;
                }
            }
            if (quant == 2){
                System.out.println(ve+ " é Número PRIMO e esta na posicao " + (1+i));
            }
            else{
                System.out.println(ve+ " não é Número PRIMO");
            }
        }
    }
}
