package prog_Vetores;

import java.util.Scanner;

/*
9. Faca um programa que pergunte ao usuário o numero de
alunos a ser lido. O tamanho dos vetores será o numero
informado pelo usuário. Armazene num vetor as notas G1
destes alunos; num outro vetor, armazene as notas G2
destes alunos. Ambas notas, G1 e G2, são informadas pelo
usuário. Calcule a media aritmética destes alunos e
armazene num terceiro vetor. Ao final, mostre as 3 notas
dos alunos.
*/

public class exe09 {
    public static void main(String []args){
        Scanner e = new Scanner(System.in);
        System.out.print("Digite quantos alunos seram lidos ? ");
        int ve = e.nextInt();
        double vetor0 [] = new double [ve];
        double vetor1 [] = new double [ve];
        double vetor2 [] = new double [ve];
        for (int i = 0; i <vetor0.length; i ++){
            System.out.println("Digite a nota " + i + " pra ser armazenadano vetor 0: ");
            vetor0[i] = e.nextDouble();
            System.out.println("Digite a nota " + i + " pra ser armazenadano vetor 1: ");
            vetor1[i] = e.nextDouble();
        }
        for (int i = 0; i <vetor0.length; i ++){
            System.out.println("Elemento "+i+" : "+vetor0[i]);
            System.out.println("Elemento "+i+" : "+vetor1[i]);
            vetor2[i] = (vetor0[i]+vetor1[i])/2;
        }
        for (int i = 0; i <vetor0.length; i ++){
            System.out.println("Elemento "+i+" : "+vetor2[i]);
        }
    }
}
