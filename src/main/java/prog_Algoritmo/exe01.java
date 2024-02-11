package prog_Algoritmo;

import java.util.Scanner;

/*
1. Escreva um algoritmo onde o usuário digita vários números
(para sair ele deve digitar 0). Ao final o programa deve
mostrar: quantos números foram digitados, qual é sua soma,
qual é sua média, qual o maior e qual o menor número.
*/

public class exe01 {
    public static void main(String []args){
        Scanner entrada = new Scanner(System.in);
        int quanto = 0;
        int soma = 0;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int i = -1;
        while (i != 0){
            System.out.print("Digite um numero diferente de zero: ");
            i = entrada.nextInt();
            quanto ++;
            soma += i;
            if (i != 0){
                if ( i > maior){
                    maior = i;
                }
                if ( i < menor){
                    menor = i;
                }
            }
        }
        double media = soma/quanto;
        System.out.println("Quantidade: " + quanto);
        System.out.println("Soma: " + soma);
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor) ;
        System.out.println("Media: " + media);
    }
}
