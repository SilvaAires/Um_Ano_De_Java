package prog_trab_vetores;

import java.util.Scanner;

/*
3) Crie um programa em Java para armazenar dados em um vetor de 10 elementos inteiros. Para isso, crie um
menu, que possibilite que o usuário escolha as opções de ler os valores para o vetor, imprimir todo o vetor,
imprimir o maior e o menor valores do vetor, imprimir o percentual de números pares, imprimir a média dos
elementos do vetor, e imprimir percentual de elementos que estão acima da média do vetor, conforme
imagem abaixo. 
*/

public class exe03 {
    public static void main(String [] args){
        Scanner e = new Scanner(System.in);
        int vetor[] = new int[10];       
        int opcao = 0;
        while(opcao != 7) {
            System.out.println("\n-------------- MENU -------------");
            System.out.println("---------------------------------");
            System.out.println("-- Digite a opção desejada:");
            System.out.println("-> 1 - Digitar os valores do vetor");
            System.out.println("-> 2 - Imprimir o vetor");
            System.out.println("-> 3 - Imprimir o maior e o menor valores do vetor");
            System.out.println("-> 4 - Imprimir o percentual de números pares");
            System.out.println("-> 5 - Imprimir a média dos elementos do vetor");
            System.out.println("-> 6 - Imprimir percentual acima da média do vetor");
            System.out.println("-> 7 - Sair");
            System.out.print("-> Opção: ");
            opcao = e.nextInt();
            switch (opcao) {
            case 1:
                for(int i=0; i<vetor.length; i++) {
                    System.out.print("Digitar os valores do vetor " + i + ": ");
                    vetor[i] = e.nextInt();
                }   
                break;
            case 2:
                System.out.println("\nImprimir o vetor:");
                for(int i=0; i<vetor.length; i++) {
                    System.out.print("[" + vetor[i] + "] ");           
                }
                System.out.println("\n");
                break;
            case 3:
                System.out.println("\nImprimir o maior e o menor valores do vetor");
                int maior = vetor[0];
                int menor = vetor[0];
                for(int i=0; i<vetor.length; i++) {
                    if (vetor[i]>maior){
                        maior = vetor[i];
                    }
                    if (vetor[i]<menor){
                        menor = vetor[i];
                    }
                }
                for(int i=0; i<vetor.length; i++) {
                    if (vetor[i] == maior){
                        System.out.println("Posição no vetor do maior num "+i+", e ele = " + maior);
                    }
                    if (vetor[i] == menor){
                        System.out.println("Posição no vetor do menor num "+i+", e ele = " + menor);
                    }
                }
                break;
            case 4:
                System.out.println("\nImprimir o percentual de números pares:");
                int par = 0;
                for(int i=0; i<vetor.length; i++) {
                    if ((vetor[i]%2)==0){
                        par ++;
                    }           
                }
                double x = (double)(par*100)/10;
                System.out.println("O percentual de números pares é " +x+"%");
                System.out.println("\n");
                break;    
            case 5:
                System.out.println("\nImprimir a média dos elementos do vetor:");
                int med = 0;
                for(int i=0; i<vetor.length; i++) {
                    med += vetor[i];           
                }
                double media = (double)med/10;
                System.out.println("A média dos elementos do vetor é " + media);
                System.out.println("\n");
                break;
            case 6:
                System.out.println("\nImprimir percentual acima da média do vetor:");
                int total = 0;
                for(int i=0; i<vetor.length; i++) {
                    total = total + vetor[i];           
                }
                double mda = (double)total/10;
                int g = 0;
                for(int i=0; i<vetor.length; i++) {
                    if (vetor[i]>mda){
                        g ++;
                    }
                }
                int per = (g*100)/10;
                System.out.println("O percentual acima da média do vetor é "+per+"%");
                System.out.println("\n");
                break;
            case 7:
                System.out.println("\nSaindo...");
                break;
               
            default:
                System.out.println("\nOpção Inválida\n");
                break;
            }   
        }
    }
}
