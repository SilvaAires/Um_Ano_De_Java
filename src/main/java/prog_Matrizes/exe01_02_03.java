package prog_Matrizes;

import java.util.Scanner;

public class exe01_02_03 {
    public static void main (String []args){
        Scanner e = new Scanner(System.in);
        int matriz [][] = new int [3][3];
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
        /*
        1. Criar um algoritmo que leia os elementos de uma matriz
        inteira 3x3, a escreva na tela, e posteriormente escreva
        somente seus elementos da diagonal principal.
        */
        System.out.println("");
        for (int l = 0; l < matriz.length; l++){
            for (int c = 0; c < matriz[0].length; c++){
                if(l == c){
                    System.out.print(matriz[l][c] +" ");
                }
            }
        }
        /*
        2. Criar um algoritmo que leia os elementos de uma matriz
        inteira 3x3, a escreva na tela, e posteriormente escreva
        somente seus elementos da diagonal secundária.
        */
        System.out.println("\n");
        for (int l = 0; l < matriz.length; l++){
            for (int c = 0; c < matriz[0].length; c++){
                if((l + c) == 2){
                    System.out.print(matriz[l][c] +" ");
                }
            }
        }
        /*
        3. Criar um algoritmo que leia os elementos de uma matriz
        inteira 3x3 e escreva todos elementos, exceto os
        elementos da diagonal principal.
        */
        System.out.println("\n");
        for (int l = 0; l<matriz.length; l++){
            for (int c = 0; c < matriz[0].length; c++){
                if(l !=c ){
                    System.out.print(matriz[l][c] +" ");
                }
            }
            System.out.println("");
        }
    }
}
