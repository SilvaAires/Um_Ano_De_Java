package prog_Vetores;

import java.util.Scanner;

/*
• DESAFIO: Escreva um algoritmo que leia os valores para
um vetor de 10 elementos, e em seguida ordene em
ordem crescente os valores desse vetor
*/

public class exe14 {
    public static void main(String []args){
        Scanner e =new Scanner (System.in);
        int num[] = new int [5];
        int num1[] = new int [5];
        int a;
        for (int i = 0; i<num.length; i ++){
            System.out.println("Digite os numeros: ");
            num[i]=e.nextInt();
            num1[i] = num[i];
        }
        System.out.println(" ");
        for (int i = 0; i<num.length; i ++){
            System.out.println(num[i]);
        }
        System.out.println(" ");
        for (int i = 0; i<num1.length; i ++){
            for (int j = 0; j<num1.length; j ++){
                if(num1[i]>num1[j]){
                    a = num1[j];
                    num1[j]=num1[i];
                    num1[i]=a;
                }
            }
        }
        System.out.println(" ");
        for (int i = 0; i<num1.length; i ++){
            System.out.println(num1[i]);
        }
        System.out.println(" ");
        for (int i = 0; i<num.length; i ++){
            System.out.println(num[i]);
        }
    }
}
