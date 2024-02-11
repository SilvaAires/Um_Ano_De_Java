package prog_prova_Matrizes;

import java.util.Scanner;

public class exe01 {
    public static void main(String []args){
        Scanner e = new Scanner(System.in);
        int vetor [] = new int [10];
        for(int i=0;i<vetor.length;i++){
            System.out.print("Digite os numeros");
            vetor[i]=e.nextInt();
        }
        for (int i = vetor.length-1;i>=0;i--){
            System.out.println("["+vetor[i]+"]");
        }
    }
}

