package prog_Matrizes;

import java.util.Random;
import java.util.Scanner;

/*
11. Faça um programa que leia uma matriz [5x5]. Após leia
um valor qualquer e conte quantas vezes este valor
aparece na matriz
*/

public class exe11 {
    public static void main (String []args){
        Scanner e = new Scanner (System.in);
        int matriz[][] = new int [5][5];
        for (int l = 0; l < matriz.length; l++){
            for (int c = 0; c < matriz[0].length; c++){
                System.out.print("Matriza digite os numero para a linha "+l+" e para coluna "+c+" : ");
                matriz[l][c] = e.nextInt();
            }
        }
        System.out.println(" ");
        int g = 0;
        for (int l = 0; l < matriz.length; l++){
            for (int c = 0; c < matriz[0].length; c++){
                System.out.print(matriz[l][c] +" ");
                Random rand = new Random();
                int int_rand = rand.nextInt(matriz[l][c]);
                g = int_rand;
            }
            System.out.println(" ");
        }
        int soma = 0;
        for (int l = 0; l < matriz.length; l++){
            for (int c = 0; c < matriz[0].length; c++){
                if(g == matriz[l][c]){
                    soma++;
                }
            }
        }
        System.out.println(" ");
        System.out.println("O número "+g+" repete "+(soma-1)+" veze(s).");
    }
}
