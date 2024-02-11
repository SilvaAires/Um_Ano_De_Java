package algoritmo_Lista05_if_else;

import java.util.Scanner;

/*
3. Escreva um programa que solicite que o usuário digite três números inteiros diferentes. O programa
deve informar o MAIOR e o MENOR valor. 
*/

public class exe03 {
   public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("A: ");
        int a = entrada.nextInt();
        System.out.println("B: ");
        int b = entrada.nextInt();
        System.out.println("C: ");
        int c = entrada.nextInt();
        if ((a == b) || (b == c) || (a == c)){
            System.out.println("Os valor não podem ser iguais");
        }
        else{
            if((a > b) && (a > c)){
                System.out.print("maior: " + a); 
            }else{
                if((b > a) && (b > c)){
                System.out.print("maior: " + b); 
                }else{
                    if((c > a) && (c > b)){
                    System.out.print("maior: " + c); 
                    }
                }
            }
            System.out.println();
            if((a < b) && (a < c)){
                System.out.print("menor: " + a); 
            }else{
                if((b < a) && (b <c)){
                System.out.print("menor: " + b); 
                }else{
                    if((c < a) && (c < b)){
                    System.out.print("menor: " + c); 
                    }
                }
            }
        }
    }
}
