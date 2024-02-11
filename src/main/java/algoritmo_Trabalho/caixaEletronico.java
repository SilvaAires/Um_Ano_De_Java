package algoritmo_Trabalho;

import java.util.Scanner;

public class caixaEletronico {
    public static void main(String []args){
        Scanner entrada = new Scanner (System.in);
        System.out.print("Valor a ser sacado: ");
        int valorSacado = entrada.nextInt();
        int valorFinal = valorSacado%5;
        if (valorFinal != 0){
            System.out.println("Não é possível sacar este valor");
        }
        else {
            int quociente1 = valorSacado/200;
            int resto1 = valorSacado%200;
            int quociente2 = resto1/100;
            int resto2 = resto1%100;
            int quociente3 = resto2/50;
            int resto3 = resto2%50;
            int quociente4 = resto3/20;
            int resto4 = resto3%20;
            int quociente5 = resto4/10;
            int resto5 = resto4%10;
            int quociente6 = resto5/5;
            int resto6 = resto5%5;
            int quatidade_total_de_notas = quociente1 + quociente2 + quociente3 + quociente4 + quociente5 + quociente6;
            System.out.println("Quantidade de notas de 200: " + quociente1);
            System.out.println("Quantidade de notas de 100: " + quociente2);
            System.out.println("Quantidade de notas de 50: " + quociente3);
            System.out.println("Quantidade de notas de 20: " + quociente4);
            System.out.println("Quantidade de notas de 10: " + quociente5);
            System.out.println("Quantidade de notas de 5: " + quociente6);
            System.out.println("Total de de notas: " + quatidade_total_de_notas);
        }
    }
}
