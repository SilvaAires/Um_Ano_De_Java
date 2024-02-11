package prog_Vetores;

import java.util.Scanner;

public class variante02 {
    public static void main (String []args){
        int vetor[] = new int[2];
        for (int i = 0; i < vetor.length; i++){
            Scanner e = new Scanner (System.in);
            System.out.println("Digite um numero: ");
            vetor [i] = e.nextInt();
        }
        int maior = 0;
        int pos = 0;
        for (int i = 0; i < vetor.length; i++){
            if (vetor[i] > maior){
                maior = vetor[i];
                pos = i;
                }
        }
        System.out.println("Maior: " + maior + " posição " + (pos+1));
    }
}
