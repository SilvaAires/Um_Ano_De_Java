package algoritmo_Trabalho;

import java.text.NumberFormat;
import java.util.Scanner;

public class Atividade_de_converção {
    public static void main(String []args){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número: ");
        double Num = entrada.nextDouble();
        String moeda_Real = NumberFormat.getCurrencyInstance().format(Num);
        System.out.println("valor em real:" + moeda_Real);
    }
}
