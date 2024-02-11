package prog_Vetores;

import java.util.Scanner;

/*
3. Fazer um algoritmo que leia trinta números reais
armazenando-os em um vetor e após escreva a posição de cada
número menor que zero desse vetor. Exemplo:
◦ lê: |5.1|0|-3.6|4.1|-2.5|-1.3|-4|1.39|-128|-6.9|8.2|9|154|-88|6.4|7.1|...|
◦ escreve: |3|5|6|7|9|10|14|. . .
*/

public class exe03 {
    public static void main(String []args){
        Scanner e = new Scanner (System.in);
        double vetor_0 [] = new double[4];
        for (int i = 0 ; i < vetor_0.length; i++){
            System.out.println("Digite o numero "+(1+i)+" : ");
            vetor_0[i] = e.nextDouble();
        }
        for (int i = 0 ; i < vetor_0.length; i++){
            System.out.println("Elemento "+(1+i)+" : " + vetor_0[i]);
        }
        for (int i = 0 ; i < vetor_0.length; i++){
            if (vetor_0[i]<0){
                System.out.println("Posicao : " + (1+i));
            }
        }
    }
}
