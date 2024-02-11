package prog_trab_vetores;

import java.util.Scanner;

/*
5) (BÔNUS) Crie um programa em Java que permita ordenar um vetor de inteiros em ordem decrescente. Para
isso, crie um menu, que possibilite que o usuário escolha as opções de digitar os elementos do vetor, imprimir
o vetor conforme foi digitado, e imprimir o vetor ordenado em forma decrescente, conforme imagem abaixo.
Dica: para manter o vetor original para as impressões, crie uma cópia do mesmo, para depois ordená-lo,
mantendo assim um vetor original e um ordenado em memória. 
*/

public class exe05 {
    public static void main(String []args){
        Scanner e = new Scanner(System.in);
        int vetor[] = new int[10];
        int vetor2[] = new int[10];
        int opcao = 0;
        while(opcao != 4) {
            System.out.println("\n-------------- MENU -------------");
            System.out.println("---------------------------------");
            System.out.println("-- Digite a opção desejada:");
            System.out.println("-> 1 - Digitar os elementos do veotr");
            System.out.println("-> 2 - Imprimir o vetor original");
            System.out.println("-> 3 - Imprimir o vetor ordenado");
            System.out.println("-> 4 - Sair");
            System.out.print("-> Opção: ");
            opcao = e.nextInt();
            switch (opcao) {
            case 1:
                for(int i=0; i<vetor.length; i++) {
                    System.out.print("Elemento " + i + ": ");
                    vetor[i] = e.nextInt();
                    vetor2[i] = vetor[i];
                }   
                break;
            case 2:
                System.out.println("\nVetor original:");
                for(int i=0; i<vetor.length; i++) {
                    System.out.print("[" + vetor[i] + "] ");           
                }
                System.out.println("\n");
                break;    
            case 3:
                System.out.println("\nVetor ordenado:");
                int a = 0;
                for(int i=0; i<vetor2.length; i++){
                    for (int j = 0; j<vetor2.length; j ++){
                        if (vetor2[i]>vetor2[j]){
                            a = vetor2[j];
                            vetor2[j] = vetor2[i];
                            vetor2[i] = a;
                        }
                    }          
                }
                System.out.println(" ");
                for (int i = 0; i<vetor.length; i ++){
                    System.out.println(vetor2[i]);
                }
                break;     
            case 4:
                System.out.println("\nSaindo...");
                break;
               
            default:
                System.out.println("\nOpção Inválida\n");
                break;
            }   
        }
    }
}
