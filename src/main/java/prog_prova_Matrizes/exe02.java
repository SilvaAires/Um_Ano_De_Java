package prog_prova_Matrizes;

import java.util.Scanner;

public class exe02 {
    public static void main (String []args){
        Scanner e = new Scanner (System.in);
        int vetor[]= new int [10];
        for(int i=0;i<vetor.length;i++){
            System.out.println("Digite os numeros");
            vetor[i]=e.nextInt();
        }
        for(int i=0;i<vetor.length;i++){
            System.out.print("["+ vetor[i]+"]");
        }
        double acu = 0;
        for(int i=0;i<vetor.length;i++){
            if((i!=0)&&(i!=9)){
                acu+=vetor[i];
            }
        }
        double media = acu/8;
        System.out.println("Media: " +media);
    }
}
