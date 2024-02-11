package prog_Matrizes;

import java.util.Scanner;

/*
5. Criar um algoritmo que armazene dados inteiros em
uma matriz 4x4 e imprima: toda a matriz e uma outra
matriz formada pelos números que se encontram em
posições cuja linha mais coluna formam um número par.
*/

public class exe05 {
    public static void main(String []args){
        Scanner e = new Scanner (System.in);
        int matriz[][] = new int[4][4];
        int par [][] = new int [4][4];
        for (int l = 0; l < matriz.length; l++){
            for (int c = 0; c < matriz[0].length; c++){
                System.out.print("Digite os numero para a linha "+l+" e para coluna "+c+" : ");
                matriz [l][c] = e.nextInt();
            }
        }
        for (int l = 0; l < matriz.length; l++){
            for (int c = 0; c < matriz[0].length; c++){
                System.out.print(matriz[l][c] +" ");
                if ((l+c)%2 == 0){
                    par[l][c] = matriz[l][c];
                }
            }
            System.out.println("");
        }
        System.out.println("");
        for (int l = 0; l < matriz.length; l++){
            for (int c = 0; c < matriz[0].length; c++){
                System.out.print(par[l][c] +" ");
            }
            System.out.println("");
        }
    }
}
