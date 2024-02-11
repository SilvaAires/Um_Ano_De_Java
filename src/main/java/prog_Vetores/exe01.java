package prog_Vetores;

import java.util.Scanner;

/*
1. Fazer um algoritmo que leia dez números e escreva-os na
ordem contrária à ordem de leitura. Exemplo:
◦ lê: |7|40|3|9|21|0|63|31|7|22|
◦ escreve: |22|7|31|63|0|21|9|3|40|7|
*/

public class exe01 {
    public static void main(String [] args){
        Scanner e = new Scanner(System.in);
        System.out.println("Digite a quantidade de vetor que queria que tenha: ");
        int ve = e.nextInt();
        double num [] = new double [ve];
        for (int i = 0; i < num.length; i++){
            System.out.println("Digite os numeros que voce queria armazenar no vetor: ");
            num [i] = e.nextDouble();
        }
        System.out.println(" ");
        for (int i = 0; i < num.length; i++){
            System.out.print(num[i]+" : ");
        }
        System.out.println(" ");
        for (int i = num.length-1; i > -1; i--){
            System.out.print(num[i]+" : ");
        }
        System.out.println(" ");
    }
}

