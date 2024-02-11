package MathString;

import java.util.Scanner;

public class Potencia {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Base: ");
        int base = entrada.nextInt();
        System.out.print("Potência: ");
        int pot = entrada.nextInt();
        double potencia = Math.pow(base, pot);
        System.out.println("Resultado: " + potencia);
    }
}