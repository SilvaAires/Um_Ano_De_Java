package algoritmo_Lista09_laço_while;

import java.util.Scanner;

public class exe011 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int maioresZero = 0;
        int menoresZero = 0;
        int iguaisZero = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + "º Número: ");
            int num = entrada.nextInt();
            if (num > 0){
                maioresZero++;
            }
            else{
                if (num < 0){
                    menoresZero++;
                }
                else{
                    iguaisZero++;
                }
            }
        }
        System.out.println("Quant. números > zero: " + maioresZero);
        System.out.println("Quant. números < zero: " + menoresZero);
        System.out.println("Quant. números = zero: " + iguaisZero);
    }
}
