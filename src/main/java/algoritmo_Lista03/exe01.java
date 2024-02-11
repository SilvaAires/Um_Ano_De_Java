package algoritmo_Lista03;

import java.util.Scanner;

/*
1. Escreva uma classe em Java que solicite que o usuário digite três notas de um estudante e armazene
nas variáveis “x”, “y” e “z”. A seguir, deve-se calcular a média aritmética das notas: 
*/

public class exe01 {
    public static void main(String [] args){
        Scanner e = new Scanner(System.in);
        System.out.println("Digite 3 notas separadas por espacos. ");
        double n1 = e.nextDouble();
        double n2 = e.nextDouble();
        double n3 = e.nextDouble();
        double res = (n1 + n2 + n3)/3;
        System.out.println("Resultado: " +res);
    }
}
