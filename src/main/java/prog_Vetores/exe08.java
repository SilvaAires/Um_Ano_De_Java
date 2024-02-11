package prog_Vetores;

import java.util.Scanner;

/*
8. Armazene num vetor de 5 posições o salário de 5
pessoas. Se o salário for menor q 1000 reais, forneça um
aumento de 10% e sobrescreva o valor antigo. Ao final,
mostre a lista de salários atualizada
*/

public class exe08 {
    public static void main(String []args){
        double vetor [] = new double [2];
        for (int i = 0; i < vetor.length; i++){
            Scanner e = new Scanner(System.in);
            System.out.println("Digite os salario : ");
            vetor[i]= e.nextDouble();
        }
        for (int i = 0; i < vetor.length; i++){
            System.out.println("Elemento " + i + " : " + vetor[i]);
            if (vetor [i] < 1000){
                double mu = ((vetor[i]*0.10)+vetor[i]);
                vetor[i] = mu;
            }
        }
        for (int i = 0; i < vetor.length; i++){
            System.out.println("Elemento " + i + " : " + vetor[i]);
        }
    }
}
