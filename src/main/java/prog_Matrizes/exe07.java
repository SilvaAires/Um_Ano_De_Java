package prog_Matrizes;

import java.util.Scanner;

/*
7. Entrar com valores inteiros para uma matriz A[2][2] e
para uma matriz B[2][2]. Gerar e imprimir a matriz
SOMA[2][2].
*/
public class exe07 {
    public static void main(String []args){
        Scanner e = new Scanner (System.in);
        int a[][]=new int[2][2];
        int b[][]=new int[2][2];
        int soma[][]=new int[2][2];
        for (int l = 0; l < a.length; l++){
            for (int c = 0; c < a[0].length; c++){
                System.out.print("Matriz A digite os numero para a linha "+l+" e para coluna "+c+" : ");
                a[l][c] = e.nextInt();
                System.out.print("Matriz B digite os numero para a linha "+l+" e para coluna "+c+" : ");
                b[l][c] = e.nextInt();
            }
        }
        for (int l = 0; l < a.length; l++){
            for (int c = 0; c < a[0].length; c++){
                System.out.print("Matriz A "+ a[l][c] +" ");
                System.out.print("Matriz B "+ b[l][c] +" ");
                soma[l][c]=a[l][c]+b[l][c];
            }
            System.out.println("");
        }
        System.out.println("");
        for (int l = 0; l < a.length; l++){
            for (int c = 0; c < a[0].length; c++){
                System.out.print(soma[l][c]+" ");
            }
            System.out.println("");
        }
    }
}
