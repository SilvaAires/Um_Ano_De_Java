package prog_Vetores;

import java.util.Scanner;

/*
2. Fazer um algoritmo que leia dez números inteiros
armazenando-os em um vetor e escreva primeiramente todos
os números pares lidos e após todos os ímpares. Exemplo:
◦ lê: |7|40|3|9|21|0|63|31|7|22|
◦ escreve: |40|0|22|7|3|9|21|63|31|7|
*/

public class exe02 {
    public static void main(String []args){
       Scanner e = new Scanner (System.in);
       System.out.println("Digite a quantidade de vetor: ");
       int ve = e.nextInt();
       double vetor [] = new double[ve];
       for (int i = 0 ; i < vetor.length ; i++){
           System.out.println("Digite os numeros que vc queria armazenar; ");
           vetor[i] = e.nextDouble();
       }
       for (int i = 0 ; i < vetor.length ; i++){
           System.out.println("Elemento: "+ i + " : " + vetor[i]);
       }
       System.out.println(" ");
       for (int i = 0 ; i < vetor.length ; i++){
           if((vetor[i]%2) == 0){
               System.out.println(vetor[i]);
           }
       }
       for (int i = 0 ; i < vetor.length ; i++){
           if((vetor[i]%2) != 0){
               System.out.println(vetor[i]);
           }
        }
    }
}

