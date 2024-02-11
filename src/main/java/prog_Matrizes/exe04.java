package prog_Matrizes;

import java.util.Scanner;

/*
Ler uma matriz 4x5 de inteiros, calcular e imprimir a
soma de todos os seus elementos.
*/

public class exe04 {
    public static void main (String []args){
        Scanner e = new Scanner (System.in);
        int matriz[][] = new int [4][5];
        int soma = 0;
        for (int l = 0; l < matriz.length; l++){
            for (int c = 0; c < matriz[0].length; c++){
                System.out.print("Digite os numero para a linha "+l+" e para coluna "+c+" : ");
                matriz [l][c] = e.nextInt();
                soma = soma + matriz [l][c];
            }
        }
        for (int l = 0; l < matriz.length; l++){
            for (int c = 0; c < matriz[0].length; c++){
                System.out.print(matriz[l][c] +" ");
            }
            System.out.println("");
        }
        System.out.println("Soma total da matriz é igual: " + soma);
    }
}
