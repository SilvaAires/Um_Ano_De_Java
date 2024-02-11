package prog_trab_vetores;

import java.util.Scanner;

/*
1) Crie um programa em Java para armazenar 10 nomes em um vetor nomes e imprimir uma listagem numerada
na tela. Para isso, crie um pequeno menu, onde o usuário possa escolher a opção de digitar os nomes, e
posteriormente, imprimir a listagem numerada, conforme a imagem abaixo.
 */

public class exe01 {
    public static void main (String []args){
        Scanner e = new Scanner(System.in);
        String vetor[] = new String[10];       
        int opcao = 0;
        while(opcao != 3) {
            System.out.println("\n-------------- MENU -------------");
            System.out.println("---------------------------------");
            System.out.println("-- Digite a opção desejada:");
            System.out.println("-> 1 - Digitar os nomes");
            System.out.println("-> 2 - Imprimir a listagem numerada");
            System.out.println("-> 3 - Sair");
            System.out.print("-> Opção: ");
            opcao = e.nextInt();
            switch (opcao) {
            case 1:
                for(int i=0; i<vetor.length; i++) {
                    System.out.print("Digite os nomes que queria armazenar no vetor, na posição " + i + ": ");
                    vetor[i] = e.next();
                }   
                break;

            case 2:
                System.out.println("\nNomes:");
                for(int i=0; i<vetor.length; i++) {
                    System.out.println("Posição "+i+ " : [" + vetor[i] + "] ");           
                }
                System.out.println("\n");
                break;
           
            case 3:
                System.out.println("\nSaindo...");
                break;
               
            default:
                System.out.println("\nOpção Inválida\n");
                break;
            }   
        }
    }
}

