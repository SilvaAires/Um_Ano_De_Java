package prog_Vetores;

import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        int vetor[] = new int[10];       
        int opcao = 0;
        while(opcao != 3) {
            System.out.println("\n-------------- EXEMPLO MENU -------------");
            System.out.println("-----------------------------------------");
            System.out.println("-- Digite a opção desejada:");
            System.out.println("-> 1 - Digitar os elementos");
            System.out.println("-> 2 - Imprimir o vetor");
            System.out.println("-> 3 - Sair");
            System.out.print("-> Opção: ");
            opcao = e.nextInt();
            switch (opcao) {
            case 1:
                for(int i=0; i<vetor.length; i++) {
                    System.out.print("Elemento " + i + ": ");
                    vetor[i] = e.nextInt();
                }   
                break;

            case 2:
                System.out.println("\nVETOR:");
                for(int i=0; i<vetor.length; i++) {
                    System.out.print("[" + vetor[i] + "] ");           
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