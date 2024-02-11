package algoritmo_Lista04_if_else;

import java.util.Scanner;

/*
4. Escreva um programa para calcular a área de um círculo, dada pela seguinte fórmula:
*/

public class exe04 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        System.out.print("Medida do raio: ");
        double raio = e.nextDouble();
        if (raio > 0){
            System.out.println("Área: " + (3.14 * (raio * raio)));
        }
        else{
            System.out.println("Não é possível calcular");
        }
    }
}