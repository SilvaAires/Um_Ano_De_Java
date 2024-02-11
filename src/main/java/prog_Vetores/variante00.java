package prog_Vetores;

import java.util.Scanner;

public class variante00 {
    public static void main(String []args){
        Scanner e = new Scanner (System.in);
        double notas[] = new double[2];
        for (int i = 0; i<notas.length; i++){
            System.out.println("Digite a nota " + (i+1)+ " : ");
            notas[i]= e.nextDouble();
        }
        double notas1[] = new double[2];
        for (int i = 0; i<notas1.length; i++){
            System.out.println("Digite a nota " + (i+1)+ " : ");
            notas1[i]= e.nextDouble();
        }
        double media[] = new double[2];
        for (int i = 0; i<notas.length; i++){
            media[i] = (notas1[i]+notas[i])/2;
            System.out.println("Media: " + media[i]);
            if (media[i] >= 7.0){
                System.out.println("O aluno aprovo" +i);
            }
            else {
                System.out.println("O aluno reprovo" +i);
            }
        }
    }
}
