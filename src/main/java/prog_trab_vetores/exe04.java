package prog_trab_vetores;

import java.util.Scanner;

/*
4) Crie um programa em Java que possa armazenar matrícula, nome, nota 1, nota 2, e média de 10 alunos. A
média será calculada pela média aritmética das duas notas. Para isso, crie um menu, que possibilite que o
usuário escolha as opções de digitar as informações de cada aluno (nome, nota 1 e nota 2), e de imprimir a
listagem de todos os alunos contendo todas as informações: matrícula, nome, duas notas e média, e a opção
de mostrar as informações de apenas um aluno, informando a matrícula do mesmo, conforme imagem abaixo:
OBS. A matrícula não precisa ser digitada no cadastro, pois será considerado como matrícula o índice
dos vetores.
*/

public class exe04 {
    public static void main(String []args){
        Scanner e = new Scanner(System.in);
        String nome[] = new String[10];
        double nota1[] = new double[10];
        double nota2[] = new double[10];
        double media[] = new double[10];
        int opcao = 0;
        while(opcao != 4) {
            System.out.println("\n-------------- MENU -------------");
            System.out.println("---------------------------------");
            System.out.println("-- Digite a opção desejada:");
            System.out.println("-> 1 - Digitar os dados dos alunos");
            System.out.println("-> 2 - Imprimir a listagem completa");
            System.out.println("-> 3 - Imprimir consulta matrícula");
            System.out.println("-> 4 - Sair");
            System.out.print("-> Opção: ");
            opcao = e.nextInt();
            switch (opcao) {
            case 1:
                for(int i=0; i<nota1.length; i++) {
                    System.out.print("Digita o nome do aluno " + i + ": ");
                    nome[i] = e.next();
                    System.out.print("Digita a nota 1 do aluno " + i + ": ");
                    nota1[i] = e.nextDouble();
                    System.out.print("Digita a nota 2 do aluno " + i + ": ");
                    nota2[i] = e.nextDouble();
                    media[i] = (nota1[i]+nota2[i])/2;
                }   
                break;
            case 2:
                System.out.println("\nImprimir a listagem completa:");
                for(int i=0; i<nota1.length; i++) {
                    System.out.println(i+"- Nome do aluno "+nome[i]+" \n nota 1 = "+nota1[i]+" \n nota 2 = "+nota2[i]+" \n media das notas = " +media[i]);           
                }
                System.out.println("\n");
                break;
           case 3:
                System.out.println("\nImprimir consulta matrícula:");
                System.out.println("Digite a posição do aluno que você que pesquisar: ");
                int num = e.nextInt();
                for(int i=0; i<nota1.length; i++) {
                    if (num == i){
                        System.out.print("Nome do aluno "+nome[i]+" \n nota 1 = "+nota1[i]+" \n nota 2 = "+nota2[i]+" \n media das notas = " +media[i]);
                    }           
                }
                System.out.println("\n");
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
