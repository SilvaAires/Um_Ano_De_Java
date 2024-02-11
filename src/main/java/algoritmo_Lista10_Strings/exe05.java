package algoritmo_Lista10_Strings;

import java.util.Scanner;

/*
5. Escreva uma classe em Java que simule um jogo de adivinhação. A classe deve sortear um número
entre 0 e 9. A seguir, deve-se solicitar que o usuário tente adivinhar o número sorteado. A cada chute
do usuário, deve-se informar se o chute foi alto ou baixo. O usuário ganha o jogo quando acertar o
número sorteado e perde quando errar 5 chutes. Caso o usuário perca o jogo, deve-se exibir o número
sorteado pelo computador. 
*/

public class exe05 {
    public static void main(String[] args) {
         Scanner entrada = new Scanner (System.in);
         System.out.print("Digite um Numero: ");
         int num = entrada.nextInt();
         int vezes = 7;
         for (int i = 1; i <= 7; i++) {
             System.out.print("Adivinhe o numero: ");
             int ale = entrada.nextInt();
             if (num == ale){
                 System.out.println("Voce Acertou");
                 break;
             }
             else{ 
                 if (num != ale){ 
                     System.out.println("Voce Errou");
                     vezes = vezes - i;
                     System.out.println("Vida: " + vezes);
                 }
                 if (num < ale){ 
                     System.out.println("O Chute Foi Alto");
                 }
                 if (num > ale) { 
                     System.out.println("O Chute Foi Baixo");
                 }
             }
        }
        if (vezes == 0){
          System.out.println("Game over");
        }
        else {
        System.out.println("Voce ganhou,total de vidas sobresalntes: "+ vezes);
      }
    }
}
