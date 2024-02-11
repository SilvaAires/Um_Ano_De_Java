package prog_Algoritmo;

import java.util.Scanner;

public class matriz {
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
        System.out.println("\n");
        int p = 3;
        for (int l = 0; l < p; l ++){
            System.out.print(matriz[l][l] + " ");
        }
        System.out.println("\n");
        for (int l = p-1; l > -1; l --){
            System.out.print(matriz[l][l]+" ");
        }
    }
}
