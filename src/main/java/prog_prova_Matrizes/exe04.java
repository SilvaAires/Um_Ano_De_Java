package prog_prova_Matrizes;

import java.util.Scanner;

public class exe04 {
    public static void main(String []args){
        Scanner e = new Scanner(System.in);
        int l;
        int c;
        System.out.println("Digite linha");
        l = e.nextInt();
        System.out.println("Digite coluna");
        c = e.nextInt();
        if (l != c){
            System.out.print("linha e coluna estão diferentes");
        }
        else{
            int m[][]=new int [l][c];
            for (int i=0; i<m.length; i++){
                System.out.println(" ");
                for (int j=0; j<m[0].length; j++){
                    System.out.println("Digite os numeros");
                    m[i][j]= e.nextInt();
                }
            }
            int soma = 0;
            for (int i=0; i<m.length; i++){
                System.out.println(" ");
                for (int j=0; j<m[0].length; j++){
                    System.out.print(m[i][j]+" ");
                    if (i < j){
                        soma= soma + m[i][j];
                    }
                }
            }
            System.out.print("Soma dos elementos " + soma);
        }
    }
}
