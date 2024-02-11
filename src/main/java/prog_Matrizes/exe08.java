package prog_Matrizes;

import java.util.Scanner;

/*
8. Capture do teclado valores para o preenchimento de
uma matriz M 3x3. Após a captura imprima a matriz
criada e encontre a quantidade de números pares e a
quantidade de números ímpares.
*/
public class exe08 {
    public static void main (String []args){
        Scanner e = new Scanner (System.in);
        int matriz[][]= new int [3][3];
        int par = 0;
        int impar = 0;
        for (int l = 0; l < matriz.length; l++){
            for (int c = 0; c < matriz[0].length; c++){
                System.out.print("Digite os numero para a linha "+l+" e para coluna "+c+" : ");
                matriz [l][c] = e.nextInt();
            }
        }
        for (int l = 0; l < matriz.length; l++){
            for (int c = 0; c < matriz[0].length; c++){
                System.out.print((matriz[l][c]) +" ");
                if ((matriz[l][c]%2) == 0){
                    par ++;
                }
                if ((matriz[l][c]%2) == 0){
                    impar ++;
                }
            }
            System.out.println(" ");
        }
        System.out.print("Quantidade de pares é " +par+ ", de impares é " +impar);
    }
}
