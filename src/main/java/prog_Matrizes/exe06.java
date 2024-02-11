package prog_Matrizes;

import java.util.Scanner;

/*
6. Entrar com valores reais para uma matriz M[4][5]. Gerar
e imprimir a matriz METADE.
*/
public class exe06 {
    public static void main(String []args){
        Scanner e = new Scanner (System.in);
        double matriz[][] = new double [4][5];
        for (int l = 0; l < matriz.length; l++){
            for (int c = 0; c < matriz[0].length; c++){
                System.out.print("Digite os numero para a linha "+l+" e para coluna "+c+" : ");
                matriz [l][c] = e.nextDouble();
            }
        }
        for (int l = 0; l < matriz.length; l++){
            for (int c = 0; c < matriz[0].length; c++){
                System.out.print((matriz[l][c]) +" ");
            }
            System.out.println("");
        }
        System.out.println("");
        for (int l = 0; l < matriz.length; l++){
            for (int c = 0; c < matriz[0].length; c++){
                System.out.print((matriz[l][c]/2) +" ");
            }
            System.out.println("");
        }
    }
}
