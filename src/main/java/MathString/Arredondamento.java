package MathString;

import java.util.Scanner;

public class Arredondamento {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número: ");
        double numero = entrada.nextDouble();
        System.out.println("Arredondamento com ceil(): " 
                + Math.ceil(numero));
        System.out.println("Arredondamento com floor(): " 
                + Math.floor(numero));
    } 
}
