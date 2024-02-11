package prog_Vetores;

import java.util.Scanner;

/* Matriz
• DESAFIO: Escreva um algoritmo que leia os valores para
um vetor de 10 elementos, e em seguida ordene em
ordem crescente os valores desse vetor.
*/

public class matriz_Crescente {
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
        int aux[][] = new int [li][co];
        for (int l = 0; l < matriz.length; l++){
            for (int c = 0; c < matriz[0].length; c++){
                for (int j=0; j<matriz.length; j++){
                    for (int i=0; i<matriz[0].length; i++){
                        if (matriz[l][c] < matriz[j][i]){
                            aux [l][c] = matriz [l][c];
                            matriz[l][c] = matriz[j][i];
                            matriz[j][i] = aux [l][c];
                        }
                    }
                }
            }
        }
        System.out.println("");
        for (int l = 0; l < matriz.length; l++){
            for (int c = 0; c < matriz[0].length; c++){
                System.out.print(matriz[l][c] +" ");
            }
            System.out.println("");
        }
    }
}

