package prog_Vetores;

import java.util.Scanner;

public class variante03 {
    public static void main (String []args){
        int vetor_A []= new int[2];
        for (int i = 0; i < vetor_A.length; i ++){
            Scanner e = new Scanner (System.in);
            System.out.println("Digite um numero: ");
            vetor_A[i] = e.nextInt();
        }
        int vetor_B[]= new int [vetor_A.length];
        for (int i = 0; i < vetor_A.length; i ++){
            if ( (vetor_A[i]%2) != 0){
                System.out.println("impar");
                vetor_B[i]=vetor_A[i] + 5; 
            }
            if ( (vetor_A[i]%2) == 0){
                System.out.println("par");
                vetor_B[i]=vetor_A[i] * 5;
        }
        }
        for (int i = 0; i < vetor_A.length; i ++){
            System.out.println(vetor_A[i]);
        }
        for (int i = 0; i < vetor_A.length; i ++){
            System.out.println(vetor_B[i]);
        }
    }
}
