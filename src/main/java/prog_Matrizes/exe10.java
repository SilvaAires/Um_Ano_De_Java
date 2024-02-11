package prog_Matrizes;

import java.util.Scanner;

/*
10. Implementar um algoritmo para multiplicar duas
matrizes de números inteiros. A multiplicação só é
possível se o número de colunas da matriz A for igual ao
número de linhas da matriz B. Suponha um tamanho
máximo igual a uma matriz 10x10, sendo que o usuário
entrará com o tamanho e os valores de cada uma das
matrizes a serem multiplicadas.
*/

public class exe10 {
    public static void main (String []args){
        Scanner e = new Scanner(System.in);
        System.out.print("Digite a quantidade de linha da A: ");
        int li = e.nextInt();
        System.out.print("Digite a quantidade de coluna da A: ");
        int co = e.nextInt();
        System.out.print("Digite a quantidade de linha da B: ");
        int li1 = e.nextInt();
        System.out.print("Digite a quantidade de coluna da B: ");
        int co1 = e.nextInt();
        int matriza[][] = new int [li][co];
        int matrizb[][] = new int [li1][co1];
        for (int l = 0; l < matriza.length; l++){
            for (int c = 0; c < matriza[0].length; c++){
                System.out.print("Matriza digite os numero para a linha "+l+" e para coluna "+c+" : ");
                matriza [l][c] = e.nextInt();
            }
        }
        for (int l = 0; l < matrizb.length; l++){
            for (int c = 0; c < matrizb[0].length; c++){
                System.out.print("Matrizb digite os numero para a linha "+l+" e para coluna "+c+" : ");
                matrizb [l][c] = e.nextInt();
            }
        }
        System.out.println("");
        for (int l = 0; l < matriza.length; l++){
            for (int c = 0; c < matriza[0].length; c++){
                System.out.print(matriza[l][c] +" ");
            }
            System.out.println("");
        }
        System.out.println("");
        for (int l = 0; l < matrizb.length; l++){
            for (int c = 0; c < matrizb[0].length; c++){
                System.out.print(matrizb[l][c] +" ");
            }
            System.out.println("");
        }
        System.out.println("");
        if (co == li1){
        int mult[][] = new int [li][co1];
        for (int l = 0; l < li; l++){
            for (int c = 0; c < co1; c++){
                for ( int k = 0; k < li1; k++){
                    mult[l][c] += matriza [l][k] * matrizb [k][c]; 
                }
            }
            System.out.println("");
        }
        for (int l = 0; l < mult.length; l++){
            for (int c = 0; c < mult[0].length; c++){
                System.out.print(mult[l][c] +" ");
            }
            System.out.println("");
        }
        }
    }
}
