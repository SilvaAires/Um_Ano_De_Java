package prog_trab_vetores;

import java.util.Scanner;

/*
2) Crie um programa em Java para armazenar o código, nome, quantidade, valor de compra e valor de venda
de 10 produtos. Para isso, crie um menu, que possibilite que o usuário escolha as opções de registar os valores
(nome, quantidade, valor de compra e valor de venda), imprimir uma listagem com as informações de
todos os produtos, ou imprimir apenas as informações de um determinado produto, através de seu código,
conforme a imagem abaixo.
OBS. O código não precisa ser digitado no cadastro, pois pode-se usar o índice dos vetores como código
do produto. 
*/

public class exe02 {
    public static void main(String []args){
        Scanner e = new Scanner(System.in);
        //*int cod[] = new int[10];
        String nome[] = new String[10];
        int quant[] = new int[10];
        double vend[] = new double [10];
        double cmp[] = new double[10];
        int opcao = 0;
        while(opcao != 7) {
            System.out.println("\n-------------- MENU -------------");
            System.out.println("---------------------------------");
            System.out.println("-- Digite a opção desejada:");
            System.out.println("-> 1 - Digitar o nome de 10 produtos");
            System.out.println("-> 2 - Informar a Quantidade de 10 produtos");
            System.out.println("-> 3 - Digitar o valor de compra de 10 produtos");
            System.out.println("-> 4 - Digitar o valor de venda de 10 produtos");
            System.out.println("-> 5 - Imprimir apenas as informações de um determinado produto");
            System.out.println("-> 6 - Imprimir uma listagem com as informações de todos os produtos");
            System.out.println("-> 7 - Sair");
            System.out.print("-> Opção: ");
            opcao = e.nextInt();
            switch (opcao) {
            case 1:
                System.out.println("\nNome:");
                for(int i=0; i<nome.length; i++) {
                    System.out.print("Digitar o nome do produto " + i + ": ");
                    nome[i] = e.next();
                }   
                break;

            case 2:
                System.out.println("\nQuantidade:");
                for(int i=0; i<quant.length; i++) {
                    System.out.print("Digitar o nome do produto " + i + ": ");
                    quant[i] = e.nextInt();           
                }
                System.out.println("\n");
                break;
            case 3:
                System.out.println("\nValor de compra:");
                for(int i=0; i<cmp.length; i++) {
                    System.out.print("Digitar o valor de compra do " + i + ": ");
                    cmp[i] = e.nextInt();           
                }
                System.out.println("\n");
                break;
            case 4:
                System.out.println("\nValor de venda:");
                for(int i=0; i<vend.length; i++) {
                    System.out.print("Digitar o valor de venda do " + i + ": ");
                    vend[i] = e.nextInt();           
                }
                System.out.println("\n");
                break;
            case 5:
                System.out.println("\nImprimir apenas as informações de um determinado produto:");
                    System.out.print("Digite a posição do zero ao 10, que você que saber sobre o produto: ");
                    int num = e.nextInt();
                    for (int j = 0; j<quant.length; j++){
                        if ( num == j){
                            System.out.println("Nome do produto "+j+" : " + nome[j]);
                            System.out.println("Quantida do produto "+j+" : " + quant[j]);
                            System.out.println("Valor de compra do produto "+j+" : " + cmp[j]);
                            System.out.println("Valor de venda do produto "+j+" : " + vend[j]);
                        }
                    }
                System.out.println("\n");
                break;    
            case 6:
                System.out.println("\nImprimir uma listagem com as informações de todos os produtos:");
                for(int i=0; i<vend.length; i++) {
                    System.out.print("Informações do produto" +i+ ": \n Nome do produto: "+nome[i]+"\n Quantidade: "+quant[i]+"\n Valor de compra: "+cmp[i]+"\n Valor de venda: "+vend[i]);           
                }
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
