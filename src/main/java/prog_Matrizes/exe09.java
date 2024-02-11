package prog_Matrizes;

import java.util.Scanner;

/*
9. Implementar um algoritmo para transpor matrizes NxM.
Transpor uma matriz significa transformar suas linhas em
colunas e vice-versa.
*/
public class exe09 {
    public static void main (String []args){
          Scanner e = new Scanner (System.in); 
        System.out.print("digite a quatidade de linha: ");
        int li = e.nextInt();
        System.out.print("digite a quatidade de coluna: ");
        int co = e.nextInt();
        int matriz[][] = new int [li][co];
         for (int l = 0; l < matriz.length; l++){
            for (int c = 0; c < matriz[0].length; c++){
                System.out.print("Digite os numero para a linha "+l+" e para coluna "+c+" : ");
                matriz [l][c] = e.nextInt();
            }
        }
        for (int l = 0; l < matriz.length; l++){
            for (int c = 0; c < matriz[0].length; c++){
                System.out.print(matriz[l][c] +" ");
            }
            System.out.println("");
        }
        System.out.println("");
        int trans[][]=new int [co][li];
        for (int l = 0; l < trans.length; l++){
            for (int c = 0; c < trans[0].length; c++){
                trans[l][c] = matriz [c][l];
            }
        }
        System.out.println("");
        for (int l = 0; l < trans.length; l++){
            for (int c = 0; c < trans[0].length; c++){
                System.out.print(trans[l][c] +" ");
            }
            System.out.println("");
        }
    }
}