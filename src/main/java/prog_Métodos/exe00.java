package prog_Métodos;

import java.util.Scanner;

public class exe00 {
    public static double cM (double sN){
        double media = sN/2;
        return media;
    }
    public static void main(String[]args){
        Scanner e = new Scanner (System.in);
        boolean fim = false;
        int contEst = 1;
        while (fim = false){
            System.out.print("Estudante " + contEst);
            System.out.println("1 nota: ");
            double n1 = e.nextDouble();
            System.out.println("2 nota: ");
            double n2= e.nextDouble();
            double s = n1 + n2;
            System.out.println("\n Calcular outra média (1 - Sim| 2 - Não)? ");
            int r = e.nextInt();
            if (r != 1){
                fim = true;
            }else{
                fim = false;
            }
        }
    }
}