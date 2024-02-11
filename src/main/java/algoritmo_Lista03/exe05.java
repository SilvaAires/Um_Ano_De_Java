package algoritmo_Lista03;

import java.util.Scanner;

/*
5. Escreva um programa que solicite que o usuário digite a quantidade de minutos transcorridos desde
o início do dia. O programa deve calcular e exibir esse valor convertido para horas e minutos. 
*/

public class exe05 {
    public static void main(String []args){
        Scanner e = new Scanner(System.in);
        System.out.println("Digite a quantidade de min transcorridos: ");
        int mT = e.nextInt();
        System.out.println("Horas percorridas: "+ (mT/60)+"\nminutos percorridos: "+(mT%60));
    }
}
