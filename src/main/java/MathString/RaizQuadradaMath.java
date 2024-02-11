package MathString;

import java.util.Scanner;

public class RaizQuadradaMath {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Número: ");
        int num = entrada.nextInt();
        double rq = Math.sqrt(num);
        System.out.println("Raiz quadra: " + rq);
    }
}