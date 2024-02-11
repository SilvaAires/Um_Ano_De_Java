package prog_prova_Matrizes;

import java.util.Scanner;

public class exe03 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        int l, c;

        System.out.println("digite as linhas: ");
        l = e.nextInt();
        System.out.println("digite as colunas: ");
        c = e.nextInt();
        if (l == c) {
            int matriz[][] = new int[l][c];
            for (int i = 0; i < l; i++) {
                for (int j = 0; j < c; j++) {
                    System.out.println("digite o elemento: [" + i + "][" + j + "]");
                    matriz[i][j] = e.nextInt();

                }

            }
            int DP[] = new int[l];
            int DS[] = new int[c];
            int aux1 = 0;
            int aux2 = 0;
            for (int i = 0; i < l; i++) {
                for (int j = 0; j < c; j++) {
                    if (i == j) {
                        DP[aux1] = matriz[i][j];
                        aux1++;

                    }
                    if ((i + j) == l - 1) {
                        DS[aux2] = matriz[i][j];
                        aux2++;
                    }

                }

            }
            int SPS[] = new int[l];
            for (int i = 0; i < l; i++) {
                SPS[i] = DP[i] + DS[i];

            }
            System.out.println("DP: ");
            for (int i = 0; i < l; i++) {
                System.out.print("[" + DS[i] + "] ");

            }
            System.out.println("\nDS: ");
            for (int i = 0; i < l; i++) {
                System.out.print("[" + DP[i] + "] ");

            }
            System.out.println("\nSPS: ");
            for (int i = 0; i < l; i++) {
                System.out.print("[" + SPS[i] + "] ");
            }
        }
        else{
            System.out.println(" A matriz não é quadrada");
        }
    }
}
