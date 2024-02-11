package algoritmo_Lista03;

import java.util.Scanner;

/*
7. Escreva um programa que solicite que o usuário digite a quantidade de horas transcorridas desde o
início da primavera. O programa deve calcular e exibir a quantidade de semanas, dias e horas equivalentes. 
*/

public class exe07 {
    public static void main (String []args){
        Scanner e = new Scanner (System.in);
        System.out.print("Digite o total de horas transcorridas: ");
        int hT = e.nextInt();
        int resto = hT%168;
        System.out.println("Total de semanas: "+(hT/168)+"\nTotal de dias: "+(resto/24)+"\nTotal de horas: "+(resto%24));
    }
}
